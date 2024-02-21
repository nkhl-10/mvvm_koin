package mvvm.app.koin.db.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity (
    @PrimaryKey val roomID: Int,
    val userId:String,
    val id :String,
    val title: String,
    val completed: Boolean
)
