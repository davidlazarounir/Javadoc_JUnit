package Calculadora;

public class Resta {

    // Primer metodo: Resta de dos números reales,
    // tendrá 2 parámetros de entrada y uno de salida que será la solución.

    public double restaReales(double numb1,double numb2) {
        return numb1  - numb2;
    }
    // Segundo metodo:Resta de dos números enteros,
    // tendrá 2 parámetros de entrada y uno de salida que será la solución.

    public int restaEnteros(int numb1,int numb2){
        return numb1 - numb2;
    }

    //Tercer metodo:Resta de tres números reales, tendrá 3 parámetros de entrada
    // y uno de salida que será la solución.

    public double restarReales(double numb1,double numb2,double numb3){
        return numb1 - numb2 - numb3;
    }

    //Cuarto metodo: Resta con valor acumulado, tendrá un parámetro de entrada
    // y la clase deberá de guardar el valor acumulado.

    public double restaAcumulada(double numb){
        valorAcumulado -= numb;
        return valorAcumulado;
    }

    public double getValorAcumulado(){
        return valorAcumulado;
    }



}


