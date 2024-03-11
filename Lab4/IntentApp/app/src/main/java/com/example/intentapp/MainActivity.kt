package com.example.intentapp

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import com.example.intentapp.ui.theme.IntentAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    IntentsApp(context = this@MainActivity)
                }
            }
        }
    }
}

@Composable
fun IntentsApp(context: Context){
   Column(
       verticalArrangement = Arrangement.SpaceAround,
       horizontalAlignment = Alignment.CenterHorizontally,
       modifier = Modifier.fillMaxSize()
   ) {
       Button(onClick = {
           Intent(Intent.ACTION_MAIN).also {
               it.`package`="com.google.android.gm"
               try {
                   startActivity(context, it, null)
               } catch (e: ActivityNotFoundException){
                   e.printStackTrace()
               }
           }
       }) {
           Image(
               painter = painterResource(id = R.drawable.gmail),
               contentDescription = null
           )
       }
       Button(onClick = {
           Intent(Intent.ACTION_MAIN).also {
               it.`package`="com.google.android.googlequicksearchbox"
               try {
                   startActivity(context, it, null)
               } catch (e: ActivityNotFoundException){
                   e.printStackTrace()
               }
           }
       }) {
           Image(
               painter = painterResource(id = R.drawable.google),
               contentDescription = null
           )
       }
       Button(onClick = {
           Intent(Intent.ACTION_MAIN).also {
               it.`package`="com.google.android.youtube"
               try {
                   startActivity(context, it, null)
               } catch (e: ActivityNotFoundException){
                   e.printStackTrace()
               }
           }
       }) {
           Image(
               painter = painterResource(id = R.drawable.youtube),
               contentDescription = null
           )
       }
   }
}
