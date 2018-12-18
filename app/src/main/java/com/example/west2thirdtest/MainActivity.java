package com.example.west2thirdtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button jump_to_next = findViewById(R.id.jump2next);
        jump_to_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RecyclerViewActivity.class));
                Toast.makeText(MainActivity.this,"Hey!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
