package com.example.menu;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
public class Profile extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // Temukan tombol "Keluar" berdasarkan ID
        Button exitButton = view.findViewById(R.id.buttonlogout);

        // Menambahkan OnClickListener ke tombol "Keluar"
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menutup aplikasi saat tombol "Keluar" ditekan
                getActivity().finish();
            }
        });

        return view;
    }
}

