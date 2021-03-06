package com.codecool.verysimpleshop.dao;

import com.codecool.verysimpleshop.data.DbHelper;
import com.codecool.verysimpleshop.data.PreparedStatementCreator;
import com.codecool.verysimpleshop.data.statements.CustomerStatement;
import com.codecool.verysimpleshop.models.Customer;

import java.awt.print.Book;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DbCustomerDAO extends DbHelper implements CustomerDAO {

    private PreparedStatementCreator psc = new PreparedStatementCreator();
    private CustomerStatement customerStatement = new CustomerStatement();

    @Override
    public Customer getById(int id) {
        String sqlStatement = customerStatement.selectById();
        Customer customer = null;
        try {
            PreparedStatement statement = getPreparedStatement(sqlStatement);
            statement.setInt(1, id);
            ResultSet resultSet = query(statement);
            while (resultSet.next())
                customer = new Customer(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("birthyear"),
                        resultSet.getString("gender")
                );
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        } finally {
            closeConnection();
        }
        return customer;
    }

    @Override
    public List<Customer> getBySearchPhrase(String searchPhrase) {

        String sqlStatement = customerStatement.selectBySearchPhrase();
        PreparedStatement statement = psc.getPreparedStatementBy(Collections.nCopies(5, "%" + searchPhrase + "%"),
                sqlStatement);

        List<Customer> customers = new ArrayList<>();
        try {
            ResultSet resultSet = query(statement);
            while (resultSet.next())
                customers.add(new Customer(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("birthyear"),
                        resultSet.getString("gender")
                ));
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        } finally {
            closeConnection();
        }
        return customers;
    }
}
