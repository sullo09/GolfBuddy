package com.example.sullo.golfbuddy.Model;

/**
 * Created by sullo on 30/01/2018.
 */
//Model class that Represents one item
public class ListItems {

    private String logo;
    private String name;

    public ListItems(String image, String name) {
        this.logo = image;
        this.name = name;

    }

    public String getlogo() {
        return logo;
    }

    public void setlogo(String image) {
        this.logo = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
