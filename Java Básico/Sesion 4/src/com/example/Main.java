package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        SmartDevice smartPhone = new SmartPhone("Realme", "Gris", "C11 2021", 1, "Android");
        SmartDevice smartWatch = new SmartWatch("Apple", "Gris", "Apple Watch 3", "Negra")  ;

        System.out.println("Smart Phone: " + smartPhone.toString());
        System.out.println("Smart Watch: " + smartWatch.toString());
    }
}
