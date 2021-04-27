package com.DelaMora.CarRental.models;

import java.util.*;
import java.io.*;

public class Customer {

    private int Customer_ID;
    private String firstName;
    private String lastName;
    private String mobile,email;
    private String state;
    private String country;
    private String address;


    public Customer() {

        firstName = "";
        lastName = "";
        mobile = "";
        state = "";
        country = "";
        address = "";
        email = "";
    }

    public void setCustomer(String fN, String lN, String m, String s, String c, String e){

        firstName = fN;
        lastName = lN;
        mobile = m;
        state = s;
        country = c;
        email = e;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getMobile() {
        return mobile;
    }


    public String getState() {
        return state;
    }



    public String getCountry() {
        return country;
    }



    public String getAddress() {
        return address;
    }


}
