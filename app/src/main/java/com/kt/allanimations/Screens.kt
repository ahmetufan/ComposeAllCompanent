package com.kt.allanimations

sealed class Screens(val route: String, vararg params: String) {
    val fullRoute: String = if (params.isEmpty()) route else {
        val builder = StringBuilder(route)
        params.forEach { builder.append("/{${it}}") }
        builder.toString()
    }


    object HomePageScreen : Screens("homePageScreen")
    object DrawAnimationsScreen : Screens("drawAnimationsScreen")
    object ProgressIndicatorScreen : Screens("progressIndicatorScreen")
    object TooltipScreen : Screens("tooltipScreen")
}