package com.DelaMora.CarRental.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@Entity
@Table(name = "CUSTOMERS")
public class CUSTOMERS implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CUSTOMER_ID", nullable = false)
    private Integer customerId;

    @Column(name = "FIRSTNAME", nullable = false)
    private String FIRSTNAME;

    @Column(name = "LASTNAME", nullable = false)
    private String LASTNAME;

    @Column(name = "MOBILE", nullable = false)
    private String MOBILE;

    @Column(name = "ADDRESS", nullable = false)
    private String ADDRESS;

    @Column(name = "STATE", nullable = false)
    private String STATE;

    @Column(name = "COUNTRY", nullable = false)
    private String COUNTRY;

    @Column(name = "EMAIL")
    private String EMAIL;

}
