package com.android.puntenhackjam;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HasilSurvey extends AppCompatActivity {
    TextView textHasil;
    Button btnKembali,btnDaftar;
    ImageView imageHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_survey);
        btnDaftar = findViewById(R.id.btnDaftar);
        btnKembali = findViewById(R.id.btnKembali);
        textHasil = findViewById(R.id.textHasil);
        imageHasil =findViewById(R.id.imageHasil);
        Intent intent = getIntent();

        int sum = intent.getIntExtra("SUM",0);
        if(sum>=45){
            textHasil.setText("Anda memiliki kemungkinan besar terinfeksi COVID-19. Gejala - gejala ini membutuhkan penanganan segera mungkin. Jaga jarak dengan orang di sekitar dan segera telpon rumah sakit atau menghubungi instalasi gawat darurat (IGD terdekat).");
            textHasil.setTextColor(Color.parseColor("#C52D2D"));
            imageHasil.setImageResource(R.drawable.besar);
        }else if(sum>=40 && sum <45){
            textHasil.setText("Anda memiliki kemungkinan waspada terinfeksi COVID-19. Anda disarankan untuk menelpon Rumah Sakit terdekat dan jangan berangkat ke UGD, Rumah sakit kecuali kalau gejala anda semakin buruk segera pergi ke dokter terdekat dengan protokol kesehatan sesuai aturan.");
            textHasil.setTextColor(Color.parseColor("#ABA627"));
            imageHasil.setImageResource(R.drawable.waspada);
        }else if(sum<40){
            textHasil.setText("Anda memiliki kemungkinan kecil terinfeksi COVID-19. Kami menyarankan anda untuk tetapberada di dalam rumah. Kondisi anda mungkin disebabkan oleh faktor selain COVID-19. Beristirahat yang cukup dan mengatur pola makan akan membantu anda sembuh dengan sendirinya.");
            textHasil.setTextColor(Color.parseColor("#39C750"));
            imageHasil.setImageResource(R.drawable.kecil);
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
                String url = "https://covid19.go.id/daftar-rumah-sakit-rujukan";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}