package com.example.inohz.apptive_lab;


import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager) findViewById(R.id.vp);
        Button btn_friends = (Button) findViewById(R.id.button_friends);
        Button btn_chat = (Button) findViewById(R.id.button_chat);
        Button btn_more = (Button) findViewById(R.id.button_more);

        vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        vp.setCurrentItem(0);

        btn_friends.setOnClickListener(movePageListener);
        btn_friends.setTag(0);
        btn_chat.setOnClickListener(movePageListener);
        btn_chat.setTag(1);
        btn_more.setOnClickListener(movePageListener);
        btn_more.setTag(2);
    }


    View.OnClickListener movePageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v){
            int tag = (int) v.getTag();
            vp.setCurrentItem(tag);
        }
    };

    private class pagerAdapter extends FragmentStatePagerAdapter {
        public pagerAdapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }
        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            switch(position) {
                case 0:
                    return new main_fragment();
                case 1:
                    return new chat_fragment();
                case 2:
                    return new more_fragment();
                default:
                    return null;
            }
        }
        @Override
        public int getCount() {
            return 3;
        }
    }


}
