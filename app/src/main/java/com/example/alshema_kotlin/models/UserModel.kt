package com.example.alshema_kotlin.models

class UserModel(
    private val getId: Int?,
    private val getFirstName: String?,
    private val getLastName: String?,
    private val getPhoneNumber: String?,
) {
    val id: Int? = getId
    val firstName: String? = getFirstName
    val lastName: String? = getLastName
    val phoneNumber: String? = getPhoneNumber

}