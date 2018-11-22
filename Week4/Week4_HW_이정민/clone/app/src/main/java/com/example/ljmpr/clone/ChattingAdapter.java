package com.example.ljmpr.clone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChattingAdapter extends BaseAdapter {

    private ArrayList<ChattingItem> chattingItemList = new ArrayList<ChattingItem>();

    public ChattingAdapter() {

    }

    @Override
    public int getCount() {
        return chattingItemList.size();
    }

    @Override
    public View getView (int pos, View convertView, ViewGroup parent) {

        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.chatting_item, parent, false);
        }

        ImageView imgImageView = (ImageView) convertView.findViewById(R.id.img);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title);
        TextView sentTextView = (TextView) convertView.findViewById(R.id.sent);

        ChattingItem chattingItem = chattingItemList.get(pos);

        imgImageView.setImageResource(chattingItem.getImg());
        titleTextView.setText(chattingItem.getTitleStr());
        sentTextView.setText(chattingItem.getSentStr());

        return convertView;
    }

    @Override
    public long getItemId (int pos) {
        return pos;
    }

    @Override
    public Object getItem (int pos) {
        return chattingItemList.get(pos);
    }

    public void addItem (int img, String title, String sent) {
        ChattingItem items = new ChattingItem();

        items.setImg(img);
        items.setTitle(title);
        items.setSent(sent);

        chattingItemList.add(items);
    }
}
