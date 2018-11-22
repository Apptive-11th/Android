package com.example.ljmpr.clone;

public class ChattingItem {

    private int img;
    private String titleStr;
    private String sentStr;

    public void setImg(int image) {
        img = image;
    }

    public void setTitle(String title) {
        titleStr = title;
    }

    public void setSent(String sentence) {
        sentStr = sentence;
    }

    public int getImg() {
        return this.img;
    }

    public String getTitleStr() {
        return this.titleStr;
    }

    public String getSentStr() {
        return this.sentStr;
    }
}
