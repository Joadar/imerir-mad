package io.smallant.imerir.library.ui.home

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.smallant.imerir.library.Constants
import io.smallant.imerir.library.R
import io.smallant.imerir.library.data.models.Book
import io.smallant.imerir.library.data.models.Section
import io.smallant.imerir.library.ui.home.recycleradapter.HomeRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject


class HomeActivity : AppCompatActivity(), OnSectionClickListener {

    private val recyclerAdapter: HomeRecyclerAdapter = HomeRecyclerAdapter(this)

    private val viewModel: HomeViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Part III
        recycler.apply {
            adapter = recyclerAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }

        viewModel.books.observe(this, Observer { books ->
            val sections = arrayListOf(
                Section(
                    Constants.Section.FEATURED_ID,
                    "Featured",
                    books
                ),
                Section(
                    Constants.Section.LATESTED_ID,
                    "Latested",
                    books
                )
            )
            recyclerAdapter.setItems(sections)
        })

    }

    override fun onBookClicked(book: Book) {
        Toast.makeText(this, "${book.title} clicked", Toast.LENGTH_LONG).show()
    }

    override fun onSectionClicked(section: Section) {
        Toast.makeText(this, "Section: ${section.label}", Toast.LENGTH_LONG).show()
    }
}
