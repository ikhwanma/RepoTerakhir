package com.android.puntenhackjam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SurveyActivity extends AppCompatActivity {
    int jumlahNilai = 0;
    RadioButton btnIya1;
    RadioButton btnTidak1;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        btnIya1 = findViewById(R.id.btnIya1);
        btnTidak1 = findViewById(R.id.btnTidak1);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveNilai saveNilai = new SaveNilai();
                saveNilai.setNilai(jumlahNilai);
                Intent intent = new Intent(SurveyActivity.this,HasilSurvey.class);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view){
        boolean isSelected = ((AppCompatRadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.btnIya1:
                if(isSelected){
                    jumlahNilai += 1;
                    btnIya1.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak1.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak1:
                if (isSelected){
                    btnTidak1.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya1.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
        }
    }

}