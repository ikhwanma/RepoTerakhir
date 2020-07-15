package com.android.puntenhackjam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SurveyActivity extends AppCompatActivity {
    int jumlahNilai[] = new int[13];
    RadioButton btnIya1,btnIya2,btnIya3,btnIya4,btnIya5,btnIya13,btnIya6,btnIya7,btnIya8,btnIya9,btnIya10,btnIya11,btnIya12;
    RadioButton btnTidak1,btnTidak2,btnTidak3,btnTidak4,btnTidak5,btnTidak6,btnTidak7,btnTidak8,btnTidak9,btnTidak10,btnTidak11,btnTidak12,btnTidak13;
    Button btnSubmit;
    int sum =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        btnIya1 = findViewById(R.id.btnIya1);
        btnIya2 = findViewById(R.id.btnIya2);
        btnIya3 = findViewById(R.id.btnIya3);
        btnIya4 = findViewById(R.id.btnIya4);
        btnIya5 = findViewById(R.id.btnIya5);
        btnIya6 = findViewById(R.id.btnIya6);
        btnIya7 = findViewById(R.id.btnIya7);
        btnIya8 = findViewById(R.id.btnIya8);
        btnIya9 = findViewById(R.id.btnIya9);
        btnIya10 = findViewById(R.id.btnIya10);
        btnIya11 = findViewById(R.id.btnIya11);
        btnIya12 = findViewById(R.id.btnIya12);
        btnIya13 = findViewById(R.id.btnIya13);
        btnTidak1 = findViewById(R.id.btnTidak1);
        btnTidak2 = findViewById(R.id.btnTidak2);
        btnTidak3 = findViewById(R.id.btnTidak3);
        btnTidak4 = findViewById(R.id.btnTidak4);
        btnTidak5 = findViewById(R.id.btnTidak5);
        btnTidak6 = findViewById(R.id.btnTidak6);
        btnTidak7 = findViewById(R.id.btnTidak7);
        btnTidak8 = findViewById(R.id.btnTidak8);
        btnTidak9 = findViewById(R.id.btnTidak9);
        btnTidak10 = findViewById(R.id.btnTidak10);
        btnTidak11 = findViewById(R.id.btnTidak11);
        btnTidak12 = findViewById(R.id.btnTidak12);
        btnTidak13 = findViewById(R.id.btnTidak13);
        btnSubmit = findViewById(R.id.btnSubmit);
        submit();
    }

    public void onRadioButtonClicked(View view){
        boolean isSelected = ((AppCompatRadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.btnIya1:
                if(isSelected){
                    jumlahNilai[0] = 9;
                    btnIya1.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak1.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak1:
                if (isSelected){
                    jumlahNilai[0] = 0;
                    btnTidak1.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya1.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya2:
                if(isSelected){
                    jumlahNilai[1] = 9;
                    btnIya2.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak2.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak2:
                if (isSelected){
                    jumlahNilai[1] = 0;
                    btnTidak2.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya2.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya3:
                if(isSelected){
                    jumlahNilai[2] = 9;
                    btnIya3.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak3.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak3:
                if (isSelected){
                    jumlahNilai[2] = 0;
                    btnTidak3.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya3.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya4:
                if(isSelected){
                    jumlahNilai[3] = 4;
                    btnIya4.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak4.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak4:
                if (isSelected){
                    jumlahNilai[3] = 0;
                    btnTidak4.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya4.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya5:
                if(isSelected){
                    jumlahNilai[4] = 4;
                    btnIya5.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak5.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak5:
                if (isSelected){
                    jumlahNilai[4] = 0;
                    btnTidak5.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya5.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya6:
                if(isSelected){
                    jumlahNilai[5] = 4;
                    btnIya6.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak6.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak6:
                if (isSelected){
                    jumlahNilai[5] = 0;
                    btnTidak6.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya6.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya7:
                if(isSelected){
                    jumlahNilai[6] = 4;
                    btnIya7.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak7.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak7:
                if (isSelected){
                    jumlahNilai[6] = 0;
                    btnTidak7.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya7.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya8:
                if(isSelected){
                    jumlahNilai[7] = 4;
                    btnIya8.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak8.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak8:
                if (isSelected){
                    jumlahNilai[7] = 0;
                    btnTidak8.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya8.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya9:
                if(isSelected){
                    jumlahNilai[8] = 4;
                    btnIya9.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak9.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak9:
                if (isSelected){
                    jumlahNilai[8] = 0;
                    btnTidak9.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya9.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya10:
                if(isSelected){
                    jumlahNilai[9] = 4;
                    btnIya10.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak10.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak10:
                if (isSelected){
                    jumlahNilai[9] = 0;
                    btnTidak10.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya10.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya11:
                if(isSelected){
                    jumlahNilai[10] = 15;
                    btnIya11.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak11.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak11:
                if (isSelected){
                    jumlahNilai[10] = 0;
                    btnTidak11.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya11.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya12:
                if(isSelected){
                    jumlahNilai[11] = 15;
                    btnIya12.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak12.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak12:
                if (isSelected){
                    jumlahNilai[11] = 0;
                    btnTidak12.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya12.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;
            case R.id.btnIya13:
                if(isSelected){
                    jumlahNilai[12] = 15;
                    btnIya13.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnTidak13.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                break;
            case R.id.btnTidak13:
                if (isSelected){
                    jumlahNilai[12] = 0;
                    btnTidak13.setBackgroundColor(Color.parseColor("#0400ff"));
                    btnIya13.setBackgroundColor(Color.parseColor("#00ff55"));
                }
                break;

        }
    }

    public void submit(){
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0; i<jumlahNilai.length; i++){
                    sum += jumlahNilai[i];
                }
                SaveNilai saveNilai = new SaveNilai();
                saveNilai.setNilai(sum);
                Intent intent = new Intent(SurveyActivity.this,HasilSurvey.class);
                intent.putExtra("SUM",sum);
                startActivity(intent);
            }
        });
    }


}