package com.example.owner.week3_youwan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class viewPagerAdapter extends FragmentPagerAdapter {
    public viewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return new Friend();

        }
        else if (i==1){
            return new Chat();
        }
        else if (i==2){
            return new wallShape();
        }
        else if (i==3){
            return new More();
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
