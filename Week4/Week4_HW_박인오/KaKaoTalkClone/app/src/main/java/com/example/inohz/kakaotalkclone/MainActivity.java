package com.example.inohz.kakaotalkclone;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager viewPager;
    private static ImageButton tab_btn_friends, tab_btn_chat, tab_btn_news, tab_btn_more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);
        viewPager.setCurrentItem(0);

        tab_btn_friends = (ImageButton) findViewById(R.id.tab_btn_friends);
        tab_btn_chat = (ImageButton) findViewById(R.id.tab_btn_chat);
        tab_btn_news = (ImageButton) findViewById(R.id.tab_btn_news);
        tab_btn_more = (ImageButton) findViewById(R.id.tab_btn_more);

        tab_btn_friends.setOnClickListener(this);
        tab_btn_chat.setOnClickListener(this);
        tab_btn_news.setOnClickListener(this);
        tab_btn_more.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tab_btn_friends:
                viewPager.setCurrentItem(0);
                break;
            case R.id.tab_btn_chat:
                viewPager.setCurrentItem(1);
                break;
            case R.id.tab_btn_news:
                viewPager.setCurrentItem(2);
                break;
            case R.id.tab_btn_more:
                viewPager.setCurrentItem(3);
                break;
        }
    }
}
