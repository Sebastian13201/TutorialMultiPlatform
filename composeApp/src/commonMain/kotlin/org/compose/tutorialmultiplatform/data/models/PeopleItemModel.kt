package org.compose.tutorialmultiplatform.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PeopleItemModel(
    @SerialName("avatar")
    val avatar: String? = "",
    @SerialName("createdAt")
    val createdAt: String? = "",
    @SerialName("data")
    val `data`: DataModel? = DataModel(),
    @SerialName("email")
    val email: String? = "",
    @SerialName("favouriteColor")
    val favouriteColor: String? = "",
    @SerialName("firstName")
    val firstName: String? = "",
    @SerialName("fromName")
    val fromName: String? = "",
    @SerialName("id")
    val id: String? = "",
    @SerialName("jobtitle")
    val jobtitle: String? = "",
    @SerialName("lastName")
    val lastName: String? = "",
    @SerialName("name")
    val name: String? = "",
    @SerialName("size")
    val size: String? = "",
    @SerialName("to")
    val to: String? = "",
    @SerialName("type")
    val type: String? = "",
    @SerialName("{}")
    val x: String? = ""
)