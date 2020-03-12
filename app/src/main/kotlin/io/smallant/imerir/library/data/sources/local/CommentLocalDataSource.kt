package io.smallant.imerir.library.data.sources.local

import androidx.lifecycle.LiveData
import io.smallant.imerir.library.data.models.Comment
import io.smallant.imerir.library.data.sources.local.database.AppDatabase
import io.smallant.imerir.library.data.sources.local.database.dao.CommentDao

class CommentLocalDataSource(database: AppDatabase): BaseLocalDataSource<Comment, CommentDao>(database.commentDao()) {
    fun getComments(bookId: Int): LiveData<List<Comment>> = dao.getComments(bookId)
}