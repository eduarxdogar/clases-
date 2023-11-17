package com.bodega.bodega.lamda.filtroslamda;

import java.util.function.Predicate;

public interface IFiltroPersona extends Predicate<Persona> {

    //los ... la posibilidad de pasar multiples parametros del mismo tipo
    public static  Predicate<Persona> orMultiple(Predicate<Persona>...predicados){

        Predicate<Persona> combinarPredicados = predicados [0];
        for (Predicate<Persona> predicado : predicados){

            combinarPredicados=combinarPredicados.or(predicado);

        }
        return  combinarPredicados;
    }


}
