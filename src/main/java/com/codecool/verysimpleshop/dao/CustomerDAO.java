package com.codecool.verysimpleshop.dao;

public interface CustomerDAO {
    List<Customer> getBySearchPhrase(String searchPhrase);
}
