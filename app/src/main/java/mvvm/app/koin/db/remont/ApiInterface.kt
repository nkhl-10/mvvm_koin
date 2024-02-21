package mvvm.app.koin.db.remont

import mvvm.app.koin.db.local.UserEntity
import retrofit2.http.GET


interface ApiInterface {
    @GET("todos")
    suspend fun getUsers(): List<UserEntity>
}
