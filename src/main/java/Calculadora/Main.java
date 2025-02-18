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
        System.out.println("La resta de dos numeros reales : " );
    }
}