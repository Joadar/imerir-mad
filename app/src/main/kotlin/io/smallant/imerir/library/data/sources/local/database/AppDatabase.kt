package io.smallant.imerir.library.data.sources.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.smallant.imerir.library.data.models.Comment
import io.smallant.imerir.library.data.sources.local.database.dao.CommentDao

const val DB_NAME = "app.db"

@Database(entities = [
    Comment::class
], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun commentDao(): CommentDao

    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME)
                .build()
    }
}