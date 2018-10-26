package com.example.inohz.apptive_lab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class main_fragment extends Fragment {
    public main_fragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_friends, container, false);

        ListView listView = (ListView) layout.findViewById(R.id.mainlistview);
        UserAdapter useradapter = new UserAdapter();
        useradapter.addItem(R.drawable.ic_launcher_background, "사람1", "내용1");
        useradapter.addItem(R.drawable.ic_launcher_background, "사람2", "내용2");
        listView.setAdapter(useradapter);
        return  layout;
    }
}
