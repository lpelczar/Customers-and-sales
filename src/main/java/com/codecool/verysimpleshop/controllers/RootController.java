package com.codecool.verysimpleshop.controllers;

import com.codecool.verysimpleshop.dao.CustomerDAO;
import com.codecool.verysimpleshop.models.Customer;
import com.codecool.verysimpleshop.views.RootView;

import java.util.ArrayList;
import java.util.List;

public class RootController {

    private String[] consoleArgs;
    private RootView rootView;
    private CustomerDAO customerDAO;

    public RootController(String[] args, RootView rootView, CustomerDAO customerDAO) {
        this.consoleArgs = args;
        this.rootView = rootView;
        this.customerDAO = customerDAO;
    }

    public void start() {
        if (this.consoleArgs.length == 0) {
            rootView.displayNoConsoleArgsError();
            return;
        }

        List<Customer> customers = new ArrayList<>(customerDAO.getBySearchPhrase(consoleArgs[0]));
        rootView.displayResults(customers, new ArrayList<>());

    }
}
