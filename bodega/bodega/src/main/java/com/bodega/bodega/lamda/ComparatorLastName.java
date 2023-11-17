package com.bodega.bodega.lamda;

import com.bodega.bodega.lamda.filtroslamda.Persona;

import java.util.Comparator;

public class ComparatorLastName implements Comparator<Persona> {
    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getApellido().compareTo(persona2.getApellido());
    }
}
