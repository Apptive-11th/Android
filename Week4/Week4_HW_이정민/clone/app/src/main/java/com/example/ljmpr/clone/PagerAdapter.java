package com.example.ljmpr.clone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) {
            return new Friends();
        }
        else if(position==1) {
            return new Chatting();
        }
        else if(position==2) {
            return new News();
        }
        else if(position==3) {
            return new Plus();
        }
        else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
