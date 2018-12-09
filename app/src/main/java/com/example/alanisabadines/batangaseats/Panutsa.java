package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Panutsa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panutsapage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button88) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button89){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//La+Locanda+Ristorante+pizzeria,+J+P+Laurel+Street,+Nasugbu,+Batangas/@14.0752594,120.5964397,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd96bb16c68655:0x859d41c8d2ef41f5!2m2!1d120.6314593!2d14.0751787"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button90){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//HO+TSAI+RESTAURANT+AND+CATERING+SERVICES,+Evangelista+Street,+Poblacion,+Batangas/@13.7577701,121.0241324,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0541a011baff:0x56e596df3ebc6065!2m2!1d121.059152!2d13.7576892"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button91){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Linda+Pe+Restaurant+%26+Catering+Services,+Tanauan,+Batangas/@14.0806368,121.1160891,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6f5e4b8ba015:0x7cc291470d05fe5d!2m2!1d121.1511087!2d14.0805561"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button92){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Kapitan+Bawang's+Grill+%26+Restaurant,+Mabini,+Batangas/@13.7452103,120.9054677,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0701f3a98b4d:0x3201f2f76bfd92fd!2m2!1d120.9404873!2d13.7451294"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button60){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Lutong+Bahay+sa+Sawali,+Gov.+Antonio+Carpio+Road,+Kumintang+Ibaba,+Batangas/@13.7690621,121.0329136,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd05575a8b7323:0xf3709c1237408248!2m2!1d121.0679332!2d13.7689812"));
            startActivity(i);
        }


    }



}
