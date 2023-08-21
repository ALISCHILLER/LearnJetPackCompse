package com.msa.basiccomposables.components

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun RadioButtonTest(){
    val context = LocalContext.current
    Row(
        verticalAlignment = Alignment.CenterVertically
    ){
        RadioButton(
            selected = false,
            onClick = {
                Toast.makeText(context, "Selected is Car", Toast.LENGTH_SHORT).show()
            }
        )
        Text(text = "Car", color = Color.Red)
    }
 
}



@Composable
fun RadioButtonGroupTest(){
    val context = LocalContext.current

    val radioOption = listOf("Car","Key","Lamp")

    var (selectedItem , selectedOption) = remember {
        mutableStateOf(radioOption[0])
    }
    Column(modifier = Modifier.selectableGroup()) {
        radioOption.forEach {
            Row (
                modifier = Modifier
                    .height(56.dp)
                    .selectable(
                        selected = (selectedItem == it),
                        onClick = { selectedOption(it) },
                        role = Role.RadioButton
                    )
                    .padding(horizontal = 16.dp)
            ){
                RadioButton(
                    modifier = Modifier.padding(end = 16.dp ),
                    onClick = { selectedOption(it) },
                    selected = (selectedItem == it),

                )
                Text(text = it, color = Color.Green)
            }
        }

    }




}


@Composable
@Preview
fun RadioButtonGroupTestPreview(){
    RadioButtonGroupTest()
}
@Composable
@Preview
fun RadioButtonTestPreview(){
    RadioButtonTest()
}