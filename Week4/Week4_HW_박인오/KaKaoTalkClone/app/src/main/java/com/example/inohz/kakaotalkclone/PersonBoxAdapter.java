package com.example.inohz.kakaotalkclone;

import android.app.Person;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonBoxAdapter extends BaseAdapter {
    ArrayList<PersonBox> personBoxArrayList = new ArrayList<>();

    public PersonBoxAdapter() {}

    @Override
    public int getCount() {
        return personBoxArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return personBoxArrayList.get(position);
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
            convertView = inflater.inflate(R.layout.items_friends, parent, false);
        }

        ImageView friendFace = convertView.findViewById(R.id.friendFace);
        TextView friendName = convertView.findViewById(R.id.friendName);
        TextView friendState = convertView.findViewById(R.id.friendState);

        PersonBox personBox = personBoxArrayList.get(position);

        friendFace.setImageResource(personBox.getFace());
        friendName.setText(personBox.getUserName());
        friendState.setText(personBox.getUserState());

        return convertView;
    }

    public void addItem(int friendFace, String friendName, String friendState) {
        PersonBox addPersonBox = new PersonBox(friendFace, friendName, friendState);
        personBoxArrayList.add(addPersonBox);
    }
}
