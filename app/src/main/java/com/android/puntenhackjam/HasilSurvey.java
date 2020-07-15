package com.android.puntenhackjam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HasilSurvey extends AppCompatActivity {
    TextView hasil;
    String x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_survey);
        hasil = findViewById(R.id.hasil);
        Intent intent = getIntent();
        int sum = intent.getIntExtra("SUM",0);

        if(sum>=45){
            hasil.setText("Resiko Tinggi");
        }else if(sum>=40 && sum <45){
            hasil.setText("Resiko Sedang");
        }else if(sum<40){
            hasil.setText("Resiko Rendah");
        }

    }
}