package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bulatrung extends AppCompatActivity {
    EditText editTextRadius;
    TextView textViewResult;
    Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulatrung);

        editTextRadius = findViewById(R.id.jari3);
        textViewResult = findViewById(R.id.hasilbols);
        buttonCalculate = findViewById(R.id.buttobols);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan nilai jari-jari dari EditText dan mengonversinya ke tipe data double
                String radiusStr = editTextRadius.getText().toString();
                double radius = Double.parseDouble(radiusStr);

                // Menghitung luas bola
                double area = 4 * Math.PI * radius * radius;

                // Menampilkan hasil pada TextView
                textViewResult.setText("Luas Bola: " + area);
            }
        });
    }
}
