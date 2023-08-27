package com.msa.basiccomposables.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RowListTest(){
    val list= listOf<String>(
        "car","bus","Air",
        "car","bus","Air",
        "car","bus","Air",
        "car","bus","Air",
        "car","bus","Air",
        "car","bus","Air",
        "car3","bus","Air",
        "car2","bus","Air",
        "car1","bus","Air",
        "car","bus","Air",
        "car","bus","Air",
        "car","bus","Air",
        "car","bus","Air",
        "car","bus","Air",
        "car456546","bus","Air",
        "cars56546","bus","Air",
        "car","bus","Air",
        "car","bus","Air",
    )

    Column() {
        list.forEach {item->
            CreateRowListItem(s = item)
        }
    }
}

@Composable
fun CreateRowListItem( s :String){

    Row(){
        Text(
            text = s, fontSize = 20.sp,
            modifier = Modifier.padding(10.dp),
            color = Color.Red
        )
    }

}

@Composable
@Preview
fun RowListTestPreview(){
    RowListTest()
}