package com.example;

public class SmartDevice {

    protected String model;
    protected String trademark;
    protected int battery;
    protected int memoryRam;
    protected int storageCapacity;
    protected String screen;


    public SmartDevice(){}

    public SmartDevice(String model, String trademark, int memoryRam, int battery, int storageCapacity, String screen){
        this.model = model;
        this.trademark = trademark;
        this.memoryRam = memoryRam;
        this.battery = battery;
        this.storageCapacity = storageCapacity;
        this.screen = screen;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setTrademark(String trademark){
        this.trademark = trademark;
    }

    public String getTrademark(){
        return trademark;
    }

    public void setBattery(int battery){
        this.battery = battery;
    }

    public int getBattery(){
        return battery;
    }

    public void setMemoryRam(int memoryRam){
        this.memoryRam = memoryRam;
    }

    public int getMemoryRam(){
        return memoryRam;
    }

    public void setStorageCapacity(int storageCapacity){
        this.storageCapacity = storageCapacity;
    }

    public int getStorageCapacity(){
        return storageCapacity;
    }

    public void setScreen(String screen){
        this.screen = screen;
    }

    public String getScreen() {
        return screen;
    }

    public void switchOn() {
        System.out.println("está encendido.");
    }

    public void switchOff() {
        System.out.println("está apagado.");
    }


    @Override
    public String toString() {
        return "SmartDevice{" +
                "model='" + model + '\'' +
                ", trademark='" + trademark + '\'' +
                ", battery=" + battery +
                ", memoryRam=" + memoryRam +
                ", storageCapacity=" + storageCapacity +
                '}';
    }

}
