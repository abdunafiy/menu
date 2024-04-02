package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class jajarBR extends AppCompatActivity {

    EditText editTextAlas, editTextTinggi;
    TextView textViewHasil;
    Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_br);

        // Inisialisasi EditText, TextView, dan Button
        editTextAlas = findViewById(R.id.alasJARUNG);
        editTextTinggi = findViewById(R.id.tinggJARUNG);
        textViewHasil = findViewById(R.id.jarung);
        buttonHitung = findViewById(R.id.jarung2);
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan nilai luas alas dan tinggi jajar genjang dari EditText
                String strLuasAlas = editTextAlas.getText().toString();
                String strTinggi = editTextTinggi.getText().toString();

                // Konversi nilai luas alas dan tinggi jajar genjang menjadi float
                float luasAlas = Float.parseFloat(strLuasAlas);
                float tinggi = Float.parseFloat(strTinggi);

                // Menghitung volume jajar genjang
                float volume = luasAlas * tinggi;

                // Menampilkan hasil volume pada TextView
                textViewHasil.setText("Volume jajar genjang: " + volume);
            }
        });
    }
}
