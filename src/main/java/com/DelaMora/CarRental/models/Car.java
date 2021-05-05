package com.DelaMora.CarRental.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CAR")
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CAR_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "MODEL")
    private String model;

    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name="ID_CATEGORY")
    private Category CatId ;

    @Column(name = "PRICE")
    private Integer pricePerDay;

    @Column(name = "AVAILABILITY")
    private boolean av;


    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
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

    public void setCatId(Category catId) {
        CatId = catId;
    }

    public Integer getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Integer pricePerDay) {
        this.pricePerDay = pricePerDay;
    }


    public boolean isAv() {
        return av ;
    }

    public void setAv(boolean av) {
        this.av = av;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", CatId=" + CatId +
                ", pricePerDay=" + pricePerDay +
                ", av=" + av +
                '}';
    }
}







































