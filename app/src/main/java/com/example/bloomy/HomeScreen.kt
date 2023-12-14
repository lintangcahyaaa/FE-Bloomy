package com.example.bloomy

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.firebase.Firebase
import com.google.firebase.database.database

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    val database = Firebase.database
    val myRef = database.getReference("message")

    myRef.setValue("Hello, World!")

    var text by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = text,
            onValueChange = {newText -> text = newText},
            label = { Text(text = "Masukkan nama") }
        )
        Button(
            onClick = { myRef.setValue(text) },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text ="Submit")
        }
    }
}