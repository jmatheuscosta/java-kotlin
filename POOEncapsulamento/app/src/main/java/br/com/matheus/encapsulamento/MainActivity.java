package br.com.matheus.encapsulamento;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtTitleBook;
    TextView txtAuthor;
    TextView txtPages;
    TextView txtYearPub;
    TextView txtEditor;
    TextView txtLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        startComponentsLayout();
        createObjects();

    }

    private void startComponentsLayout() {
        txtTitleBook = findViewById(R.id.txtTitleBook);
        txtAuthor = findViewById(R.id.txtAuthor);
        txtPages = findViewById(R.id.txtPages);
        txtYearPub = findViewById(R.id.txtYearPub);
        txtEditor = findViewById(R.id.txtEditor);
        txtLocation = findViewById(R.id.txtLocation);
    }

    public void createObjects(){

        book objctBook = new book();
        objctBook.setTitle("The Lord of the Rings");
        objctBook.setAuthor("J.R.R Tolkien");
        objctBook.setPages(1191);
        objctBook.setYearPub(1954);
        objctBook.setEditor("Allen & Unwin");
        objctBook.setLocation("London - UK");

        Log.i("POO", "Object Book Title: "+ objctBook.getTitle());
        Log.i("POO", "Object Book Author: "+ objctBook.getAuthor());
        Log.i("POO", "Object Book Pages: "+ objctBook.getPages());
        Log.i("POO", "Object Book Year of Publication: "+ objctBook.getYearPub());
        Log.i("POO", "Object Book Editor: "+ objctBook.getEditor());
        Log.i("POO", "Object Book Location: "+ objctBook.getLocation());

        txtTitleBook.setText(objctBook.getTitle());
        txtAuthor.setText(objctBook.getAuthor());
        txtPages.setText(String.valueOf(objctBook.getPages()));
        txtYearPub.setText(String.valueOf(objctBook.getYearPub()));
        txtEditor.setText(objctBook.getEditor());
        txtLocation.setText(objctBook.getLocation());
    }

}