package mvvm.app.koin.db.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [UserEntity::class], version = 1)
abstract class RoomDB : RoomDatabase() {
    abstract fun userDao(): UserDao
}
