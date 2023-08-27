package com.msa.basiccomposables.components

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun FloatingActionComponent() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize()) {
        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(10.dp)
            ,
            onClick = {
                Toast.makeText(context, "click botton", Toast.LENGTH_SHORT).show()
            },
            elevation=
            FloatingActionButtonDefaults.elevation(5.dp,focusedElevation=10.dp,
                pressedElevation=50.dp)
        ) {
            Icon(
                painter = rememberVectorPainter(image = Icons.Default.Add),
                contentDescription = "Floating"
            )
        }
    }
}


@Composable
fun ExtendedFloatingActionComponent(){
    val context= LocalContext.current
    Box(modifier = Modifier.fillMaxSize()){
        ExtendedFloatingActionButton(
            text = { Text(text = "Search") },

            onClick = { Toast.makeText(context, "Click ExtendedFloating ",
                Toast.LENGTH_SHORT).show() },
            modifier = Modifier
                .padding(all = 16.dp)
                .align(alignment = Alignment.BottomStart),
            icon = {
                   Icon(painter = rememberVectorPainter(image = Icons.Default.Search),
                       contentDescription = "Search")
            },
        )

    }
}


@Composable
@Preview
fun ExtendedFloatingActionComponentPreview(){
    ExtendedFloatingActionComponent()
}
@Composable
@Preview
fun FloatingActionComponentPreview() {
    FloatingActionComponent()
}