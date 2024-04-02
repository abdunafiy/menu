package com.example.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

public class home2 extends Fragment {

    ImageView persegi;
    ImageView segitiga;
    ImageView bulat;
    ImageView jajarganjar;
    ImageView segipanjang;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home2, container, false);

        // Inisialisasi ImageView
        persegi = view.findViewById(R.id.imageView);
        segitiga = view.findViewById(R.id.imageView2);
        bulat = view.findViewById(R.id.imageView4);
        jajarganjar = view.findViewById(R.id.imageView3);
        segipanjang = view.findViewById(R.id.imageView5);

        // Menambahkan OnClickListener pada ImageView
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika ImageView diklik, buka activity baru
                Intent intent = new Intent(getActivity(), persegi.class);
                startActivity(intent);

            }
        });
        segitiga.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(getActivity(), Segitigadatar.class);
          startActivity(intent);

           }});
        bulat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), com.example.menu.bulat.class);
                startActivity(intent);
            }
        });
        jajarganjar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), jajargenjardatar.class);
                startActivity(intent);
            }
        }); segipanjang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), persegipanjangD.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
