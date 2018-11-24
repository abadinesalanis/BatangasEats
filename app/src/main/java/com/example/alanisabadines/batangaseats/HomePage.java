package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagehome);

    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button21) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.button2) {
            i = new Intent(this, LomiPage.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.button3) {
            i = new Intent(this, GotongBatangas.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.button4) {
            i = new Intent(this, Bulalo.class);
            startActivity(i);
        }else if (v.getId() == R.id.button7) {
            i = new Intent(this, Bulalo.class);
            startActivity(i);
        }


    }

}