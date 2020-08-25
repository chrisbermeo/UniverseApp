package com.ups.planetasra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSistema(View view){
        Intent i = new Intent(this, SistemaActivity.class);
        startActivity(i);
    }

    public void btnPlanetas(View view){
        Intent i = new Intent(this, PlanetasActivity.class);
        startActivity(i);
    }

    public void btnTrivia(View view){
        Intent i = new Intent(this, TriviaActivity.class);
        startActivity(i);
    }







}