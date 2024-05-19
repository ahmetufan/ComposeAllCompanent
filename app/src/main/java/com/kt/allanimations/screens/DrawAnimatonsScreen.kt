package com.kt.allanimations.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kt.allanimations.drawAnimation.ArcRotationAnimation
import com.kt.allanimations.drawAnimation.CircleOffsetAnimation
import com.kt.allanimations.drawAnimation.ClockLoading
import com.kt.allanimations.drawAnimation.HeartAnimation
import com.kt.allanimations.drawAnimation.PacmanAnimation
import com.kt.allanimations.drawAnimation.ProgressAnimation
import com.kt.allanimations.drawAnimation.RotateDotAnimation
import com.kt.allanimations.drawAnimation.RotateTwoDotsAnimation
import com.kt.allanimations.drawAnimation.RotatingCircle
import com.kt.allanimations.drawAnimation.RotatingSquare
import com.kt.allanimations.drawAnimation.SquareFillLoaderAnimation
import com.kt.allanimations.drawAnimation.StepperAnimation
import com.kt.allanimations.drawAnimation.ThreeBounceAnimation
import com.kt.allanimations.drawAnimation.TwinCircleAnimation
import com.kt.allanimations.drawAnimation.WavesAnimation

@Composable
fun DrawAnimationsScreen(navController: NavController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
    ) {


        WavesAnimation()

        RotatingCircle()

        ArcRotationAnimation()

        CircleOffsetAnimation()

        ClockLoading()

        HeartAnimation()

        PacmanAnimation()

        ProgressAnimation()

        RotateDotAnimation()

        RotateTwoDotsAnimation()

        StepperAnimation(modifier = Modifier.align(Alignment.CenterHorizontally))

        RotatingSquare()

        SquareFillLoaderAnimation()

        ThreeBounceAnimation()

        TwinCircleAnimation()


    }

}