package com.ups.planetasra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TriviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
    }

    public void btnRegresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}