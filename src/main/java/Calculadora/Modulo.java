package Calculadora;

import java.util.Scanner;

public class Modulo {
    public static Scanner teclado = new Scanner(System.in);

    public static void mostrarMenu() {
        int menuCalculadora;
        do {
            System.out.println("MENÚ CALCULADORA:");
            System.out.println("Seleccione la función que desee ejecutar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir del menú");
            menuCalculadora = teclado.nextInt();

            switch (menuCalculadora) {

                // Ejecutar Suma haciendo click en 1
                case 1:
                    ejecutarSuma();
                    break;

                // Ejecutar Resta haciendo click en 2
                case 2:
                    ejecutarResta();
                    break;
                // Ejecutar Multiplicación (Producto) haciendo click en 3
                case 3:
                    ejecutarProducto();
                    break;

                // Ejecutar División (Cociente) haciendo click en 4
                case 4:
                    ejecutarCociente();
                    break;

                // Salir del menú
                case 5:
                    System.out.println("Salir del programa");
                    break;

                default:
                    System.out.println("Opción incorrecta, escoja una opción del menú");
                    break;
            }
        }
        while (menuCalculadora != 5);
        teclado.close();
    }



    /**
     *  Operación de suma entre dos números reales:
     *  1) Escribir los números.
     *  2) Mostrar el resultado
     */

    public static void ejecutarSuma() {
        Suma suma = new Suma();
        System.out.println("Ingrese el valor del primer numero: ");
        double a = teclado.nextDouble();
        System.out.println("Ingrese el valor del segundo numero: ");
        double b = teclado.nextDouble();
        System.out.println("Resultado: " + suma.sumaReales(a, b));
    }


    /**
     *  Operación de resta entre dos números reales:
     *  1) Escribir los números.
     *  2) Mostrar el resultado
     */

    public static void ejecutarResta() {
        Resta resta = new Resta();
        System.out.println("Ingrese el valor del primer numero: ");
        double a = teclado.nextDouble();
        System.out.println("Ingrese el valor del segundo numero: ");
        double b = teclado.nextDouble();
        System.out.println("Resultado: " + resta.restaReales(a, b));
    }

    /**
     *  Operación de multiplicación (producto) entre dos números reales:
     *  1) Escribir los números.
     *  2) Mostrar el resultado
     */

    public static void ejecutarProducto() {
        Producto producto = new Producto();
        System.out.println("Ingrese el valor del primer numero: ");
        double a = teclado.nextDouble();
        System.out.println("Ingrese el valor del segundo numero: ");
        double b = teclado.nextDouble();
        System.out.println("Resultado " + producto.prodcutoreales(a, b));
    }

    /**
     *  Operación de división (cociente) entre dos números reales:
     *  1) Escribir los números.
     *  2) Mostrar el resultado
     */

    public static void ejecutarCociente() {
        Cociente cociente = new Cociente();
        System.out.println("Ingrese el valor del primer numero: ");
        double a = teclado.nextDouble();
        System.out.println("Ingrese el valor del segundo numero: ");
        double b = teclado.nextDouble();
        System.out.println("Resultado: " + cociente.divisionReales(a, b));
    }


    // --------------------------------------------------

    int menu;

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
