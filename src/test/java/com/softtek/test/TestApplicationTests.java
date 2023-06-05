package com.softtek.test;

import com.softtek.test.modelo.Calculadora;
import com.softtek.test.modelo.Circulo;
import com.softtek.test.modelo.Rectangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {



    Rectangulo r;


    Circulo c;
    @Test
    void contextLoads() {
    }

    @BeforeEach
    public void antes(){
        r= new Rectangulo(3,4);
        c= new Circulo(5);
    }

    @Test
    public void testCalculadora() throws Exception {
        double resultado= Calculadora.sumar(5,4);
        Assertions.assertEquals(9,resultado);
        double resultadoResta= Calculadora.restar(10,4);
        Assertions.assertEquals(6,resultadoResta);
        double resultadoMultiplicar= Calculadora.multiplicar(5,5);
        Assertions.assertEquals(25,resultadoMultiplicar);

        Assertions.assertThrowsExactly(Exception.class,()->Calculadora.division(15,0));
        Assertions.assertEquals(5, Calculadora.division(25,5));
    }

    @Test
    @DisplayName("Metodo rectangulo")
    public void testRectangulo(){
        Assertions.assertEquals(12,r.calcularAreaR());
    }

    @Test
    @DisplayName("Metodo circulo")
    public void testCirculo(){
        Assertions.assertEquals(78.53981633974483,c.calcularAreaC());
    }
}
