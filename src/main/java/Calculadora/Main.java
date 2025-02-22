package Calculadora;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de la clase Suma
        Suma suma = new Suma();

        // Pruebas de suma normales
        System.out.println("Suma de dos reales: " + suma.sumaReales(5.5, 2.3));
        System.out.println("Suma de dos enteros: " + suma.sumaEnteros(5, 3));
        System.out.println("Suma de tres reales: " + suma.sumaTresReales(1.1, 2.2, 3.3));

        /*
        // Pruebas de suma acumulada
        System.out.println("Valor acumulado inicial: " + suma.getAcumulado());
        System.out.println("Sumando 10 al acumulado: " + suma.sumarAcumulado(10));
        System.out.println("Sumando 5 al acumulado: " + suma.sumarAcumulado(5));
        System.out.println("Valor acumulado actual: " + suma.getAcumulado());
        suma.reiniciarAcumulado();
        System.out.println("Valor acumulado después de reiniciar: " + suma.getAcumulado());

         */

        //Pruebas de Resta
        Resta resta= new Resta();
        System.out.println("La resta de dos numeros reales : " + resta.restaReales(8.5, 6.5));
        System.out.println("La resta de dos numeros enteros : " + resta.restaEnteros(10, 7));
        System.out.println("La resta de tres números reales : " + resta.restarReales(8.3,2.2,1.3));
        System.out.println("La resta con un valor acumulado : " + resta.restaAcumulado(7));


    }
}