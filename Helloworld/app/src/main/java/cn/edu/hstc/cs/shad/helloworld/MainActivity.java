package cn.edu.hstc.cs.shad.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("tag","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("tag","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("tag","onStop");
    }
}
