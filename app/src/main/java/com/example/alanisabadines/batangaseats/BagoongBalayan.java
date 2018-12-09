package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BagoongBalayan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bagoongpage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button66) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button70){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Minori-Tei,+FPIP+Main+Road,+Santo+Tomas,+Batangas/@14.1374337,121.0988412,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd645252c77191:0xed65bbac1d8b6439!2m2!1d121.1338608!2d14.137353"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button72){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Exotik+Restaurant,+Lipa,+Batangas/@13.9413329,121.1135381,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6cb8af213b81:0xa1a1cce2cbb6115a!2m2!1d121.1485577!2d13.9412521"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button71){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Casa+Rap+Restaurant,+President+Jose+P.+Laurel+Highway,+San+Jose,+Batangas/@13.8907069,121.0694884,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd12c710e2ee7f:0xe03e62ac9aff04d5!2m2!1d121.104508!2d13.8906261"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button73){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Old+San+Juan+Hotel+and+Restaurant,+Javier+Street,+San+Juan,+Batangas/@13.8273708,121.3606367,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd39746892136d:0x940ea3c28550fb77!2m2!1d121.3956563!2d13.8272899"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button65){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Eat+'n+Be+Well+Vegetarians'+Haven,+C.Tirona,+Poblacion,+Batangas/@13.75843,121.0237296,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0541919716cb:0xc179857cdd58fda0!2m2!1d121.0587492!2d13.7583491"));
            startActivity(i);
        }


    }



}
