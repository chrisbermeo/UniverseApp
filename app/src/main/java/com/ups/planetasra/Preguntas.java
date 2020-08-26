package com.ups.planetasra;

public class Preguntas {
    String pregunta;
    String OpcionA;
    String OpcionB;
    String OpcionC;
    String OpcionD;
    int correcto;

    public Preguntas(String pregunta, String opcionA, String opcionB, String opcionC, String opcionD, int correcto) {
        this.pregunta = pregunta;
        OpcionA = opcionA;
        OpcionB = opcionB;
        OpcionC = opcionC;
        OpcionD = opcionD;
        this.correcto = correcto;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getOpcionA() {
        return OpcionA;
    }

    public void setOpcionA(String opcionA) {
        OpcionA = opcionA;
    }

    public String getOpcionB() {
        return OpcionB;
    }

    public void setOpcionB(String opcionB) {
        OpcionB = opcionB;
    }

    public String getOpcionC() {
        return OpcionC;
    }

    public void setOpcionC(String opcionC) {
        OpcionC = opcionC;
    }

    public String getOpcionD() {
        return OpcionD;
    }

    public void setOpcionD(String opcionD) {
        OpcionD = opcionD;
    }

    public int getCorrecto() {
        return correcto;
    }

    public void setCorrecto(int correcto) {
        this.correcto = correcto;
    }
}
