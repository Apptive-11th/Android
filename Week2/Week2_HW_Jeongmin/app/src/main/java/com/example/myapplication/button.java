package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void OnBackButtonClicked(View v)
    {
        Toast.makeText(getApplicationContext(),"push the Back", Toast.LENGTH_LONG.show());
        finish();
    }
}
