package Calculadora;

import Calculadora.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumaTest {

    private Suma suma;

    @BeforeEach
    void setUp() {
        suma = new Suma();
    }

    @Test
    void sumaReales() {
        double resultado = suma.sumaReales(5.5, 2.3);
        assertEquals(7.8, resultado, 0.0001);
    }

    @Test
    void sumaEnteros() {
        int resultado = suma.sumaEnteros(3, 7);
        assertEquals(10, resultado);
    }

    @Test
    void sumaTresReales() {
        double resultado = suma.sumaTresReales(1.1, 2.2, 3.3);
        assertEquals(6.6, resultado, 0.0001);
    }
}