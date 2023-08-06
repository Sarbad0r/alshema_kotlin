package com.example.alshema_kotlin.pages.auth_pages.non_authorized_screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.example.alshema_kotlin.pages.auth_pages.non_authorized_screens.components.SupportServiceComponent
import com.example.alshema_kotlin.pages.auth_pages.non_authorized_screens.components.UnAuthPhoneNumberComponent

@Composable
fun AuthorizationScreen() {
    var focusManager = LocalFocusManager.current;
    Column(modifier = Modifier.fillMaxSize()) {
        UnAuthPhoneNumberComponent()
        Spacer(modifier = Modifier
            .fillMaxSize()
            .weight(1f)
            .pointerInput(Unit) {
                detectTapGestures {
                    focusManager.clearFocus();
                }
            }
        )
        SupportServiceComponent()
        Spacer(modifier = Modifier.height(80.dp))
    }
}