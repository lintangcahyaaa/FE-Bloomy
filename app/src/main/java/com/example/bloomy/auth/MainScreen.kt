package com.example.bloomy.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bloomy.DestinationScreen
import com.example.bloomy.IgViewModel

@Composable
fun MainScreen(navController: NavController, vm: IgViewModel) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        // Background with color EB7B8A
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                    colors = listOf(Color.White, Color(0xFFEB7B8A),Color.White)
                    )
                )
        )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp)
    ) {
//        Image(
//            painter = painterResource(id = R.drawable.em),
//            contentDescription = null,
//            Modifier.size(200.dp)
//        )
        Text(
            text = "Welcome",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.height(80.dp))
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(50.dp))
                .background(Color.White)
                )
        {
            Button(onClick = {
                navController.navigate(DestinationScreen.Signup.route)
            },
                colors = ButtonDefaults.buttonColors(
                    Color.Transparent
                ),
                modifier = Modifier.width(300.dp)
            ) {
                Text(
                    text = "Sign Up",
                    color = Color.Black,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(50.dp))
                .background(Color.White)
        )
        {
            Button(onClick = {
                navController.navigate(DestinationScreen.Login.route)
            },
                colors = ButtonDefaults.buttonColors(
                    Color.Transparent
                ),
                modifier = Modifier.width(300.dp)
            ) {
                Text(
                    text = "Log In",
                    color = Color.Black,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
}
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}

fun MainScreen() {
    TODO("Not yet implemented")
}


