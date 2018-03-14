package com.codecool.verysimpleshop.models;

public class Sale {

    private int id;
    private int customerId;
    private String productName;
    private double netValue;
    private int taxRate;

    public Sale(int id, int customerId, String productName, double netValue, int taxRate) {
        this.id = id;
        this.customerId = customerId;
        this.productName = productName;
        this.netValue = netValue;
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Customer id: " + customerId + " Product name: " + productName +
        " Net value: " + netValue + " Tax rate: " + taxRate;
    }
}
