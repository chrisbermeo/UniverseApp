package com.ups.planetasra;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class juegoActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView question, qCount, timer;
    private Button opcion1, opcion2, opcion3, opcion4;
    private List<Preguntas> preguntasList;
    private int preguntaNum;
    private CountDownTimer countDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        question = findViewById(R.id.pregunta);
        qCount = findViewById(R.id.numPregunta);
        timer = findViewById(R.id.tiempo);

        opcion1 = findViewById(R.id.opcion1);
        opcion2 = findViewById(R.id.opcion2);
        opcion3 = findViewById(R.id.opcion3);
        opcion4 = findViewById(R.id.opcion4);

        opcion1.setOnClickListener(this);
        opcion2.setOnClickListener(this);
        opcion3.setOnClickListener(this);
        opcion4.setOnClickListener(this);

        getQuestionsList();

    }

    private void getQuestionsList()
    {
        preguntasList = new ArrayList<>();

        preguntasList.add(new Preguntas("Pregunta 1", "A", "B", "C", "D", 2));
        preguntasList.add(new Preguntas("Pregunta 2", "B", "C", "A", "D", 2));
        preguntasList.add(new Preguntas("Pregunta 3", "C", "B", "A", "D", 2));
        preguntasList.add(new Preguntas("Pregunta 4", "B", "A", "C", "D", 2));
        preguntasList.add(new Preguntas("Pregunta 5", "B", "D", "C", "A", 2));
        preguntasList.add(new Preguntas("Pregunta 6", "C", "D", "B", "A", 2));
        preguntasList.add(new Preguntas("Pregunta 7", "A", "B", "D", "C", 2));
        preguntasList.add(new Preguntas("Pregunta 8", "B", "C", "D", "A", 2));
        preguntasList.add(new Preguntas("Pregunta 9", "A", "B", "C", "D", 2));
        preguntasList.add(new Preguntas("Pregunta 10", "D", "B", "C", "A", 2));

        setPreguntas();
    }

    private void setPreguntas(){
        timer.setText(String.valueOf(10));

        question.setText(preguntasList.get(0).getPregunta());
        opcion1.setText(preguntasList.get(0).getOpcionA());
        opcion2.setText(preguntasList.get(0).getOpcionB());
        opcion3.setText(preguntasList.get(0).getOpcionC());
        opcion4.setText(preguntasList.get(0).getOpcionD());

        qCount.setText(String.valueOf(1) + "/" + String.valueOf(preguntasList.size()));
        startTimer();

        preguntaNum = 0;

    }

    private void startTimer()
    {
         countDown = new CountDownTimer(12000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(millisUntilFinished < 10000)
                    timer.setText(String.valueOf(millisUntilFinished / 1000)); //Esto define el timer y se lo divide para 1000 porque está en milisegundos
            }

            @Override
            public void onFinish() {
                cambiaPregunta();
            }
        };
        countDown.start();
    }



    @Override
    public void onClick(View view) {
        int selectedOption = 0;

        switch (view.getId())
        {
            case R.id.opcion1 :
                selectedOption = 1;
                break;

            case R.id.opcion2:
                selectedOption = 2;
                break;

            case R.id.opcion3:
                selectedOption = 3;
                break;

            case R.id.opcion4:
                selectedOption = 4;
                break;

            default:
        }
        countDown.cancel();
        checkAnswer(selectedOption, view);
    }

    private void checkAnswer(int selectedOption, View view) {

        if (selectedOption == preguntasList.get(preguntaNum).getCorrecto()) {
            //Respuesta Correcta
            ((Button) view).setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
            //score++;

        } else {
            //Pregunta incorrecta
            ((Button) view).setBackgroundTintList(ColorStateList.valueOf(Color.RED));

            switch (preguntasList.get(preguntaNum).getCorrecto()) {
                case 1:
                    opcion1.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 2:
                    opcion2.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 3:
                    opcion3.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 4:
                    opcion4.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;

            }
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                cambiaPregunta();
            }
        },2000);

    }

    private void cambiaPregunta()
    {
        if( preguntaNum < preguntasList.size() - 1) //Si ya no hay más preguntas
        {
            preguntaNum++;

            playAnim(question,0,0);
            playAnim(opcion1,0,1);
            playAnim(opcion2,0,2);
            playAnim(opcion3,0,3);
            playAnim(opcion4,0,4);

            qCount.setText(String.valueOf(preguntaNum+1) + "/" + String.valueOf(preguntasList.size()));

            timer.setText(String.valueOf(10));
            startTimer();

        }
        else
        {
            // Va a Puntaje Activity
            Intent intent = new Intent(juegoActivity.this,PuntajeActivity.class);
            //intent.putExtra("SCORE", String.valueOf(score) + "/" + String.valueOf(preguntasList.size()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            //QuestionActivity.this.finish();
        }


    }



    private void playAnim(final View view, final int value, final int viewNum)
    {

        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500)
                .setStartDelay(100).setInterpolator(new DecelerateInterpolator())
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        if(value == 0)
                        {
                            switch (viewNum)
                            {
                                case 0:
                                    ((TextView)view).setText(preguntasList.get(preguntaNum).getPregunta());
                                    break;
                                case 1:
                                    ((Button)view).setText(preguntasList.get(preguntaNum).getOpcionA());
                                    break;
                                case 2:
                                    ((Button)view).setText(preguntasList.get(preguntaNum).getOpcionB());
                                    break;
                                case 3:
                                    ((Button)view).setText(preguntasList.get(preguntaNum).getOpcionC());
                                    break;
                                case 4:
                                    ((Button)view).setText(preguntasList.get(preguntaNum).getOpcionD());
                                    break;

                            }


                            if(viewNum != 0)
                                ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#E99C03")));


                            playAnim(view,1,viewNum);

                        }

                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });

    }





}