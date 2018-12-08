package com.example.owner.week3_youwan;

public class list_item {
    String img;
    String name;
    String balloon;

    public list_item(String img,String name, String balloon) {
        this.img = img;
        this.name = name;
        this.balloon = balloon;
    }

    public String getImg() {
        return img;
    }


    public String getName() {
        return name;
    }

    public String getBalloon() {
        return balloon;
    }

    public void setImg(String img) {
        this.img = img;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBalloon(String balloon) {
        this.balloon = balloon;
    }
}
