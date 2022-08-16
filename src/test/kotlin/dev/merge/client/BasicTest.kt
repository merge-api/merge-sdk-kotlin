import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.ApiClient
import dev.merge.client.accounting.apis.AccountsApi
import dev.merge.client.ats.apis.CandidatesApi
import dev.merge.client.crm.apis.ContactsApi
import dev.merge.client.hris.apis.EmployeesApi
import dev.merge.client.ticketing.apis.TicketsApi
import kotlinx.coroutines.async

internal class BasicTest {
    @Test
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    fun testAllCategoriesSimple() = runTest {
        val mapper = ApiClient.JSON_DEFAULT

        val apiKey = "REDACTED"

        val accountsApi = AccountsApi()
        accountsApi.setApiKey(apiKey)
        accountsApi.setAccountToken("REDACTED")

        val accountsPromise = async { accountsApi.accountsList(AccountsApi.AccountsListRequest()) }

        val candidatesApi = CandidatesApi()
        candidatesApi.setApiKey(apiKey)
        candidatesApi.setAccountToken("REDACTED")

        val candidatesPromise = async { candidatesApi.candidatesList(CandidatesApi.CandidatesListRequest()) }



        val accountsResponse = accountsPromise.await()

        assertNotNull(accountsResponse)
        assertNotNull(accountsResponse.results)
        println(mapper.writeValueAsString(accountsResponse))

        val candidatesResponse = candidatesPromise.await()

        assertNotNull(candidatesResponse)
        assertNotNull(candidatesResponse.results)
        println(mapper.writeValueAsString(candidatesResponse))


    }
}