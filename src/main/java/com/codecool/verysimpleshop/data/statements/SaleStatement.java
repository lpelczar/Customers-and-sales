package com.codecool.verysimpleshop.data.statements;

public class SaleStatement {


    public String selectBySearchPhrase() {
        return "SELECT * FROM sales " +
                "WHERE id LIKE ? " +
                "OR product_name LIKE ? " +
                "OR net_value LIKE ? " +
                "OR tax_rate LIKE ? COLLATE NOCASE;";
    }
}
