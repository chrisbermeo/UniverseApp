package com.ups.planetasra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TriviaActivity extends AppCompatActivity {
    private Button empezar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
        empezar = findViewById(R.id.btn_empezar);

    }

    public void btnRegresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void btnEmpezar(View view){
        Intent i = new Intent(this, dificultadActivity.class);
        startActivity(i);

    }



}