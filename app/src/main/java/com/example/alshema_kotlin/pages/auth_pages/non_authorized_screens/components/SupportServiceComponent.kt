package com.example.alshema_kotlin.pages.auth_pages.non_authorized_screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alshema_kotlin.ui.theme.black54
import com.example.alshema_kotlin.ui.theme.mainAppColor
import com.example.alshema_kotlin.ui.theme.mainAppColorAccent

@Preview
@Composable
fun SupportServiceComponent() {

    Box(modifier = Modifier.padding(horizontal = 10.dp)) {
        Card(modifier = Modifier.fillMaxWidth(),
            backgroundColor = mainAppColorAccent,
            elevation = 4.dp) {
            Column(modifier = Modifier.padding(10.dp)) {
                ClickableText(
                    text = buildAnnotatedString {
                        withStyle(SpanStyle(color = black54, fontSize = 15.sp)) {
                            append("Авторизуясь вы соглашаетесь с ")
                        }
                        withStyle(
                            style = SpanStyle(
                                color = mainAppColor,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                textDecoration = TextDecoration.Underline
                            )
                        ) {
                            append("Правилами участия в программе лояльности")
//                            addStringAnnotation(
//                                tag = "URL",
//                                annotation = privacyUrl
//                            )
                        }
                    },
                    onClick = { offset ->
//                        val annotations = offset.getStringAnnotations("URL", offset, offset)
//                        if (annotations.isNotEmpty()) {
//                            val url = annotations.first().item
//                            // Launch the URL using the appropriate method
//                            // e.g., openURL(url)
//                        }
                    }
                )
                Spacer(modifier = Modifier.height(20.dp))
                Divider(color = mainAppColor)
                Spacer(modifier = Modifier.height(20.dp))
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "Служба поддержки",
                        style = TextStyle(fontSize = 20.sp))
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.ArrowForward,
                            contentDescription = "support_services_forward_button",
                            modifier = Modifier.size(25.dp))
                    }
                }
            }
        }
    }
}