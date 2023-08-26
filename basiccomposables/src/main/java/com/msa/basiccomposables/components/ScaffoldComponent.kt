@file:OptIn(
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class
)

package com.msa.basiccomposables.components

import android.R
import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msa.basiccomposables.ui.theme.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldTest() {

}


@Composable
fun TopBarComponent() {
    var context = LocalContext.current
    TopAppBar(

        title = { Text(text = "TopBarTest", color = Color.White) },
        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(context, "Click Icon", Toast.LENGTH_SHORT).show()
            }) {
                Icon(
                    painter = rememberVectorPainter(image = Icons.Default.Menu),
                    contentDescription = "",
                    tint = Color.White
                )
            }
        },
        actions = {
            IconButton(
                onClick = {

                }) {
                Icon(
                    painter = rememberVectorPainter(image = Icons.Default.Search),
                    contentDescription = "Search",
                    tint = Color.White
                )
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = purple,
            scrolledContainerColor =

        ),

        )
}

@Composable
@Preview
fun ToopBarComponentPreview() {
    TopBarComponent()
}

@Composable
@Preview
fun ScaffoldTextPreview() {
    ScaffoldTest()
}