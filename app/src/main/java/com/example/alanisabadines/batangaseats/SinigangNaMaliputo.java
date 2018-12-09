package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SinigangNaMaliputo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sinigangpage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button97) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button99){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Culture+Lounge+%26+Restaurant,+Lipa,+Batangas/@13.9519937,121.1264216,13z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x33bd6c9a4416aa53:0x58620175abd4b344!2m2!1d121.1614412!2d13.9519129"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button98){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Asian+Flavours,+Malvar,+Batangas/@14.0406363,121.1194248,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6edb7acd1307:0x3ba77b0ba9bfcee8!2m2!1d121.1544444!2d14.0405556"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button100){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Taal+Bayview+Bistro,+Diversion+Road,+Taal,+Batangas/@13.8881378,120.9017954,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0a33e85e5d8b:0xab88e7beb2f05bf4!2m2!1d120.936815!2d13.888057"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button101){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Seafood+in+a+Bucket+by+Chef+Jonas,+Lipa,+Batangas/@13.9561758,121.1310304,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6c8367ff2603:0xb81741cbf9f6ca07!2m2!1d121.16605!2d13.956095"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button62){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Kanpai,+Diversion+Rd.+Brgy,+Balagtas,+Batangas/@13.7967693,121.0338087,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0fdcdba9ef89:0xcfd9c276ec1b27a!2m2!1d121.0688283!2d13.7966884"));
            startActivity(i);
        }


    }



}
