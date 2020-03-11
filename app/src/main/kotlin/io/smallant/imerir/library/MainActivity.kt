package io.smallant.imerir.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.smallant.imerir.library.data.pojo.Book

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Part I
        val book = Book(1, "Harry Potter", 6.99F, "", 4.4F, "Lorem ipsum...")
        Log.d("MainLog", "book = $book")

        // TODO Part I
        //Log.d("MainLog", "author = $author")
        //"Joanne Rowling was born on 31/07/1965"
    }
}
