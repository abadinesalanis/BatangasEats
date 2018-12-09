package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KapengBarako extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kapepage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button83) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button84){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Don+Juan+Boodle+House,+Calle+Jose+W.+Diokno,+Taal,+Batangas/@13.8797773,120.8873313,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0a2172a6b335:0xddc407940a73d391!2m2!1d120.9223509!2d13.8796965"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button85){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Hinomaru,+Diversion+Road,+Batangas/@13.7840926,121.0230922,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0ff2c077bae3:0x9616280ba4ad538c!2m2!1d121.0581118!2d13.7840117"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button86){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Clemente's+Cuisine,+Lipa,+Batangas/@13.9416388,121.1254274,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6ca339a5a3d5:0xc1a650e65590398d!2m2!1d121.160447!2d13.941558"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button87){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Mjca's+Bistro,+National+Road,+Batangas/@13.786084,121.0341861,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0fe5742a4a9f:0x67c29d923170d68a!2m2!1d121.0692057!2d13.7860031"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button59){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Cafe+at+the+Ranch,+Taal,+Batangas/@13.8798004,120.9076765,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0bd33bdb99e1:0x8e19a6b6da205e8f!2m2!1d120.9426961!2d13.8797196"));
            startActivity(i);
        }


    }



}
