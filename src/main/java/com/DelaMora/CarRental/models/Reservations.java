package com.DelaMora.CarRental.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "RESERVATION")

public class Reservations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ReservId;

    @ManyToOne(targetEntity = Customers.class)
    @JoinColumn(name="CUSTOMER_ID")
    private Customers customerId ;

    @ManyToOne(targetEntity = Car.class)
    @JoinColumn(name="CAR_ID")
    private Category carId ;


    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name="ID_CATEGORY")
    private Category CatId ;

    @Column(name = "AMOUNT")
    private Integer totalAmount;

    @Column(name = "PICKUPDATE")
    private LocalDateTime pickDate;

    @Column(name = "RETURNDATE")
    private LocalDateTime returnDate;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getReservId() {
        return ReservId;
    }

    public void setReservId(Long reservId) {
        ReservId = reservId;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public Category getCarId() {
        return carId;
    }

    public void setCarId(Category carId) {
        this.carId = carId;
    }

    public Category getCatId() {
        return CatId;
    }

    public void setCatId(Category catId) {
        CatId = catId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getPickDate() {
        return pickDate;
    }

    public void setPickDate(LocalDateTime pickDate) {
        this.pickDate = pickDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Reservations{" +
                "ReservId=" + ReservId +
                ", customerId=" + customerId +
                ", carId=" + carId +
                ", CatId=" + CatId +
                ", totalAmount=" + totalAmount +
                ", pickDate=" + pickDate +
                ", returnDate=" + returnDate +
                '}';
    }
}