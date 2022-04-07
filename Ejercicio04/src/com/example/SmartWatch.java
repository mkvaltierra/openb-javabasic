package com.example;

public class SmartWatch extends SmartDevice {

    private boolean isWaterResistant;

    public SmartWatch() {}

    public SmartWatch(String model, String trademark, int memoryRam, int battery, int storageCapacity, String screen,
                      boolean isWaterResistant) {

        super(model, trademark, memoryRam, battery, storageCapacity, screen);
        this.isWaterResistant = isWaterResistant;
    }


    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean isWaterResistant) {
        this.isWaterResistant = isWaterResistant;
    }



    @Override
    public String toString() {
        return "SmartWatch{" +
                "model='" + model + '\'' +
                ", trademark='" + trademark + '\'' +
                ", battery=" + battery +
                ", memoryRam=" + memoryRam +
                ", storageCapacity=" + storageCapacity +
                ", screen='" + screen + '\'' +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}