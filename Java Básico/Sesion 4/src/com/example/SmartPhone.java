package com.example;

public class SmartPhone extends SmartDevice {
    int camaras;
    String sistema;

    public SmartPhone() {

    }

    public SmartPhone(String marca, String color, String modelo, int camaras, String sistema) {
        super(marca, color, modelo);
        this.camaras = camaras;
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "[" + "\n\t" +
                "Marca = " + this.marca + ", \n\t" +
                "Color = " + this.color + ", \n\t" +
                "Modelo = " + this.modelo + ", \n\t" +
                "Camaras = " + this.camaras + ", \n\t" +
                "Sistema=" + this.sistema + "\n" +
                "]";
    }
}
