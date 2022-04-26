package com.company;

public class Main {
    public static void main (String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setEdad(18);
        cliente.setNombre("Eduardo");
        cliente.setNumero(111222333);
        cliente.setCredito(9000);

        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println("Edad del cliente: " + cliente.getEdad());
        System.out.println("Telefone del cliente: " + cliente.getNumero());
        System.out.println("Credito del cliente: $" + cliente.getCredito() + " pesos");

        trabajador.setEdad(48);
        trabajador.setNombre("Aurelio");
        trabajador.setNumero(989364785);
        trabajador.setSueldo(7800);

        System.out.println("Nombre del trabajador: " + trabajador.getNombre());
        System.out.println("Edad del trabajador: " + trabajador.getEdad());
        System.out.println("Telefono del trabajador: " + trabajador.getNumero());
        System.out.println("Sueldo del trabajador $" + trabajador.getSueldo() + " pesos al mes");
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

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int sueldo;

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}