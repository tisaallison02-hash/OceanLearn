package com.allison.oceanlearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.allison.oceanlearn.ui.theme.OceanLearnTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            OceanLearnTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Greeting(
                        name = "OceanLearn",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "OCEANLEARN",
            fontSize = 32.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Protecting Life Below Water",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { }) {
            Text("Learn About Oceans")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { }) {
            Text("Marine Animals")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { }) {
            Text("Ocean Pollution")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { }) {
            Text("Take Quiz")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OceanLearnTheme {
        Greeting("OceanLearn")
    }
}