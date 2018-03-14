package com.codecool.verysimpleshop.dao;

import com.codecool.verysimpleshop.models.Sale;

import java.util.List;

public interface SalesDAO {
    List<Sale> getBySearchPhrase(String searchPhrase);
}
