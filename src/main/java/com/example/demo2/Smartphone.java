package com.example.demo2;

public class Smartphone extends Device{
    protected double screenSize;
    protected double cameraResolution;

    public Smartphone(){}

    public Smartphone(Devicetype type, String name, double price, double weight) {
        super(type, name, price, weight);
    }

    public Smartphone(Devicetype type, String name, double price, double weight, double screenSize, double cameraResolution) {
        super(type, name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getResolution() {
        return cameraResolution;
    }

    public void setResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", screenSize=" + screenSize +
                ", cameraResolution=" + cameraResolution +
                '}';
    }
}
