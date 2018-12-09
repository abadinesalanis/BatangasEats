package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GotongBatangas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gotopage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button12) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button16){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Al+Goto+King,+Diversion+Road,+Brgy.+Balagtas,+Batangas/@13.7975787,121.0349959,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0fdc8d5e506d:0xe0d421c206a0088b!2m2!1d121.0700155!2d13.7974978"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button17){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Greg+Goto+and+Mami,+President+Jose+P.+Laurel+Highway,+San+Pioquinto,+Tanauan,+Batangas/@14.0581257,121.1193906,13z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x33bd6f24a2f99603:0x2543a37ba81ec2bf!2m2!1d121.1544102!2d14.058045"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button35){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Orlando's+Lomi+and+Gotong+Batangas,+Talisay,+Batangas/@14.0926493,120.9805551,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd710e385f2d93:0x9e03912d21c10515!2m2!1d121.0155747!2d14.0925686"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button36){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Lhino's+Goto,+Santo+Tomas-Lipa+Road,+Lipa,+Batangas/@13.9667895,121.1482717,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6b9cb9f561d7:0xe018add8e04fc01a!2m2!1d121.1832913!2d13.9667087"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button20){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Tessie's+Goto+%26+Bulalo,+Lipa,+Batangas/@13.9337487,121.1170021,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd6cb6e6e04379:0x76f72d8f18041b08!2m2!1d121.1520217!2d13.9336679"));
            startActivity(i);
        }


    }



}
