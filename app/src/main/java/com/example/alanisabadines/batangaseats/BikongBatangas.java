package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BikongBatangas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bikopage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button78) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button77){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Dencio's,+Maharlika+Highway+Cor.,+Gov+Carpio+Ave.,+Poblation+IV,+Santo+Tomas,+Batangas/@14.1064816,121.1127954,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6591efffffff:0xf15669baa6e0dc3d!2m2!1d121.147815!2d14.1064009"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button76){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//El+cocinero+by+chef+arnaldo,+J+P+Laurel+Street,+Nasugbu,+Batangas/@14.0786194,120.5952273,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd96ad9901a6d5:0xbd4a151a5f3917ed!2m2!1d120.6302469!2d14.0785387"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button74){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//The+Other+Place,+Rizal+Avenue,+Batangas/@13.7554747,121.0166701,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd050d7ea69c61:0x5976760b2a3d6f10!2m2!1d121.0516897!2d13.7553938"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button75){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Hapag+Filipino+Restaurant,+Gen.+Luna+Street,+Lipa,+Batangas/@13.9508559,121.1306559,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6c9b88be6b6b:0x8dae687127ffb483!2m2!1d121.1656755!2d13.9507751"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button57){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Hungry+Hippo,+President+Jose+P.+Laurel+Highway,+Hilltop+St.,+Kumintang+Ibaba,+Batangas/@13.763812,121.0237118,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd055cd5070d63:0x90c1881e2c6f621f!2m2!1d121.0587314!2d13.7637311"));
            startActivity(i);
        }


    }



}
