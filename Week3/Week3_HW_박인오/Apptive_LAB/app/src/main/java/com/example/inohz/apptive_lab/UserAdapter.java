package com.example.inohz.apptive_lab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends BaseAdapter {

    ArrayList<User> userList = new ArrayList<User>();
    public UserAdapter() {
    }

    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int i) {
        return userList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item, viewGroup, false);
        }

        ImageView img = view.findViewById(R.id.user_image);
        TextView name = view.findViewById(R.id.user_name);
        TextView balloon = view.findViewById(R.id.user_balloon);

        User user = userList.get(i);
        img.setImageResource(user.getImage());
        name.setText(user.getName());
        balloon.setText(user.getBalloon());
        return view;
    }

    public void addItem(int img, String name, String balloon) {
        User new_user = new User(img, name, balloon);
        userList.add(new_user);
    }
}
