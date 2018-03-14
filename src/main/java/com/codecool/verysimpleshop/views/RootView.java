package com.codecool.verysimpleshop.views;

import com.codecool.verysimpleshop.models.Customer;
import com.codecool.verysimpleshop.models.Sale;

import java.util.List;

public class RootView {

    public void displayNoConsoleArgsError() {
        System.out.println("You need to pass search phrase as console argument like 'java Application search phrase'");
    }

    public void displayResults(List<Customer> customers, List<Sale> sales) {
        System.out.println("Results: ");
        if (customers.isEmpty()) {
            System.out.println("No customers found!");
        } else {
            for (Customer c : customers) {
                System.out.println(c);
            }
        }
        if (sales.isEmpty()) {
            System.out.println("No sales found!");
        } else {
            for (Sale s : sales) {
                System.out.println(s);
            }
        }
    }

    public void displayMessageToUseQuotes() {
        System.out.println("Use double quote if your search phrase is more than single word");
    }
}
