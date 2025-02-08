package com.example.gcg_android.feature.signup

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gcg_android.R
import com.example.gcg_android.ui.theme.label2
import com.example.gcg_android.ui.theme.primary100
import com.example.gcg_android.ui.theme.primary300

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
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
        Spacer(modifier = modifier.size(240.dp))
        Image(
            modifier = modifier
                .align(Alignment.BottomStart)
                .size(height = 124.dp, width = 124.dp),
            painter = painterResource(R.drawable.two_people),
            contentDescription = "login_back_second"
        )

        TextButton(onClick = { navController.navigate("intro") }) {
            Image(
                modifier = modifier
                    .padding(top = 48.dp, start = 10.dp)
                    .size(width = 24.dp, height = 18.dp),
                painter = painterResource(R.drawable.left_arrow),
                contentDescription = "login_back_second"
            )
        }

        Canvas(
            modifier = modifier
                .padding(top = 150.dp)
                .fillMaxSize()
        ) {
            drawRoundRect(
                color = label2,
                cornerRadius = CornerRadius(60f, 60f),
            )
        }

        Column(
            modifier = modifier
                .align(Alignment.Center)
                .padding(horizontal = 32.dp, vertical = 160.dp)
                .fillMaxWidth()
        ) {
            Button(
                onClick = { navController.navigate("lesser") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(bottom = 8.dp)
                    .background(Color.White)
            ) {
                Column {
                    Text(
                        text = "임대인",
                        color = Color.Black,
                        modifier = modifier.align(Alignment.Start),
                        fontSize = 24.sp
                    )
                    Icon(
                        painterResource(id = R.drawable.house),
                        contentDescription = "임대인",
                        tint = Color.Black,
                        modifier = modifier.size(240.dp)
                    )
                }
            }

            Button(
                onClick = { navController.navigate("tenant") },
                colors = ButtonDefaults.buttonColors(containerColor = primary100),
                modifier = modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 8.dp)
                    .background(primary100)
            ) {
                Column {
                    Text(text = "세입자", color = Color.Black, modifier = modifier.align(Alignment.Start), fontSize = 24.sp)
                    Icon(
                        painterResource(id = R.drawable.people),
                        contentDescription = "세입자",
                        tint = Color.Black,
                        modifier = modifier.size(240.dp)
                    )
                }
            }
        }
    }
}