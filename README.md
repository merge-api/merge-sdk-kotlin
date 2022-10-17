# Merge-SDK-Kotlin

The Kotlin/JVM SDK for accessing various Merge Unified APIs. We use the following dependencies:

* Ktor for http communication
  * OkHttp engine (labeled Apache in ktor)
  * Jackson serialization engine
    * JSR 310 (java.time.OffsetDateTime for datetimes)
* JUnit for tests
* NO logging, aside from some `println` in tests

We target Java language level 8 and above. The API methods are written using Kotlin coroutines, but can be called with
`CompletableFutures` see [this example](https://stackoverflow.com/a/52887677), as well as the unit test 
[here](src/test/java/dev/merge/client/BasicJavaTest.java). There should also be some packages that can make it 
work in Java 7, although we do not officially support it.

## Build

You can find the latest published maven package [here](https://s01.oss.sonatype.org/#nexus-search;quick~dev.merge.client)

The dependency in a maven pom will look something like:

```
<dependency>
  <groupId>dev.merge</groupId>
  <artifactId>client</artifactId>
  <version>2.0.2</version>
</dependency>
```

## Usage

For all examples, you can refer to the [BasicTest class](src/test/kotlin/dev/merge/client/BasicTest.kt) in this
repository.

### Plain call, Kotlin

```kotlin
val accountsApi = AccountsApi()
accountsApi.setApiKey("REDACTED")
accountsApi.setAccountToken("REDACTED")

// or any other filters you prefer
val accountingAccountsResponse = accountsApi.accountsList(AccountsApi.AccountsListRequest(
    createdAfter=java.time.OffsetDateTime.now()
))

assertNotNull(accountingAccountsResponse)
assertNotNull(accountingAccountsResponse.results)
```

### Plain call, Java

```java
AccountsApi accountsApi = new AccountsApi();
accountsApi.setApiKey("REDACTED");
accountsApi.setAccountToken("REDACTED");

CompletableFuture<MergePaginatedResponse<Account>> accountingAccountsPromise = accountsApi.accountsListAsync(
    new AccountsApi.AccountsListRequest()
);

MergePaginatedResponse<Account> accountingAccountsResponse = accountingAccountsPromise.get();

assertNotNull(accountingAccountsResponse);
assertNotNull(accountingAccountsResponse.getResults());
```

### Expands call, Kotlin

The `expand` parameter can be used during GET requests to fetch the related objects in your response body. For example,
if you sent a request for GET `/employees`, you can use the expand parameter on Teams. This will fetch the associated
Team data for each given employee. The Employee objects will be returned with the corresponding Teams objects instead of
the default `List<UUID>`. In the below example, we expand the `applications` property of recruiting `Candidate`.

```kotlin
// debugging output
val mapper = ObjectMapper()
mapper.findAndRegisterModules()
mapper.enable(SerializationFeature.INDENT_OUTPUT)

// create api like normal
val candidatesApi = CandidatesApi()
candidatesApi.setApiKey("REDACTED")
candidatesApi.setAccountToken("REDACTED")

// note the "Expanded" suffix, returns a class of type Candidate.Expanded
val atsCandidatesExpandedResponse = candidatesApi.candidatesListExpanded(CandidatesApi.CandidatesListRequest(
  expand="applications"
))

// get candidates with expand=applications, check we have an expanded application sub object
assertNotNull(atsCandidatesExpandedResponse)
assertNotNull(atsCandidatesExpandedResponse.results)

for (candidate in atsCandidatesExpandedResponse.results ?: listOf()) {
    // since each candidate is now of type Candidate.Expanded, each property will be of type JsonNode or
    // List<JsonNode>, so in this case we take the first one and re-deserialize it again to type Application since we
    // had expanded it in our call. Other properties will remain the same.
    if (candidate.applications?.isNotEmpty() == true) {
        val applicationFromExpandedCandidate = mapper.convertValue(
            candidate.applications?.first(),
            Application::class.java
        )

        assertNotNull(applicationFromExpandedCandidate)
    }
  
    // of course, you may only want one property to be expanded and still have easy access to the other properties. To
    // get the non-expanded properties, use
    val candidateNormalized: Candidate = Candidate.Normalize(candidate)
    // this will convert all fields back to their strong types from JsonNode, if possible (it will even try to do so on
    // the expanded applications field which will error and gracefully continue to other properties)
    println(candidateNormalized.applications) // empty array
    println(candidateNormalized.id) // non-empty, non-JsonNode, uuid value
}
```

### Remote Fields, Kotlin

Merge attempts to map as many enum values as possible from integrations into a single normalized set of enum values.
However, there will always be edge cases where the default mapping does not suit our callers. In order to get the raw
value, you can pass in the name of the enum parameter into the remoteFields request property:

```kotlin
val employeesApi = EmployeesApi()
employeesApi.setApiKey("REDACTED")
employeesApi.setAccountToken("REDACTED")

val hrisEmployeesResponse = employeesApi.employeesListExpanded(EmployeesApi.EmployeesListRequest(
  remoteFields="employment_status"
))
```

Using this feature looks very similar to the expands feature, in that you will be receiving raw JsonNode values and will
need to deserialize to `String` yourself for the enum fields that are using the "remote field" functionality.

