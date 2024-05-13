package com.bekprotek.bekprotek.Entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name="products")
public class productEntity implements Serializable {
    @Id
    @Column(name = "id")
    private long id; // Change the type to String

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String desc;

    // Getters and setters for id, name, and description
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}