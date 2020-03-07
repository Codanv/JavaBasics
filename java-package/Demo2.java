package com.demoexample;

import com.example.Surgeon;
import com.example.Physician;
import com.example.transport.Driver;

class Demo2 {
    public static void main(String args[]) {

        Physician physician = new Physician();
        physician.treat();
        physician.checkup();

        Surgeon surgeon = new Surgeon();
        surgeon.surgery();
        // surgeon.treat();

        Driver driver = new Driver();
        driver.drive();

        driver.setLicenseNumber("DL49459");
        System.out.println(driver.getLicenseNumber());

    }
}