package org.compose.tutorialmultiplatform.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.compose.tutorialmultiplatform.data.models.PeopleItemModel

@Composable
fun PersonItem(person: PeopleItemModel) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Name: ${person.firstName} ${person.lastName}")
        Text(text = "Email: ${person.email}")
    }
}