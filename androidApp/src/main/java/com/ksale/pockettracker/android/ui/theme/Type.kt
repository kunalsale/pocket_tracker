package com.ksale.pockettracker.android.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.ksale.pockettracker.android.R

val OutfitFontFamily = FontFamily(
    Font(R.font.outfit_regular),
    Font(R.font.outfit_bold, FontWeight.Bold),
    Font(R.font.outfit_medium, FontWeight.Medium),
)
// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = OutfitFontFamily,
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)