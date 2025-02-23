package Calculadora;

import Calculadora.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() { producto = new Producto();
    }

    @Test
    void prodcutoreales() {
        assertEquals(4.0, producto.prodcutoreales(2, 2), 0.0001);
    }

    @Test
    void productoenteros() {
        assertEquals(-10, producto.productoenteros(-5, 2));
    }

    @Test
    void productotresreales() {
        assertEquals(0.0, producto.productotresreales(0, 2.43, 44.69), 0.0001);
    }

    @Test
    void productopotencia() {
        assertEquals(1.0, producto.productopotencia(5, 0), 0.0001);
    }


}