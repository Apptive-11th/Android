package com.example.ljmpr.clone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FriendsAdapter extends BaseAdapter {

    private ArrayList<FriendsItem> friendsItemList = new ArrayList<FriendsItem>();

    public FriendsAdapter() {

    }

    @Override
    public int getCount() {
        return friendsItemList.size();
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.friends_item,parent,false);
        }

        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView nameTextView = (TextView) convertView.findViewById(R.id.Name);
        TextView senTextView = (TextView) convertView.findViewById(R.id.sentence);

        FriendsItem friendsItem = friendsItemList.get(position);

        iconImageView.setImageResource(friendsItem.getIcon());
        nameTextView.setText(friendsItem.getName());
        senTextView.setText(friendsItem.getSen());

        return convertView;
    }

    @Override
    public long getItemId (int position) {
        return position;
    }

    @Override
    public Object getItem (int position) {
        return friendsItemList.get(position);
    }

    public void addItem (int icon, String name, String sen) {
        FriendsItem item = new FriendsItem();

        item.setIcon(icon);
        item.setName(name);
        item.setSen(sen);

        friendsItemList.add(item);
    }
}
