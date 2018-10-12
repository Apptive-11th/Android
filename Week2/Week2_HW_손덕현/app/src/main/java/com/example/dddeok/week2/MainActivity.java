package com.example.dddeok.week2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView Text;
    private Button button1,button2;
    private FragmentManager fm;
    private FragmentTransaction tran;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreat()",Toast.LENGTH_SHORT).show();

        Text = findViewById(R.id.apptive);
        Text.setText("내마음대로 변경.");

        button1 = (Button) findViewById(R.id.fragment);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.lifecycle);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fragment:
                Fragment1 fr= new Fragment1();
                setFrag(fr);

                button1.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                Text.setVisibility(View.GONE);
                break;
            case R.id.lifecycle:
                if(count==0)
                    onPause();
                else if(count==1)
                    onResume();
                else {
                    finish();
                }
                count ++;
        }
    }
    public void setFrag(Fragment fr) {
        fm = getFragmentManager();
        tran = fm.beginTransaction();
        tran.replace(R.id.main_frame,fr);
        tran.commit();
    }

    //라이프 사이클 구현

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart()",Toast.LENGTH_SHORT).show();
    }
}
