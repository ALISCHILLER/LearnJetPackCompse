package com.msa.basiccomposables.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msa.basiccomposables.R

@Composable
fun ImagePicture(){
    Image(
      painter =   painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "android"
    )
}
@Composable
fun ImagePictureCustom(){
    Image(
        painter =   painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "android",
        modifier = Modifier
            .size(160.dp)
            .scale(0.6f)
            .aspectRatio(16f/9f)
            .blur(
                radiusX = 10.dp,
                radiusY = 10.dp,
                edgeTreatment = BlurredEdgeTreatment(shape = RoundedCornerShape(percent = 5))
            )
            .clip(CircleShape)
            .border(width = 2.dp,
                color = Color.Red,
                shape = CircleShape
            ),
        contentScale = ContentScale.Crop
    )
}
@Composable
@Preview
fun ImagePictureCustomPreview(){
    ImagePictureCustom()
}

@Composable
@Preview
fun ImagePicturePreview(){
    ImagePicture()
}