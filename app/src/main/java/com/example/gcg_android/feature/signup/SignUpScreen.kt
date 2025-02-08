package com.example.gcg_android.feature.signup

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.gcg_android.ui.theme.label2

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Canvas(modifier = modifier
            .padding(top = 150.dp)
            .fillMaxSize()
        ) {
            drawRoundRect(
                color = label2,
                cornerRadius = CornerRadius(60f, 60f),
            )
        }
    }
}