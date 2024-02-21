package mvvm.app.koin.ui.activity

import mvvm.app.koin.db.local.UserDao
import mvvm.app.koin.db.local.UserEntity
import mvvm.app.koin.db.remont.ApiInterface

class MainRepo (
    private val doa:UserDao,
    private val api :ApiInterface
){
    suspend fun  getUsers():List<UserEntity>{

        val localUser = doa.getUsers()

        return  if(localUser.isNotEmpty()){
            localUser
        }else{
            api.getUsers().also {
                doa.insertUser(it)
            }
        }

    }
}