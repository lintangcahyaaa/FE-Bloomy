package com.example.bloomy.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bloomy.DestinationScreen
import com.example.bloomy.IgViewModel
import com.example.bloomy.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavController, vm: IgViewModel) {
    val emty by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var cpassword by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
    var cpasswordVisibility by remember { mutableStateOf(false) }
    var errorE by remember { mutableStateOf(false) }
    var errorP by remember { mutableStateOf(false) }
    var errorCP by remember { mutableStateOf(false) }
    var errorC by remember { mutableStateOf(false) }
    var plength by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        // Background with color EB7B8A
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFEB7B8A))
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (vm.inProgress.value) {
                CircularProgressIndicator()
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 150.dp)
                .verticalScroll(
                    rememberScrollState()
                )
        ) {
            Text(
                text = "User Signup",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )
            Spacer(modifier = Modifier.height(50.dp))
            if (errorE) {
                Text(
                    text = "Enter email",
                    color = Color.Red,
                    modifier = Modifier.padding(end = 100.dp)
                )
            }
            TextField(
                value = email,
                onValueChange = {
                    email = it
                },
                label = {
                    Text(text = "Email")
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_person_24),
                        contentDescription = null
                    )
                },
                trailingIcon = {
                    if (email.isNotEmpty()) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_close_24),
                            contentDescription = null,
                            Modifier.clickable { email = emty }
                        )
                    }
                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Next
                ),
                singleLine = true,
                textStyle = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                ),
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .width(300.dp)
                    .height(60.dp),
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    containerColor = Color(0x30FFFFFF),
                    focusedLeadingIconColor = Color.White,
                    unfocusedLeadingIconColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    cursorColor = Color.Red,
                    focusedTrailingIconColor = Color.White,
                    unfocusedTrailingIconColor = Color.White
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            if (errorP) {
                Text(
                    text = "Masukkan Password",
                    color = Color.Red,
                    modifier = Modifier.padding(end = 100.dp)
                )
            }
            if (plength) {
                Text(
                    text = "Password harus 6 karakter",
                    color = Color.Red,
                    modifier = Modifier.padding(end = 100.dp)
                )
            }
            TextField(
                value = password,
                onValueChange = {
                    password = it
                    plength = it.length < 6
                },
                label = {
                    Text(text = "Password")
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_lock_24),
                        contentDescription = null
                    )
                },
                trailingIcon = {
                    if (password.isNotEmpty()) {
                        val visibilityIcon = if (passwordVisibility) {
                            painterResource(id = R.drawable.baseline_visibility_24)
                        } else {
                            painterResource(id = R.drawable.baseline_visibility_off_24)
                        }
                        Icon(
                            painter = visibilityIcon,
                            contentDescription = if (passwordVisibility) "Sembunyikan Password" else "Tunjukkan Password",
                            Modifier.clickable {
                                passwordVisibility = !passwordVisibility
                            }
                        )
                    }
                },
                visualTransformation = if (passwordVisibility) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Next,
                    keyboardType = KeyboardType.Password
                ),
                singleLine = true,
                textStyle = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                ),
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .width(300.dp)
                    .height(60.dp),
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    containerColor = Color(0x30FFFFFF),
                    focusedLeadingIconColor = Color.White,
                    unfocusedLeadingIconColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    cursorColor = Color.Red,
                    focusedTrailingIconColor = Color.White,
                    unfocusedTrailingIconColor = Color.White
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            if (errorCP) {
                Text(
                    text = "Password Tidak Cocok",
                    color = Color.Red,
                    modifier = Modifier.padding(end = 100.dp)
                )
            }
            if (errorC) {
                Text(
                    text = "Masukkan Konfirmasi Password",
                    color = Color.Red,
                    modifier = Modifier.padding(end = 100.dp)
                )
            }
            TextField(
                value = cpassword,
                onValueChange = {
                    cpassword = it
                },
                label = {
                    Text(text = "Konfirmasi Password")
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_lock_24),
                        contentDescription = null
                    )
                },
                trailingIcon = {
                    if (cpassword.isNotEmpty()) {
                        val visibilityIcon = if (cpasswordVisibility) {
                            painterResource(id = R.drawable.baseline_visibility_24)
                        } else {
                            painterResource(id = R.drawable.baseline_visibility_off_24)
                        }
                        Icon(
                            painter = visibilityIcon,
                            contentDescription = if (cpasswordVisibility) "Sembunyikan Password" else "Tunjukkan Password",
                            Modifier.clickable {
                                cpasswordVisibility = !cpasswordVisibility
                            }
                        )
                    }
                },
                visualTransformation = if (cpasswordVisibility) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Done,
                    keyboardType = KeyboardType.Password
                ),
                singleLine = true,
                textStyle = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                ),
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .width(300.dp)
                    .height(60.dp),
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    containerColor = Color(0x30FFFFFF),
                    focusedLeadingIconColor = Color.White,
                    unfocusedLeadingIconColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    cursorColor = Color.Red,
                    focusedTrailingIconColor = Color.White,
                    unfocusedTrailingIconColor = Color.White
                )
            )
            Spacer(modifier = Modifier.height(50.dp))
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50.dp))
                    .background(
                        color = Color.White
                    )
            ) {
                Button(
                    onClick = {
                        if (email.isNotEmpty()) {
                            errorE = false
                            if (password.isNotEmpty()) {
                                errorP = false
                                if (cpassword.isNotEmpty()) {
                                    errorC = false
                                    if (password == cpassword) {
                                        errorCP = false
                                        vm.onSignup(
                                            email,
                                            password
                                        )
                                    } else {
                                        errorCP = true
                                    }
                                } else {
                                    errorC = true
                                }
                            } else {
                                errorP = true
                            }
                        } else {
                            errorE = true
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        Color.Transparent
                    ),
                    modifier = Modifier.width(200.dp)
                ) {
                    Text(
                        text = "Sign Up",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                if (vm.signedIn.value) {
                    navController.navigate(DestinationScreen.Success.route)
                }
                vm.signedIn.value = false
            }
        }
    }
}

