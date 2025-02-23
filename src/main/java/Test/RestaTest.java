package Test;

import Calculadora.Resta;
import org.junit.Before;
import org.junit.Test;

public class RestaTest {

    private Resta resta;

    @Before
    public void setUp() throws Exception {
        Resta resta = new Resta();
    }

    @Test
    public void restaReales() {
        resta.restaReales(8.6,6.5);
    }

    @Test
    public void restaEnteros() {
        resta.restaEnteros(6,3);
    }

    @Test
    public void restarReales() {
        resta.restarReales(10,2,3);
    }

    @Test
    public void restaAcumulado() {
        resta.restaAcumulado(10);
    }
}