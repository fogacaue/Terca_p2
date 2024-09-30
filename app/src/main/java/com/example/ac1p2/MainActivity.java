package com.example.ac1p2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnVotoGames = findViewById(R.id.btnAlemao);
        btnVotoGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AlemaoActivity.class));
            }
        });

        Button btnXGames = findViewById(R.id.btnOca);
        btnXGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OcaActivity.class));
            }
        });

        Button btnWorldGames = findViewById(R.id.btnEai);
        btnWorldGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EaiActivity.class));
            }
        });
    }
}

