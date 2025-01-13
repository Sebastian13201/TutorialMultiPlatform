package org.compose.tutorialmultiplatform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.ktor.client.engine.okhttp.OkHttp
import org.compose.tutorialmultiplatform.data.api.ApiClient
import org.compose.tutorialmultiplatform.data.api.createHttpClient


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(client = ApiClient(createHttpClient(OkHttp.create())))
        }
    }
}