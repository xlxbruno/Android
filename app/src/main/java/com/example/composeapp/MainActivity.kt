package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column {greeting()
                greeting2()
            }

            }
        }
    @Preview
    @Composable
    fun greeting(){
        Column() {
           Text("Hanks Bruno", style = TextStyle(color = Color.Red, fontWeight = FontWeight.Bold))
           Text("Robinson", style = TextStyle(color = Color.Red, fontWeight = FontWeight.Light))
           Text("Joseph", style = TextStyle(color = Color.Red, fontWeight = FontWeight.Light))
        }

    }

    @Preview
    @Composable
    fun greeting2(){
        Column() {
            Text("Hanks Bruno", style = TextStyle(color = Color.Yellow, fontWeight = FontWeight.Bold))
            Text("Robinson", style = TextStyle(color = Color.Yellow), modifier = Modifier.padding(all = 20.dp))
            Text("joseph")
        }


}}


