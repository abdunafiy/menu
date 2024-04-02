package com.example.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Segitigadatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitigadatar);

        final EditText editTextAlas = findViewById(R.id.alas);
        final EditText editTextTinggi = findViewById(R.id.tinggi);
        Button buttonHitung = findViewById(R.id.buttosegitig);
        final TextView textViewHasil = findViewById(R.id.textViewseg);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alasString = editTextAlas.getText().toString();
                String tinggiString = editTextTinggi.getText().toString();

                if (!alasString.isEmpty() && !tinggiString.isEmpty()) {
                    double alas = Double.parseDouble(alasString);
                    double tinggi = Double.parseDouble(tinggiString);

                    if (alas > 0 && tinggi > 0) {
                        double luas = 0.5 * alas * tinggi;
                        textViewHasil.setText("Luas segitiga adalah: " + luas);
                    } else {
                        textViewHasil.setText("Masukkan nilai alas dan tinggi yang valid (positif)");
                    }
                } else {
                    textViewHasil.setText("Masukkan nilai alas dan tinggi");
                }
            }
        });
    }
}
