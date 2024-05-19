package com.kt.allanimations.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kt.allanimations.companent.CardTitleAndDesc
import com.kt.allanimations.tooltip.RichTooltipBoxBasic
import com.kt.allanimations.tooltip.TooltipContent

@Composable
fun TooltipScreen(navController: NavController) {


    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .padding(top = 32.dp)
                .padding(horizontal = 16.dp)
                .clip(RoundedCornerShape(10.dp)),
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, bottom = 32.dp)
                    .padding(horizontal = 24.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    modifier = Modifier.weight(weight = 1f, fill = false),
                    text = "Tooltip 1",
                    maxLines = 1,
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 22.sp,
                        fontWeight = FontWeight.Medium,
                    ),
                    color = Color.Gray,
                    overflow = TextOverflow.Ellipsis,
                )

                RichTooltipBoxBasic()
            }
            CardTitleAndDesc(title = "RichTooltip Box Basic")




            TooltipContent(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, bottom = 32.dp)
                    .padding(horizontal = 24.dp)
                    .align(Alignment.CenterHorizontally),
                name = "Tooltip 2",
                tooltipsText = "Tooltips text",
            )
            CardTitleAndDesc(title = "Tooltip Custom")

        }

    }


}