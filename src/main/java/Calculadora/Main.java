package Calculadora;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de la clase Suma
        Suma suma = new Suma();

        // Pruebas de suma normales
        System.out.println("Suma de dos reales: " + suma.sumaReales(-5.7, 2.4));
        System.out.println("Suma de dos enteros: " + suma.sumaEnteros(0, 365));
        System.out.println("Suma de tres reales: " + suma.sumaTresReales(1.45, 27.244, 35.32));

        /**
        // Pruebas de suma acumulada
        System.out.println("Valor acumulado inicial: " + suma.getAcumulado());
        System.out.println("Sumando 10 al acumulado: " + suma.sumarAcumulado(10));
        System.out.println("Sumando 5 al acumulado: " + suma.sumarAcumulado(5));
        System.out.println("Valor acumulado actual: " + suma.getAcumulado());
        suma.reiniciarAcumulado();
        System.out.println("Valor acumulado después de reiniciar: " + suma.getAcumulado());

         */

        //Pruebas para la Multiplicación.
        Producto producto = new Producto();

        // Probar el producto de dos números reales
        System.out.println("Producto de dos reales " + producto.prodcutoreales(3.7, 2.4));
        //En caso de número negativo, la operación será errónea.
        //En caso de número 0, el resultado será 0.

        // Probar el producto de dos números enteros
        System.out.println("Producto de dos enteros " + producto.productoenteros(5, 2));
        //En caso de número negativo, la operación será errónea.
        //En caso de número 0, el resultado será 0.

        // Probar el producto de tres números reales
        System.out.println("Producto de tres reales " + producto.productotresreales
                (1.45, 27.244, 35.32));
        //En caso de número negativo, la operación será errónea.
        //En caso de número 0, el resultado será 0.

        // Probar la potencia de un número
        System.out.println("Potencia de base por exponente" + producto.productopotencia(8, 4));


        //Pruebas de Resta

        Resta resta= new Resta();
        System.out.println("La resta de dos numeros reales : " + resta.restaReales(8.5, 6.5));
        System.out.println("La resta de dos numeros enteros : " + resta.restaEnteros(10, 7));
        System.out.println("La resta de tres números reales : " + resta.restarReales(8.3,2.2,1.3));
        System.out.println("La resta con un valor acumulado : " + resta.restaAcumulado(7));

 
    }


    }