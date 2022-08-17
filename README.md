# Merge-SDK-Kotlin

The Kotlin/JVM SDK for accessing various Merge Unified APIs. We use the following dependencies:

* Ktor for http communication
  * OkHttp engine (labeled Apache in ktor)
  * Jackson serialization engine
    * JSR 310 (java.time.OffsetDateTime for datetimes)
* JUnit for tests
* NO logging, aside from some `println` in tests

We target Java language level 8 and above. The API methods are written using Kotlin coroutines, but can be called with
`CompletableFutures` see [https://stackoverflow.com/a/52887677](this example). There should also be some packages that
can make it work in Java 7, although we do not officially support it.

## Usage

For all examples, you can refer to the [src/test/kotlin/dev/merge/client/BasicTest.kt](BasicTest class) in this
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

### Expands call, Kotlin

The `expand` parameter of Merge API endpoints take in properties which the caller wishes to "expand" from an id into
a full sub object. For example, you can expand the applications property of a candidate from a list of ids of that
candidate's applications into a list of full application objects matching those ids in one call (rather than call list
applications later). This has historically been a challenge to support in our statically typed language SDK's, but we
have this pattern:

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

Using this feature looks very similar to the expands feature, in that you will be receiving raw JsonNode values and will
need to deserialize to `String` yourself for the enum fields that are using the "remote field" functionality

