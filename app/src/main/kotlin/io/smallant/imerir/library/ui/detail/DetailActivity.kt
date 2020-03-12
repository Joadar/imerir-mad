package io.smallant.imerir.library.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.smallant.imerir.library.Constants
import io.smallant.imerir.library.R
import kotlinx.android.synthetic.main.activity_detail.*
import org.koin.android.ext.android.inject

// TODO Part X
class DetailActivity: AppCompatActivity() {

    private val viewModel: DetailViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bookId = intent.getIntExtra(Constants.Extra.BOOK_ID, 0)
        val bookTitle = intent.getStringExtra(Constants.Extra.BOOK_TITLE)

        title = bookTitle

        message.text = viewModel.message

    }

}