package com.DelaMora.CarRental.models;


import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name = "CAR_TYPE")

public class Category implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "CatId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CatId;

    @Column(name = "TYPE")
    private String Type;

    @Column(name = "CAT_DESC")
    private String CatDesc;

    public Category(String Type, String catDesc) {
        this.Type = Type;
        this.CatDesc = catDesc;
    }

    public Long getCatId() {

        return CatId;
    }

    public void setCatId(Long CatId) {

        this.CatId = CatId;
    }

    public static long getSerialVersionUID() {

        return serialVersionUID;
    }

    public void setType(String Type) {

        this.Type = Type;
    }

    public String getCatDesc() {

        return CatDesc;
    }

    public void setCatDesc(String catDesc) {

        this.CatDesc = catDesc;
    }

    @Override
    public String toString() {
        return "Category{" +
                "CatId="+ CatId +
                ",Type='" + Type + '\'' +
                ", CatDesc='" + CatDesc + '\'' +
                '}';
    }
}
