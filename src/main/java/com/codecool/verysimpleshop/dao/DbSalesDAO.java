package com.codecool.verysimpleshop.dao;

import com.codecool.verysimpleshop.data.DbHelper;
import com.codecool.verysimpleshop.data.PreparedStatementCreator;
import com.codecool.verysimpleshop.data.statements.SaleStatement;
import com.codecool.verysimpleshop.models.Customer;
import com.codecool.verysimpleshop.models.Sale;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DbSalesDAO extends DbHelper implements SalesDAO {

    private PreparedStatementCreator psc = new PreparedStatementCreator();
    private SaleStatement saleStatement = new SaleStatement();

    @Override
    public List<Sale> getBySearchPhrase(String searchPhrase) {

        String sqlStatement = saleStatement.selectBySearchPhrase();
        PreparedStatement statement = psc.getPreparedStatementBy(Collections.nCopies(4, "%" + searchPhrase + "%"),
                sqlStatement);

        List<Sale> sales = new ArrayList<>();
        try {
            ResultSet resultSet = query(statement);
            while (resultSet.next())
                sales.add(new Sale(
                        resultSet.getInt("id"),
                        new DbCustomerDAO().getById(resultSet.getInt("customer_id")),
                        resultSet.getString("product_name"),
                        resultSet.getDouble("net_value"),
                        resultSet.getInt("tax_rate")
                ));
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        } finally {
            closeConnection();
        }
        return sales;
    }
}
