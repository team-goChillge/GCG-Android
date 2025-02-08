package com.example.gcg_android.feature.signup.tenant

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.navigation.NavController
import com.example.gcg_android.R
import com.example.gcg_android.ui.theme.label2
import com.example.gcg_android.ui.theme.primary300
import com.example.gcg_android.ui.theme.primary500

@Composable
fun TenantScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    var idText by remember { mutableStateOf("") }
    var pwText by remember { mutableStateOf("") }
    var tellText by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }

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

        TextButton(onClick = { navController.navigate("signup") }) {
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
            modifier = Modifier.padding(top = 200.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp) // 간격 조정
        ) {
             InputField(
                label = "아이디",
                text = idText,
                onTextChange = { idText = it })
             InputField(
                label = "비밀번호",
                text = pwText,
                onTextChange = { pwText = it })
             InputField(
                label = "전화번호",
                text = tellText,
                onTextChange = { tellText = it })
             InputField(
                label = "이름",
                text = name,
                onTextChange = { name = it })

            Button(
                modifier = modifier
                    .padding(horizontal = 24.dp)
                    .fillMaxWidth()
                    .padding(bottom = 60.dp),
                onClick = { navController.navigate("login") },
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
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputField(label: String, text: String, onTextChange: (String) -> Unit) {
    Column {
        Text(
            modifier = Modifier.padding(start = 40.dp),
            text = label
        )
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp, vertical = 8.dp), // 세로 간격 줄임
            value = text,
            onValueChange = onTextChange,
            placeholder = { Text("$label 를 입력하세요.") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF404040),
                unfocusedBorderColor = Color(0xFF404040)
            ),
            shape = RoundedCornerShape(12.dp)
        )
    }
}