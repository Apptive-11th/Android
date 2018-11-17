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

public class FragmentChat extends Fragment {
    public FragmentChat() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_chat, container, false);

        ListView chatBoxList = (ListView) layout.findViewById(R.id.fragment_chat_listview);
        ChatBoxAdapter chatBoxAdapter = new ChatBoxAdapter();

        chatBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "다이나모",
                "게시물 들어가는 액티비티...",
                "16:55",
                "");

        chatBoxAdapter.addItem(
                R.drawable.baseline_search_black_18dp,
                "박인오",
                "마지막 채팅 내용",
                "15:43",
                "13");

        chatBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "마지막 채팅 내용",
                "15:43",
                "4");

        chatBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "마지막 채팅 내용",
                "15:43",
                "6");

        chatBoxAdapter.addItem(
                R.drawable.baseline_chat_bubble_black_18dp,
                "박인오",
                "마지막 채팅 내용",
                "15:43",
                "");

        chatBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "마지막 채팅 내용",
                "15:43",
                "");

        chatBoxAdapter.addItem(
                R.drawable.baseline_more_horiz_black_18dp,
                "박인오",
                "마지막 채팅 내용",
                "15:43",
                "");

        chatBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "마지막 채팅 내용",
                "15:43",
                "");

        chatBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "마지막 채팅 내용",
                "15:43",
                "");

        chatBoxAdapter.addItem(
                R.drawable.baseline_account_circle_black_18dp,
                "박인오",
                "마지막 채팅 내용",
                "15:43",
                "");


        chatBoxList.setAdapter(chatBoxAdapter);

        return layout;
    }
}
