package com.example.ac1p2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OcaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oca);

        Button btnBack = findViewById(R.id.btnSair);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnXGamesMap = findViewById(R.id.btnOcaMap);
        btnXGamesMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Oca+Burger+Campolim/@-23.5247156,-47.4693542,17z/data=!3m1!4b1!4m6!3m5!1s0x94c58ac049112b29:0x992d894231bb0030!8m2!3d-23.5247205!4d-47.4667793!16s%2Fg%2F11c603rp6p?entry=ttu&g_ep=EgoyMDI0MDkyNS4wIKXMDSoASAFQAw%3D%3D");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        Button btnXGamesSite = findViewById(R.id.btnOcaSite);
        btnXGamesSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.ocaburger.com.br");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        Button btnXGamesCall = findViewById(R.id.btnOcaTel);
        btnXGamesCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+5515998298084"));
                startActivity(callIntent);
            }
        });
    }
}
