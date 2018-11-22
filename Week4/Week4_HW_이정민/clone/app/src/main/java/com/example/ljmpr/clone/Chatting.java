package com.example.ljmpr.clone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Chatting extends ListFragment {

    ChattingAdapter adapter;

    public Chatting() {

    }

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        adapter = new ChattingAdapter();
        setListAdapter(adapter);

        adapter.addItem(R.drawable.baseline_person_outline_black_18dp,"Title1", "Sentences1");
        adapter.addItem(R.drawable.baseline_person_outline_black_18dp,"Title2", "Sentences2");
        adapter.addItem(R.drawable.baseline_person_outline_black_18dp,"Title3", "Sentences3");
        adapter.addItem(R.drawable.baseline_person_outline_black_18dp,"Title4", "Sentences4");
        adapter.addItem(R.drawable.baseline_person_outline_black_18dp,"Title5", "Sentences5");

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
