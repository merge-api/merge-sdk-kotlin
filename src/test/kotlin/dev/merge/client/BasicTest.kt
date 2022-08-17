import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

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

        val candidatesApi = CandidatesApi()
        candidatesApi.setApiKey(apiKey)
        candidatesApi.setAccountToken("REDACTED")

        val contactsApi = ContactsApi()
        contactsApi.setApiKey(apiKey)
        contactsApi.setAccountToken("REDACTED")

        val employeesApi = EmployeesApi()
        employeesApi.setApiKey(apiKey)
        employeesApi.setAccountToken("REDACTED")

        val ticketsApi = TicketsApi()
        ticketsApi.setApiKey(apiKey)
        ticketsApi.setAccountToken("REDACTED")

        // make requests async

        val accountingAccountsPromise = async { accountsApi.accountsList(AccountsApi.AccountsListRequest()) }

        val atsCandidatesPromise = async { candidatesApi.candidatesList(CandidatesApi.CandidatesListRequest()) }

        val crmContactsPromise = async { contactsApi.contactsList(ContactsApi.ContactsListRequest()) }

        val hrisEmployeesPromise = async { employeesApi.employeesList(EmployeesApi.EmployeesListRequest()) }

        val ticketingTicketsPromise = async { ticketsApi.ticketsList(TicketsApi.TicketsListRequest()) }

        // check all results

        val accountingAccountsResponse = accountingAccountsPromise.await()

        assertNotNull(accountingAccountsResponse)
        assertNotNull(accountingAccountsResponse.results)
        println(mapper.writeValueAsString(accountingAccountsResponse))

        val atsCandidatesResponse = atsCandidatesPromise.await()

        assertNotNull(atsCandidatesResponse)
        assertNotNull(atsCandidatesResponse.results)
        println(mapper.writeValueAsString(atsCandidatesResponse))

        val crmContactsResponse = crmContactsPromise.await()

        assertNotNull(crmContactsResponse)
        assertNotNull(crmContactsResponse.results)
        println(mapper.writeValueAsString(crmContactsResponse))

        val hrisEmployeesResponse = hrisEmployeesPromise.await()

        assertNotNull(hrisEmployeesResponse)
        assertNotNull(hrisEmployeesResponse.results)
        println(mapper.writeValueAsString(hrisEmployeesResponse))

        val ticketingTicketsResponse = ticketingTicketsPromise.await()

        assertNotNull(ticketingTicketsResponse)
        assertNotNull(ticketingTicketsResponse.results)
        println(mapper.writeValueAsString(ticketingTicketsResponse))
    }
}