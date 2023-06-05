package com.softtek.test.modelo;

public class Calculadora {

    public static double sumar(double n1, double n2) {
        return n1+n2;
    }

    public static double restar(double n1, double n2) {
        return n1-n2;
    }

    public static double multiplicar(double n1, double n2){
        return n1*n2;
    }

    public static double division(double n1, double n2) throws Exception {
        if (n2==0){
            throw new Exception("No se puede dividir entre 0");
        }
        return n1/n2;
    }
}
