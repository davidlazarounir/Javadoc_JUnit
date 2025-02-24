package Calculadora;

public class Resta {

    private double acumulado;
    public Resta(){
        acumulado=0.0;
    }

   /**
     * @param  a primer numero real
     * @param  b segundo numero real
    * @return a menos b como resultado
    * @throws -a o -b se podría lanzar un valor negativo
      */


    public double restaReales(double a,double b) {
        return a  - b;
    }

    /***
     * @param a primer numero entero
     * @param b segundo numero entero
     * @return resultado de de a - b
     * @throws -a o -b pueden  tener  valor negativo
     * */

    public int restaEnteros(int a,int b){
        return a - b;
    }

    /**
     * @param a Primer numero real
     * @param b Segundo numero real
     * @param c Tercer numero real
     * @retun el resultato de 3 reales nos devolvera un valor
     * .*/

    public double restarReales(double a,double b,double c){
        return a - b - c;
    }

    /**
     * @param valor
     * @return se guardara el valor acumulado
     **/

    public double restaAcumulado(double valor){
        acumulado -= valor;
        return acumulado;
    }




    }







