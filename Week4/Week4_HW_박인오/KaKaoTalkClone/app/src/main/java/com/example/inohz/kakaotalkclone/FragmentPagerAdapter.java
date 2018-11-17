package com.example.inohz.kakaotalkclone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    public FragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentFriends();
            case 1:
                return new FragmentChat();
            case 2:
                return new FragmentNews();
            case 3:
                return new FragmentMore();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
