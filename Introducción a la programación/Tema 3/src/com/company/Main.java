package com.company;

public class Main {
    public static void main(String[] args) {
        int resultado = suma(3, 15, 19);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    int puertas = 4;

    void aumentarPuertas() {
        this.puertas++;
    }
}