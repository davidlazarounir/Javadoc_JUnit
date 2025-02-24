package Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RestaTest {

    private Resta resta = new Resta();

    @BeforeEach
    void setUp() {
        resta = new Resta();
    }

    @Test
    void restaReales() {
        double resultado = resta.restaReales(10.5, 4.2);
        assertEquals(6.3, resultado, 0.0001);
    }

    @Test
    void restaEnteros() {
        int resultado = resta.restaEnteros(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    void restarReales() {
        double resultado = resta.restarReales(10.5, 4.2, 1.3);
        assertEquals(5.0, resultado, 0.0001);
    }

    @Test
    void restaAcumulado() {
        double resultado1 = resta.restaAcumulado(5.0);
        assertEquals(-5.0, resultado1, 0.0001);

        double resultado2 = resta.restaAcumulado(3.0);
        assertEquals(-8.0, resultado2, 0.0001);
    }
}
