package com.msa.basiccomposables.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.msa.basiccomposables.data.BottomMenuItem
import com.msa.basiccomposables.ui.theme.*


@Composable
fun bottomNavigationComponent() {

    val bottomItemList = prepareBottomMenu()
    val context = LocalContext.current

    var selectedItem by remember {
        mutableStateOf("Home")
    }

    Box(modifier = Modifier.fillMaxSize()) {
        NavigationBar(
                modifier = Modifier
                    .align(alignment = Alignment.BottomCenter),
            containerColor=orange

        ) {
            bottomItemList.forEach {menuItem ->
                NavigationBarItem(
                    selected =(selectedItem == menuItem.title) ,
                    onClick = {
                              selectedItem=menuItem.title
                        Toast.makeText(context, menuItem.title, Toast.LENGTH_SHORT).show()
                    },
                    icon = {
                        Icon(
                            painter = rememberVectorPainter(image = menuItem.icon),
                            contentDescription = menuItem.title
                        )
                    },
                    label = {
                        Text(text = menuItem.title)
                    },
                    enabled = true

                )
            }



        }
    }
}

private fun prepareBottomMenu():List<BottomMenuItem>{
    val bottomMenuItemList = arrayListOf<BottomMenuItem>()

    bottomMenuItemList.add(BottomMenuItem("Home", Icons.Default.Home))
    bottomMenuItemList.add(BottomMenuItem("setting", Icons.Default.Settings))
    bottomMenuItemList.add(BottomMenuItem("Profile", Icons.Default.Person))

    return bottomMenuItemList
}
@Composable
@Preview
fun bottomNavigationComponentPreview() {
    bottomNavigationComponent()
}