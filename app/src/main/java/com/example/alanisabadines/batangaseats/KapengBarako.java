package com.example.alanisabadines.batangaseats;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KapengBarako extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kapepage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button83) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }


    }



}
