package com.example.ac1p2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlemaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alemao);

        Button btnBack = findViewById(R.id.btnSair);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnVotoGamesMap = findViewById(R.id.btnAlemaoMap);
        btnVotoGamesMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Alemão+Burger+-+Hamburgueria+Sorocaba/@-23.4873435,-47.511338,12z/data=!3m1!5s0x94c58abc2af5d761:0xf9a50be682b52f04!4m10!1m2!2m1!1sAlemão+burger!3m6!1s0x94c58bb852156ae1:0xc2a74029cae6d693!8m2!3d-23.5028413!4d-47.4635691!15sCg5BbGVtw6NvIGJ1cmdlcloQIg5hbGVtw6NvIGJ1cmdlcpIBFGhhbWJ1cmdlcl9yZXN0YXVyYW504AEA!16s%2Fg%2F11g21cq_g8?entry=ttu&g_ep=EgoyMDI0MDkyNS4wIKXMDSoASAFQAw%3D%3D");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        Button btnVotoGamesSite = findViewById(R.id.btnAlemaoSite);
        btnVotoGamesSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.instagram.com/alemaoburger/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        Button btnVotoGamesCall = findViewById(R.id.btnAlemaoTel);
        btnVotoGamesCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+5515998573005"));
                startActivity(callIntent);
            }
        });
    }
}


