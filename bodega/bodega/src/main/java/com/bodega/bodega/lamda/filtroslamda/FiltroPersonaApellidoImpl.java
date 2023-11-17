package com.bodega.bodega.lamda.filtroslamda;

public class FiltroPersonaApellidoImpl implements IFiltroPersona {
    private  String lastname;

    public FiltroPersonaApellidoImpl(String lastname) {
        this.lastname = lastname;
    }
   // funcion de test que recibe una persona y devuelve verdadero o falso
    @Override
    public boolean test(Persona persona) {
        if (persona.getApellido().equals(lastname)){
            return true;
        }else {
            return false;
        }
    }
}
