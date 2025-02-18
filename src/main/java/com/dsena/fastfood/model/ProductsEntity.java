package com.dsena.fastfood.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("products")
public class ProductsEntity {

    @Id
    private String id;

    @Field("value")
    @Positive
    @NotNull
    private Double value;

    @Field("quantity")
    private Integer quantity;

    @Field("name")
    private String name;

    @Field("description")
    private String description;

    public ProductsEntity(String id, Double value, Integer quantity, String name, String description) {
        this.id = id;
        this.value = value;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
    }

    public ProductsEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductsEntity{" +
                "id='" + id + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


