package Calculadora;

/**
 * Clase que realiza operaciones matemáticas.
 * Esta clase implementará todos los métodos que están relacionados con la multiplicación de la calculadora.
 * @author josemariacastellano
 * @version 1.0

 */

public class Producto {

    /**
     * Producto de dos números reales y devuelve solucion.

     * @param Reala Primer numero real a multiplcar.
     * @param Realb Segundo numero real a multiplicar.
     * @return Resultado de la multiplicación de Reala y Realb.
     */

    public double prodcutoreales(double Reala, double Realb) {
        if (Reala == 0 || Realb == 0) {
            throw new IllegalArgumentException("Si utilizar un numero 0 el resultado será 0");}

        return Reala * Realb;
    }

    /**
     * Producto de dos números enteros y devuelve solucion.
     *
     * @param Enteroa Primer numero entero a multiplcar.
     * @param Enterob Segundo numero entero a multiplicar.
     * @return Resultado de la multiplicación de Enteroa y Enterob.
     */

    public int productoenteros(int Enteroa, int Enterob) {
        if (Enteroa == 0 || Enterob == 0) {
            throw new IllegalArgumentException("Si utilizas un numero 0 el resultado será 0");
        }
        return Enteroa * Enterob;
    }


    /**
     * Producto de tres números reales y devuelve solucion.
     *
     * @param Reala Primer numero real a multiplcar.
     * @param Realb Segundo numero real a multiplicar.
     * @param Realc Tercer numero real a multiplicar.
     * @return Resultado de la multiplicación de Reala, Realb y Realc.
     */

    public double productotresreales(double Reala, double Realb, double Realc) {
        if (Reala == 0 || Realb == 0 || Realc == 0) {
            throw new IllegalArgumentException("Si utilizas un numero 0 el resultado será 0");}
        return Reala * Realb * Realc;
    }

    /**
     * Potencia de Base por Exponente y devuelve solucion.

     * @param Base Base al que se elevará.
     * @param Exponente Exponente que se elevará la base.
     * @return Resultado del Exponente elevado a la Base
     */
    public double productopotencia(int Base, int Exponente) {
        if (Base == 0 || Exponente == 0) {
            throw new IllegalArgumentException("Si utilizas un numero 0 el resultado será 0");

        }
       return Math.pow(Base, Exponente);
    }
}

