package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DeepFriedTawilis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tawilispage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button69) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button93){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//The+Beehive,+Lipa,+Batangas/@13.9426,121.1028069,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6cc4bc937b5d:0x755f27d334e37907!2m2!1d121.1378265!2d13.9425192"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button95){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Golden+View+Grill+Caf%C3%A8+and+Restaurant,+Diokno+Highway,+Calaca,+Batangas/@14.0543188,120.8173726,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd9dd4f35e3997:0x81e093bd622b3b52!2m2!1d120.8523922!2d14.0542381"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button96){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//The+Tree+House+Restaurant,+Batangas/@13.7769734,121.0183269,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0541b76f7f3f:0xd2a089e9d9e69251!2m2!1d121.0533465!2d13.7768925"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button94){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Milan's+Native+Food+and+Grill,+Tolentino+West,+Talisay,+Batangas/@14.0933509,120.9925786,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd708ead75f417:0x8ecd25c22ff992ed!2m2!1d121.0275982!2d14.0932702"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button61){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//MESA+Filipino+Moderne+Restaurant+SM+City+Lipa,+Batangas,+Ayala+Highway,+Lipa,+Batangas/@13.954744,121.128955,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6c9b498abdeb:0x526dc78844acc0db!2m2!1d121.1639746!2d13.9546632"));
            startActivity(i);
        }


    }



}
