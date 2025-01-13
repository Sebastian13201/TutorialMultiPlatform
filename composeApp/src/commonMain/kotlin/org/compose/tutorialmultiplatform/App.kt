package org.compose.tutorialmultiplatform

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.compose.tutorialmultiplatform.data.api.ApiClient
import util.NetworkError

@Composable
@Preview
fun App(client: ApiClient) {
    MaterialTheme {
        var isLoading by remember { mutableStateOf( false) }
        var errorMessage by remember { mutableStateOf<NetworkError?>(null) }
        val scope = rememberCoroutineScope()
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
        ) {
            Button(onClick = {

            }){
                if(isLoading){
                    CircularProgressIndicator(
                        modifier = Modifier
                            .size(15.dp),
                        strokeWidth = 1.dp,
                        color = Color.White

                    )
                }
                Text("")
            }
        }
    }
}

