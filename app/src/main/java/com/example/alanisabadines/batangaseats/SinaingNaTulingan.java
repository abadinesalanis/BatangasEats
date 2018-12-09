package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SinaingNaTulingan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tulinganpage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button68) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button102){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//The+Authentic+Savory+Restaurant,+Tabangao-+Lobo+Road,+Pallocan+West,+Batangas/@13.7542684,121.0355005,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd05484d93bef3:0xf3ece09f008bf298!2m2!1d121.0705201!2d13.7541875"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button103){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Seafood+Island+Sto.+Tomas+Batangas+Branch,+Pan-Philippine+Highway,+Santo+Tomas,+Batangas/@14.1091076,121.111903,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6594df1b5093:0x22129e0e4ae70319!2m2!1d121.1469226!2d14.1090269"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button104){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Mando+and+Elvie's+Lutong+Bahay+Batangas+Bulalo,+San+Roque,+Santo+Tomas,+Batangas/@14.0982583,121.1251251,13z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x33bd65fa985c2b93:0x205965addfb5b14f!2m2!1d121.1601447!2d14.0981776"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button105){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir///@14.0982583,121.1251251,13z"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button58){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//The+Beehive,+Lipa,+Batangas/@13.9426,121.1028069,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6cc4bc937b5d:0x755f27d334e37907!2m2!1d121.1378265!2d13.9425192"));
            startActivity(i);
        }


    }



}
