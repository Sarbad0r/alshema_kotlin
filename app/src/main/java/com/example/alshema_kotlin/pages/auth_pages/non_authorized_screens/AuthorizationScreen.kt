package com.example.alshema_kotlin.pages.auth_pages.non_authorized_screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.alshema_kotlin.pages.auth_pages.non_authorized_screens.components.UnAuthPhoneNumberComponent

@Composable
fun AuthorizationScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        UnAuthPhoneNumberComponent()
        Spacer(modifier = Modifier.fillMaxHeight().weight(1f))
        Text(text = "Hello")
        Spacer(modifier = Modifier.height(80.dp))
    }
}