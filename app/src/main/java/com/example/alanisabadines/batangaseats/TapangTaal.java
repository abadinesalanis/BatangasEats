package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TapangTaal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tapapage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button14) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button38){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Restaurant+El+Torro,+Caltex+Road,+Brgy+Banaba+South,+Batangas/@13.7867662,121.0225471,13z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x33bd0fed3058ee8b:0xd4f84a6757accd14!2m2!1d121.0575667!2d13.7866853"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button44){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Johanna's+Grille,+P.+Burgos,+Barangay+12,+Batangas/@13.7867662,121.0225471,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd05426e0a427b:0xbb75e294c6196861!2m2!1d121.0572338!2d13.7609104"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button45){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Big+Mike's+Grill+House,+M.Pastor+Avenue,+Pallocan+West,+Batangas/@13.7609913,121.0222142,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0547e226a20d:0xc1fde1b0084e2f78!2m2!1d121.0670786!2d13.753457"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button46){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Don+Juan+BBQ,+Calle+Jose+W.+Diokno,+Taal,+Batangas/@13.8797602,120.887268,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0a210d4eb521:0x563d2c6c0c13437b!2m2!1d120.9222876!2d13.8796794"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button43){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Millie's,+FPIP+Main+Road,+Santo+Tomas,+Batangas/@14.1376219,121.098773,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6453b2cc4d17:0x1dbe8ef9378c4030!2m2!1d121.1337926!2d14.1375412"));
            startActivity(i);
        }


    }



}
