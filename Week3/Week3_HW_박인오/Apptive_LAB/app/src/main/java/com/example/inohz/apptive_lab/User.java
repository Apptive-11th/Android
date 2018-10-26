package com.example.inohz.apptive_lab;

public class User {

    int image;
    String name;
    String balloon;

    public User(int image, String name, String balloon) {
        this.image = image;
        this.name = name;
        this.balloon = balloon;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBallon(String ballon) {
        this.balloon = balloon;
    }

    public int getImage() {

        return image;
    }

    public String getName() {
        return name;
    }

    public String getBalloon() {
        return balloon;
    }
}
