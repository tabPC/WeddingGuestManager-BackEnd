package com.labels.labelmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Label implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String diet;
    private String role;
    private String email;
    private String phone;
    private String imageURL;

    public Label() {
    }

    public Label(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Label(String name, String role, String imageURL) {
        this.name = name;
        this.role = role;
        this.imageURL = imageURL;
    }

    public Label(String name, String diet, String role, String imageURL) {
        this.name = name;
        this.diet = diet;
        this.role = role;
        this.imageURL = imageURL;
    }

    public Label(String name, String role, String email, String phone, String imageURL) {
        this.name = name;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.imageURL = imageURL;
    }

    public Label(String name, String diet, String role, String email, String phone, String imageURL) {
        this.name = name;
        this.diet = diet;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.imageURL = imageURL;
    }

    public Label(Long id, String name, String diet, String role, String imageURL) {
        this.id = id;
        this.name = name;
        this.diet = diet;
        this.role = role;
        this.imageURL = imageURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String tags) {
        this.diet = tags;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String description) {
        this.role = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", title='" + name + '\'' +
                ", description='" + role + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
