package com.example.tpmpertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnNama;
    private EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNama =findViewById(R.id.btn_nama);
        etNama = findViewById(R.id.et_nama);


        btnNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sNama =etNama.getText().toString();

                Intent intentku = new Intent(getApplicationContext(), TampilNama.class);
                intentku.putExtra("nama", sNama);
                startActivity(intentku);
            }
        });
    }
}
