package Calculadora;

import Calculadora.Producto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductoTest extends Modulo {

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

    /**
     * Nota: errores al hacer un Run.
     * Trabajando en resolverlos.
     */

    @Test
    void productopotencia() {
     assertEquals(1.0, producto.productopotencia(5, 0), 0.0001);
    }


    @AfterEach
    void tearDown() {
    }

    @Test
    void testProdcutoreales() {
    }

    @Test
    void testProductoenteros() {
    }

    @Test
    void testProductotresreales() {
    }

    @Test
    void testProductopotencia() {
    }

 @Test
 void testProdcutoreales1() {
 }

 @Test
 void testProductoenteros1() {
 }

 @Test
 void testProductotresreales1() {
 }

 @Test
 void testProductopotencia1() {
 }
}