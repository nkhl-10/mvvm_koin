package mvvm.app.koin.ui.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mvvm.app.koin.db.local.UserEntity

class MainViewModel (
    private val repo:MainRepo
):ViewModel(){
    private val _user = MutableLiveData<List<UserEntity>>()
    val user:LiveData<List<UserEntity>> = _user

    suspend fun fetchUser(){
        viewModelScope.launch {
            _user.value =repo.getUsers()
        }
    }



}