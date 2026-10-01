package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LecturaArchivo lecturaArchivo = new LecturaArchivo("src/main/resources/hola.txt");

        System.out.println("Nombre: " + lecturaArchivo.getNombre());
        System.out.println("Tamaño: " + lecturaArchivo.getTamanio() + " KB");
        System.out.println("Número de líneas: " + lecturaArchivo.getNumLineas());
        System.out.println("Resumen: " + lecturaArchivo);
    }
}
