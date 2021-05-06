package com.DelaMora.CarRental.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "RESERVATION")

public class Reservations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ReservationId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String BookingId;

    @OneToOne(targetEntity = Customers.class)
    @JoinColumn(name="CustomerId")
    private Customers customerId ;

    @OneToOne(targetEntity = Car.class)
    @JoinColumn(name="CarId")
    private Category carId ;

    @OneToOne(targetEntity = Category.class)
    @JoinColumn(name="CatId")
    private Category CatId ;

    @Column(name = "AMOUNT")
    private Integer totalAmount;

    @Column(name = "PICKUPDATE")
    private LocalDateTime pickDate;

    @Column(name = "RETURNDATE")
    private LocalDateTime returnDate;

    public Reservations(String bookingId, Customers customerId, Category carId, Category catId, Integer totalAmount, LocalDateTime pickDate, LocalDateTime returnDate) {
        BookingId = bookingId;
        this.customerId = customerId;
        this.carId = carId;
        CatId = catId;
        this.totalAmount = totalAmount;
        this.pickDate = pickDate;
        this.returnDate = returnDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getBookingId() {
        return BookingId;
    }

    public void setBookingId(String bookingId) {
        BookingId = bookingId;
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

    public void setCatId(Category CatId) {
        this.CatId= CatId;
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
                "BookingId=" + BookingId +
                ", customerId=" + customerId +
                ", carId=" + carId +
                ", CatId=" + CatId +
                ", totalAmount=" + totalAmount +
                ", pickDate=" + pickDate +
                ", returnDate=" + returnDate +
                '}';
    }
}