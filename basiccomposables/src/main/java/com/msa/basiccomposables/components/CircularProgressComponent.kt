package com.msa.basiccomposables.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.PI
import kotlin.math.atan2
import kotlin.math.roundToInt
import android.graphics.Paint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.unit.sp
import com.msa.basiccomposables.ui.theme.*
import kotlin.math.*

@Composable
fun CircularProgressTest() {

    Row {


        CircularProgressIndicator(
            modifier = Modifier.size(25.dp),
            color = Color.Red,
            strokeWidth = 6.dp

        )
        Text(text = "Loading", color = Color.Red)

        CircularProgressIndicator(
            progress = 0.9f,
            modifier = Modifier
                .size(25.dp)
                .padding(start = 5.dp),
            color = Color.Green,
            strokeWidth = 6.dp
        )

    }
}



@Composable
fun CircularProgressButton() {

    var progress by remember {
        mutableStateOf(0f)
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            progress=progress,
            strokeWidth = 6.dp,
            modifier=Modifier.size(120.dp),
            color = Color.Blue
        )

        Button(onClick = {
            progress +=0.1f
        }) {
            Text(text = "add")
        }
    }
}




@Composable
@Preview
fun CircularProgressTestPreview() {
    CircularProgressTest()
}