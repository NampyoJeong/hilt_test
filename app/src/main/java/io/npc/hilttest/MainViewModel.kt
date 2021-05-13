package io.npc.hilttest

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor (
    val repository: MainRepository,
    val handle: SavedStateHandle,
) : ViewModel() {

    val repoName: String
        get() = repository.get()

    val param: String
        get() = handle.get<String>("param").orEmpty()

    init {
        Log.d("ViewModelLog", "init viewmodel")
    }
}

//class MyViewModelFactory(
//    private val application: Application,
//    private val param: String,
//) : ViewModelProvider.Factory {
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        return MainViewModel(param) as T
//    }
//}
