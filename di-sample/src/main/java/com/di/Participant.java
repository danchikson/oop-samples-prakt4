package com.di;

// Абстрактний клас для учасників
abstract class Participant {
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayInfo();
}
