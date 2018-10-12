package com.example.owner.homework_week2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button text_change;
    LinearLayout largest;
    LinearLayout frist;
    LinearLayout Red;
    LinearLayout Bule;
    LinearLayout Yellow;
    TextView mond_text;
    private boolean bt_check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics dm = getApplicationContext().getResources().getDisplayMetrics();


        int width = dm.widthPixels;
        int height = dm.heightPixels;

        frist = findViewById(R.id.first_Linear);
        largest = findViewById(R.id.largest_Linear);
        text_change = findViewById(R.id.change_word_bt);
        mond_text = findViewById(R.id.text_view);
        Yellow = findViewById(R.id.YELLOW_Layout);
        Red = findViewById(R.id.RED_Layout);
        Bule = findViewById(R.id.BULE_Layout);



        if(width >=height) {
            width = height;
            largest.setOrientation(LinearLayout.HORIZONTAL);
        }

        else {
            height = width;
            largest.setOrientation(LinearLayout.VERTICAL);
        }

        frist.setLayoutParams(new LinearLayout.LayoutParams(width , height));
        text_change.setOnClickListener(mClickListener);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("CHECK","앱이 중지 되었습니다~");


    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i("CHECK","앱이 다시 실행되었습니다!");
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            if(bt_check==false) {
                mond_text.setText("뿅!!!");
                bt_check = true;
                Yellow.setBackgroundColor(Color.rgb(255,255,255));
                Red.setBackgroundColor(Color.rgb(255,255,255));
                Bule.setBackgroundColor(Color.rgb(255,255,255));
            }

            else {
                mond_text.setText("몬 드 리 안");
                bt_check = false;
                Yellow.setBackgroundColor(Color.rgb(255,255,51));
                Red.setBackgroundColor(Color.rgb(255,0,0));
                Bule.setBackgroundColor(Color.rgb(0,0,255));
            }
        }
    };
}
