package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AtcharangCalaca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atcharapage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button67) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button79){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Casa+Marikit,+Lipa,+Batangas/@13.763812,121.0237118,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6ca8a7a3d437:0xb45dfc9b2800ac4b!2m2!1d121.1220206!2d13.941285"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button80){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Tree+House,+Diversion+Road,+Batangas/@13.7761386,121.0181623,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0f8ec5d8bd49:0xc9fa06af6ffb49df!2m2!1d121.0531819!2d13.7760577"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button81){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Ginazel's+Hotel+Restaurant+%26+Catering+Services,+Pastor+Road,+Gulod+Labac,+Batangas/@13.7587294,121.0396835,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0547e226a20d:0x466255a19459c3dc!2m2!1d121.0747031!2d13.7586485"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button82){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Fred's+Seafood+(Club+Yolanda),+G.C.+Berberabe+Subdivison,+Pallocan+West,,+Batangas+City,,+Batangas/@13.7587294,121.0396835,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0541b76f7f3f:0x4e01d68f87df1b5c!2m2!1d121.0739446!2d13.7488815"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button63){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//TOP+RESTAURANT,+P.+Burgos,+Poblacion,+Batangas/@13.7574384,121.0232515,13z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x33bd054193290e63:0xf67645fd22da4931!2m2!1d121.0582711!2d13.7573575"));
            startActivity(i);
        }


    }



}
