package com.codecool.verysimpleshop.controllers;

import com.codecool.verysimpleshop.views.RootView;

public class RootController {

    private String[] consoleArgs;
    private RootView rootView;

    public RootController(String[] args, RootView rootView) {
        this.consoleArgs = args;
        this.rootView = rootView;
    }

    public void start() {
        if (this.consoleArgs.length == 0) {
            rootView.displayNoConsoleArgsError();
            return;
        }

        for (String arg : consoleArgs) {

        }
    }
}
