package com.exercise;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public Phonebook() {}

    public Phonebook(Contact contact) {
        this.contacts.add(contact);
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public int getContactsSize() {
        return contacts.size();
    }

    public void setContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void printContacts() {
        for (Contact contact: contacts) {
            System.out.println(contact.getName());
            System.out.println("-------------------");

            System.out.println(contact.getName() + " has the following registered numbers:");
            ArrayList<String> numbersArray = contact.getNumbers();
            for (String number: numbersArray) {
                System.out.println(number);
            }

            System.out.println("-----------------------------------");
            System.out.println(contact.getName() + " has the following registered Addresses:");
            ArrayList<String> addressesArray = contact.getAddresses();
            for (String address: addressesArray) {
                System.out.println(address);
            }

            System.out.println("===================================");

        }
    }
}
