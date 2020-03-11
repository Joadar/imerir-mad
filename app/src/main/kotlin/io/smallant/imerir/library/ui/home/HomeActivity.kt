package io.smallant.imerir.library.ui.home

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.smallant.imerir.library.R
import io.smallant.imerir.library.data.models.Book
import io.smallant.imerir.library.data.models.Section
import io.smallant.imerir.library.ui.home.recycleradapter.HomeRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*


class HomeActivity : AppCompatActivity(), OnSectionClickListener {

    private val recyclerAdapter: HomeRecyclerAdapter = HomeRecyclerAdapter(this)

    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val provider = ViewModelProvider(this)
        viewModel = provider.get(HomeViewModel::class.java)

        // TODO Part III
        recycler.apply {
            adapter = recyclerAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }

        recyclerAdapter.setItems(viewModel.sections)
    }

    override fun onBookClicked(book: Book) {
        Toast.makeText(this, "${book.title} clicked", Toast.LENGTH_LONG).show()
    }

    override fun onSectionClicked(section: Section) {
        Toast.makeText(this, "Section: ${section.label}", Toast.LENGTH_LONG).show()
    }
}
