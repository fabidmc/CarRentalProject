package com.DelaMora.CarRental.models;

import java.time.LocalDateTime;


public class Reservation {

    private String Reservation_ID;
    private int Car_ID;
    private int Customer_ID;
    private int idCategory;
    private double totalAmount;
    private LocalDateTime pickupDate;
    private LocalDateTime returnDate;


    public Reservation(String reservation_ID, int car_ID, int customer_ID, int idCategory, double totalAmount, LocalDateTime pickupDate, LocalDateTime returnDate) {
        Reservation_ID = reservation_ID;
        Car_ID = car_ID;
        Customer_ID = customer_ID;
        this.idCategory = idCategory;
        this.totalAmount = totalAmount;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;

    }

    public String getReservation_ID() {
        return Reservation_ID;
    }

    public void setReservation_ID(String reservation_ID) {
        Reservation_ID = reservation_ID;
    }

    public int getCar_ID() {
        return Car_ID;
    }

    public void setCar_ID(int car_ID) {
        Car_ID = car_ID;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "Reservation_ID='" + Reservation_ID + '\'' +
                ", Car_ID=" + Car_ID +
                ", Customer_ID=" + Customer_ID +
                ", idCategory=" + idCategory +
                ", totalAmount=" + totalAmount +
                ", pickupDate=" + pickupDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
