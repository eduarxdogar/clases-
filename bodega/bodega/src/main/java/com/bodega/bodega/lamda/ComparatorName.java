package com.bodega.bodega.lamda;

import com.bodega.bodega.lamda.filtroslamda.Persona;

import java.util.Comparator;

public class ComparatorName  implements Comparator<Persona>{

    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getName().compareTo(persona2.getName()) ;
    }
}
