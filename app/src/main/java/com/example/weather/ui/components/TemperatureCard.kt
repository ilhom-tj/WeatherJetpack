package com.example.weather.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TemperatureCard(temperature: Int) {
    Card(
        shape = RoundedCornerShape(10),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        elevation = 0.dp,
        backgroundColor = Color.Transparent
    ) {
        Column(
            modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xffeab2ac).copy(0.8f),
                            Color(0xffe8ced0).copy(0.7f)
                        )
                    )
                )
                .padding(start = 25.dp,end = 25.dp)
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Temp.", style = TextStyle(
                    Color.White,
                    fontSize = 20.sp,
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "${temperature} ℃", fontSize = 25.sp,
                style = TextStyle(
                    Color.White,
                    fontWeight = FontWeight.Black
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.White)
            )
            Spacer(modifier = Modifier.height(25.dp))
        }
    }
}