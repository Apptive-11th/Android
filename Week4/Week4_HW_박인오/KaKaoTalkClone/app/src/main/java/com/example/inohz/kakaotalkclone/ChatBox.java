package com.example.inohz.kakaotalkclone;

public class ChatBox {
    int chatFace;
    String chatName, chatLast, chatTime, chatUnread;

    public ChatBox(int chatFace, String chatName, String chatLast, String chatTime, String chatUnread) {
        this.chatFace = chatFace;
        this.chatName = chatName;
        this.chatLast = chatLast;
        this.chatTime = chatTime;
        this.chatUnread = chatUnread;
    }

    public int getChatFace() {
        return chatFace;
    }

    public void setChatFace(int chatFace) {
        this.chatFace = chatFace;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getChatLast() {
        return chatLast;
    }

    public void setChatLast(String chatLast) {
        this.chatLast = chatLast;
    }

    public String getChatTime() {
        return chatTime;
    }

    public void setChatTime(String chatTime) {
        this.chatTime = chatTime;
    }

    public String getChatUnread() {
        return chatUnread;
    }

    public void setChatUnread(String chatUnread) {
        this.chatUnread = chatUnread;
    }
}
