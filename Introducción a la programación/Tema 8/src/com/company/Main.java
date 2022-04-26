package com.company;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Eduardo");
        persona.setEdad(17);
        persona.setNumero(1234567890);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Numero: " + persona.getNumero());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int numero;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }   
}