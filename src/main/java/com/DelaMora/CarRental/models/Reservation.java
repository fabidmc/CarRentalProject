package com.DelaMora.CarRental.models;

import java.time.LocalDateTime;


public class Reservation {

    private String Reservation_ID;
    private int Car_ID;
    private int Customer_ID;
    private double totalAmount;
    private LocalDateTime pickupDate;
    private LocalDateTime returnDate;


    public Reservation(String Reservation_ID, int Car_ID, int Customer_ID, double totalAmount, LocalDateTime pickupDate, LocalDateTime returnDate){
        this.Reservation_ID = Reservation_ID;
        this.Car_ID = Car_ID;
        this.Customer_ID = Customer_ID;
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
}
