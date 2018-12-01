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
            i = new Intent(this, TapangTaal.class);
            startActivity(i);
        }else if (v.getId() == R.id.button23) {
            i = new Intent(this, Taghilaw.class);
            startActivity(i);
        }else if (v.getId() == R.id.button24) {
            i = new Intent(this, TamalesngIbaan.class);
            startActivity(i);
        }else if (v.getId() == R.id.button25) {
            i = new Intent(this, BikongBatangas.class);
            startActivity(i);
        }else if (v.getId() == R.id.button26) {
            i = new Intent(this, AtcharangCalaca.class);
            startActivity(i);
        }else if (v.getId() == R.id.button27) {
            i = new Intent(this, KapengBarako.class);
            startActivity(i);
        }else if (v.getId() == R.id.button28) {
            i = new Intent(this, Panutsa.class);
            startActivity(i);
        }else if (v.getId() == R.id.button29) {
            i = new Intent(this, BagoongBalayan.class);
            startActivity(i);
        }else if (v.getId() == R.id.button30) {
            i = new Intent(this, DeepFriedTawilis.class);
            startActivity(i);
        }else if (v.getId() == R.id.button31) {
            i = new Intent(this, SinigangNaMaliputo.class);
            startActivity(i);
        }else if (v.getId() == R.id.button32) {
            i = new Intent(this, SinaingNaTulingan.class);
            startActivity(i);
        }else if (v.getId() == R.id.button22) {
            i = new Intent(this, Tinapa.class);
            startActivity(i);
        }




    }

}