package org.compose.tutorialmultiplatform.data.api

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import util.NetworkError
import util.Result

class InsultCensorClient (
    private val httpClient: HttpClient
) {
    suspend fun censorWords(uncensored: String): Result<String,NetworkError>{
        httpClient.get(
            urlString = "https://61e947967bc0550017bc61bf.mockapi.io/api/v1/"
        )
        return TODO("Provide the return value")
    }
}