package com.example.demo2;

public class Tablet extends Device{
    protected int screenSize;
    protected int resolution;
    protected double butteryLife;
    protected boolean hasStylus;
    public Tablet(){}

    public Tablet(Devicetype type, String name, double price, double weight) {
        super(type, name, price, weight);
    }

    public Tablet(Devicetype type, String name, double price, double weight, int screenSize, int resolution,double butteryLife,boolean hasStylus) {
        super(type, name, price, weight);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.butteryLife=butteryLife;
        this.hasStylus=hasStylus;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public double getButteryLife() {
        return butteryLife;
    }

    public void setButteryLife(double butteryLife) {
        this.butteryLife = butteryLife;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", screenSize=" + screenSize +
                ", resolution=" + resolution +
                ",batteryLife="+ butteryLife+
                ",hasStylus="+ hasStylus+
                '}';

    }
}
