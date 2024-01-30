package entities;

import enums.Battery;

import java.util.Date;

public class Electronics extends Product {
    private int resolution;
    private Battery battery;
    private Date garanty;

    public Electronics(String name, float price) {
        super(name, price);
    }

    public Electronics(String name, float price, int resolution, Battery battery) {
        super(name, price);
        this.resolution = resolution;
        this.battery = battery;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Date getGaranty() {
        return garanty;
    }

    public void setGaranty(Date garanty) {
        this.garanty = garanty;
    }
}
