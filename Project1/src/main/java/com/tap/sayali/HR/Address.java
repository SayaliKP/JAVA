package com.tap.sayali.HR;

public class Address {
    private String city;
    private String state;
    private String zip;

    public Address(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void display() {
        System.out.println("Address: " + city + ", " + state + "-" + zip);
    }

}
