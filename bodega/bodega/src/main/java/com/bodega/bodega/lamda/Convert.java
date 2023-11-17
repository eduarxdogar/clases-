package com.bodega.bodega.lamda;

import java.util.function.Predicate;



public class Convert {
    public static void main(String[] args) {


        String dccFieldsCZP = convertDecimals("2500","2");// si en DccExponet llega 1 o 2 es la pocision donde se asigna el punto ej: si es 1 = 250.0 si es 2 = 25.00

        System.out.println("CHile : "+ dccFieldsCZP);
    }
    private static String convertDecimals(String DccAmount, String DccExponet) {
        Predicate<String> isInteger = str -> str.matches("\\d+");
        int numDecimalsPlaces = Integer.parseInt(DccExponet);
        if (!isInteger.test(DccAmount) || !isInteger.test(DccExponet)) {
            throw new IllegalArgumentException("Both arguments should be intergers. ");
        }
        StringBuilder result = new StringBuilder(DccAmount);
        if (numDecimalsPlaces != 0) {
            result.insert(result.length() - numDecimalsPlaces, ".");
        }
        return result.toString();
    }
}

