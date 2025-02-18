package com.gdu_springboot.springboot_demo.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
    @NotNull(message="is required")
    @Size(min=1, message="Bắt buộc nhập dữ liệu")
    private String firstName;
    private String lastName;
    private String country;
    private String gender;
    private String language;

    public Student() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
