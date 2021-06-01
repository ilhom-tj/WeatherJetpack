package com.example.weather.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NextWeekCard() {
    val scrollState = rememberScrollState()
    Card(
        shape = RoundedCornerShape(10),
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(start = 10.dp,end = 10.dp,top = 10.dp,bottom = 20.dp),
        elevation = 0.dp,
        backgroundColor = Color.White.copy(0.3f)
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(scrollState)
                .padding(start = 25.dp,end = 25.dp)
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Next week", style = TextStyle(
                    Color.White,
                    fontSize = 20.sp,
                )
            )

        }
    }
}