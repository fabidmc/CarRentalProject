package com.DelaMora.CarRental.models;
import javax.persistence.*;
import java.io.Serializable;
//import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "cars")
public class Car implements Serializable {

    private static final long serialVersionUID= 7034352443015914334L;

    public Car() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    @Column(length = 50)
    private String plate;

    @Column
    private String brand;

    @Column
    private String model;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;


    @Column(name = "prices")
    private Integer pricePerDay;

    @Column
    private boolean available;


    public Car(Long carId, String plate, String brand, String model, Category category, Integer pricePerDay, boolean available) {
        this.setCarId(carId);
        this.setPlate(plate);
        this.setBrand(brand);
        this.setModel(model);
        this.setCategory(category);
        this.setPricePerDay(pricePerDay);
        this.setAvailable(available);
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Integer pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}











































