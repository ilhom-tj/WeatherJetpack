package com.example.weather.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import com.example.weather.R

@Composable
fun toolbar(modifier: Modifier) {
    val tintColor = Color.White
    val constraintSet = ConstraintSet {
        val menu = createRefFor("menu")
        val location = createRefFor("location")
        constrain(menu){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        }
        constrain(location){
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        }

    }

    ConstraintLayout(constraintSet = constraintSet, modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp,top = 32.dp,end = 16.dp)
        ) {
        menu(color = tintColor)
        location(modifier = Modifier.layoutId("location"),color = tintColor)
    }
}


@Composable
fun menu(color: Color) {
    Image(
        painter = painterResource(id = R.drawable.ic_heroicons_solid_menu_alt_2),
        contentDescription = "menu",
        colorFilter = ColorFilter.tint(color),
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .layoutId("menu")

    )
}

@Composable
fun location(modifier: Modifier,color: Color) {
    Row(modifier = Modifier.layoutId("location")) {
        Text(
            text = "Tajikistan",
            style = TextStyle(color,fontSize = 18.sp),

        )
        Spacer(modifier = Modifier.width(10.dp))
        Image(
            painter = painterResource(
                id = R.drawable.ic_baseline_location_on_24
            ),
            contentDescription = "location",
            colorFilter = ColorFilter.tint(color)
        )

    }

}
