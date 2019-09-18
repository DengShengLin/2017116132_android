package cn.edu.hstc.cs.shad.hello1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hello2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);
        Button button = findViewById(R.id.btn3);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn3){
            finish();
        }
        if(view.getId()==R.id.btn4){
            Toast.makeText(Hello2.this,"少女祈祷中...",Toast.LENGTH_SHORT).show();
        }
    }
}
