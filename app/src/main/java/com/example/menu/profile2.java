package com.example.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

public class profile2 extends Fragment {


    ImageView persegidatar1;
    ImageView segitigaruang;
    ImageView balok;
    ImageView jajarRG;
    ImageView bulatrung1;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile2, container, false);

        // Inisialisasi ImageView
        persegidatar1 = view.findViewById(R.id.persegdatar);
        segitigaruang = view.findViewById(R.id.segitigadatr);
        balok = view.findViewById(R.id.persegipanjangdatr);
        jajarRG = view.findViewById(R.id.jardat);
        bulatrung1 = view.findViewById(R.id.bulatRUNG);


       persegidatar1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), KubusActivity.class);
                startActivity(intent);

            }});
       segitigaruang.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(getActivity(), segitigaruang.class);
               startActivity(intent);
           }});
       balok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Persegibangunruang.class);
                startActivity(intent);
            }});
        jajarRG.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), jajarBR.class);
                startActivity(intent);
            }});
        bulatrung1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), bulatrung.class);
                startActivity(intent);
            }});






        return view;
    }
}
