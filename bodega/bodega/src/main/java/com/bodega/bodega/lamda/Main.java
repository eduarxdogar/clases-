package com.bodega.bodega.lamda;

import com.bodega.bodega.lamda.filtroslamda.Persona;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> listPersona = new ArrayList<Persona>();

        listPersona.add(new Persona("cristian","garzon",20));
        listPersona.add(new Persona("nicolas","martinez",30));
        listPersona.add(new Persona("jaime","ortiz",40));
        listPersona.add(new Persona("daniel","quevedo",21));

        //listPersona.sort(new ComparatorName());
       // listPersona.sort(new ComparatorLastName());
        listPersona.sort((Persona p1, Persona p2)  -> {
                if (p1.getEdad() == p2.getEdad()){
                    return 0;
                } else if (p1.getEdad()>p2.getEdad()) {
                    return 1;
                }else {
                    return -1;
                }
        });
        for (Persona p: listPersona){
            System.out.printf("persona : %s  %s %s %n " ,p.getName(),p.getApellido(),p.getEdad());
        }

    }
}
