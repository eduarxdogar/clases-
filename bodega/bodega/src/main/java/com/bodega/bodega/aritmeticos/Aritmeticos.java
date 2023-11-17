package com.bodega.bodega.aritmeticos;

public class Aritmeticos {

    public static void main(String[] args) {

        int variableX =50 , variableY =10;
        int resultado;

        int result = 0;



        //suma
        resultado = variableX + variableY;
        System.out.println("Suma es :" + resultado);

        // resta
        resultado = variableX - variableY;
        System.out.println("resta es :" + resultado);

        //multiplicacion
        resultado = variableX * variableY;
        System.out.println("multiplicacion es :" +resultado);

        //division
        resultado = variableX / variableY;
        System.out.println("division es : " + resultado);

        // increment
        variableX++;
        System.out.println("mas 1 : "+ variableX);

        // decrement
        variableX--;
        System.out.println("menos 1 :" + variableX);

        variableX++;
        System.out.println("mas 1 : "+ variableX);


        //blucles aritmeticos
        result =0;
        System.out.println("aumentar en 2 : "+ result);
        while (result <= 20) {                     // solo permite colocar una conidición white es mientras
            System.out.print(result+",");            // "print" solo imprime de forma horinzotal, println hace el salto de línea
            result +=2;

            // impresión por pantalla : 2,4,6,8
        }



    }
}
