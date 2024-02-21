package mvvm.app.koin.di

import android.content.Context
import androidx.room.Room
import mvvm.app.koin.db.local.RoomDB
import mvvm.app.koin.db.remont.ApiInterface
import mvvm.app.koin.ui.activity.MainRepo
import mvvm.app.koin.ui.activity.MainViewModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val appModule = module  {
    // Define ViewModel
    viewModel { MainViewModel(get()) }
    // Define Repository
    single<MainRepo> { MainRepo(get(), get()) }
    // Define Retrofit service
    single { provideRetrofitService() }
    // Define Room database
    single { provideDatabase(androidContext()) }
    single { get<RoomDB>().yourDao() }
}



private fun provideRetrofitService(): ApiInterface {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    return retrofit.create(ApiInterface::class.java)
}

private fun provideDatabase(context: Context): RoomDB {
    return Room.databaseBuilder(context, RoomDB::class.java, "app_database")
        .fallbackToDestructiveMigration()
        .build()
}
