package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AtcharangCalaca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atcharapage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button67) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }


    }



}
