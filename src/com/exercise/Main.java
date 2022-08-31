package com.exercise;

public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Contact contact1 = new Contact();
        Contact contact2 = new Contact();

        contact1.setName("John Doe");
        contact1.setNumber("+639123456789");
        contact1.setNumber("+639987654321");
        contact1.setAddress("my home in Quezon City");
        contact1.setAddress("my office in Makati City");

        contact2.setName("Jane Doe");
        contact2.setNumber("+639012345678");
        contact2.setNumber("+639876543210");
        contact2.setAddress("my home in Caloocan City");
        contact2.setAddress("my office in Pasay City");

        phonebook.setContact(contact1);
        phonebook.setContact(contact2);

        if (phonebook.getContactsSize() == 0) {
            System.out.println("The Phonebook is empty.");
        } else{
            phonebook.printContacts();
        }
    }

}

