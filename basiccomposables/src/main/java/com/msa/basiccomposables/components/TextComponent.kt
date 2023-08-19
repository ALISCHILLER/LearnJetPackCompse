package com.msa.basiccomposables.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msa.basiccomposables.R


@Composable
fun TextComponent(){

    SelectionContainer {


    Text(
        text = "Hello my Friends, hi ,salam , #### ,45566",
        color = Color.Blue,
        fontSize = 48.sp,
        style = TextStyle(textDecoration = TextDecoration.LineThrough),
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        lineHeight = 60.sp,
        letterSpacing = 2.sp,
        fontFamily = FontFamily.Cursive,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
    }
}


@Composable
fun TextUsersList(list: List<String>){


    Column(modifier = Modifier
        .padding(20.dp)
        .background(Color.White)

    ){
    for (i in  list){
          Text(
              text ="hi $i",
              color = Color.White,
              fontSize = 48.sp,
              modifier = Modifier
                  .background(Color.Red)
                  .padding(12.dp)
          )
      }
    }

}

@Composable
fun TextComponentScroll(){

    Column(modifier = Modifier
        .padding(20.dp)
        .background(Color.White)

    ) {
        SelectionContainer {

            Text(
                modifier = Modifier
                    .verticalScroll(state = rememberScrollState())
                    .padding(20.dp),
                text = stringResource(id = R.string.txtScroll),
                color = Color.Blue,
                fontFamily = FontFamily.Cursive,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraBold,
                textDecoration = TextDecoration.Underline,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


@Composable
fun  TextComponentBox(){
    Box(modifier = Modifier.fillMaxSize().background(Color.White)){
        Text(
            text = "Hello my Friends",
            color = Color.Red,
            fontSize = 48.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
        )

        Box(
            Modifier.align(Alignment.TopCenter)
                .fillMaxHeight().width(50.dp)
                .background(Color.Cyan)
        )

        Text(
            text = "Hello my Friends",
            color = Color.Black,
            fontSize = 48.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.align(Alignment.Center)
        )

    }
}


@Composable
@Preview
fun  TextComponentBoxPreview(){
    TextComponentBox()
}
@Composable
@Preview
fun TextComponentScrollPreview(){
    TextComponentScroll()
}
@Composable
@Preview
fun TextUsersListPreview(){
    val usersList= listOf<String>("user","2","3","4","5","6","7")
    TextUsersList(usersList)
}

@Composable
@Preview
fun TextComponentPreview(){
    TextComponent()
}

