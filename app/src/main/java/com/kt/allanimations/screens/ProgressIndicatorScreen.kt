package com.kt.allanimations.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kt.allanimations.companent.CardTitleAndDesc
import com.kt.allanimations.progressAnimation.BouncingDotProgressIndicator
import com.kt.allanimations.progressAnimation.DotProgressIndicator
import com.kt.allanimations.progressAnimation.GooeyProgressIndicator
import com.kt.allanimations.progressAnimation.IndicatorDefaults
import com.kt.allanimations.progressAnimation.IndicatorStyle
import com.kt.allanimations.progressAnimation.ScaledCircleProgressIndicator
import com.kt.allanimations.progressAnimation.SpinnerShape
import com.kt.allanimations.progressAnimation.SpinningCircleProgressIndicator
import com.kt.allanimations.progressAnimation.SpinningProgressIndicator

@Composable
fun ProgressIndicatorScreen(navController: NavController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
    ) {


        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            SpinningProgressIndicator()


            Spacer(modifier = Modifier.width(16.dp))
            SpinningProgressIndicator(
                dynamicItemColor = MaterialTheme.colorScheme.primary,
                staticItemColor = MaterialTheme.colorScheme.onPrimary,
                dynamicItemCount = 12
            )
            Spacer(modifier = Modifier.width(16.dp))
            SpinningProgressIndicator(
                staticItemCount = 8
            )
            Spacer(modifier = Modifier.width(16.dp))
            SpinningProgressIndicator(
                modifier = Modifier.size(60.dp),
                spinnerShape = SpinnerShape.Rect,
                staticItemColor = IndicatorDefaults.DynamicItemColor,
                dynamicItemColor = Color(0xffFF9800)
            )
        }
        CardTitleAndDesc(title = "Spinning Progress")



        Spacer(modifier = Modifier.height(10.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            SpinningCircleProgressIndicator()
            Spacer(modifier = Modifier.width(20.dp))
            SpinningCircleProgressIndicator(
                modifier = Modifier.size(60.dp),
                dynamicItemColor = Color(0xffE1F5FE),
                staticItemColor = Color(0xff039BE5),
                durationMillis = 500
            )
            Spacer(modifier = Modifier.width(20.dp))
            SpinningCircleProgressIndicator(
                modifier = Modifier.size(60.dp),
                dynamicItemColor = Color(0xffC8E6C9),
                staticItemColor = Color(0xff2E7D32)
            )
        }
        CardTitleAndDesc(title = "Spinning Circle Progress")




        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            GooeyProgressIndicator(
                modifier = Modifier.size(70.dp),
            )
            Spacer(modifier = Modifier.width(10.dp))
            GooeyProgressIndicator(
                modifier = Modifier.size(70.dp),
                style = IndicatorStyle.Stroke,
            )
        }
        CardTitleAndDesc(title = "Gooey Progress")
        Spacer(modifier = Modifier.height(10.dp))




        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            ScaledCircleProgressIndicator(
                modifier = Modifier.size(70.dp),
                color = Color(0xff29B6F6))
            Spacer(modifier = Modifier.width(10.dp))
            ScaledCircleProgressIndicator(
                modifier = Modifier.size(70.dp),
                color = Color(0xffEC407A)
            )
        }
        CardTitleAndDesc(title = "Scaled Circle Progress")
        Spacer(modifier = Modifier.height(10.dp))




        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            DotProgressIndicator()
            Spacer(modifier = Modifier.width(10.dp))
            DotProgressIndicator(
                initialColor = Color(0xffF44336),
                animatedColor = Color(0xffFF9800)
            )
        }
        CardTitleAndDesc(title = "Dot Progress")
        Spacer(modifier = Modifier.height(10.dp))




        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            BouncingDotProgressIndicator()
            Spacer(modifier = Modifier.width(10.dp))
            BouncingDotProgressIndicator(
                initialColor = Color(0xffF44336),
                animatedColor = Color(0xff29B6F6)
            )
        }
        CardTitleAndDesc(title = "Bouncing Dot Progress")



    }
}

