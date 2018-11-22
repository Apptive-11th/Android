package com.example.ljmpr.clone;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Friends extends ListFragment {

    FriendsAdapter adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView (@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        adapter = new FriendsAdapter();
        setListAdapter(adapter);

        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name1","Sentence1");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name2","Sentence2");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name3","Sentence3");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name4","Sentence4");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name5","Sentence5");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name6","Sentence6");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name7","Sentence7");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name8","Sentence8");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name9","Sentence9");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name10","Sentence10");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name11","Sentence11");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name12","Sentence12");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name13","Sentence13");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name14","Sentence14");
        adapter.addItem(R.drawable.baseline_person_black_18dp,"Name15","Sentence15");

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void addItem (int icon, String name, String sen) {
        adapter.addItem(icon,name,sen);
    }
}
