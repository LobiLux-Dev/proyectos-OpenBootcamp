package com.company;

public class Main {
    public static void main(String[] args) {
        // If - Else if - Else
        int numeroIf = 5;

        if (numeroIf > 0) System.out.println("La variable numeroIf es Positiva, valor: " + numeroIf);
        else if (numeroIf < 0) System.out.println("La variable numeroIf es Negativa, valor: " + numeroIf);
        else System.out.println("La variable numeroIf es 0");

        // While - Do While - For
        int numeroWhile = 2;

        while  (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Valor de la variable numeroWhile " + numeroWhile);
        }

        do {
            numeroWhile++;
            System.out.println("Valor de la variable numeroWhile " + numeroWhile);
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Valor de la variable numeroFor " + numeroFor);
        }

        // Switch
        String estacion = "Primavera";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No existe esa estación");
        }
    }
}