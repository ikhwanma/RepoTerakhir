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
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class SurveyActivity extends AppCompatActivity {
    int jumlahNilai[] = new int[13];
    String cek[] = new String[13];
    RadioButton btnIya1,btnIya2,btnIya3,btnIya4,btnIya5,btnIya13,btnIya6,btnIya7,btnIya8,btnIya9,btnIya10,btnIya11,btnIya12;
    RadioButton btnTidak1,btnTidak2,btnTidak3,btnTidak4,btnTidak5,btnTidak6,btnTidak7,btnTidak8,btnTidak9,btnTidak10,btnTidak11,btnTidak12,btnTidak13;
    Button btnSubmit;
    int sum =0;
    boolean x = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        for (int i = 0; i< 13;i++){
            cek[i] = "aa";
        }
        //a
        //b
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
                    cek[0] = "b";
                    btnIya1.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak1.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak1:
                if (isSelected){
                    jumlahNilai[0] = 0;
                    cek[0] = "b";
                    btnTidak1.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya1.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya2:
                if(isSelected){
                    jumlahNilai[1] = 9;
                    cek[1] = "b";
                    btnIya2.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak2.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak2:
                if (isSelected){
                    jumlahNilai[1] = 0;
                    cek[1] = "b";
                    btnTidak2.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya2.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya3:
                if(isSelected){
                    jumlahNilai[2] = 9;
                    cek[2] = "b";
                    btnIya3.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak3.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak3:
                if (isSelected){
                    jumlahNilai[2] = 0;
                    cek[2] = "b";
                    btnTidak3.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya3.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya4:
                if(isSelected){
                    jumlahNilai[3] = 4;
                    cek[3] = "b";
                    btnIya4.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak4.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak4:
                if (isSelected){
                    jumlahNilai[3] = 0;
                    cek[3] = "b";
                    btnTidak4.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya4.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya5:
                if(isSelected){
                    jumlahNilai[4] = 4;
                    cek[4] = "b";
                    btnIya5.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak5.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak5:
                if (isSelected){
                    jumlahNilai[4] = 0;
                    cek[4] = "b";
                    btnTidak5.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya5.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya6:
                if(isSelected){
                    jumlahNilai[5] = 4;
                    cek[5] = "b";
                    btnIya6.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak6.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak6:
                if (isSelected){
                    jumlahNilai[5] = 0;
                    cek[5] = "b";
                    btnTidak6.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya6.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya7:
                if(isSelected){
                    jumlahNilai[6] = 4;
                    cek[6] = "b";
                    btnIya7.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak7.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak7:
                if (isSelected){
                    jumlahNilai[6] = 0;
                    cek[6] = "b";
                    btnTidak7.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya7.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya8:
                if(isSelected){
                    jumlahNilai[7] = 4;
                    cek[7] = "b";
                    btnIya8.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak8.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak8:
                if (isSelected){
                    jumlahNilai[7] = 0;
                    cek[7] = "b";
                    btnTidak8.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya8.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya9:
                if(isSelected){
                    jumlahNilai[8] = 4;
                    cek[8] = "b";
                    btnIya9.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak9.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak9:
                if (isSelected){
                    jumlahNilai[8] = 0;
                    cek[8] = "b";
                    btnTidak9.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya9.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya10:
                if(isSelected){
                    jumlahNilai[9] = 4;
                    cek[9] = "b";
                    btnIya10.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak10.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak10:
                if (isSelected){
                    jumlahNilai[9] = 0;
                    cek[9] = "b";
                    btnTidak10.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya10.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya11:
                if(isSelected){
                    jumlahNilai[10] = 15;
                    cek[10] = "b";
                    btnIya11.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak11.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak11:
                if (isSelected){
                    jumlahNilai[10] = 0;
                    cek[10] = "b";
                    btnTidak11.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya11.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya12:
                if(isSelected){
                    jumlahNilai[11] = 15;
                    cek[11] = "b";
                    btnIya12.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak12.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak12:
                if (isSelected){
                    jumlahNilai[11] = 0;
                    cek[11] = "b";
                    btnTidak12.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya12.setBackgroundResource(R.drawable.btn_iya);
                }
                break;
            case R.id.btnIya13:
                if(isSelected){
                    jumlahNilai[12] = 15;
                    cek[12] = "b";
                    btnIya13.setBackgroundResource(R.drawable.btn_dipilih);
                    btnTidak13.setBackgroundResource(R.drawable.btn_tidak);
                }
                break;
            case R.id.btnTidak13:
                if (isSelected){
                    jumlahNilai[12] = 0;
                    cek[12] = "b";
                    btnTidak13.setBackgroundResource(R.drawable.btn_dipilih);
                    btnIya13.setBackgroundResource(R.drawable.btn_iya);
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
                List<String> list = Arrays.asList(cek);
                if(list.contains("aa")){
                    Toast.makeText(SurveyActivity.this, "Ada Yang Belum Terisi", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(SurveyActivity.this,HasilSurvey.class);
                    intent.putExtra("SUM",sum);
                    startActivity(intent);
                }

            }
        });
    }


}