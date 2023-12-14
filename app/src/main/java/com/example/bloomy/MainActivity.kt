package com.example.bloomy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.Bloomy.ui.theme.MyApplicationTheme
import com.example.bloomy.auth.LoginScreen
import com.example.bloomy.auth.MainScreen
import com.example.bloomy.auth.SignupScreen
import com.example.bloomy.auth.SuccessScreen
import com.example.bloomy.main.NotificationMessage
import com.example.bloomy.ui.theme.LandingPage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window.statusBarColor = getColor(R.color.black)
            window.navigationBarColor = getColor(R.color.black)
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AuthenticationApp()
                }
            }
        }
    }
}


sealed class DestinationScreen(val route: String) {
    object Main: DestinationScreen("main")
    object Signup: DestinationScreen("signup")
    object Login: DestinationScreen("login")
    object Success: DestinationScreen("success")
    object LandingPage: DestinationScreen("landingpage")
}


@Composable
fun AuthenticationApp() {
    val vm = hiltViewModel<IgViewModel>()
    val navController = rememberNavController()

    NotificationMessage(vm)

    NavHost(
        navController = navController,
        startDestination = DestinationScreen.Main.route
    ) {
        composable(DestinationScreen.Main.route) {
            MainScreen(navController, vm)
        }
        composable(DestinationScreen.Signup.route) {
            SignupScreen(navController, vm)
        }
        composable(DestinationScreen.Login.route) {
            LoginScreen(navController, vm)
        }
        composable(DestinationScreen.Success.route) {
            SuccessScreen(navController, vm)
        }
        composable(DestinationScreen.LandingPage.route) {
            LandingPage()
        }
    }
}

