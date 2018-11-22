package com.example.ljmpr.clone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Plus extends Fragment {

    public Plus() {

    }

    @Nullable
    @Override
    public View onCreateView (@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_plus, container, false);

        return view;
    }
}
