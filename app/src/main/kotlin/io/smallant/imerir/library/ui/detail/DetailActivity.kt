package io.smallant.imerir.library.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.smallant.imerir.library.Constants
import io.smallant.imerir.library.R
import io.smallant.imerir.library.data.models.Comment
import io.smallant.imerir.library.ui.detail.adapter.CommentRecyclerAdapter
import kotlinx.android.synthetic.main.activity_detail.*
import org.koin.android.ext.android.inject

class DetailActivity: AppCompatActivity() {

    private val recyclerAdapter: CommentRecyclerAdapter = CommentRecyclerAdapter()

    private val viewModel: DetailViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bookId = intent.getIntExtra(Constants.Extra.BOOK_ID, 0)
        val bookTitle = intent.getStringExtra(Constants.Extra.BOOK_TITLE)

        title = bookTitle

        viewModel.getComments(bookId).observe(this, Observer {
            recyclerAdapter.setItems(it)
        })

        recycler.apply {
            adapter = recyclerAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }

        publish.setOnClickListener {
            val contentValue: String = value.text.toString()
            if (contentValue.isNotEmpty()) {
                val comment = Comment(0, bookId, contentValue)
                viewModel.saveComment(comment)
                value.setText("")
            }
        }

    }

}