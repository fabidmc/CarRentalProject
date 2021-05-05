package com.DelaMora.CarRental.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "CUSTOMERS")
public class Customers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CUSTOMER_ID", nullable = false)
    private String customerId;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Column(name = "FIRSTNAME", nullable = false)
    private String FIRSTNAME;

    @Column(name = "LASTNAME", nullable = false)
    private String LASTNAME;

    @Column(name = "MOBILE", nullable = false)
    private String MOBILE;

    @Column(name = "STATE", nullable = false)
    private String STATE;

    @Column(name = "COUNTRY", nullable = false)
    private String COUNTRY;

    @Column(name = "EMAIL")
    private String EMAIL;


    public String getCustomerId() {

        return customerId;
    }

    public void setCustomerId(String customerId) {

        this.customerId = customerId;
    }

    public String getFIRSTNAME() {

        return FIRSTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME) {

        this.FIRSTNAME = FIRSTNAME;
    }

    public String getLASTNAME() {

        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {

        this.LASTNAME = LASTNAME;
    }

    public String getMOBILE() {

        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {

        this.MOBILE = MOBILE;
    }

    public String getSTATE() {

        return STATE;
    }

    public void setSTATE(String STATE) {

        this.STATE = STATE;
    }

    public String getCOUNTRY() {

        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {

        this.COUNTRY = COUNTRY;
    }

    public String getEMAIL() {

        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {

        this.EMAIL = EMAIL;
    }

    @Override
    public String toString() {
        return "CUSTOMERS{" +
                "customerId=" + customerId +
                ", FIRSTNAME='" + FIRSTNAME + '\'' +
                ", LASTNAME='" + LASTNAME + '\'' +
                ", MOBILE='" + MOBILE + '\'' +
                ", STATE='" + STATE + '\'' +
                ", COUNTRY='" + COUNTRY + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                '}';
    }
}
