package com.example.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class persegipanjangD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang_d);

        final EditText editTextPanjang = findViewById(R.id.panjang);
        final EditText editTextLebar = findViewById(R.id.lebar);
        Button buttonHitung = findViewById(R.id.buttojang);
        final TextView textViewHasil = findViewById(R.id.textViewjang);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjangString = editTextPanjang.getText().toString();
                String lebarString = editTextLebar.getText().toString();

                if (!panjangString.isEmpty() && !lebarString.isEmpty()) {
                    double panjang = Double.parseDouble(panjangString);
                    double lebar = Double.parseDouble(lebarString);

                    if (panjang > 0 && lebar > 0) {
                        double luas = panjang * lebar;
                        textViewHasil.setText("Luas persegi panjang adalah: " + luas);
                    } else {
                        textViewHasil.setText("Masukkan nilai panjang dan lebar yang valid (positif)");
                    }
                } else {
                    textViewHasil.setText("Masukkan nilai panjang dan lebar");
                }
            }
        });
    }
}
