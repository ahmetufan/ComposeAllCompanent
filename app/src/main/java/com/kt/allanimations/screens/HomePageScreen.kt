package com.kt.allanimations.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kt.allanimations.Screens
import com.kt.allanimations.companent.CardTitleAndDesc

@Composable
fun HomePageScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {

        CardTitleAndDesc(
            title = "Draw Animation",
            onClick = {

                navController.navigate(Screens.DrawAnimationsScreen.route)
            }
        )

        CardTitleAndDesc(
            title = "Progress Indicator",
            onClick = {

                navController.navigate(Screens.ProgressIndicatorScreen.route)
            }
        )

        CardTitleAndDesc(
            title = "Tooltip",
            onClick = {

                navController.navigate(Screens.TooltipScreen.route)
            }
        )


    }
}