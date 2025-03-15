package com.jetpackcompose.constaintapp.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpackcompose.constaintapp.R

@Preview
@Composable
fun ProfileComp(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id= R.drawable.profile),
        contentDescription = null,
        modifier = modifier
            .padding(start = 16.dp)
            .clip(CircleShape)
            .size(42.dp)
    )
}

@Preview
@Composable
fun Notification(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id= R.drawable.bell),
        contentDescription = null,
        modifier = modifier
            .padding(end = 16.dp)
            .clip(CircleShape)
            .size(42.dp)
    )
    
}