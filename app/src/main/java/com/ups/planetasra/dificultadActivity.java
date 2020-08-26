package com.ups.planetasra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class dificultadActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dificultad);
    }


    public void btnFacil(View view){
        Intent i = new Intent(this, juegoActivity.class);
        startActivity(i);
    }

    public void btnDificil(View view){
        Intent i = new Intent(this, juegoActivity.class);
        startActivity(i);
    }

}