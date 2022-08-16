import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.accounting.apis.AccountsApi

internal class BasicTest {
    @Test
    fun testAllCategoriesSimple() = runTest {
        val mapper = ObjectMapper();

        val accountsApi = AccountsApi()
        accountsApi.setApiKey("REDACTED")
        accountsApi.setAccountToken("REDACTED")

        val accountsResponse = accountsApi.accountsList(AccountsApi.AccountsListRequest())

        assertNotNull(accountsResponse)
        assertNotNull(accountsResponse.results)
        println(mapper.writeValueAsString(accountsResponse))
    }
}