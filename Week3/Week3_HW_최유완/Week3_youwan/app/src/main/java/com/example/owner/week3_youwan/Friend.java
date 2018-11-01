package com.example.owner.week3_youwan;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;


public class Friend extends Fragment {

    public static Friend newInstance() {
        return new Friend();
    }

    ListView listview;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_friend,null);
        listview = (ListView) view.findViewById(R.id.list_view);


        user_adapter adapter = new user_adapter();//adapter 생성


        int i;

        for(i=0;i<20;++i) {
            Log.i("TEST","뭐여시벌1");
            adapter.addItem("https://cdn-images-1.medium.com/fit/c/36/36/0*HgJ2Psmia7PjQsp9.jpg","최유완","앱티브");
        }

        listview.setAdapter(adapter);//최종구현






        return view;
    }

}

