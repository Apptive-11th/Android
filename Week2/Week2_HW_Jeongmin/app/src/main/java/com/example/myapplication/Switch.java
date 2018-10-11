package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;

public class Switch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        Switch sb = (Switch) findViewById(R.id.sb);
        final TextView tv = (TextView) findViewById(R.id.tv);

        sb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public  void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tv.setBackgroundColor(Color.GREEN);
                    tv.setText("Switch is on.");
                }
                else {
                    tv.setBackgroundColor(Color.RED);
                    tv.setText("Switch is off");
                }
            }
        });
    }
}
