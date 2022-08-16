import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

import dev.merge.client.accounting.apis.AccountsApi

internal class BasicTest {
    @Test
    fun testAllCategoriesSimple() = runTest {
        val accountsApi = AccountsApi()
        accountsApi.setApiKey("REDACTED")
        accountsApi.setAccountToken("REDACTED")

        val accountsResponse = accountsApi.accountsList(AccountsApi.AccountsListRequest())
        assertEquals(accountsResponse.success, true)
        assertNotNull(accountsResponse.body())
        assertNotNull(accountsResponse.body().results)
    }
}