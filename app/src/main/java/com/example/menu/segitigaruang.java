package com.example.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class segitigaruang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitigaruang);

        final EditText editTextAlas = findViewById(R.id.alasr);
        final EditText editTextTinggi = findViewById(R.id.tinggir);
        Button buttonHitung = findViewById(R.id.buttosegitigr);
        final TextView textViewHasil = findViewById(R.id.textViewsegr);

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
                        textViewHasil.setText("Masukkan nilai yang valid untuk alas dan tinggi");
                    }
                } else {
                    textViewHasil.setText("Masukkan nilai untuk alas dan tinggi");
                }
            }
        });
    }
}
