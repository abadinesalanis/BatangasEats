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


    }



}
