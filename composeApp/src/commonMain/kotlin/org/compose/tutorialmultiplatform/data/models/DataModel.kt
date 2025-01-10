package org.compose.tutorialmultiplatform.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class DataModel(
    @SerialName("body")
    val body: String? = "",
    @SerialName("fromId")
    val fromId: String? = "",
    @SerialName("id")
    val id: String? = "",
    @SerialName("meetingid")
    val meetingid: String? = "",
    @SerialName("title")
    val title: String? = "",
    @SerialName("toId")
    val toId: String? = ""
)