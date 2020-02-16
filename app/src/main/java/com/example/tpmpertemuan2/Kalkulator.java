package com.example.tpmpertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    private Button btnPlus1,btnPlus2,btnMin1, btnMin2 , btnTambah , btnKurang , btnKali ,btnBagi ;
    private EditText etAngka1 , etAngka2;
    private TextView tvHasil ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        btnPlus1 = findViewById(R.id.btn_plus1);
        btnPlus2 = findViewById(R.id.btn_plus2);
        btnMin1 = findViewById(R.id.btn_min1);
        btnMin2 = findViewById(R.id.btn_min2);
        btnTambah =findViewById(R.id.btn_tambah);
        btnKurang =findViewById(R.id.btn_kurang);
        btnKali = findViewById(R.id.btn_kali);
        btnBagi =findViewById(R.id.btn_bagi);

        etAngka1 = findViewById(R.id.et_angka1);
        etAngka2 = findViewById(R.id.et_angka2);

        tvHasil = findViewById(R.id.tv_hasil);


        btnMin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sAngka1 = etAngka1.getText().toString();
                double angka1 = Double.parseDouble(sAngka1);

                double angkaku = angka1 - 1;
                String smin1 = String.valueOf(angkaku);
                etAngka1.setText(smin1);
            }
        });
        btnPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sAngka1 = etAngka1.getText().toString();
                double angka1 = Double.parseDouble(sAngka1);

                double angkaku = angka1 + 1;
                String splus1 = String.valueOf(angkaku);
                etAngka1.setText(splus1);
            }
        });

        btnMin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sAngka2 = etAngka2.getText().toString();
                double angka2 = Double.parseDouble(sAngka2);

                double angkaku2 = angka2 - 1;
                String smin2 = String.valueOf(angkaku2);
                etAngka2.setText(smin2);
            }
        });

        btnPlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sAngka2 = etAngka2.getText().toString();
                double angka2 = Double.parseDouble(sAngka2);
                double angkaku2 = angka2 + 1;
                String splus2 = String.valueOf(angkaku2);
                etAngka2.setText(splus2);
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sangka1 = etAngka1.getText().toString();
                String sangka2 = etAngka2.getText().toString();

                double angka1 = Double.parseDouble(sangka1);
                double angka2 = Double.parseDouble(sangka2);

                double Hasil = angka1+angka2;

                String sHasil = String.valueOf(Hasil);
                tvHasil.setText(sHasil);
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sangka1 = etAngka1.getText().toString();
                String sangka2 = etAngka2.getText().toString();

                double angka1 = Double.parseDouble(sangka1);
                double angka2 = Double.parseDouble(sangka2);
                double Hasil = angka1-angka2;

                String sHasil = String.valueOf(Hasil);
                tvHasil.setText(sHasil);
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sangka1 = etAngka1.getText().toString();
                String sangka2 = etAngka2.getText().toString();

                double angka1 = Double.parseDouble(sangka1);
                double angka2 = Double.parseDouble(sangka2);
                double Hasil = angka1*angka2;

                String sHasil = String.valueOf(Hasil);
                tvHasil.setText(sHasil);
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sangka1 = etAngka1.getText().toString();
                String sangka2 = etAngka2.getText().toString();

                double angka1 = Double.parseDouble(sangka1);
                double angka2 = Double.parseDouble(sangka2);

                double Hasil = angka1/angka2;

                String sHasil = String.valueOf(Hasil);
                tvHasil.setText(sHasil);
            }
        });
    }


}
