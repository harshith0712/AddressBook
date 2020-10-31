package com.mphasis.model;

import java.math.BigInteger;

/*
@author : harshith kolagatla
Created Date : 22nd october 2020
Functionality : to get the members from the user for address book
* */
public class Person {
    private String firstName;
    private String lastName;
    private String Address;
    private String City;
    private String State;
    private String pinCode;
    private String Number;


    public Person(String firstName, String lastName, String address, String city,String state, String pinCode, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        Address = address;
        City = city;
        State = state;
        this.pinCode = pinCode;
        Number = number;
    }

    public Person() {
    }
    /*
    Functionality : to get and set value of first name
    @param taken first name as argument
    @param returned fist name as agrument
    * */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /*
    Functionality : to get and set value of last name
    @param taken last name as argument
    @param returned last name as argument
    * */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /*
    Functionality : to get and set value of address name
    @param taken first name as argument
    @param returned fist name as agrument
    * */
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }
    public String getState() {
        return State;
    }
    public void setState(String state) {
        State = state;
    }


    public void setCity(String city) {
        City = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", pinCode=" + pinCode +
                ", Number=" + Number +
                '}';
    }
}
