package dev.merge.client.shared.auth

class HttpBearerAuth : Authentication {
    var bearerToken: String? = null

    override fun apply(query: MutableMap<String, List<String>>, headers: MutableMap<String, String>) {
        val token: String = bearerToken ?: throw IllegalArgumentException("Missing API Key")
        headers["Authorization"] = "Bearer $token"
    }
}
