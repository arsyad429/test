package com.example.raionacademy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun AppScreen(
    navController: NavController = rememberNavController()
) {
    val applist = listOf(
        AppObject.whatsapp,
        AppObject.capcut,
        AppObject.tiktok,
        AppObject.dana
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        item{
            Spacer(modifier = Modifier.height(24.dp))
        }

        items(applist){appEntity  ->
            AppWidget(appEntity){
                navController.navigate("detail_screen/${appEntity.name}")
            }
        }
    }
}