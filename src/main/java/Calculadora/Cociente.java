package Calculadora;

/**
 * Clase que realiza operaciones matemáticas.
 * Esta clase implementará todos los métodos que están relacionados con la multiplicación de la calculadora.
 * @author WorldOfPromise
 * @version 1.0

 */




public class Cociente {

    /**
     * Clase 4: Cociente.
     *  * Clase que implementa operaciones relacionadas con la división y raíces.
     *  * Incluye métodos para división de números reales/enteros, inverso y raíz cuadrada.
     *  *
     * @author David Díaz Pérez (https://github.com/WorldOfPromise)
     * @version 1.5
     * @see <a href="https://github.com/davidlazarounir/Javadoc_JUnit/">nuestro repositorio compartido</a>
     *
     *
     * Dentro de la Calculadora tengo que desarrollar esta clase.
     * Copio el texto del enunciado:
     * Esta clase implementará todos los métodos que están relacionados con la división
     * de la calculadora. Esta clase tendrá los siguientes métodos:
     * 1. División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
     * 2. División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
     * 3. Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
     * 4. Raíz de un número, tendrá un parámetro de entra y uno de salida que será la solución.
     **/


    /**
 * 1. División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 * Dividir dos números reales.
 *
 * @param dividendoReales Numero a dividir
 * @param divisorReales   Numero de divisor
 * @return es el resultado
 * @throws IllegalArgumentException si el divisorReales es 0
 */

public double divisionReales(double dividendoReales, double divisorReales) {
    if (divisorReales == 0) {
        // System.out.printIn("El divisor no puede ser 0");
        throw new IllegalArgumentException("El divisor no puede ser cero");
    }
    return dividendoReales / divisorReales;
}


/**
 * 2. División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 * Dividir dos números enteros.
 *
 * @param dividendoEnteros Numero a dividir
 * @param divisorEnteros Numero de divisor
 * @return es el resultado
 * @throws IllegalArgumentException si el divisorEnteros es 0
 */

public int divisionEnteros(int dividendoEnteros, int divisorEnteros) {
    if (divisorEnteros == 0) {
        throw new IllegalArgumentException("El divisor no puede ser cero");
    }
    return dividendoEnteros / divisorEnteros;
}


/**
 * 3. Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
 * Inverso de un número real.
 * Más información:
 * El inverso de un número A es 1/A ya que A * 1/A = 1 (por ejemplo, el
 * inverso de 5 es 1/5) Todos los números reales que no sean 0 tienen un
 * inverso.
 * Enlace: https://es.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/modular-inverses
 *
 * @param numeroInverso sobre el que calcularemos el inverso
 * @return es 1 / numeroInverso
 * @throws IllegalArgumentException si el numero inverso es = a 0
 */

public double calcularInverso(double numeroInverso) {
    if (numeroInverso == 0) {
        throw new IllegalArgumentException("El numero inverso no puede ser cero");
    }
    return 1 / numeroInverso;
}


/**
 * 4. Raíz de un número, tendrá un parámetro de entrada y uno de salida que será la solución.
 *
 * @param numero el número sobre el cual calcularemos la raíz cuadrada
 * @return es el resultado
 * @throws IllegalArgumentException si el número es negativo
 */

public double raizCuadrada(double numero) {
    if (numero < 0) {
        throw new IllegalArgumentException("El numero no puede ser negativo");
       }
    return Math.sqrt(numero);
    }





}