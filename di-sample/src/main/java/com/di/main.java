package com.di;

import java.util.ArrayList;
import java.util.List;

// Головний клас для виконання
public class AgricultureInspection {
    public static void main(String[] args) {
        Farmer farmer = new Farmer("Іван");
        Operator operator = new Operator("Олексій");
        Drone drone = new Drone();
        Agronomist agronomist = new Agronomist("Марія");

        // Процес інспекції
        farmer.publishRequest();
        operator.receiveRequest();
        operator.buildRoute(drone);
        drone.sendData(operator);
        agronomist.analyzeData();
        agronomist.sendAnalysis(farmer);
        farmer.displayInfo();
        System.out.println("Інспекція завершена, дані отримано.");
    }
}
