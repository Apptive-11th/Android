package com.example.inohz.kakaotalkclone;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

public class FragmentFriends extends Fragment {
    public FragmentFriends() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_friends, container, false);

        ListView personBoxList = (ListView) layout.findViewById(R.id.fragment_friends_listview);
        PersonBoxAdapter personBoxAdapter = new PersonBoxAdapter();

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "앗..아..");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "동생",
                "뇌야 위만큼만 일해줘");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");

        personBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "상태 메세지");


        personBoxList.setAdapter(personBoxAdapter);
        return layout;
    }

}
