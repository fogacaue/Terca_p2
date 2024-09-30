package com.example.ac1p2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eai);

        Button btnBack = findViewById(R.id.btnSair);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnWorldGamesMap = findViewById(R.id.btnEaiMap);
        btnWorldGamesMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Eaiburguer+-+Sorocaba/@-23.4001574,-47.6741784,9z/data=!4m10!1m2!2m1!1sEai+burguer!3m6!1s0x94c58bc51e13fbfd:0x279751d755889250!8m2!3d-23.5359563!4d-47.4645314!15sCgtFYWkgYnVyZ3VlcloNIgtlYWkgYnVyZ3VlcpIBCnJlc3RhdXJhbnSaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVTktOR05VUmtGM0VBReABAA!16s%2Fg%2F11tg8gd1h5?entry=ttu&g_ep=EgoyMDI0MDkyNS4wIKXMDSoASAFQAw%3D%3D");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        Button btnWorldGamesSite = findViewById(R.id.btnEaiSite);
        btnWorldGamesSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://eaiburguer.com.br");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        Button btnWorldGamesCall = findViewById(R.id.btnEaiTel);
        btnWorldGamesCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+5511916571314"));
                startActivity(callIntent);
            }
        });
    }
}

