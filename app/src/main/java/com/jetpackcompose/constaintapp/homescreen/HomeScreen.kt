package com.jetpackcompose.constaintapp.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.jetpackcompose.constaintapp.R


@Preview
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    ConstraintLayout (modifier = modifier
        .background(MaterialTheme.colorScheme.surface)
        .fillMaxSize()
        .verticalScroll(rememberScrollState())){


        val(
            myBackground,profileImg,notificationImg,
            welcomeText,questionText,joinBtn,middleImg,myCard,
            courseText,courseImg,latestlesson,seeAll,lessonCard
        )=createRefs()
        val bgGuide=createGuidelineFromTop(0.45f)
        MyBackground(modifier = modifier.constrainAs(myBackground){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(bgGuide)
            width=Dimension.fillToConstraints
            height=Dimension.fillToConstraints
        })

        val topGuide=createGuidelineFromTop(16.dp)
        val startGuide=createGuidelineFromStart(16.dp)
        val endGuide=createGuidelineFromEnd(16.dp)
        val bottomGuide=createGuidelineFromBottom(16.dp)

        createHorizontalChain(
            profileImg,notificationImg,
            chainStyle = ChainStyle.SpreadInside
        )


        //header part
        ProfileComp(modifier=Modifier.constrainAs(profileImg){
            top.linkTo(topGuide)
        })

        Notification(modifier = Modifier.constrainAs(notificationImg){
            top.linkTo(profileImg.top)
            bottom.linkTo(profileImg.bottom)
        })

        //middle part
        WelcomeText(modifier=Modifier.constrainAs(welcomeText){
            top.linkTo(profileImg.bottom, margin = 32.dp)
            start.linkTo(startGuide)
        })

        QuestionText(modifier = Modifier.constrainAs(questionText){
            top.linkTo(welcomeText.bottom, margin = 0.dp)
            start.linkTo(startGuide)
        })

        JoinButton({}, modifier = Modifier.constrainAs(joinBtn){
            top.linkTo(questionText.bottom, margin = 24.dp)
            start.linkTo(questionText.start)
            end.linkTo(questionText.end)
        })

        ImagePart(modifier = Modifier.constrainAs(middleImg){
            top.linkTo(joinBtn.bottom,0.dp)
            end.linkTo(endGuide)
            start.linkTo(joinBtn.end, margin = 5.dp)
            bottom.linkTo(bgGuide)

            width=Dimension.value(240.dp)
            height=Dimension.fillToConstraints
        })

        MyCard(modifier = Modifier.constrainAs(myCard){
            top.linkTo(myBackground.bottom, margin = (-30).dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)

            width=Dimension.fillToConstraints
            height= Dimension.fillToConstraints
        })

        CourseText(modifier = Modifier.constrainAs(courseText){
            top.linkTo(myCard.top,25.dp)
            start.linkTo(startGuide)
        })

        CourseImage(modifier = Modifier.constrainAs(courseImg){
            top.linkTo(courseText.bottom,25.dp)
            start.linkTo(courseText.start)
        })

        LatestText(modifier = Modifier.constrainAs(latestlesson){
            top.linkTo(courseImg.bottom,30.dp)
            start.linkTo(startGuide)
        })

        SeeAll(modifier = Modifier.constrainAs(seeAll){
            top.linkTo(latestlesson.top)
            end.linkTo(endGuide)
        })

        LessonCard(modifier=Modifier.constrainAs(lessonCard){
            top.linkTo(latestlesson.bottom,16.dp)
            start.linkTo(startGuide)
            end.linkTo(endGuide)
            bottom.linkTo(bottomGuide)

            width=Dimension.fillToConstraints
            height=Dimension.fillToConstraints
        })


    }
}

@Composable
fun MyBackground(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.bluebg),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = modifier.alpha(0.8f)

    )
}

