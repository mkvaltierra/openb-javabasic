package com.example;

public class SmartPhone extends SmartDevice{

    private String camera;
    private boolean isFastCharged;

    public SmartPhone(){}


    public SmartPhone(String model, String trademark, int memoryRam, int battery, int storageCapacity,
                      String screen, String camera, boolean isFastCharged) {
        super(model, trademark, memoryRam, battery, storageCapacity, screen);
        this.camera = camera;
        this.isFastCharged = isFastCharged;
    }

    public SmartPhone(String camera, boolean isFastCharged) {
        this.camera = camera;
        this.isFastCharged = isFastCharged;
    }


    public String getCamera() {
        return camera;
    }


    public void setCamera(String camera) {
        this.camera = camera;
    }


    public boolean isFastCharged() {
        return isFastCharged;
    }


    public void setFastCharged(boolean isFastCharged) {
        this.isFastCharged = isFastCharged;
    }



    @Override
    public String toString() {
        return "SmartPhone{" +
                "model='" + model + '\'' +
                ", trademark='" + trademark + '\'' +
                ", battery=" + battery +
                ", memoryRam=" + memoryRam +
                ", storageCapacity=" + storageCapacity +
                ", screen='" + screen + '\'' +
                ", camera='" + camera + '\'' +
                ", isFastCharged=" + isFastCharged +
                '}';
    }
}
