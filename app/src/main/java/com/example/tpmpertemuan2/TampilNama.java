package com.example.tpmpertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TampilNama extends AppCompatActivity {
    private TextView tvNama;
    private Button btnKeKalkulator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_nama);

        tvNama = findViewById(R.id.tv_nama);
        btnKeKalkulator = findViewById(R.id.btn_kekalkulator);

        String hasil = getIntent().getStringExtra("nama");

        tvNama.setText("Selamat Datang " + hasil);

         btnKeKalkulator.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intentku = new Intent(getApplicationContext(), Kalkulator.class);
                 startActivity(intentku);
             }
         });
    }
}
