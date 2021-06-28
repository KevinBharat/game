package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button button,btnmassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
        button=findViewById(R.id.button);
        btnmassage=findViewById(R.id.btnmassage);
        btnmassage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,massage.class);
                startActivity(i);
            }
        });

        button.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, TicTacToe.class);
            startActivity(i);

        }
    });
    }
}