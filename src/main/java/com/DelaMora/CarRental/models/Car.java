package com.DelaMora.CarRental.models;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;

//import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "cars")
public class Car implements Serializable {

    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="car_id")
    private int carId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategory")
    private Category category;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "transmission")
    private typeTransmission transmission;

    @Column(name = "seats")
    private int seats;

    @Column(name = "doors")
    private int doors;

    @Column(name = "available")
    private boolean av;

    public Car() {
    }

    public Car(Integer carId, Category category, String brand, String model, typeTransmission transmission, int seats, int doors, boolean av) {
        this.carId = carId;
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.transmission = transmission;
        this.seats = seats;
        this.doors = doors;
        this.av = av;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

    public typeTransmission getTransmission() {
        return transmission;
    }

    public void setTransmission(typeTransmission transmission) {
        this.transmission = transmission;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isAv() {
        return av;
    }

    public void setAv(boolean av) {
        this.av = av;
    }

}











































