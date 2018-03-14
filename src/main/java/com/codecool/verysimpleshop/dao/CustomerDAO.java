package com.codecool.verysimpleshop.dao;

import com.codecool.verysimpleshop.models.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getBySearchPhrase(String searchPhrase);
}
