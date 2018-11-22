package com.example.ljmpr.clone;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public ViewPager viewPager;
    public TextView friends,chatting,news,plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));

        Button btn1 = (Button) findViewById(R.id.btn_friends);
        Button btn2 = (Button) findViewById(R.id.btn_chatting);
        Button btn3 = (Button) findViewById(R.id.btn_news);
        Button btn4 = (Button) findViewById(R.id.btn_plus);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    private void changeView(int position) {
        TextView textView1 = (TextView) findViewById(R.id.friends);
        TextView textView2 = (TextView) findViewById(R.id.chatting);
        TextView textView3 = (TextView) findViewById(R.id.news);
        TextView textView4 = (TextView) findViewById(R.id.plus);

        switch (position) {

            case 0:
                textView1.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.INVISIBLE);
                textView3.setVisibility(View.INVISIBLE);
                textView4.setVisibility(View.INVISIBLE);
                break;
            case 1:
                textView1.setVisibility(View.INVISIBLE);
                textView2.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.INVISIBLE);
                textView4.setVisibility(View.INVISIBLE);
                break;
            case 2:
                textView1.setVisibility(View.INVISIBLE);
                textView2.setVisibility(View.INVISIBLE);
                textView3.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.INVISIBLE);
                break;
            case 3:
                textView1.setVisibility(View.INVISIBLE);
                textView2.setVisibility(View.INVISIBLE);
                textView3.setVisibility(View.INVISIBLE);
                textView4.setVisibility(View.VISIBLE);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_friends:
                viewPager.setCurrentItem(0);
                break;
            case R.id.btn_chatting:
                viewPager.setCurrentItem(1);
                break;
            case R.id.btn_news:
                viewPager.setCurrentItem(2);
                break;
            case R.id.btn_plus:
                viewPager.setCurrentItem(3);
                break;
        }
    }
}
