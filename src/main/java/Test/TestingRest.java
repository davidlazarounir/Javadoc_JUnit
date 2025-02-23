package Test;

import Calculadora.Resta;

public class TestingRest {
    public static void main(String[] args) {
        /**
         * Pruebas de resta
         */

        Resta resta= new Resta();
        System.out.println("La resta de dos numeros reales : " + resta.restaReales(8.5, 6.5));
        System.out.println("La resta de dos numeros enteros : " + resta.restaEnteros(10, 7));
        System.out.println("La resta de tres números reales : " + resta.restarReales(8.3,2.2,1.3));
        System.out.println("La resta con un valor acumulado : " + resta.restaAcumulado(7));
    }
}
