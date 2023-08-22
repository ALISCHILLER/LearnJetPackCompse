package com.msa.basiccomposables.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun SwitchTest(){
    var switchOn by remember {
        mutableStateOf(false)
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(12.dp)
    ){
        Switch (
            checked = switchOn,
            onCheckedChange ={
                    switchState -> switchOn=switchState
            },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Green,
                checkedTrackColor = Color.Yellow,
                uncheckedThumbColor = MaterialTheme.colorScheme.outline,
                uncheckedTrackColor = Color.Cyan
            )
        )
        Text(text = "Night Mode", color = Color.Green)
    }

}

@Composable
@Preview
fun SwitchTestPreview(){
    SwitchTest()
}