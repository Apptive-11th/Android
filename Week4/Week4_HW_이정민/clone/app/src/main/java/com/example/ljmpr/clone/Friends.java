package com.example.ljmpr.clone;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Friends extends Fragment {

    FriendsAdapter adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView (@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment_friends,container,false);

        ListView friendsList = (ListView)layout.findViewById(R.id.listView_friends);
        FriendsAdapter friendsAdapter = new FriendsAdapter();

        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name1","Sentence1");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name2","Sentence2");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name3","Sentence3");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name4","Sentence4");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name5","Sentence5");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name6","Sentence6");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name7","Sentence7");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name8","Sentence8");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name9","Sentence9");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name10","Sentence10");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name11","Sentence11");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name12","Sentence12");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name13","Sentence13");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name14","Sentence14");
        friendsAdapter.addItem(R.drawable.baseline_person_black_18dp,"Name15","Sentence15");

        friendsList.setAdapter(friendsAdapter);

        return layout;
    }

    public void addItem (int icon, String name, String sen) {
        adapter.addItem(icon,name,sen);
    }
}
