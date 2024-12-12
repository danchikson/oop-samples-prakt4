package com.di;

// Клас Оператор дронів
class Operator extends Participant {
    public Operator(String name) {
        super(name);
    }

    public void receiveRequest() {
        System.out.println(getName() + ": Приймає запит на інспекцію.");
    }

    public void buildRoute(Drone drone) {
        System.out.println(getName() + ": Будує маршрут для дрона.");
        drone.performInspection();
    }

    @Override
    public void displayInfo() {
        System.out.println("Оператор: " + getName());
    }
}