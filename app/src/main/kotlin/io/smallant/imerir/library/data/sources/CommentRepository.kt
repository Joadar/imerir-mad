package io.smallant.imerir.library.data.sources

import androidx.lifecycle.LiveData
import io.smallant.imerir.library.data.models.Comment
import io.smallant.imerir.library.data.sources.local.CommentLocalDataSource

class CommentRepository(private val commentLocalDataSource: CommentLocalDataSource) {

    fun getComments(bookId: Int): LiveData<List<Comment>> = commentLocalDataSource.getComments(bookId)

    suspend fun saveComment(comment: Comment) {
        commentLocalDataSource.saveItem(comment)
    }

}