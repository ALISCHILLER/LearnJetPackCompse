package com.msa.basiccomposables.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ConstaintLayoutComponent() {

    ConstraintLayout {
        val (redBox,blueBox,yelloBox) = createRefs()


        Box(modifier = Modifier.size(50.dp).background(Color.Red)
            .constrainAs(redBox){})
        Box(modifier = Modifier.size(50.dp).background(Color.Blue)
            .constrainAs(blueBox){
                top.linkTo(redBox.bottom)
            })
        Box(modifier = Modifier.size(50.dp).background(Color.Yellow)
            .constrainAs(yelloBox){
                top.linkTo(blueBox.bottom)
            })
    }

}


@Composable
@Preview
fun ConstaintLayoutComponentPreview() {
    ConstaintLayoutComponent()
}