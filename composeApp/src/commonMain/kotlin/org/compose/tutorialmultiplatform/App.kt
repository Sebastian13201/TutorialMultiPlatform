package org.compose.tutorialmultiplatform

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import org.compose.tutorialmultiplatform.ui.PeopleListView
import org.compose.tutorialmultiplatform.ui.RoomList
import org.compose.tutorialmultiplatform.viewmodels.MainViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composabl

@Composable
@Preview
fun App() {
    MaterialTheme {
        val viewModel: MainViewModel = viewModel()

        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            PeopleListView(viewModel = viewModel)
            RoomList(viewModel = viewModel)
        }
    }
}

