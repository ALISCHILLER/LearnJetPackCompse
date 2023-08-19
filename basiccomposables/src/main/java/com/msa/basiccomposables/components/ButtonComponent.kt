package com.msa.basiccomposables.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonComponent() {
    val context = LocalContext.current.applicationContext
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(10.dp),
    ) {
        Button(
            onClick = { Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show() },
            shape = RoundedCornerShape(size = 10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red
            ),
            elevation = ButtonDefaults.buttonElevation(40.dp),
            modifier = Modifier
                .width(200.dp)
                .height(100.dp)
                .padding(10.dp)

        ) {
            Text(text = "Click")
        }
    }
}


@Composable
fun CustomButton() {

}

@Composable
@Preview
fun CustomButtonPreview() {
    val context = LocalContext.current.applicationContext
    Column() {
        Button(

            onClick = {
                Toast.makeText(
                    context,
                    "hello",
                    Toast.LENGTH_SHORT
                )
                    .show()
            },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 20.dp
            ),
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
            ) {
            Text(text = "Hello")

        }

    }
}


@Composable
@Preview
fun ButtonComponentPreview() {
    ButtonComponent()
}