package com.example.gcg_android.feature.login

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.gcg_android.R
import com.example.gcg_android.ui.theme.label2
import com.example.gcg_android.ui.theme.primary300
import com.example.gcg_android.ui.theme.primary400

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    viewModel: LoginViewModel = viewModel()
) {
    var idText by remember { mutableStateOf("") }
    var pwText by remember { mutableStateOf("") }


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

        TextButton(onClick = { navController.navigate("home") }) {
            Image(
                modifier = modifier
                    .padding(top = 48.dp, start = 10.dp)
                    .size(width = 24.dp, height = 18.dp),
                painter = painterResource(R.drawable.left_arrow),
                contentDescription = "login_back_second"
            )
        }

        Canvas(modifier = modifier
            .padding(top = 150.dp)
            .fillMaxSize()
        ) {
            drawRoundRect(
                color = label2,
                cornerRadius = CornerRadius(60f, 60f),

            )
        }
        Image(
            modifier = modifier
                .padding(bottom = 200.dp)
                .align(Alignment.Center)
                .size(155.dp),
            painter = painterResource(R.drawable.bi_house),
            contentDescription = "logo"
        )
        Column(
            modifier = modifier
                .padding(top = 450.dp)
        ) {
            Text(
                modifier = modifier
                    .padding(start = 40.dp),
                text = "아이디",
                //fontFamily =
            )

            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp, vertical = 20.dp),
                value = idText,
                onValueChange = { idText = it },
                placeholder = { Text("아이디를 입력하세요.") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF404040),
                    unfocusedBorderColor = Color(0xFF404040)),
                shape = RoundedCornerShape(12.dp)
                //textStyle =
            )

            Text(
                modifier = modifier
                    .padding(start = 40.dp),
                text = "비밀번호",
            )

            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp, vertical = 20.dp),
                value = pwText,
                onValueChange = { pwText = it },
                placeholder = { Text("비밀번호를 입력하세요.") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF404040),
                    unfocusedBorderColor = Color(0xFF404040)),
                shape = RoundedCornerShape(12.dp)
                //textStyle =
            )

            Button(
                modifier = modifier
                    .padding(horizontal = 24.dp)
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                onClick = { navController.navigate("signup")},
                colors = ButtonDefaults.buttonColors(
                    containerColor = primary400,
                    contentColor = primary400,
                    disabledContainerColor = primary400,
                    disabledContentColor = primary400,
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = "로그인", color = Color.White)
            }
        }


    }
}