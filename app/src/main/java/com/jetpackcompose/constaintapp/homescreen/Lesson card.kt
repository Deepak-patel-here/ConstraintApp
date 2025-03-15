package com.jetpackcompose.constaintapp.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcompose.constaintapp.R

@Preview
@Composable
fun LessonCard(modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(12.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(Color.White),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .padding(top = 16.dp, start = 16.dp)
                .wrapContentSize(Alignment.TopStart)
                .fillMaxHeight()
                .background(Color.White)
        ) {
            Column {
                Text(
                    "Lesson",
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.alpha(0.5f),
                )

                Spacer(modifier = Modifier.height(8.dp))
                Timing()
                Spacer(modifier = Modifier.height(20.dp))
                Subject()



            }

        }
    }
}

@Composable
fun Timing(modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(R.drawable.time),
            contentDescription = null
        )
        Spacer(Modifier.width(5.dp))

        Text(
            text="Thur Jun 6 | 8:00 - 8:30 AM",
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    }
    
}

@Composable
fun Subject(modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(R.drawable.dsa_img),
            contentDescription = null
        )
        Spacer(Modifier.width(5.dp))


        Column {
            Text(
                "Data Structures and Algorithms",
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(3.dp))
            Text("To be a pro developer you need to master Data structures and algorithms",
                fontSize = 12.sp,
                modifier =  Modifier.alpha(0.5f))
        }
    }
    
}

