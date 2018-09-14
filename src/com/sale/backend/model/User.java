package com.sale.backend.model;

public class User {
    private Integer userId;
    private String name;
    private String address;
    private String emeil;
    private String phone;

    public User () { }

    public User (Integer userId,
                 String name,
                 String address,
                 String emeil,
                 String phone) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.emeil = emeil;
        this.phone = phone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmeil() {
        return emeil;
    }

    public void setEmeil(String emeil) {
        this.emeil = emeil;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
