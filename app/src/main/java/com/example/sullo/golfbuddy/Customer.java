package com.example.sullo.golfbuddy;

/**
 * Created by sullo on 22/10/2017.
 */

public class Customer {
    private String firstName;
    private String surname;
    private String email;
    private int age;

    public Customer() {
    }

    public Customer(String firstName, String surname, String email, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
