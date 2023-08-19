package com.msa.basiccomposables

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msa.basiccomposables.ui.theme.LearnJetPackCompseTheme

class MainActivityBasicComposables : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetPackCompseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // Greeting("Android")
                    ButtonComponent()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .padding(20.dp)
        .background(Color.White)

    ) {
        SelectionContainer {

            Text(
                modifier = Modifier.verticalScroll(state = rememberScrollState()).padding(20.dp),
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
fun ButtonComponent() {
    val context= LocalContext.current.applicationContext
    Column(modifier = Modifier
        .background(Color.White)
        .padding(10.dp),){
        Button(
            onClick = { Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show()},
            shape = RoundedCornerShape(size = 10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red
            ),
            elevation = ButtonDefaults.buttonElevation(90.dp),
            modifier = Modifier
                .width(200.dp)
                .height(100.dp)
                .padding(10.dp)

        ) {
            Text(text = "Click")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnJetPackCompseTheme {
      //  Greeting("Android")
        ButtonComponent()
    }
}