package com.example.sullo.golfbuddy.Model;

/**
 * Created by sullo on 30/01/2018.
 */
//Model class that Represents one item
public class ListItems {

    private String image;
    private String name;

    public ListItems(String image, String name) {
        this.image = image;
        this.name = name;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
