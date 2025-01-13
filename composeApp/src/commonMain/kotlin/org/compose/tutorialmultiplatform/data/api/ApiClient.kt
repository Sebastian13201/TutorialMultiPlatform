package org.compose.tutorialmultiplatform.data.api

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.statement.HttpResponse
import io.ktor.util.network.UnresolvedAddressException
import kotlinx.serialization.SerializationException
import org.compose.tutorialmultiplatform.data.models.PeopleItemModel
import org.compose.tutorialmultiplatform.data.models.RoomsModelItemModel
import util.NetworkError
import util.Result

class ApiClient(
    private val httpClient: HttpClient
) {
    private val baseUrl = "https://61e947967bc0550017bc61bf.mockapi.io/api/v1"

    suspend fun getPeople(): Result<List<PeopleItemModel>, NetworkError> {
        return try {
            val response: HttpResponse = httpClient.get("$baseUrl/people")
            if (response.status.value in 200..299) {
                val people: List<PeopleItemModel> = response.body()
                Result.Success(people)
            } else {
                Result.Error(NetworkError.UNKNOWN)
            }
        } catch (e: Exception) {
            when (e) {
                is UnresolvedAddressException -> Result.Error(NetworkError.NO_INTERNET)
                else -> Result.Error(NetworkError.SERIALIZATION)
            }
        }
    }

    suspend fun getRooms(): Result<List<RoomsModelItemModel>, NetworkError> {
        return try {
            val response: HttpResponse = httpClient.get("$baseUrl/rooms")
            if (response.status.value in 200..299) {
                val rooms: List<RoomsModelItemModel> = response.body()
                Result.Success(rooms)
            } else {
                Result.Error(NetworkError.UNKNOWN)
            }
        } catch (e: Exception) {
            when (e) {
                is UnresolvedAddressException -> Result.Error(NetworkError.NO_INTERNET)
                else -> Result.Error(NetworkError.SERIALIZATION)
            }
        }
    }
}