package com.example.gcg_android

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gcg_android.feature.intro.HomeScreen
import com.example.gcg_android.feature.login.LoginScreen
import com.example.gcg_android.feature.signup.SignUpScreen

@Composable
fun GCGApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("login") {
            LoginScreen(modifier, navController)
        }
        composable("intro") {
            HomeScreen(modifier, navController)
        }
        composable("signup") {
            SignUpScreen(modifier, navController)
        }
    }
}