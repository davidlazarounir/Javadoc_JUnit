package Calculadora;

/**
 * Clase que proporciona operaciones matemáticas básicas relacionadas con la suma.
 * Incluye la suma de:
 * 1- dos numeros reales
 * 2- dos numeros enteros
 * 3- tres numeros reales
 * 4 - un número acumulado
 *
 * @author David Lázaro (davidlazarounir en GitHub)
 * @version 1.4
 */

public class Suma {

    private double acumulado;   //Variable que se usa para el metodo sumarAcumulado


    public Suma(){
        this.acumulado = 0;     //Variable inicia en 0
    }

    /**
     * Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
     */

    public double sumaReales(double a, double b) {
        return a + b;
    }

    /**
     * Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
     */

    public int sumaEnteros(int a, int b) {
        return a + b;
    }

    /**
     * Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
     */

    public double sumaTresReales(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * Suma valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado
     * @param valor, es el numero introducimos en la calculadora. Se sumará al acumulado.
     * @return
     */

    public double sumarAcumulado(double valor) {
        this.acumulado += valor;
        return this.acumulado;
    }

    /**
     * Indica el número acumulado actual.
     */
    public double getAcumulado() {
        return this.acumulado;
    }

    /**
     * Convierte el número acumuado a (0)
     */
    public void reiniciarAcumulado() {
        this.acumulado = 0;
    }

}
