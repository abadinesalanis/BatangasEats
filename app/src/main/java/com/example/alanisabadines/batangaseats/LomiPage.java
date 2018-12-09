package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LomiPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lomipage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button9) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button10){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Lomi+King,+Pres.+J.P.+Laurel+Highway,+Lipa,+Batangas/@13.9410155,121.1460205,18.09z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6cc73a50f9c7:0x8c15663040dc28d!2m2!1d121.146192!2d13.9412443"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button11){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//LBN+Lomi+House+and+Eatery,+1824+Pres.+J.+P.+Laurel+Brgy.+Marawoy,+Lipa,+4217+Batangas/@13.9709652,121.1645613,17z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6c793d92791d:0x1aeed305d41a038d!2m2!1d121.16675!2d13.97096"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button33){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Bafoos+Lomi+Haus+%26+Restaurant,+Hilltop+Rd,+Kumintang+Ibaba,+Batangas/@13.757292,121.0230915,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0541b76f7f3f:0x401fcf93f6e88f3b!2m2!1d121.0581111!2d13.7572111"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button34){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Mr.+Top'si+Lomi+And+Bulalo+House,+National+Road,+Brgy.+Alangilan,+Batangas/@13.7778432,121.0316921,13z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x33bd0ff7465b2d9b:0x7d57e3f3e9ab4501!2m2!1d121.0667117!2d13.7777623"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button19){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Corcolon's+Lomi+Haus,+San+Jose,+Batangas/@13.9148429,121.0492475,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd129f58693903:0xc87ccce5ebeb0a47!2m2!1d121.0842671!2d13.9147621"));
            startActivity(i);
        }



    }



}
