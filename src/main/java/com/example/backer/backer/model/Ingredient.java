package com.example.backer.backer.model;

import com.example.backer.backer.controller.Type;

public class Ingredient {

    public static Type Type;


    private String name;
    private String shortName;
    private Type id;


    public Ingredient(String shortName, String name, Type id) {
        this.name = name;
        this.shortName = shortName;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Type getId() {
        return id;
    }

    public void setId(Type id) {
        this.id = id;
    }
}
