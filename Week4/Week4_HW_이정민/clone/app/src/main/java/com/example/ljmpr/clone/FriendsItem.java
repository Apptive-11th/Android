package com.example.ljmpr.clone;

public class FriendsItem {

    private int iconDrawable;
    private String nameStr;
    private String senStr;

    public void setIcon (int icon) {
        iconDrawable = icon ;
    }

    public void setName (String name) {
        nameStr = name;
    }

    public void setSen (String sen) {
        senStr = sen;
    }

    public int getIcon() {
        return this.iconDrawable;
    }

    public String getName() {
        return this.nameStr;
    }

    public String getSen() {
        return this.senStr;
    }
}
