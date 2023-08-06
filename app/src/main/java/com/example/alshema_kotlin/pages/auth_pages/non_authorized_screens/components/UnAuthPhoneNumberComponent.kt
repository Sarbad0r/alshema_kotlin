package com.example.alshema_kotlin.pages.auth_pages.non_authorized_screens.components

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.alshema_kotlin.ui.theme.mainAppColor
import com.example.alshema_kotlin.ui.theme.mainAppColorAccent
import com.example.alshema_kotlin.viewmodels.authorization_view_model.MainAuthorizationViewModel

@Preview
@Composable
fun UnAuthPhoneNumberComponent(
    viewModel: MainAuthorizationViewModel = viewModel(),
) {
    val mainState = viewModel.authState;

    val buttonGoBackGround = if (mainState.value.isFilledTextField) {
        mainAppColorAccent
    } else {
        Color.Gray;
    }

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .background(color = Color.White),
        elevation = 10.dp) {

        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)) {
            Column() {
                Text(text = "Введите номер телефона")
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom) {
                    TextField(modifier = Modifier
                        .background(color = Color.Transparent)
                        .width(90.dp)
                        .padding(0.dp),
                        textStyle = TextStyle(fontSize = 18.sp,
                            letterSpacing = 2.sp,
                            textAlign = TextAlign.Start),
                        colors = TextFieldDefaults.textFieldColors(focusedIndicatorColor = Color.Gray,
                            unfocusedIndicatorColor = Color.Gray,
                            backgroundColor = Color.Transparent),
                        readOnly = true,
                        shape = RoundedCornerShape(ZeroCornerSize),
                        value = "+992",
                        onValueChange = { })
                    TextField(value = mainState.value.textFieldState,
                        textStyle = TextStyle(fontSize = 18.sp, letterSpacing = 2.sp),
                        onValueChange = { viewModel.changingTextOfTextField(it) },
                        colors = TextFieldDefaults.textFieldColors(focusedIndicatorColor = Color.Blue,
                            unfocusedIndicatorColor = Color.Gray,
                            backgroundColor = Color.Transparent),
                        shape = RoundedCornerShape(ZeroCornerSize),

                        modifier = Modifier
                            .background(color = Color.Transparent)
                            .fillMaxWidth()
                            .weight(0.5f)
                            .padding(0.dp)
                            .pointerInput(Unit) {
                                detectTapGestures {
                                    println("working remove");
                                    viewModel.removeAllSymbolsAndPutDotsToTextField()
                                }
                            })
                    Spacer(modifier = Modifier.width(10.dp))

                    Box(contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .background(color = buttonGoBackGround,
                                shape = RoundedCornerShape(7.dp))
                            .width(70.dp)
                            .height(50.dp)) {
                        Icon(imageVector = Icons.Default.ArrowForward,
                            contentDescription = "go_ahead",
                            modifier = Modifier.size(25.dp),
                            tint = Color.White)
                    }
                }
            }
        }
    }
}