package com.example.demo;

import java.util.logging.Logger;

public class Barista {

    private final String name;

    public Barista(String name) {
        this.name = name;
    }

    public void makeCoffee(Object request) {
        System.out.println(String.format("%s making coffee order [%s]", name, request.toString()));
    }

}
