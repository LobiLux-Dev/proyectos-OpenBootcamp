package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        // Declarando los datos
        // 1 numeros
        // 1.1 enteros
        byte wholeByte = 127;
        short wholeShort = 32767;
        int wholeInt = 2147483647;
        long wholeLong = 9223372036854775807l;

        // 1.2 flotantes
        float floatingFloat = 2147483647.12345f;
        double floatingDouble = 9223372036854775807.123456789d;

        // 2 booleanos
        boolean booleanTrue = true;
        boolean booleanFalse = false;

        // 3 caracteres
        char character = '@';

        // 4 cadenas de texto
        String stringText = "Hola Mundo!";

        // Mostrando los datos
        // 1 numeros
        // 1.1 enteros
        System.out.println("Numero entero (byte): " + wholeByte);
        System.out.println("Numero entero (short): " + wholeShort);
        System.out.println("Numero entero (int): " + wholeInt);
        System.out.println("Numero entero (long): " + wholeLong);

        // 1.2 flotantes
        System.out.println("Numero flotante (float): " + floatingFloat);
        System.out.println("Numero flotante (double): " + floatingDouble);

        // 2 booleanos
        System.out.println("Booleano (true): " + booleanTrue);
        System.out.println("Booleano (false): " + booleanFalse);

        // 3 caracteres
        System.out.println("Caracter (char): " + character);

        // 4 cadenas de texto
        System.out.println("Cadena de texto (String): " + stringText);

    }
}
