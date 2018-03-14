package com.codecool.verysimpleshop.models;

public class Sale {

    private int id;
    private Customer customer;
    private String productName;
    private double netValue;
    private int taxRate;

    public Sale(int id, Customer customer, String productName, double netValue, int taxRate) {
        this.id = id;
        this.customer = customer;
        this.productName = productName;
        this.netValue = netValue;
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ID: " + id + " Customer id: " + customer.getId() + " Product name: " +
                productName + " Net value: " + netValue + " Tax rate: " + taxRate;
    }
}
