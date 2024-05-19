package com.kt.allanimations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kt.allanimations.screens.DrawAnimationsScreen
import com.kt.allanimations.screens.HomePageScreen
import com.kt.allanimations.screens.ProgressIndicatorScreen
import com.kt.allanimations.screens.TooltipScreen
import com.kt.allanimations.ui.theme.AllAnimationsTheme
import com.kt.allanimations.ui.theme.ThemeColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AllAnimationsTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = ThemeColor
                ) {


                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screens.HomePageScreen.fullRoute

                    ) {

                        composable(route = Screens.HomePageScreen.route) {
                            HomePageScreen(
                                navController = navController
                            )
                        }

                        composable(route = Screens.DrawAnimationsScreen.route) {
                            DrawAnimationsScreen(
                                navController = navController
                            )
                        }

                        composable(route = Screens.ProgressIndicatorScreen.route) {
                            ProgressIndicatorScreen(
                                navController = navController
                            )
                        }

                        composable(route = Screens.TooltipScreen.route) {
                            TooltipScreen(
                                navController = navController
                            )
                        }

                    }

                }
            }
        }
    }
}
