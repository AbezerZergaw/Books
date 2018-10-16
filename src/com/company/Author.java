package com.company;

import java.util.ArrayList;

public class Author {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;


    private ArrayList<Book> abook;

    public Author() {
        abook = new ArrayList<Book>();
    }

    public Author(String firstName, String lastName, String emailAddress, String phoneNumber, ArrayList<Book> abook) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.abook = abook;
    }

    @Override
    public String toString() {
        return "Author{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", EmailAddress='" + emailAddress + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                //   ", abook=" + abook +
                '}';
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Book> getAbook() {
        return abook;
    }

    public void setAbook() {
        this.abook = abook;
    }

    public void addBooks(Book book) {
        abook.add(book);
    }
}
