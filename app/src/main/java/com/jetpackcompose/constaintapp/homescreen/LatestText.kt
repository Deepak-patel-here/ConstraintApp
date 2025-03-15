package com.jetpackcompose.constaintapp.homescreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun LatestText(modifier: Modifier = Modifier) {
    Text("Latest Lessons",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = modifier
        )

}

@Composable
fun SeeAll(modifier: Modifier = Modifier) {
    Text("See All",
        fontSize = 20.sp,
        color = Color.Blue,
        modifier = modifier
        )
    
}