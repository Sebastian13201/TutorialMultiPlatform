package org.compose.tutorialmultiplatform.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import org.compose.tutorialmultiplatform.viewmodels.MainViewModel

@Composable
fun PeopleListView(viewModel: MainViewModel) {
    val people by viewModel.peopleState.collectAsState()
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(people) { person ->
            Text(text = person.name ?: "Unknown")
        }
    }
}