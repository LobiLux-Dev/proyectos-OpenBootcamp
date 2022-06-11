package com.example;

public class SmartWatch extends SmartDevice {
    String correa;

    public SmartWatch() {

    }

    public SmartWatch(String marca, String color, String modelo, String correa) {
        super(marca, color, modelo);
        this.correa = correa;
    }

    @Override
    public String toString() {
        return "[" + "\n\t" +
                "Marca = " + this.marca + ", \n\t" +
                "Color = " + this.color + ", \n\t" +
                "Modelo = " + this.modelo + ", \n\t" +
                "Correa = " + this.correa + "\n" +
                "]";
    }

}
