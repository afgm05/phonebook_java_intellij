package com.exercise;

import java.util.ArrayList;

public class Contact {
    private String name;
    private ArrayList<String> numbers = new ArrayList<>();
    private ArrayList<String> addresses = new ArrayList<>();

    public Contact() {}

    public Contact(String number, String address) {
        this.numbers.add(number);
        this.addresses.add(address);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getNumbers() {
        return this.numbers;
    }

    public ArrayList<String> getAddresses() {
        return this.addresses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.numbers.add(number);
    }

    public void setAddress(String address) {
        this.addresses.add(address);
    }

    @Override
    public String toString(){
        return getName() + getNumbers() + getAddresses();
    }

}

