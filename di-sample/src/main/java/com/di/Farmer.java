package com.di;

// Клас Фермер
class Farmer extends Participant implements InspectionRequest {
    public Farmer(String name) {
        super(name);
    }

    @Override
    public void publishRequest() {
        System.out.println(getName() + ": Публікує запит на інспекцію.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Фермер: " + getName());
    }
}
