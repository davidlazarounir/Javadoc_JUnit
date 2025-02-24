package Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocienteTest {

    @BeforeEach
    void setUp() {
        CocienteTest c = new CocienteTest();
    }

    @Test
    void divisionReales() {

        double dividendo = 5.8;
        double divisores = 2.8;
        double esperado=5.8/2.8;
        CocienteTest c;
        double resultado= c.divisionReales(dividendo,divisores);
        assertEquals(2.07);


    }

    @Test
    void divisionEnteros() {
        int divisores = 10;
        int divisorEnteros=2;
        CocienteTest c;
        double esperado=10/2;
        c=new CocienteTest();
        assertEquals(5);
    }

    @Test
    void calcularInverso() {
        double inverso = 2.0;
        CocienteTest c;
        double esperado=1/2.5;
        c=new CocienteTest();
        assertEquals(0.4);
    }

    @Test
    void raizCuadrada() {
        double valor = 8.6;
        double raizCuadrada=Math.sqrt(valor);
        assertEquals(2.93);



    }
}