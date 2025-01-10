package org.compose.tutorialmultiplatform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.compose.tutorialmultiplatform.ui.PeopleListView
import org.compose.tutorialmultiplatform.ui.RoomList
import org.compose.tutorialmultiplatform.viewmodels.MainViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    val viewModel = getViewModel<MainViewModel>()

    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            PeopleListView(viewModel = viewModel)
            RoomList(viewModel = viewModel)
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}