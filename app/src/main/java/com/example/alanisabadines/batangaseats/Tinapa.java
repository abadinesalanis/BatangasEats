package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tinapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tinapapage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button106) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button107){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Arsenio's+Restaurant,+Rizal+Street,+Mataas+Na+Kahoy,+Batangas/@13.9578773,121.0776474,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6d10b9f6fbb1:0xfb5d46abf7382174!2m2!1d121.112667!2d13.9577965"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button108){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Anchor+Point+Diner,+V.+Templo+Street,+Mataas+Na+Kahoy,+Batangas/@13.9587763,121.0797919,13z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x33bd6d1a6f523669:0x880624be3ab7878a!2m2!1d121.1148115!2d13.9586955"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button109){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Leonora+Cecilia's+Restaurant,+Calaca+-+Lemery+Highway,+Calaca,+Batangas/@13.9257522,120.7860511,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bda17155c36f17:0xd9a1ac69937cb59a!2m2!1d120.8210707!2d13.9256714"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button110){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Pixie's+Sinugba,+Lipa,+Batangas/@13.9421868,121.1175024,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6cbeb8c7c7c9:0xebe771b0252e35ac!2m2!1d121.152522!2d13.942106"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button64){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Ridel's+Garden+Restaurant,+L.Grenas+Street,+Pob.+D,+Rosario,+Batangas/@13.8433339,121.1686264,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd1425bb635c9f:0x6bba4d09dba0c029!2m2!1d121.203646!2d13.843253"));
            startActivity(i);
        }


    }



}
