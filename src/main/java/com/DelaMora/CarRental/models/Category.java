package com.DelaMora.CarRental.models;
import javax.persistence.*;


@Entity
@Table(name = "categories_cars")
public class Category {

    private static final long serialVersionUID= 7034352443015914334L;

    public Category() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long idCategory;

    @Column(name = "type_cars")
    private String Type;

    private String description;

    public Category(Long idCategory, String type, String description) {
        this.setIdCategory(idCategory);
        this.setType(type);
        this.setDescription(description);
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}



