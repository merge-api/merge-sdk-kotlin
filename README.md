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
    // List<JsonNode>, so in this case we take the first one and re-deserialize it again to type Applicaton since we
    // had expanded it in our call. Other properties will remain the same.
    if (candidate.applications?.isNotEmpty() == true) {
        val applicationFromExpandedCandidate = mapper.convertValue(
            candidate.applications?.first(),
            Application::class.java
        )

        assertNotNull(applicationFromExpandedCandidate)
    }
}
```
