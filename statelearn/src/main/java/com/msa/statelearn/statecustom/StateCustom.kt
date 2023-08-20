package com.msa.statelearn.statecustom

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun stateCustomeTest(){
    Column(){

        var count by remember { mutableStateOf(0) }
        Button(onClick = {
            count++
            Log.e(TAG, "stateCustomeTest: $count", )
        }) {
            Text(text = "click $count" )
        }
    }
}

@Composable
fun NotCustomeTest(){
    Column(){

        var count=0;
        Button(onClick = {
            count++
            Log.v(ContentValues.TAG, "stateCustomeTest: $count", )
        }) {
            Text(text = "click $count" )
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StateTextFieldTest(){
    var enteredValue by remember {
        mutableStateOf("")
    }

    var  validateTextUser by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        TextField(
            value =enteredValue ,
            onValueChange = {text ->enteredValue =text},
            label = { Text(text = "Name")},
            placeholder = { Text(text = "Enter Your Name")},
            leadingIcon = {
                Icon(
                    painter = rememberVectorPainter(image = Icons.Rounded.Email),
                    contentDescription = "Email"
                )
            },
            isError = validateTextUser,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number, imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone  = {
                    validateTextUser= valedateNumber(inputText = enteredValue)
                }
            )
        )

        if (validateTextUser) {
            Text(
                text = "Input Text: $enteredValue",
                color = MaterialTheme.colorScheme.error,
                modifier = Modifier.padding(16.dp)
            )
        }

    }
}



fun  valedateNumber(inputText:String):Boolean{
    return inputText.toInt() > 18
}

@Composable
@Preview
fun StateTextTestPreview(){
    StateTextFieldTest()
}