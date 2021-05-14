package com.DelaMora.CarRental.models;

import org.hibernate.annotations.Proxy;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "reservations")
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(unique = true)
    private Long idReservation;

    @JoinColumn
    private String lastName ;

    @JoinColumn(name = "car_id")
    private int carId ;

    @JoinColumn(name = "type_category")
    private String typeCategory ;

    @Column
    private double totalAmount;

    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pickDate;

    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date returnDate;


    public Reservation(Long idReservation, String lastName, int carId, String typeCategory, double totalAmount, Date pickDate, Date returnDate) {
        this.idReservation = idReservation;
        this.lastName = lastName;
        this.carId = carId;
        this.typeCategory = typeCategory;
        this.totalAmount = totalAmount;
        this.pickDate = pickDate;
        this.returnDate = returnDate;
    }

    public Reservation(){}

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getPickDate() {
        return pickDate;
    }

    public void setPickDate(Date pickDate) {
        this.pickDate = pickDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}

