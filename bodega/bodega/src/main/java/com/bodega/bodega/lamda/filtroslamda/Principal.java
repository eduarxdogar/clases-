package com.bodega.bodega.lamda.filtroslamda;

import com.bodega.bodega.lamda.filtroslamda.FiltroPersonaApellidoImpl;
import com.bodega.bodega.lamda.filtroslamda.FiltroPersonaNombreImpl;
import com.bodega.bodega.lamda.filtroslamda.IFiltroPersona;
import com.bodega.bodega.lamda.filtroslamda.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal {
    
    public static void main(String[] args) {



        ArrayList<Persona> listPersona = new ArrayList<Persona>();

        listPersona.add(new Persona("cristian","garzon",20));
        listPersona.add(new Persona("nicolas","martinez",30));
        listPersona.add(new Persona("jaime","ortiz",40));
        listPersona.add(new Persona("daniel","quevedo",21));
        listPersona.add(new Persona("antonio","perez",70));

        //listPersona.sort(new ComparatorName());
        // listPersona.sort(new ComparatorLastName());


        // esta es nuestra primera expresion lamdba sencialla o compata
        // ya no se necesita crear una clase comparadorName

      //  listPersona.sort((p1, p2)-> p1.getApellido().compareTo(p2.getApellido()));
      //  listPersona.sort(( p1,  p2)  -> p1.getName().compareTo(p2.getName()));



         // List<Persona> nueva=buscarPersonaConFiltro(new FiltroPersonaImpl("daniel"),listPersona);
         // List<Persona> nueva=buscarPersonaConFiltro(new FiltroPersonaApellidoImpl("ortiz"),listPersona);
       //  List<Persona> nueva=buscarPersonaConFiltro((p)->p.getApellido().equals("ortiz"),listPersona);
       // List<Persona> nueva=buscarPersonaConFiltro((p)->p.getName().equals("cristian"),listPersona);

         Predicate<Persona> filtroCristian = new FiltroPersonaNombreImpl("cristian");
         Predicate<Persona> filtroApellido = new FiltroPersonaApellidoImpl("ortiz");
         Predicate<Persona> filtroJubilado= Persona::estaJubilado;



        List<Persona> nueva= buscarPersonaConFiltro(IFiltroPersona.orMultiple(filtroCristian,filtroJubilado,filtroApellido),listPersona);// un metodo de referencia que es como una expresion lamda pero en una clase

        for (Persona p: nueva){
            System.out.printf("persona : %s  %s %s %n " ,p.getName(),p.getApellido(),p.getEdad());
        }

    }

    // necesito una funcion de filtrado
    public static List<Persona> buscarPersonaConFiltro(Predicate<Persona> filtro , List<Persona> milista){

        List<Persona> listaFiltro = new ArrayList<Persona>();
        for (Persona p: milista){
            if (filtro.test(p)){
                listaFiltro.add(p);
            }

        }
       return listaFiltro;
    }
}


