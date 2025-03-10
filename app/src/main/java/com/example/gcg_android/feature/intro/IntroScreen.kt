package com.example.gcg_android.feature.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.gcg_android.R
import com.example.gcg_android.ui.theme.primary300
import com.example.gcg_android.ui.theme.primary500

@Composable
fun IntroScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    viewModel: IntroViewModel = viewModel()
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(primary300)
    ) {
        Image(
            modifier = modifier
                .align(Alignment.TopEnd)
                .size(height = 240.dp, width = 240.dp),
            painter = painterResource(R.drawable.rotate_house),
            contentDescription = "login_back_first"
        )
        Spacer(modifier = modifier.size(200.dp))
        Image(
            modifier = modifier
                .align(Alignment.Center)
                .size(155.dp),
            painter = painterResource(R.drawable.logo),
            contentDescription = "logo"
        )
        IconButton(onClick = { navController.navigate("home") }) {
            Icon(
                modifier = modifier
                    .padding(bottom = 150.dp)
                    .align(Alignment.BottomStart)
                    .size(height = 124.dp, width = 124.dp),
                painter = painterResource(R.drawable.two_people),
                contentDescription = "login_back_second"
            )
        }

        Button(
            modifier = modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth()
                .padding(bottom = 120.dp)
                .align(Alignment.BottomCenter),
            onClick = { navController.navigate("login")},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.White,
                disabledContainerColor = Color.White,
                disabledContentColor = Color.White,
            ),
            shape = RoundedCornerShape(10.dp),
            contentPadding = PaddingValues(12.dp),
        ) {
            Text(text = "로그인", color = Color.Black)
        }

        Button(
            modifier = modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth()
                .padding(bottom = 60.dp)
                .align(Alignment.BottomCenter),
            onClick = { navController.navigate("signup") },
            colors = ButtonDefaults.buttonColors(
                containerColor = primary500,
                contentColor = primary500,
                disabledContainerColor = primary500,
                disabledContentColor = primary500,
            ),
            shape = RoundedCornerShape(10.dp),
            contentPadding = PaddingValues(12.dp),
        ) {
            Text(text = "회원가입", color = Color.White)
        }
    }
}