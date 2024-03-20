package com.example.intents2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.intents2.ui.theme.Intents2Theme

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Intents2Theme {
                ThirdActivityComposable()
            }
        }
    }
}


@Composable
fun ThirdActivityComposable(){
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Lexus LC500",
            fontSize = 32.sp,
            fontFamily = FontFamily.Monospace
        )
        Image(
            painter = painterResource(id = R.drawable.lexuslc),
            contentDescription = null,
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Text(
            text = stringResource(id = R.string.lcDescription),
            modifier = Modifier.padding(16.dp),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Monospace
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(onClick = {
                val intent = Intent(context, SecondActivity::class.java)
                context.startActivity(intent)

            }) {
                Text("Previous")
            }
        }
    }
}