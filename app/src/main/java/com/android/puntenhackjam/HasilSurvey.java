package com.android.puntenhackjam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilSurvey extends AppCompatActivity {
    TextView textHasil;
    Button btnKembali,btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_survey);
        btnDaftar = findViewById(R.id.btnDaftar);
        btnKembali = findViewById(R.id.btnKembali);
        textHasil = findViewById(R.id.textHasil);
        Intent intent = getIntent();
        int sum = intent.getIntExtra("SUM",0);
        if(sum>=45){
            textHasil.setText("Anda memiliki kemungkinan besar terinfeksi COVID-19. Gejala - gejala ini membutuhkan penanganan segera mungkin. Jaga jarak dengan orang di sekitar dan segera telpon rumah sakit atau menghubungi instalasi gawat darurat (IGD terdekat).");
            textHasil.setTextColor(Color.parseColor("#C52D2D"));
        }else if(sum>=40 && sum <45){
            textHasil.setText("Anda memiliki kemungkinan waspada terinfeksi COVID-19. Anda disarankan untuk menelpon Rumah Sakit terdekat dan jangan berangkat ke UGD, Rumah sakit kecuali kalau gejala anda semakin buruk segera pergi ke dokter terdekat dengan protokol kesehatan sesuai aturan.");
            textHasil.setTextColor(Color.parseColor("#ABA627"));
        }else if(sum<40){
            textHasil.setText("Anda memiliki kemungkinan kecil terinfeksi COVID-19. Kami menyarankan anda untuk tetapberada di dalam rumah. Kondisi anda mungkin disebabkan oleh faktor selain COVID-19. Beristirahat yang cukup dan mengatur pola makan akan membantu anda sembuh dengan sendirinya.");
            textHasil.setTextColor(Color.parseColor("#39C750"));
        }
        kembali();
        daftar();
    }

    public void kembali(){
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HasilSurvey.this,HomePage.class);
                startActivity(intent);
            }
        });
    }

    public void daftar(){
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HasilSurvey.this,InfoRS.class);
                startActivity(intent);
            }
        });
    }
}