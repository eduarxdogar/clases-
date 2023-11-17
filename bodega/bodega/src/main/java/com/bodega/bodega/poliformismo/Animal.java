package com.bodega.bodega.poliformismo;

public class Animal {
    // Clase base (superclase)

        void hacerSonido() {
            System.out.println("Haciendo un sonido genérico");

    }

    // Clase derivada (subclase)
    class Perro extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("Haciendo ladrido");
        }
    }

    // Otra clase derivada (subclase)
    class Gato extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("Haciendo maullido");
        }
    }

    public class Main {
     //   public static void main(String[] args) {
            Animal miMascota;

            // Crear una instancia de Perro
   //         miMascota = new Perro();
     //       miMascota.hacerSonido(); // Llama al método hacerSonido() de Perro

            // Cambiar la instancia a Gato
       //     miMascota = new Gato();
         //   miMascota.hacerSonido(); // Llama al método hacerSonido() de Gato
        }
    }


