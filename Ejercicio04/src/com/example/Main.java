package com.example;

public class Main {

    public static void main(String[] args) {

        SmartDevice smartdevice =  new SmartDevice();

        SmartDevice smartdevice01 = new SmartDevice("Galaxy S22", "Samsung", 8, 3700, 256, "6.1 Super AMOLED");

        System.out.println("*** Datos Movil ***");
        System.out.println("Marca:" + smartdevice01.getTrademark());
        System.out.println("Modelo: " + smartdevice01.getModel());
        System.out.println("Memoria RAM:" + smartdevice01.getMemoryRam() + " GB");
        System.out.println("Bateria: " + smartdevice01.getBattery());
        System.out.println("Almacenamiento: " + smartdevice01.getStorageCapacity() + " GB");
        System.out.println("Pantalla: " +  smartdevice01.getScreen() + "\n");


        SmartWatch smartwatch = new SmartWatch();

        smartwatch.setTrademark("Amazfit");
        smartwatch.setModel("GTS");
        smartwatch.setMemoryRam(512);
        smartwatch.setBattery(250);
        smartwatch.setStorageCapacity(3);
        smartwatch.setScreen("AMOLED 1.5");
        smartwatch.setWaterResistant(true);

        System.out.println("*** Datos SmartWatch ***");
        System.out.println("Marca: " + smartwatch.getTrademark());
        System.out.println("Modelo: " + smartwatch.getModel());
        System.out.println("Memoria RAM: " + smartwatch.getMemoryRam() + " GB");
        System.out.println("Bateria: " + smartwatch.getBattery());
        System.out.println("Almacenamiento: " + smartwatch.getStorageCapacity() + " GB");
        System.out.println("Pantalla: " + smartwatch.getScreen());
        System.out.println("Sumergibilidad: " + smartwatch.isWaterResistant());

        // Polimorfismo
        smartdevice = new SmartPhone();
        smartdevice = new SmartWatch();

        smartdevice.switchOn();

    }
}
