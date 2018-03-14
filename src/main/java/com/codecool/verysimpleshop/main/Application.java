package com.codecool.verysimpleshop.main;

import com.codecool.verysimpleshop.controllers.RootController;
import com.codecool.verysimpleshop.dao.DbCustomerDAO;
import com.codecool.verysimpleshop.views.RootView;

public class Application {

    public static void main(String[] args) {

        RootController rootController = new RootController(args, new RootView(), new DbCustomerDAO());
        rootController.start();
    }
}
