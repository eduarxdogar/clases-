package com.bodega.bodega.lamda.filtroslamda;

public class FiltroPersonaNombreImpl implements IFiltroPersona {

    private  String name;

    public FiltroPersonaNombreImpl(String name) {
        this.name = name;
    }

    //funcion de test que recibe una persona y devuelve verdadero o falso
    @Override
    public boolean test(Persona persona) {
        if (persona.getName().equals(name)){
            return true;
        }else {
            return false;
        }
    }
}
