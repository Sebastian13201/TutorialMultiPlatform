package org.compose.tutorialmultiplatform.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RoomsModelItemModel(
    @SerialName("createdAt")
    val createdAt: String? = "",
    @SerialName("id")
    val id: String? = "",
    @SerialName("isOccupied")
    val isOccupied: Boolean? = false,
    @SerialName("maxOccupancy")
    val maxOccupancy: Int? = 0
)