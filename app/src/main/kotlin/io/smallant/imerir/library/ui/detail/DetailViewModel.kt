package io.smallant.imerir.library.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import io.smallant.imerir.library.data.models.Comment
import io.smallant.imerir.library.data.sources.CommentRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class DetailViewModel(private val repository: CommentRepository): ViewModel() {

    val message: String = "Hello from DetailViewModel"

    private val viewModelJob: Job = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    fun getComments(bookId: Int): LiveData<List<Comment>> = liveData(Dispatchers.IO) {
        val retrievedData = repository.getComments(bookId)
        emitSource(retrievedData)
    }

    fun saveComment(comment: Comment) {
        uiScope.launch {
            repository.saveComment(comment)
        }
    }

}