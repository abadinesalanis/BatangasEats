package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bulalo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulalopage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button13) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button37){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Irene's+BULALO+SA+KUBO,+Batangas/@13.7859868,121.0341637,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0fe5d8886301:0xa6bfb0634dfda1b7!2m2!1d121.0691833!2d13.7859059"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button40){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Rose+%26+Grace+Restaurant,+Pan-Philippine+Highway,+Santo+Tomas,+Batangas/@14.1111992,121.1092154,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd659596bf9d35:0xb9b0189360d36368!2m2!1d121.144235!2d14.1111185"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button41){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Kainan+sa+Dalampasigan,+Nasugbu,+Batangas/@14.0677758,120.5929273,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd96a4666bd485:0x37b2335018e56e56!2m2!1d120.6279469!2d14.0676951"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button42){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//L'Bulalo+Restaurant,+J+P+Laurel+Street,+Nasugbu,+Batangas/@14.0677758,120.5929273,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd96bb16c68655:0xa4d8ce7443948aba!2m2!1d120.6307478!2d14.0780184"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button39){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Jorjhane's+House+of+Special+Bulalo,+Batangas/@13.7757442,121.009479,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0f892f05bb23:0xacca250da5fe7f11!2m2!1d121.0444986!2d13.7756633"));
            startActivity(i);
        }


    }



}
