package Calculadora;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto();
    }

    @Test
    @DisplayName("Prodcuto de dos numeros reales")
    void prodcutoreales() {
        assertEquals(4.0, producto.prodcutoreales(2.0, 2.0), 0.0001);
    }

    @Test
    @DisplayName("Producto de dos numeros enteros")
    void productoenteros() {
        assertEquals(-10, producto.productoenteros(-5, 2));
    }



    @Test
    @DisplayName("Test tres numeros reales")
    void productotresreales() {
        assertEquals(108.5967, producto.productotresreales(1.0, 2.43, 44.69), 0.0001);
    }



    @Test
    @DisplayName("Test Potencia")
    void productopotencia() {
        assertEquals(1, producto.productopotencia(1, 21), 0.0001);
    }



}