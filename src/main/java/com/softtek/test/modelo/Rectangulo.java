package com.softtek.test.modelo;



public class Rectangulo {

    private double alto;
    private double ancho;
    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double calcularAreaR(){
    double area=this.alto*this.ancho;
        return area;
    }
}
