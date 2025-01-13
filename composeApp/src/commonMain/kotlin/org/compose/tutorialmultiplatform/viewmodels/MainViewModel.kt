package org.compose.tutorialmultiplatform.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.compose.tutorialmultiplatform.data.api.ApiClient
import org.compose.tutorialmultiplatform.data.models.PeopleItemModel
import org.compose.tutorialmultiplatform.data.models.RoomsModelItemModel
import util.Result

class MainViewModel(private val apiClient: ApiClient) : ViewModel() {
    private val _peopleState = MutableStateFlow<List<PeopleItemModel>>(emptyList())
    val peopleState: StateFlow<List<PeopleItemModel>> = _peopleState

    private val _roomsState = MutableStateFlow<List<RoomsModelItemModel>>(emptyList())
    val roomsState: StateFlow<List<RoomsModelItemModel>> = _roomsState

    init {
        fetchPeople()
        fetchRooms()
    }

    private fun fetchPeople() {
        viewModelScope.launch {
            when (val result = apiClient.getPeople()) {
                is Result.Success -> _peopleState.value = result.data
                is Result.Error -> {
                }
            }
        }
    }

    private fun fetchRooms() {
        viewModelScope.launch {
            when (val result = apiClient.getRooms()) {
                is Result.Success -> _roomsState.value = result.data
                is Result.Error -> {
                }
            }
        }
    }
}