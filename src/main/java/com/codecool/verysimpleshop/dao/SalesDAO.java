package com.codecool.verysimpleshop.dao;

public interface SalesDAO {
    List<Sale> getBySearchPhrase(String searchPhrase);
}
