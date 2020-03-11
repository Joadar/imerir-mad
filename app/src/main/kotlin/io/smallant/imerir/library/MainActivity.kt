package io.smallant.imerir.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.smallant.imerir.library.data.models.Author
import io.smallant.imerir.library.data.pojo.Book
import java.util.*

class MainActivity : AppCompatActivity() {

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
    }
}
