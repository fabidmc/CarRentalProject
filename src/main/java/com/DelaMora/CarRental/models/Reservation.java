package com.DelaMora.CarRental.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "reservations")

public class Reservation implements Serializable {

    private static final long serialVersionUID = 7034352443015914334L;

    @Id
    @Column(name = "id_reservation", unique = true)
    private Long idReservation;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="last_name")
    private Client client ;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="plate")
    private Car car ;

    @OneToOne(targetEntity = Category.class)
    @JoinColumn(name="category_id")
    private Category category ;

    @Column(name = "total_amount")
    private Integer totalAmount;

    @Column(name = "pick_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pickDate;

    @Column(name = "return_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date returnDate;

    public Reservation(Long idReservation, Client client, Car car, Category category, Integer totalAmount, Date pickDate, Date returnDate) {
        this.idReservation = idReservation;
        this.client = client;
        this.car = car;
        this.category = category;
        this.totalAmount = totalAmount;
        this.pickDate = pickDate;
        this.returnDate = returnDate;
    }

    public Reservation(){
        super();
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
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

