package com.DelaMora.CarRental.models;

public class Customer {

    private int Customer_ID;
    private String firstName;
    private String lastName;
    private String mobile,email;
    private String state;
    private String country;


    public Customer() {

        firstName = "";
        lastName = "";
        mobile = "";
        state = "";
        country = "";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Customer{" +
                "Customer_ID=" + Customer_ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
