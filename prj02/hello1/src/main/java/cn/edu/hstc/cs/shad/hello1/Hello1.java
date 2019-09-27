package cn.edu.hstc.cs.shad.hello1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Hello1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello1);
        settupClick();
        Log.d("myMsg", "onCreate hello1 execute");
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("myMsg", "onStart hello1 execute");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("myMsg", "onStop hello1 execute");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("myMsg", "onPostResume hello1 execute");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("myMsg", "onDestroy hello1 execute");

    }

    public void settupClick(){
        Button button;
        button = findViewById(R.id.btn1);
        button.setOnClickListener(this);
        button = findViewById(R.id.btn2);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn1){
            Intent intent=new Intent(Hello1.this,Hello2.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.btn2){
            Toast.makeText(Hello1.this,"没什么用的~点旁边的按钮吧",Toast.LENGTH_LONG).show();
        }
    }
}
