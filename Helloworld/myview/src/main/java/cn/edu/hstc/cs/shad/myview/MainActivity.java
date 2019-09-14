package cn.edu.hstc.cs.shad.myview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout=(FrameLayout)findViewById(R.id.mylayout);
        final RabbitView rabbit = new RabbitView(this);
        rabbit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                rabbit.bitmapY=event.getY();
                rabbit.bitmapX=event.getX();
                rabbit.invalidate();
                return true;
            }
        });
        frameLayout.addView(rabbit);
    }
}
