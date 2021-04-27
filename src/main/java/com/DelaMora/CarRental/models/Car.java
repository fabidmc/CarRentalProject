package com.DelaMora.CarRental.models;

import org.springframework.boot.SpringApplication;

import java.util.Objects;


public class Car {


    private int Car_ID;
    private String Brand;
    private String Model;
    private String Car_Type;
    private double priceForOneDay;
    private boolean availability;


    public Car(int Car_ID, String Brand, String Model, String Car_Type,  Double priceForOneDay , boolean availability) {
        this.Car_ID = Car_ID;
        this.Brand = Brand;
        this.Model = Model;
        this.Car_Type = Car_Type;
        this.priceForOneDay = priceForOneDay;
        this.availability = availability;
    }

    public int getCar_ID() {
        return Car_ID;
    }

    public void setCar_ID(int car_ID) {
        Car_ID = car_ID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getCar_Type() {
        return Car_Type;
    }

    public void setCar_Type(String car_Type) {
        Car_Type = car_Type;
    }

    public double getPriceForOneDay() {
        return priceForOneDay;
    }

    public void setPriceForOneDay(double priceForOneDay) {
        this.priceForOneDay = priceForOneDay;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


}
