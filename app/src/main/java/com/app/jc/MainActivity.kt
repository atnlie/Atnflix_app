package com.app.jc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.app.jc.ui.theme.JCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JCTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("android")
//                }
                GreetingPreview()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Surface (
        modifier = modifier.padding(3.dp),
        color = MaterialTheme.colorScheme.tertiary
    ) {
        Row (modifier = modifier.padding(10.dp)) {
            Column(modifier = modifier
                .padding(bottom = if(expanded) 0.dp else 100.dp)
                .weight(1.0f)) {
                Text(text = "Hello,")
                Text(text = name)
            }
            Button(onClick = {
                expanded = !expanded
            }) {
                Text(if (expanded) "Show more" else "Show less")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JCTheme {
        Column (modifier = Modifier.padding(5.dp)) {
            Greeting("Anton")
            Greeting("Budi")
        }
    }
}