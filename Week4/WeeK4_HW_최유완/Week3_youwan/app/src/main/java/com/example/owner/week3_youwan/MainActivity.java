package com.example.owner.week3_youwan;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static LinearLayout friend_page_layout;
    static LinearLayout chat_page_layout;

    public static void image_change(int index){

        if (index == 0) {
            Log.i("TEsT","page2_linear");
            friend_page_layout.setVisibility(View.VISIBLE);
            chat_page_layout.setVisibility(View.GONE);


        }
        else if(index == 1) {
            Log.i("TEsT","page3_linear");
            friend_page_layout.setVisibility(View.GONE);
            chat_page_layout.setVisibility(View.VISIBLE);


        }


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        friend_page_layout=(LinearLayout)findViewById(R.id.friend_page);
        chat_page_layout=(LinearLayout)findViewById(R.id.chat_page);

        final ViewPager viewpager = (ViewPager)findViewById(R.id.view_pager);
       viewpager.setAdapter(new viewPagerAdapter(getSupportFragmentManager()));//지금 뷰페이저를 관리하고있는 매니저 소환

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigationView);
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);

        for (int i = 0; i < menuView.getChildCount(); i++) {
            final View iconView = menuView.getChildAt(i).findViewById(android.support.design.R.id.icon);
            final ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
            final DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            layoutParams.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 32, displayMetrics);
            layoutParams.width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 32, displayMetrics);
            iconView.setLayoutParams(layoutParams);
        }

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        int id = item.getItemId();
                        Fragment fragment = null;

                        if (id == R.id.menuitem_bottombar_frist) {
                            viewpager.setCurrentItem(0);
                        }
                        else if (id == R.id.menuitem_bottombar_second) {
                            viewpager.setCurrentItem(1);
                        }
                        else if (id == R.id.menuitem_bottombar_third) {
                            viewpager.setCurrentItem(2);
                        }
                        else if (id == R.id.menuitem_bottombar_forth) {
                            viewpager.setCurrentItem(3);

                        }


                        return true;

                    }
                });
    }


}
