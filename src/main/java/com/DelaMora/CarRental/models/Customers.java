package com.DelaMora.CarRental.models;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "CUSTOMERS")
public class Customers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CustomerId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "EMAIL")
    private String email;


    public Customers(String customerId, String firstName, String lastName, String mobile, String state, String country, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.state = state;
        this.country = country;
        this.email = email;
    }

    public String getCustomerId() {

        return customerId;
    }

    public void setCustomerId(String customerId) {

        this.customerId = customerId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}