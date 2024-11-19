package com.example.raionacademy

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
@Preview
fun AppWidget(
    appEntity: AppEntity = AppObject.whatsapp,
    onClick: (appEntity: AppEntity) -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(Color.White)
            .padding(vertical = 8.dp)
            .padding(horizontal = 16.dp)
            .clickable {
                onClick(appEntity)
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = appEntity.id, style = TextStyle(
                fontFamily = FontFamily.Monospace
            )
        )

        Spacer(modifier = Modifier.width(16.dp))
        Card(modifier = Modifier.width(60.dp).height(60.dp)) {
            AsyncImage(
                model = appEntity.imageURL,
                contentDescription = appEntity.name,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(appEntity.name, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Text(appEntity.category, fontSize = 12.sp)
            Text(appEntity.rating.toString(), fontSize = 12.sp)
        }
    }
}