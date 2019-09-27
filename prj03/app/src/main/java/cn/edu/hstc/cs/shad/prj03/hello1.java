package cn.edu.hstc.cs.shad.prj03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class hello1 extends AppCompatActivity implements View.OnClickListener{

    private static final String myMsg = "log";
    private static int objCount=0;
    private int mobjCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello1);
        setTitle("Hello1");
        //每次create活动+1
        objCount++;
        mobjCount=objCount;
        settupClick();
        Log.d(myMsg, "onCreate hello1 execute"+mobjCount);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(myMsg, "onStart hello1 execute"+mobjCount);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(myMsg, "onPause hello1 execute"+mobjCount);

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(myMsg, "onStop hello1 execute"+mobjCount);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(myMsg, "onResume hello1 execute"+mobjCount);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //每次onDestroy活动-1
        objCount--;
        Log.d(myMsg, "onDestroy hello1 execute"+mobjCount);

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
            Intent intent=new Intent(hello1.this,hello1.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.button2){
            Intent intent=new Intent(hello1.this,hello2.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.button3){
            Intent intent=new Intent(hello1.this,hello3.class);
            startActivity(intent);
        }
    }
}
