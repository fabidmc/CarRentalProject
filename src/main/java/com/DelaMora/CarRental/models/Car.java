package com.DelaMora.CarRental.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "CAR")
@Table(name = "CAR")
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CarId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String carId;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "MODEL")
    private String model;

    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name="CatId")
    private Category CatId;

    @Column(name = "PRICE")
    private Integer pricePerDay;

    @Column(name = "AVAILABILITY")
    private String available;


    public Car(String carId, String brand, String model, Category CatId, Integer pricePerDay, String available) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.CatId = CatId;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }

    public String getCarId() {

        return carId;
    }

    public void setCarId(String carId) {

        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Category getCatId() {
        return CatId;
    }

    public void setCatId(Category CatId) {
        this.CatId = CatId;
    }

    public Integer getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Integer pricePerDay) {
        this.pricePerDay = pricePerDay;
    }


    public String isAvailable() {
        return available ;
    }

    public void setAvailable(String av) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", category=" + CatId +
                ", pricePerDay=" + pricePerDay +
                ", available=" + available +
                '}';
    }
}







































