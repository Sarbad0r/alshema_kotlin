package com.example.alshema_kotlin.viewmodels.authorization_view_model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainAuthorizationViewModel : ViewModel() {
    private val _authState = mutableStateOf(MainAuthorizationData())
    var authState: MutableState<MainAuthorizationData> = _authState



}