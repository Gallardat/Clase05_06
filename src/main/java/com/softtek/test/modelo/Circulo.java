package com.softtek.test.modelo;

public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularAreaC(){
         return Math.PI * Math.pow(this.radio, 2);
    }
}