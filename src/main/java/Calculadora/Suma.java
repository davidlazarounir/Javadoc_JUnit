package Calculadora;

/**
 * Clase que proporciona operaciones matemáticas básicas
 * @author David Lázaro
 * @version 1.2
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
     * @param valor, es el numero que se introduce y sustituye al acumulado, guardando la cifra
     * @return
     */

    public double sumarAcumulado(double valor) {
        this.acumulado += valor;
        return this.acumulado;
    }

    public double getAcumulado() {
        return this.acumulado;
    }

    public void reiniciarAcumulado() {
        this.acumulado = 0;
    }

}
