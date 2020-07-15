package com.android.puntenhackjam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {
    private Button btnCekKondisi;
    private Button btnGejala;
    private Button btnCallCenter;
    private Button btnRSRujukan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        btnCekKondisi = findViewById(R.id.buttonCekKondisi);
        btnGejala =findViewById(R.id.buttonGejala);
        btnCallCenter=findViewById(R.id.buttonCallCenter);
        btnRSRujukan = findViewById(R.id.buttonRSRujukan);

        btnCekKondisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSurveyActivity = new Intent(HomePage.this,SurveyActivity.class);
                startActivity(goToSurveyActivity);
            }
        });

        btnGejala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToInfoGejala = new Intent(HomePage.this,InfoGejala.class);
                startActivity(goToInfoGejala);
            }
        });

        btnCallCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://covid19.go.id/p/konten/kontak-layanan-kementerianlembaga-untuk-covid-19";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        btnRSRujukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://covid19.go.id/daftar-rumah-sakit-rujukan";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}