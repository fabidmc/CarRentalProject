package com.DelaMora.CarRental.models;


public class Car {


    private int Car_ID;
    private String Brand;
    private String Model;
    private int idCategory;
    private double priceForOneDay;
    private boolean availability;

    public Car(int car_ID, String Brand, String Model, int idCategory, double priceForOneDay, boolean availability) {
        this.Car_ID = car_ID;
        this.Brand = Brand;
        this.Model = Model;
        this.idCategory = idCategory;
        this.priceForOneDay = priceForOneDay;
        this.availability = availability;
    }

    public int getCar_ID() {
        return Car_ID;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public double getPriceForOneDay() {
        return priceForOneDay;
    }

    public boolean isAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Car_ID=" + Car_ID +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", idCategory=" + idCategory +
                ", priceForOneDay=" + priceForOneDay +
                ", availability=" + availability +
                '}';
    }
}