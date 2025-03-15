package com.jetpackcompose.constaintapp.homescreen

import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jetpackcompose.constaintapp.R

@Composable
fun WelcomeText(modifier: Modifier = Modifier) {
    Text(
        text = "Welcome Back!",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = modifier
    )
}

@Composable
fun QuestionText(modifier: Modifier = Modifier) {
    Text(
        text = "What do you want to learn?",
        fontSize = 18.sp,
        color = Color.White,
        modifier = modifier.alpha(0.8f)
    )
}

@Composable
fun JoinButton(onClick:()->Unit,modifier: Modifier = Modifier) {
    Button(onClick, modifier = modifier, colors = ButtonColors(Color(0xFF131B49),Color.White,Color.Gray,Color.Blue),) {
        Text("Join Now!")
    }

}

@Composable
fun ImagePart(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.social),
        contentDescription = null,
        modifier = modifier

    )

}