package com.msa.basiccomposables.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardComponent(){

    Column(Modifier.fillMaxSize().background(Color.Red)){
        Card(
            elevation= CardDefaults.cardElevation(20.dp),
            colors=CardDefaults.cardColors(
            containerColor= Color.Cyan
            ),
            modifier = Modifier.padding(16.dp),
            border = BorderStroke(width = 4.dp, color = Color.Blue),
            shape = RoundedCornerShape(size = 46.dp)
        ) {
            Text(
                text = "Hello Card",
                modifier = Modifier.padding(15.dp),
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive
            )
        }
    }
}

@Composable
@Preview
fun CardComponentPreview(){
    CardComponent()
}