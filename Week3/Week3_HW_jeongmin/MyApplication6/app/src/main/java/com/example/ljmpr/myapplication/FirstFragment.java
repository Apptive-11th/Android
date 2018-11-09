package com.example.ljmpr.myapplication;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FirstFragment extends android.support.v4.app.Fragment {

    public FirstFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    ListView List_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState)
    {
        View layout = inflater.inflate(R.layout.first_fragment, container, false);

        List_view = layout.findViewById(R.id.List_view);
        dataSetting();
        return layout;
    }

    private void dataSetting()
    {
        Adapter adapter = new Adapter();

        for(int i=0; i<10; i++){
            adapter.addItem(ContextCompat.getDrawable(this.getContext(),R.drawable.icon),"name"+i,"contents"+i);
        }

    }
}
