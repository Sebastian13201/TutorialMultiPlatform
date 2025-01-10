package org.compose.tutorialmultiplatform.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import org.compose.tutorialmultiplatform.viewmodels.MainViewModel

@Composable
fun RoomList(viewModel: MainViewModel) {
    val rooms = viewModel.roomsState.collectAsState().value
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(rooms) { room ->
            RoomItem(room)
        }
    }
}