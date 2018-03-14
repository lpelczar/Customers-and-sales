package com.codecool.verysimpleshop.controllers;

import com.codecool.verysimpleshop.dao.CustomerDAO;
import com.codecool.verysimpleshop.dao.SalesDAO;
import com.codecool.verysimpleshop.models.Customer;
import com.codecool.verysimpleshop.models.Sale;
import com.codecool.verysimpleshop.views.RootView;

import java.util.ArrayList;
import java.util.List;

public class RootController {

    private String[] consoleArgs;
    private RootView rootView;
    private CustomerDAO customerDAO;
    private SalesDAO salesDAO;

    public RootController(String[] args, RootView rootView, CustomerDAO customerDAO, SalesDAO salesDAO) {
        this.consoleArgs = args;
        this.rootView = rootView;
        this.customerDAO = customerDAO;
        this.salesDAO = salesDAO;
    }

    public void start() {
        if (this.consoleArgs.length == 0) {
            rootView.displayNoConsoleArgsError();
            return;
        } else if (this.consoleArgs.length > 1) {
            rootView.displayMessageToUseQuotes();
            return;
        }

        List<Customer> customers = new ArrayList<>(customerDAO.getBySearchPhrase(consoleArgs[0]));
        List<Sale> sales = new ArrayList<>(salesDAO.getBySearchPhrase(consoleArgs[0]));
        rootView.displayResults(customers, sales);

    }
}
