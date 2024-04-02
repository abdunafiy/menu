package com.example.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KubusActivity extends AppCompatActivity {

    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_kubus);

        final EditText editTextSisi = findViewById(R.id.sisikubus);
        Button buttonHitung = findViewById(R.id.buttokubus);
        final TextView textViewHasil = findViewById(R.id.hasilbus);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisiString = editTextSisi.getText().toString();
                if (!sisiString.isEmpty()) {
                    double sisi = Double.parseDouble(sisiString);
                    if (sisi > 0) {
                        double luas = 6 * sisi * sisi;
                        textViewHasil.setText("Luas kubus adalah: " + luas);
                    } else {
                        textViewHasil.setText("Masukkan panjang sisi yang valid");
                    }
                } else {
                    textViewHasil.setText("Masukkan panjang sisi");
                }
            }
        });
    }
}
