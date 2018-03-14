package com.codecool.verysimpleshop.dao;

import com.codecool.verysimpleshop.models.Customer;

import java.util.List;

public interface CustomerDAO {
    Customer getById(int id);
    List<Customer> getBySearchPhrase(String searchPhrase);
}
