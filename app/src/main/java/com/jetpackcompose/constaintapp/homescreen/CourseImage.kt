package com.jetpackcompose.constaintapp.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcompose.constaintapp.MyData
import com.jetpackcompose.constaintapp.R

@Preview
@Composable
fun CourseImage(modifier: Modifier = Modifier) {

    LazyRow (modifier = modifier){
        items(courseList()){ item->
            Course(item.img,item.title)

        }
    }

}

@Composable
fun Course (img:Int,title:String,modifier: Modifier = Modifier) {
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            painter = painterResource(id= img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier.size(130.dp)
        )
        Text(title, fontSize = 16.sp)
    }
}

fun courseList():List<MyData>{
    val myList= listOf(
        MyData(R.drawable.android_img,"Android"),
        MyData(R.drawable.java_img,"Java"),
        MyData(R.drawable.kotlin_img,"Kotlin")
    )
    return myList
}