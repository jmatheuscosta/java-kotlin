package br.com.matheus.pooencapsulamentokotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtTitleBook: TextView;
    lateinit var txtAuthor: TextView;
    lateinit var txtPages: TextView;
    lateinit var txtYearPub: TextView;
    lateinit var txtEditor: TextView;
    lateinit var txtLocation: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        startLayoutComponents();
        createObject();

    }

    private fun startLayoutComponents() {
        txtTitleBook = findViewById<TextView>(R.id.txtTitleBook)
        txtAuthor = findViewById<TextView>(R.id.txtAuthor)
        txtPages = findViewById<TextView>(R.id.txtPages)
        txtYearPub = findViewById<TextView>(R.id.txtYearPub)
        txtEditor = findViewById<TextView>(R.id.txtEditor)
        txtLocation = findViewById<TextView>(R.id.txtLocation)
    }

    private fun createObject() {

        var book = Book(
            "A cor da Escuridão",
            "Natália Rodrigues",
            112,
            2018,
            "Autografia",
            "Rio de Janeiro"
        )

        txtTitleBook.setText(book.title)
        txtAuthor.setText(book.author)
        txtPages.setText(book.pages.toString())
        txtYearPub.setText(book.yearPub.toString())
        txtEditor.setText(book.editor)
        txtLocation.setText(book.location)

    }
}