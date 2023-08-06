package com.example.alshema_kotlin.viewmodels.authorization_view_model

import com.example.alshema_kotlin.models.UserModel

data class MainAuthorizationData(
    var userModel: UserModel? = null,
    var checkingAuthToken : Boolean = false,

    var textFieldState : String = "",
    var isFilledTextField: Boolean = false
)
