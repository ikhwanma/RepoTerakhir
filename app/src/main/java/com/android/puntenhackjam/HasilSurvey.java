package com.android.puntenhackjam;

import androidx.appcompat.app.AppCompatActivity;

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
        SaveNilai saveNilai = new SaveNilai();

        hasil.setText(String.valueOf(saveNilai.getNilai()));

    }
}