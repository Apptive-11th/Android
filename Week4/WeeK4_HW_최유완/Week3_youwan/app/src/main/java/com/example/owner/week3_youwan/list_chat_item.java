package com.example.owner.week3_youwan;

public class list_chat_item {
    String img;
    String img1;
    String img2;
    String img3;
    String img4;
    String chat_name;
    String last_word;
    int num;


    public list_chat_item(String img, String chat_name, String last_word, int num) {
        this.img = img;
        this.chat_name = chat_name;
        this.last_word = last_word;
        this.num = num;
    }
    public list_chat_item(String img1, String img2, String img3, String img4, String chat_name, String last_word, int num) {
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.chat_name = chat_name;
        this.last_word = last_word;
        this.num = num;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getChat_name() {
        return chat_name;
    }

    public void setChat_name(String chat_name) {
        this.chat_name = chat_name;
    }

    public String getLast_word() {
        return last_word;
    }

    public void setLast_word(String last_word) {
        this.last_word = last_word;
    }

    public int getNum() { return num; }

    public void setNum(int num) { this.num = num; }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }
}
