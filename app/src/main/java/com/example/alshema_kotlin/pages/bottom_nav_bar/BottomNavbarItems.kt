package com.example.alshema_kotlin.pages.bottom_nav_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomItem(var name: String, var route: String, var icon: ImageVector) {
    object screen1 : BottomItem(name = "home", route = "home_screen", icon = Icons.Default.Home)

    object screen2 : BottomItem(name = "azs", route = "azs_screen", icon = Icons.Default.LocationOn)

    object screen3 :
        BottomItem(name = "promos", route = "promos_screen", icon = Icons.Default.FavoriteBorder)

    object screen4 :
        BottomItem(name = "more", route = "more_screen", icon = Icons.Default.MoreVert)
}