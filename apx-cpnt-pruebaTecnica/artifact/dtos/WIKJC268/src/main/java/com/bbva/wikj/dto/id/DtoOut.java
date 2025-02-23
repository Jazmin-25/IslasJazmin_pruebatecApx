package com.bbva.wikj.dto.id;

public class DtoOut {
    private String id;
    private String nuip;
    private String full_name;
    private String phone;
    private String address;

    //getters

    public String getId() {
        return id;
    }

    public String getNuip() {
        return nuip;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    //setters

    public void setId(String id) {
        this.id = id;
    }

    public void setNuip(String nuip) {
        this.nuip = nuip;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
