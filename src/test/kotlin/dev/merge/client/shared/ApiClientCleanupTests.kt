package dev.merge.client.shared

import dev.merge.client.accounting.apis.AccountsApi
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ApiClientCleanupTests {

    @Test
    fun `Should close ktor client threads`() {
        // count how many threads exist, we might have some open by previous tests
        val startThreadsCount = countKtorClientThread()

        // this should start a few threads
        val accountsApi = AccountsApi()

        assertTrue(countKtorClientThread() > startThreadsCount)

        // this should release the threads
        accountsApi.close()
        assertEquals(countKtorClientThread(), startThreadsCount)
    }

    private fun countKtorClientThread(): Int {
        return Thread.getAllStackTraces().keys
            .filter {
                it.name.equals("Ktor-client-apache")
            }
            .size

    }
}
