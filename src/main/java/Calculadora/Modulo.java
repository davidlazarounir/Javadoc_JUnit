package Calculadora;

import java.util.Scanner;

public class Modulo {


    // Clase 5: Módulo

    //Calculo del modulo (residuo de una dividión entera

    public static int modulo(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("Division by zero");
        }
        return a % b;
    }

    //Calculo del valor absoluto de un número

    public static double absoluto(double a) {
        if (a <= 0) {
            return a;
        }
        return -a;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Que quieres hacer: ");
            System.out.println("Modulo (M)");
            System.out.println("Absoluto (A)");
            System.out.println("Salir (X)");

            opcion = sc.next().charAt(0);
            switch (opcion) {
                case 'M':
                    //leo un par de valores
                    //llamo al método módulo
                    Modulo.modulo( 1, 2);
            }
        } while(sc.nextInt() != 'X');
    }
}
