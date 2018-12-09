package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TamalesngIbaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tamalespage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button48) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button53){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Great+Taste+Lomi+House,+Rosario+-+Ibaan+Road,+Ibaan,+Batangas/@13.8252862,121.112433,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd116a99d1c8c3:0xe5b1101d3fa7ba56!2m2!1d121.1474526!2d13.8252053"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button54){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Paul+%26+Harris+Caf%C3%A9,+Ibaan,+Batangas/@13.8197299,121.0986204,13z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x33bd110e899f79ad:0x4223c2c0fc4135d1!2m2!1d121.13364!2d13.819649"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button55){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Arcemfood,+Ibaan,+Batangas/@13.8197299,121.0986204,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd1136d7b560ff:0xddcfd3a2553f93b3!2m2!1d121.1304161!2d13.8315201"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button56){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Casa+Rap+Restaurant,+President+Jose+P.+Laurel+Highway,+San+Jose,+Batangas/@13.8907069,121.0694884,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd12c710e2ee7f:0xe03e62ac9aff04d5!2m2!1d121.104508!2d13.8906261"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button18){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//NG-WANAM+FOOD+HOUSE,+Batangas+-+Tabangao+-+Lobo+Road,+Libjo+D'+Hope,+Batangas/@13.8907069,121.0694884,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd05302d5dff43:0x86c4c0c1076344b5!2m2!1d121.0706606!2d13.7427448"));
            startActivity(i);
        }


    }



}
