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
        return Reala * Realb * Realc;
    }

    /**
     * Potencia de Base por Exponente y devuelve solucion.

     * @param Base Base al que se elevará.
     * @param Exponente Exponente que se elevará la base.
     * @return Resultado del Exponente elevado a la Base
    */
    public double productopotencia(double Base, int Exponente) {
        return Math.pow(Base, Exponente);
    }



}
