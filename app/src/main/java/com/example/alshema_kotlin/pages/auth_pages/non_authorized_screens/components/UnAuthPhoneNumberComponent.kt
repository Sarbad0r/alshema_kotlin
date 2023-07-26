package com.example.alshema_kotlin.pages.auth_pages.non_authorized_screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.alshema_kotlin.ui.theme.mainAppColor

@Composable
fun UnAuthPhoneNumberComponent() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .background(color = Color.White), elevation = 10.dp) {

        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)) {
            Column() {
                Text(text = "Введите номер телефона")
            }
        }
    }
}