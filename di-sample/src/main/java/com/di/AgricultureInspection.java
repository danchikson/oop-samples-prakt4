package com.di;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

// Головний клас для виконання
public class AgricultureInspection {
    private Paycheck paycheck;      // Композиція: Payroll володіє Paycheck

    private PaymentService paymentService;

    @Inject
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AgricultureInspectionModule());
        AgricultureInspection agricultureInspection = injector.getInstance(AgricultureInspection.class);
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

        Paycheck paycheck = new Paycheck(4000000, "2024-09-15");
        paycheck.displayPaycheckInfo();

        agricultureInspection.paymentService.savePaycheck(paycheck);

    }
}

