package apptive.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Life Cycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Oncreate","실행됨"); //LogCat에 빨간문구로 띄워줌. (에러표시할 때)

        TextView test = findViewById(R.id.test);
        test.setText("Apptive 화이링!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Resume","실행됨");
    }
}
