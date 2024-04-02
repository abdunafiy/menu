package com.example.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Persegibangunruang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegibangunruang);

        final EditText editTextPanjang = findViewById(R.id.editTextpersegruang);
        final EditText editTextLebar = findViewById(R.id.editTextpersegruang2);
        final EditText editTextTinggi = findViewById(R.id.editTextpersegruang3);
        Button buttonHitung = findViewById(R.id.buttopersegruang);
        final TextView textViewHasil = findViewById(R.id.hasilpersegurnag);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjangString = editTextPanjang.getText().toString();
                String lebarString = editTextLebar.getText().toString();
                String tinggiString = editTextTinggi.getText().toString();
                if (!panjangString.isEmpty() && !lebarString.isEmpty() && !tinggiString.isEmpty()) {
                    double panjang = Double.parseDouble(panjangString);
                    double lebar = Double.parseDouble(lebarString);
                    double tinggi = Double.parseDouble(tinggiString);
                    if (panjang > 0 && lebar > 0 && tinggi > 0) {
                        double luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
                        textViewHasil.setText("Luas balok adalah: " + luas);
                    } else {
                        textViewHasil.setText("Masukkan nilai yang valid untuk panjang, lebar, dan tinggi");
                    }
                } else {
                    textViewHasil.setText("Masukkan nilai untuk panjang, lebar, dan tinggi");
                }
            }
        });
    }
}
