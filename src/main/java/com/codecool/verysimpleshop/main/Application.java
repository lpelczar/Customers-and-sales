package com.codecool.verysimpleshop.main;

import com.codecool.verysimpleshop.controllers.RootController;

public class Application {

    public static void main(String[] args) {

        RootController rootController = new RootController(args);
        rootController.start();
    }
}
