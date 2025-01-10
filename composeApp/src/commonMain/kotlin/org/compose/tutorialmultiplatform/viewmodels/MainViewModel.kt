package org.compose.tutorialmultiplatform.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.compose.tutorialmultiplatform.data.models.PeopleItemModel
import org.compose.tutorialmultiplatform.data.models.RoomsModelItemModel
import org.koin.core.KoinApplication.Companion.init

classMainViewModel : ViewModel() {
    private val _peopleState = MutableStateFlow<List<PeopleItemModel>>(emptyList())
    val peopleState: StateFlow<List<PeopleItemModel>> = _peopleState

    private val _roomsState = MutableStateFlow<List<RoomsModelItemModel>>(emptyList())
    val roomsState: StateFlow<List<RoomsModelItemModel>> = _roomsState

    init {
        fetchPeople()
        fetchRooms()
    }
    private fun fetchPeople() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                // Replace with your actual API call logic
                val people = ApiService.getPeople()
                // Safe update to MutableStateFlow
                _peopleState.value = people
            } catch (e: Exception) {
                // Handle error (e.g., logging or showing error to the user)
            }
        }
    }

    private fun fetchRooms() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                // Replace with your actual API call logic
                val rooms = ApiService.getRooms()
                // Safe update to MutableStateFlow
                _roomsState.value = rooms
            } catch (e: Exception) {
                // Handle error (e.g., logging or showing error to the user)
            }
        }
    }
}