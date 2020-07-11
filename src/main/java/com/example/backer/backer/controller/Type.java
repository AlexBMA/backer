package com.example.backer.backer.controller;

public enum  Type {

    WRAP("Wrap"),
    VEGGIES("veggies"),
    CHEESE("cheese"),
    SAUCE("sauce"),
    PROTEIN("protein");

    private String typeName;

    Type(String typeName) {
        this.typeName = typeName;
    }
}
