package com.DelaMora.CarRental.models;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "categories")
public class Category implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idCategory;

        @Column(name = "price_day")
        private Double pricePerDay;

        @Column(name = "type_category")
        private String typeCategory;

        public Category(Long idCategory, Double pricePerDay, String typeCategory) {
            this.idCategory = idCategory;
            this.pricePerDay = pricePerDay;
            this.typeCategory = typeCategory;
        }

        public Category() {

        }

        public Long getIdCategory() {
            return idCategory;
        }

        public void setIdCategory(Long idCategory) {
            this.idCategory = idCategory;
        }

        public Double getPricePerDay() {
            return pricePerDay;
        }

        public void setPricePerDay(Double pricePerDay) {
            this.pricePerDay = pricePerDay;
        }

        public String getTypeCategory() {
            return typeCategory;
        }

        public void setTypeCategory(String typeCategory) {
            this.typeCategory = typeCategory;
        }


        }








