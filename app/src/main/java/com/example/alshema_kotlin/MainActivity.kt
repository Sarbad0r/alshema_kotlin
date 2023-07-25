package com.example.alshema_kotlin

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.alshema_kotlin.pages.bottom_nav_bar.BottomNavbarGraph
import com.example.alshema_kotlin.pages.bottom_nav_bar.BottomNavigationBar
import com.example.alshema_kotlin.ui.theme.Alshema_kotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp()
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainApp() {
    val navController: NavHostController = rememberNavController();
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }) {
        BottomNavbarGraph(navController = navController)
    }
}
