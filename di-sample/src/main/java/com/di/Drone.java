package com.di;

// Клас Дрон
class Drone {
    public void performInspection() {
        System.out.println("Дрон: Виконує інспекцію поля.");
    }

    public void sendData(Operator operator) {
        System.out.println("Дрон: Дані інспекції отримано.");
    }
}
