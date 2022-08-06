package com.example.models;

public class Bootcamper {
    private String name;
    private int id;

    // Builder
    public Bootcamper() {}
    public Bootcamper(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
