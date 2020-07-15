package com.android.puntenhackjam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                Intent goToInfoCC = new Intent(HomePage.this,InfoCC.class);
                startActivity(goToInfoCC);
            }
        });
        btnRSRujukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToInfoRS= new Intent(HomePage.this,InfoRS.class);
                startActivity(goToInfoRS);
            }
        });

    }
}