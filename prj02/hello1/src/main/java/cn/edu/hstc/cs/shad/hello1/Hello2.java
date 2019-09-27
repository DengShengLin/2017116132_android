package cn.edu.hstc.cs.shad.hello1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Hello2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("子页面");
        setContentView(R.layout.activity_hello2);
        settupClick();
        Log.d("myMsg", "onCreate hello2 execute");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("myMsg", "onPostResume hello2 execute");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("myMsg", "onStart hello2 execute");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("myMsg", "onStop hello2 execute");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("myMsg", "onDestroy hello2 execute");
    }

    public void settupClick(){
        Button button;
        button = findViewById(R.id.btn3);
        button.setOnClickListener(this);
        button = findViewById(R.id.btn4);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn3){
            finish();
        }
        if(view.getId()==R.id.btn4){
            Toast.makeText(Hello2.this,"少女祈祷中...",Toast.LENGTH_LONG).show();
        }
    }
}
