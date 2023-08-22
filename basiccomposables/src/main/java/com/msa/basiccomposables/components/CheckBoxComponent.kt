package com.msa.basiccomposables.components

import android.widget.CheckBox
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun CheckBoxTest() {

    var checked by remember {
        mutableStateOf(true)
    }
    val context = LocalContext.current
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){


        Checkbox(
            checked = checked,
            onCheckedChange = { checkStatus ->
                checked = checkStatus
                Toast.makeText(
                    context,
                    "choose: $checkStatus",
                    Toast.LENGTH_SHORT
                ).show()
            },
            colors = CheckboxDefaults.colors(
                checkedColor = Color.Red,
                uncheckedColor = Color.Green
            )
        )
        Text(text = "Car", color = Color.Red)
    }
}



@Composable
fun ListCheckBoxTest(){

}


@Composable
@Preview
fun ListCheckBoxTestPreview(){

    val toppings:List<String> = listOf("Car","Key","Bus")
    val context = LocalContext.current

    Column(horizontalAlignment = Alignment.Start) {
        toppings.forEach {
            toppingsName->
            var checked by remember {
                mutableStateOf(true)
            }

            Row (verticalAlignment = Alignment.CenterVertically){
                Checkbox(
                    checked =checked ,
                    onCheckedChange ={
                            checkedStatus -> checked=checkedStatus
                        Toast.makeText(context,
                            "Your  $toppingsName : $checked",
                            Toast.LENGTH_SHORT)
                            .show()
                    }
                )
                Text(text = "Your  $toppingsName : $checked", color = Color.Green)
            }

        }

    }

}



@Composable
@Preview
fun CheckBoxTestPreview() {
    CheckBoxTest()
}