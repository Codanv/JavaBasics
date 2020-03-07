package com.example.transport;

public class Driver {

    private String licenseNumber;
        
    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void drive() {
        System.out.println("driving...");
    }
}