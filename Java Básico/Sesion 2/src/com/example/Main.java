package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el precio a calcular: $");
        double price = input.nextDouble();
        
        double priceIVA = getPriceIVA(price);
        System.out.println("El precio final (con IVA) es: $" + priceIVA);

        input.close();
    }

    static double getPriceIVA(double price) {
        return price + (price * 0.16);
    }
}
