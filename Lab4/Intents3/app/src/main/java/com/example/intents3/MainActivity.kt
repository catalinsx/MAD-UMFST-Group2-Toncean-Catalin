package com.example.intents3

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.intents3.ui.theme.Intents3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Intents3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    User1ChatScreen()
                }
            }
        }
    }
}
@Composable
fun User1ChatScreen() {
    val context = LocalContext.current
    val messages = MessageDataSource.getMessages()
    val messageToSend = remember { mutableStateOf("") }

   Column(verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
       Button(
           onClick = {
               val intent = Intent(context, SecondActivity::class.java)
               context.startActivity(intent)
           }
       ) {
           Text("Switch to User2")
       }
   }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        messages.forEach {
            Text("User1: $it")
        }
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = messageToSend.value,
            onValueChange = { messageToSend.value = it },
            label = { Text("Type a message...") },
            modifier = Modifier.padding(8.dp)
        )
        Button(
            onClick = {
                MessageDataSource.addMessage(messageToSend.value)
                messageToSend.value = ""
            }
        ) {
            Text("Send")
        }
    }
}