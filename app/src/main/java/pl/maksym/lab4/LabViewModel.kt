package pl.maksym.lab4

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class LabViewModel : ViewModel() {

    private val _items = mutableStateListOf<LabItem>()
    val items: List<LabItem> get() = _items

    fun addItem(title: String, description: String, number: Int) {
        _items.add(LabItem(title, description, number))
    }
}
