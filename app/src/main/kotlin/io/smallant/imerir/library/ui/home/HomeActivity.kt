package io.smallant.imerir.library.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.smallant.imerir.library.Constants
import io.smallant.imerir.library.R
import io.smallant.imerir.library.data.models.Author
import io.smallant.imerir.library.data.models.Section
import io.smallant.imerir.library.data.models.Book
import io.smallant.imerir.library.ui.home.recycleradapter.HomeRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class HomeActivity : AppCompatActivity(), OnSectionClickListener {

    private val recyclerAdapter: HomeRecyclerAdapter = HomeRecyclerAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Part I
        val book = Book(1, "Harry Potter", 6.99F, "", 4.4F, "Lorem ipsum...")
        Log.d("MainLog", "book = $book")

        // TODO Part I
        val calendar = Calendar.getInstance().apply {
            // Month start at 0, Calendar.JULY = 6
            set(1965, Calendar.JULY, 31)
        }

        val author = Author(1, "Joanne", "Rowling", calendar.time)
        Log.d("MainLog", "author = $author")
        //"Joanne Rowling was born on 31/07/1965"

        val books: List<Book> = listOf(
                Book(1, "Harry Potter", 6.99F, "", 4.4F, "When a letter arrives for unhappy but ordinary Harry Potter, a decade-old secret is revealed to him. His parents were wizards, killed by a Dark Lord’s curse when Harry was just a baby, and which he somehow survived. Escaping from his unbearable Muggle guardians to Hogwarts, a wizarding school brimming with ghosts and enchantments, Harry stumbles into a sinister adventure when he finds a threeheaded dog guarding a room on the third floor. Then he hears of a missing stone with astonishing powers which could be valuable, dangerous, or both."),
                Book(2, "Eragon", 11.99F, "", 3.7F, "One boy... One dragon... A world of adventure. When Eragon finds a polished blue stone in the forest, he thinks it is the lucky discovery of a poor farm boy; perhaps it will buy his family meat for the winter. But when the stone brings a dragon hatchling, Eragon soon realizes he has stumbled upon a legacy nearly as old as the Empire itself. Overnight his simple life is shattered, and he is thrust into a perilous new world of destiny, magic, and power. With only an ancient sword and tge advice of an old storyteller for guidance, Eragon and the fledgling dragon must navigate the dangerous terrain and dark enemies of an Empire ruled by a king whose evil knows no bounds. Can Eragon take up the mantle of the legendary Dragon Riders? The fate of the Empire may rest in his hands."),
                Book(3, "The Alchemist", 7.50F, "", 4.7F, "Paulo Coelho's enchanting novel has inspired a devoted following around the world. This story, dazzling in its powerful simplicity and soul-stirring wisdom, is about an Andalusian shepherd boy named Santiago who travels from his homeland in Spain to the Egyptian desert in search of a treasure buried near the Pyramids. Along the way he meets a Gypsy woman, a man who calls himself king, and an alchemist, all of whom point Santiago in the direction of his quest. No one knows what the treasure is, or if Santiago will be able to surmount the obstacles in his path. But what starts out as a journey to find worldly goods turns into a discovery of the treasure found within. Lush, evocative, and deeply humane, the story of Santiago is an eternal testament to the transforming power of our dreams and the importance of listening to our hearts."),
                Book(4, "Hunger Games", 9.99F, "", 2F, "Could you survive on your own, in the wild, with everyone out to make sure you don't live to see the morning? In the ruins of a place once known as North America lies the nation of Panem, a shining Capitol surrounded by twelve outlying districts. The Capitol is harsh and cruel and keeps the districts in line by forcing them all to send one boy and one girl between the ages of twelve and eighteen to participate in the annual Hunger Games, a fight to the death on live TV. Sixteen-year-old Katniss Everdeen, who lives alone with her mother and younger sister, regards it as a death sentence when she is forced to represent her district in the Games. But Katniss has been close to dead before - and survival, for her, is second nature. Without really meaning to, she becomes a contender. But if she is to win, she will have to start making choices that weigh survival against humanity and life against love. New York Times bestselling author Suzanne Collins delivers equal parts suspense and philosophy, adventure and romance, in this searing novel set in a future with unsettling parallels to our present.")
        )

        // TODO Part III
        val sections = arrayListOf(
                Section(Constants.Section.FEATURED_ID, "Featured", books)
        )

        recycler.apply {
            adapter = recyclerAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }

        recyclerAdapter.setItems(sections)
    }

    override fun onBookClicked(book: io.smallant.imerir.library.data.models.Book) {
        Toast.makeText(this, "${book.title} clicked", Toast.LENGTH_LONG).show()
    }

    override fun onSectionClicked(section: Section) {
        Toast.makeText(this, "Section: ${section.label}", Toast.LENGTH_LONG).show()
    }
}
