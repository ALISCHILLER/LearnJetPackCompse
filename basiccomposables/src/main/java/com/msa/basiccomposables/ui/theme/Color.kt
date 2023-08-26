package com.msa.basiccomposables.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val darkGray = Color(0xFF1a1717)
val darkBlue = Color(0xFF18192b)
val white = Color(0xFFF3F3F3)
val gray = Color(0xFF3F3F3F)
val blueGray = Color(0xFF404352)
val nightDark = Color(0xFF403757)

val purple = Color(0xFF9b11ba)
val orange = Color(0xFFdb660d)
val redOrange = Color(0xFFe84a23)
val green = Color(0xFF0ddb25)
val blue = Color(0xFF140ddb)
val brightBlue = Color(0xFF027cf5)


val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val Pink = Color(0xFFE2437E)

val Green200 = Color(0xFFAEFF82)
val Green300 = Color(0xFFC9FCAD)
val Green500 = Color(0xFF07A312)

val DarkColor = Color(0xFF101522)
val DarkColor2 = Color(0xFF202532)
val LightColor = Color(0xFF414D66)
val LightColor2 = Color(0xFF626F88)

val GreenGradient = Brush.linearGradient(
    colors = listOf(Green300, Green200),
    start = Offset(0f, 0f),
    end = Offset(Float.POSITIVE_INFINITY, 0f)
)

val DarkGradient = Brush.verticalGradient(
    colors = listOf(DarkColor2, DarkColor)
)
