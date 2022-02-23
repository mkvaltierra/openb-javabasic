package com.example;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args){

        double result;
        double price;
        int vat;
        Scanner src = new Scanner(System.in);

        // Solicitud de datos al usuario
        System.out.println("Introducir precio: ");
        price = src.nextDouble();
        System.out.println("Introducir tipo IVA\n" +
                "1. 21%\n" +
                "2. 10%\n" +
                "3. 4%");
        vat = src.nextInt();
        src.close();

        // Muestra el resultado
        result = precioConIva(price, vat);
        System.out.println("Precio con Iva: " + result);

    }

    /***
     * Función para el cálculo un precio con IVA
     * @param price precio para el calculo del iva
     * @param vat porcentaje de iva aplicar al precio
     * @return devuelve el precio con iva
     */
    static double precioConIva(double price, double vat){
        vat = vat / 100;
        double priceVat = Math.round(price * (1 + vat));
        return priceVat;
    }
}
