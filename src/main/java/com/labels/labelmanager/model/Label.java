package com.labels.labelmanager.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * This is the Label entity class that encapsulates each
 * label's information to represent it in the database.
 * This class was originally designed to hold any labels,
 * but now only holds "guest" labels for Wedding Guest Manager.
 */
@Entity
public class Label implements Serializable {
    /**
     * The id for the database is automatically generated
     * and can't be null or updated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    /**
     * Variables holding Guest information
     */
    private String name;
    private String diet;
    private String role;
    private String email;
    private String phone;
    private String imageURL;

    /*
    Constructors
     */
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
        this.email = email;
        this.phone = phone;
        this.diet = diet;
    }

    public Label(Long id, String name, String diet, String role, String email, String phone) {
        this.id = id;
        this.name = name;
        this.diet = diet;
        this.role = role;
        this.email = email;
        this.phone = phone;
    }

    public Label(Long id, String name, String diet, String role, String email, String phone, String imageURL) {
        this.id = id;
        this.name = name;
        this.diet = diet;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.imageURL = imageURL;
    }

    /*
    Getters and Setters
     */

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

    /*
    String representation for Labels/Guests
     */
    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", diet='" + diet + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
