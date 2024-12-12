package com.di;


// Клас Агроном
class Agronomist extends Participant {
    public Agronomist(String name) {
        super(name);
    }


    public void analyzeData() {
        System.out.println(getName() + ": Аналізує дані.");
    }

    public void sendAnalysis(Farmer farmer) {
        System.out.println(getName() + ": Відправляє аналітику фермеру.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Агроном: " + getName());
    }
}