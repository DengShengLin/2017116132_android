package cn.edu.hstc.cs.shad.prj03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class hello3 extends AppCompatActivity implements View.OnClickListener{
    private static final String myMsg = "log";
    private static int objCount=0;
    private int mobjCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello3);
        setTitle("Hello3");
        //每次create活动+1
        objCount++;
        mobjCount=objCount;
        settupClick();
        Log.d(myMsg, "onCreate Hello3 execute"+mobjCount);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(myMsg, "onStart Hello3 execute"+mobjCount);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(myMsg, "onPause Hello3 execute"+mobjCount);

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(myMsg, "onStop Hello3 execute"+mobjCount);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(myMsg, "onResume Hello3 execute"+mobjCount);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //每次onDestroy活动-1
        objCount--;
        Log.d(myMsg, "onDestroy Hello3 execute"+mobjCount);

    }

    public void settupClick(){
        Button button;
        button = findViewById(R.id.button1);
        button.setOnClickListener(this);
        button = findViewById(R.id.button2);
        button.setOnClickListener(this);
        button = findViewById(R.id.button3);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button1){
            Intent intent=new Intent(hello3.this,hello1.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.button2){
            Intent intent=new Intent(hello3.this,hello2.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.button3){
            Intent intent=new Intent(hello3.this,hello3.class);
            startActivity(intent);
        }
    }
}
