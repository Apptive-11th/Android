package com.example.inohz.apptive_wk2_hw1;

import android.arch.lifecycle.Lifecycle;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button button;
    LinearLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        background = (LinearLayout) findViewById(R.id.mainActivity);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.rgb(0xFF, 0xFF, 0x00));
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        background.setBackgroundColor(Color.rgb(0x00, 0x00, 0x00));
    }

    @Override
    public void onResume() {
        super.onResume();
        background.setBackgroundColor(Color.rgb(0xFF, 0xFF, 0xFF));
    }
}
