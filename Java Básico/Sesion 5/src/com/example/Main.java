package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        CocheCRUD coche = new CocheCRUDImpl();

        coche.save();
        coche.findAll();
        coche.delete();
    }
}
