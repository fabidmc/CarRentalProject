package com.DelaMora.CarRental.models;

//import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


@Entity
@Table(name = "clients")
public class Client implements Serializable {

    private static final long serialVersionUID = 7034352443015914334L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long idClient;

    @NotEmpty(message = "This field is not optional")
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty(message = "This field is not optional")
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile")
    private String mobile;

    private String state;

    private String country;

    @NotEmpty(message = "This field is not optional")
    @Email(message = "incorrect format")
    @Column(name = "email")
    private String email;

    @NotEmpty(message ="This field is not optional" )
    @Column(name = "user_name")
    private String userName;

    @NotEmpty(message ="This field is not optional" )
    private String password;


    public Client(){
        super();
    }

    public Client(Long idClient, String firstName, String lastName, String mobile, String state, String country, String email, String userName, String password) {
        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.state = state;
        this.country = country;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

