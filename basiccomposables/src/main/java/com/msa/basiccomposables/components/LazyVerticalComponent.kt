package com.msa.basiccomposables.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LazyVerticalComponent(){
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

    Column(modifier = Modifier.fillMaxSize()) {

        CreateLazyVerticalItem(list)

    }
}



@Composable
fun CreateLazyVerticalItem(value: List<String>){
    LazyVerticalGrid(
//        columns = GridCells.Fixed(2),
        columns = GridCells.Adaptive(100.dp),
        content ={
        items(count=value.size){ index ->
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
                    text = value[index],
                    modifier = Modifier
                        .padding(15.dp)
                        .align(alignment=Alignment.CenterHorizontally)
                    ,
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive
                )
            }
        }
    } )
}
@Composable
@Preview
fun LazyVerticalComponentPreview(){
    LazyVerticalComponent()
}