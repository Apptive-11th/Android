package com.example.ljmpr.clone;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Chatting extends Fragment {

    public Chatting() {

    }

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment_chatting, container, false);

        ListView chattingList = (ListView)layout.findViewById(R.id.listView_chatting);
        final ChattingAdapter chattingAdapter = new ChattingAdapter();

        chattingAdapter.addItem(R.drawable.baseline_person_outline_black_18dp,"title1","sentence1");
        chattingAdapter.addItem(R.drawable.baseline_person_outline_black_18dp,"title2","sentence2");
        chattingAdapter.addItem(R.drawable.baseline_person_outline_black_18dp,"title3","sentence3");
        chattingAdapter.addItem(R.drawable.baseline_person_outline_black_18dp,"title4","sentence4");
        chattingAdapter.addItem(R.drawable.baseline_person_outline_black_18dp,"title5","sentence5");
        chattingAdapter.addItem(R.drawable.baseline_person_outline_black_18dp,"title6","sentence6");
        chattingAdapter.addItem(R.drawable.baseline_person_outline_black_18dp,"title7","sentence7");
        chattingAdapter.addItem(R.drawable.baseline_person_outline_black_18dp,"title8","sentence8");
        chattingAdapter.addItem(R.drawable.baseline_person_outline_black_18dp,"title9","sentence9");
        chattingAdapter.addItem(R.drawable.baseline_person_outline_black_18dp,"title10","sentence10");

        chattingList.setAdapter(chattingAdapter);

        chattingList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id) {

                Intent intent = new Intent(Chatting.this, ChattingPage.class);
                startActivity(intent);
            }
        });

        return layout;
    }
}
