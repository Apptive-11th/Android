package com.example.inohz.kakaotalkclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChatBoxAdapter extends BaseAdapter {
    ArrayList<ChatBox> chatBoxArrayList = new ArrayList<>();

    public ChatBoxAdapter() {}

    @Override
    public int getCount() {
        return chatBoxArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return chatBoxArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.items_chat, parent, false);
        }

        ImageView chatFace = convertView.findViewById(R.id.chatFace);
        TextView chatName = convertView.findViewById(R.id.chatName);
        TextView chatLast = convertView.findViewById(R.id.chatLast);
        TextView chatTime = convertView.findViewById(R.id.chatTime);
        TextView chatUnread = convertView.findViewById(R.id.chatUnread);

        ChatBox chatBox = chatBoxArrayList.get(position);

        chatFace.setImageResource(chatBox.getChatFace());
        chatName.setText(chatBox.getChatName());
        chatLast.setText(chatBox.getChatLast());
        chatTime.setText(chatBox.getChatTime());
        chatUnread.setText(chatBox.getChatUnread());

        return convertView;
    }

    public void addItem(int chatFace, String chatName, String chatLast, String chatTime, String chatUnread) {
        ChatBox addChatBox = new ChatBox(chatFace, chatName, chatLast, chatTime, chatUnread);
        chatBoxArrayList.add(addChatBox);
    }
}
