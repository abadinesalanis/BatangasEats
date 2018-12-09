package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Taghilaw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taghilawpage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button15) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.button49){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Butch+Seafood+%26+Grill+Restaurant,+National+Road,+Alangilan,+Batangas/@13.7776957,121.0321265,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0541b76f7f3f:0x307476f7019bb06d!2m2!1d121.0671461!2d13.7776148"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button50){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//A%26M+VILLAGE+RESTAURANT,+Brgy.+Kumintang+Ibaba,,+Batangas/@13.7776957,121.0321265,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd055e7c7da455:0x4a430798858a0ee1!2m2!1d121.059054!2d13.7698106"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button51){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//F.+Baylosis+Crispy+Pata+%26+Chicken,+G.C.+Berberabe+Subdivision,+Batangas/@13.7698915,121.0240344,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd0549e8914059:0x87ab50b6882a0a27!2m2!1d121.0725948!2d13.7527663"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button52){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//WANAM+SA+BUKID,+Batangas/@13.7528472,121.0375752,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bd054e30000001:0xbafd15960d7bc6e!2m2!1d121.0711797!2d13.758444"));
            startActivity(i);
        }
        else if(v.getId()==R.id.button47){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.google.com/maps/dir//Chez+Deo+Ristorante+Italiano,+Fe+Street,+Balayan,+Batangas/@13.9393441,120.6953146,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x33bda32143583125:0xd85bffc70e5f29c4!2m2!1d120.7303342!2d13.9392633"));
            startActivity(i);
        }


    }



}
