package com.example.weather.ui.components

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather.R


@Composable
fun WeatherCardsBig(
    date: String,
    weather: String,
    wind: Int,
    hum: Int,
    pressure: Int
) {
    val tintColor = Color.White
    Card(
        shape = RoundedCornerShape(corner = CornerSize(10)),
        backgroundColor = Color.White.copy(0.3f),
        modifier = Modifier
            .fillMaxWidth(0.58f)
            .padding(10.dp),
        elevation = 0.dp
    ) {
        val scrollableState = rememberScrollState()
        Column(
            modifier =
            Modifier
                .background(Color.Transparent)
                .verticalScroll(scrollableState),
            horizontalAlignment = Alignment.Start
        ) {

            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()

                    .background(Color.Transparent)
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Today ${date}",
                    style = TextStyle(tintColor),
                )
                Image(
                    painter = painterResource(id = R.drawable.sun),
                    contentDescription = "weather_ico",
                    modifier = Modifier
                        .width(28.dp)
                        .height(28.dp)
                )
            }
            Text(
                text = weather,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = tintColor,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Black
                )
            )
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 25.dp)
                    .height(1.dp)
                    .background(Color.White)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Column(Modifier.padding(start = 25.dp)) {
                Text(
                    text = "Wind",
                    style = TextStyle(tintColor)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "$wind km/h",
                    style = TextStyle(
                        tintColor,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Black
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Hum",
                    style = TextStyle(tintColor),
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "${hum}%",
                    style = TextStyle(
                        tintColor,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Black
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Pressure",
                    style = TextStyle(tintColor),
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "$pressure hPa",
                    style = TextStyle(
                        tintColor,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Black
                    )
                )
                Spacer(modifier = Modifier.height(25.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 40.dp, end = 70.dp)
                        .height(1.dp)
                        .background(Color.White)
                )
                Spacer(modifier = Modifier.height(25.dp))

            }

        }
    }

}