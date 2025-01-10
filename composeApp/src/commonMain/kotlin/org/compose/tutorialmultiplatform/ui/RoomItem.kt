package org.compose.tutorialmultiplatform.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.compose.tutorialmultiplatform.data.models.RoomsModelItemModel

@Composable
fun RoomItem(room: RoomsModelItemModel) {
    // Display each room's properties (customize this as needed)
    Column(modifier = Modifier.fillMaxSize()) {
        BasicText(text = "Room ID: ${room.id}")
        BasicText(text = "Max Occupancy: ${room.maxOccupancy}")
        BasicText(text = "Is Occupied: ${room.isOccupied}")
    }
}