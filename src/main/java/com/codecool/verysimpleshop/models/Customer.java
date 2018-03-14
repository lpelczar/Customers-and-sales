package com.codecool.verysimpleshop.models;

public class Customer {

    private int id;
    private String name;
    private String surname;
    private int birthYear;
    private String gender;

    public Customer(int id, String name, String surname, int birthYear, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ID: " + id + " Name: " + name + " Surname: " + surname + " Birthyear: "
                + birthYear + " Gender: " + gender;
    }

    public int getId() {
        return id;
    }
}
