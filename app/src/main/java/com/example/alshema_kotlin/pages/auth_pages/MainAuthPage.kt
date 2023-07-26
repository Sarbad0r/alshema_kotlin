package com.example.alshema_kotlin.pages.auth_pages

import android.annotation.SuppressLint
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.alshema_kotlin.pages.auth_pages.non_authorized_screens.AuthorizationScreen
import com.example.alshema_kotlin.ui.theme.mainAppColor
import com.example.alshema_kotlin.viewmodels.authorization_view_model.MainAuthorizationViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainAuthPage(
    viewModel: MainAuthorizationViewModel = viewModel(),
) {
    val mainAuthorizationViewModel = viewModel.authState;
    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = Color.White,
            title = {
                Text(text = "Авторизация",
                    style = TextStyle(color = mainAppColor, letterSpacing = 2.sp, fontSize = 24.sp))
            })
    }) {
        if (mainAuthorizationViewModel.value.checkingAuthToken)
            CircularProgressIndicator()
        else if (mainAuthorizationViewModel.value.userModel == null)
            AuthorizationScreen()
        else
            Text(text = "User not Authed!")
    }
}