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
import kotlinx.coroutines.launch
import org.compose.tutorialmultiplatform.data.api.ApiClient
import util.NetworkError

@Composable
@Preview
fun App(client: ApiClient) {
    MaterialTheme {
        var isLoading by remember { mutableStateOf(false) }
        var errorMessage by remember { mutableStateOf<NetworkError?>(null) }
        var resultMessage by remember { mutableStateOf<String?>(null) }
        val scope = rememberCoroutineScope()

        // Function to fetch data
        fun fetchData() {
            scope.launch {
                isLoading = true
                errorMessage = null
                resultMessage = null

                val result = client.getPeople()

                when (result) {
                    is util.Result.Success -> {
                        resultMessage = "Successfully fetched data!"
                    }
                    is util.Result.Error -> {
                        errorMessage = result.error
                    }
                }

                isLoading = false
            }
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
        ) {
            Button(onClick = { fetchData() }) {
                if (isLoading) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(15.dp),
                        strokeWidth = 1.dp,
                        color = Color.White
                    )
                } else {
                    Text("Fetch Data")
                }
            }

            // Show error message if any
            errorMessage?.let {
                Text(text = "Error: $it", color = Color.Red)
            }

            // Show result message
            resultMessage?.let {
                Text(text = it, color = Color.Green)
            }
        }
    }
}
