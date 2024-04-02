package com.example.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class bulat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulat);

        final EditText editTextJariJari = findViewById(R.id.editTextjari);
        Button buttonHitung = findViewById(R.id.buttobul);
        final TextView textViewHasil = findViewById(R.id.textViewbul);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jariJariString = editTextJariJari.getText().toString();

                if (!jariJariString.isEmpty()) {
                    double jariJari = Double.parseDouble(jariJariString);

                    if (jariJari > 0) {
                        double luas = Math.PI * Math.pow(jariJari, 2);
                        textViewHasil.setText("Luas lingkaran adalah: " + luas);
                    } else {
                        textViewHasil.setText("Masukkan nilai jari-jari yang valid (positif)");
                    }
                } else {
                    textViewHasil.setText("Masukkan nilai jari-jari");
                }
            }
        });
    }
}
