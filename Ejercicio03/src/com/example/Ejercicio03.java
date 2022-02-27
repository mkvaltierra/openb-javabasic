package com.example;
public class Ejercicio03 {

    public static void main(String[] args) {

        String[] names = {"Arantxa", "Aritz", "Adela"};

        concatStrings(names);
    }

    /***
     * Función para concatenar los nombres de un array string
     * @param names - array string
     */
    public static void concatStrings(String[] names){
        for (String name:names) {
            System.out.print(name + " ");
        }
    }
}

