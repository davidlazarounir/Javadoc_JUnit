package Calculadora;

public class Resta {

    private double acumulado;
    public Resta(){
        acumulado=0.0;
    }

    // Primer metodo: Resta de dos números reales,
    // tendrá 2 parámetros de entrada y uno de salida que será la solución.

    public double restaReales(double a,double b) {
        return a  - b;
    }

    // Segundo metodo:Resta de dos números enteros,
    // tendrá 2 parámetros de entrada y uno de salida que será la solución.

    public int restaEnteros(int a,int b){
        return a - b;
    }

    //Tercer metodo:Resta de tres números reales, tendrá 3 parámetros de entrada
    // y uno de salida que será la solución.

    public double restarReales(double a,double b,double c){
        return a - b - c;
    }

    //Cuarto metodo: Resta con valor acumulado, tendrá un parámetro de entrada
    // y la clase deberá de guardar el valor acumulado.

    public double restaAcumulado(double valor){
        acumulado -= valor;
        return acumulado;
    }

    public double getAcumulado(){
        return acumulado;
    }


    }







