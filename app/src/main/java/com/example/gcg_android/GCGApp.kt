package com.example.gcg_android

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gcg_android.feature.intro.IntroScreen
import com.example.gcg_android.feature.login.LoginScreen
import com.example.gcg_android.feature.signup.SignUpScreen
import com.example.gcg_android.feature.signup.lesser.LesserScreen
import com.example.gcg_android.feature.signup.tenant.TenantScreen

@Composable
fun GCGApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "intro"
    ) {
        composable("login") {
            LoginScreen(modifier, navController)
        }
        composable("intro") {
            IntroScreen(modifier, navController)
        }
        composable("signup") {
            SignUpScreen(modifier, navController)
        }
        composable("lesser") {
            LesserScreen(modifier, navController)
        }
        composable("tenant") {
            TenantScreen(modifier, navController)
        }
    }
}