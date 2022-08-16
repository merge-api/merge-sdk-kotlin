package dev.merge.client.shared.auth

class AccountTokenAuth : Authentication {
    var accountToken: String? = null

    override fun apply(query: MutableMap<String, List<String>>, headers: MutableMap<String, String>) {
        val token: String = accountToken ?: throw IllegalArgumentException("Missing Account Token")
        headers["X-Account-Token"] = "$token"
    }
}
