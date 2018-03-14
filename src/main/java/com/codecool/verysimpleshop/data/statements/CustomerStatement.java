package com.codecool.verysimpleshop.data.statements;

public class CustomerStatement {


    public String selectBySearchPhrase() {
        return "SELECT * FROM customers WHERE id LIKE '%?%' " +
                "OR name LIKE ? " +
                "OR surname LIKE ? " +
                "OR birthyear LIKE ? " +
                "OR gender LIKE ? COLLATE NOCASE;";
    }
}
