package com.msa.basiccomposables.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
fun LazyRowComponent(){
    val list = listOf<String>(
        "car", "bus", "Air",
        "car", "bus", "Air",
        "car", "bus", "Air",
        "car", "bus", "Air",
        "car", "bus", "Air",
        "car", "bus", "Air",
        "car3", "bus", "Air",
        "car2", "bus", "Air",
        "car1", "bus", "Air",
        "car", "bus", "Air",
        "car", "bus", "Air",
        "car", "bus", "Air",
        "car", "bus", "Air",
        "car", "bus", "Air",
        "car456546", "bus", "Air",
        "cars56546", "bus", "Air",
        "car", "bus", "Air",
        "car", "bus", "Air",
    )

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red)

    ) {

        CreateLazyRowItem(list)

    }
}

@Composable
fun CreateLazyRowItem(value: List<String>) {

    LazyRow(){
        item {
            Text(
                text = "Your First Item",
                color = Color.White,
                modifier = Modifier.padding(top =15.dp)
            )
        }

        items(5) { index ->
            Text(
                text = "Item: $index",
                color = Color.White,
                modifier = Modifier.padding(top =15.dp)
            )
        }

        items(value) {
            Card(
                elevation = CardDefaults.cardElevation(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Cyan
                ),
                modifier = Modifier.padding(16.dp),
                border = BorderStroke(width = 4.dp, color = Color.Blue),
                shape = RoundedCornerShape(size = 46.dp)
            ) {
                Text(
                    text = "$it",
                    modifier = Modifier.padding(15.dp),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive
                )
            }
        }
    }


}
@Composable
@Preview
fun LazyRowComponentPreview(){
    LazyRowComponent()
}