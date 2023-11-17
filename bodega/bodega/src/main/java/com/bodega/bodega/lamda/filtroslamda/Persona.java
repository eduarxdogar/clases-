package com.bodega.bodega.lamda.filtroslamda;

public class Persona {

    private  String name;

    private  String apellido;

    private int edad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String name, String apellido, int edad) {
        super();
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }

    //metodo de instancia
      public static boolean estaJubilado(Persona persona){
        return  persona.getEdad()>65;
      }


}
