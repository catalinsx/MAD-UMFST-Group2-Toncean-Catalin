package com.example.calculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorapp.ui.theme.CalculatorAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculator()
                }
            }
        }
    }
}

@Composable
fun Calculator(){
    var text by remember { mutableStateOf("")}
    var text2 by remember { mutableStateOf("")}
    var result by remember { mutableIntStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Result: $result",
            fontSize = 32.sp
        )
        OutlinedTextField(
            value = text,
            label = { Text(text = "First number") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { it ->
                text = it
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = text2,
            label = { Text(text = "Second number") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { it ->
                text2 = it
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.padding(8.dp)
        ){
            Button(onClick = {
                result = text.toInt() + text2.toInt()
            }) {
                Text("+", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {
                result = text.toInt() - text2.toInt()
            }) {
                Text("-", fontSize = 24.sp)
            }
        }
        Row() {
            Button(onClick = {
                result = text.toInt() / text2.toInt()
            }) {
                Text("/", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {
                result = text.toInt() * text2.toInt()
            }) {
                Text("*", fontSize = 24.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorPreview(){
    Calculator()
}