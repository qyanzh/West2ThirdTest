package com.example.west2thirdtest;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<Book> bookList = new LinkedList<>();
    private EditText inputText;
    private Button addBook;
    private RecyclerView bookRecyclerView;
    private BookAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initBooks();
        inputText = findViewById(R.id.input_text);
        addBook = findViewById(R.id.button_add);
        bookRecyclerView = findViewById(R.id.book_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        bookRecyclerView.setLayoutManager(layoutManager);
        adapter = new BookAdapter(bookList);
        bookRecyclerView.setAdapter(adapter);

        addBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if(!"".equals(content)) {
                    Book book = new Book(content);
                    bookList.add(0,book);
                    adapter.notifyItemInserted(0);
                    adapter.notifyDataSetChanged();
                    bookRecyclerView.scrollToPosition(0);
                    inputText.setText("");
                }
            }
        });
    }

    private void initBooks() {
        bookList.add(0,new Book("SONY"));
        bookList.add(0,new Book("HTC"));
        bookList.add(0,new Book("VIVO"));
        bookList.add(0,new Book("OPPO"));
        bookList.add(0,new Book("Meizu"));
        bookList.add(0,new Book("OnePlus"));
        bookList.add(0,new Book("Huawei"));
        bookList.add(0,new Book("Xiaomi"));
        bookList.add(0,new Book("Samsung"));
        bookList.add(0,new Book("Apple"));
    }
}
