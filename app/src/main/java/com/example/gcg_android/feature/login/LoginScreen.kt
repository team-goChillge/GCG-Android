package com.example.gcg_android.feature.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.gcg_android.R
import com.example.gcg_android.ui.theme.primary300

@Composable
fun LoginScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(primary300)
    ) {
        Image(
            painter = painterResource(R.drawable.bi_house),
            contentDescription = "login_back_first"
        )

        Column(
            modifier = Modifier
                .padding(top = 51.dp)
                .fillMaxSize()
        ) {

        }
    }
}