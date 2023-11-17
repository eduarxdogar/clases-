package com.bodega.bodega.herencia;

public class vehiculo {
    public static void main(String[] args) {
        // Clase base (superclase)

            String marca;
            String modelo;

           // void arrancar() {
                System.out.println("El vehículo ha arrancado.");
            }

            void detener() {
                System.out.println("El vehículo se ha detenido.");
            }
        }

// Clase derivada (subclase)
        class Coche extends vehiculo {
            int numeroPuertas;

            void abrirPuertas() {
                System.out.println();

            }
        }
