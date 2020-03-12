package io.smallant.imerir.library.data.sources.local.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import io.smallant.imerir.library.data.models.Comment

@Dao
abstract class CommentDao: BaseDao<Comment>() {

    @Query("SELECT * FROM comment WHERE bookId = :bookId")
    abstract fun getComments(bookId: Int): LiveData<List<Comment>>
}