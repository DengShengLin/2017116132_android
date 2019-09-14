package cn.edu.hstc.cs.shad.xmljavalayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView[] img = new ImageView[8];
    private int[] imagePath= new int[]{
            R.mipmap.a1,
            R.mipmap.a2,
            R.mipmap.a3,
            R.mipmap.a4,
            R.mipmap.a5,
            R.mipmap.a6,
            R.mipmap.a7,
            R.mipmap.a8
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout layout = (GridLayout) findViewById(R.id.layout);
        for (int i=0;i<imagePath.length;i++){
            img[i]=new ImageView(MainActivity.this);
            img[i].setImageResource(imagePath[i]);
            img[i].setPadding(2,2,2,2);
            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(116, 68);
            img[i].setLayoutParams(params);
            layout.addView(img[i]);
        }
    }
}
