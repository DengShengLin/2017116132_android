package cn.edu.hstc.cs.shad.prj04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button map = findViewById(R.id.map);
        Button call = findViewById(R.id.call);
        Button browser = findViewById(R.id.browser);
        map.setOnClickListener(onClickListener);
        call.setOnClickListener(onClickListener);
        browser.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener=new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            Button button= (Button) view;
            switch (button.getId()){
                case R.id.browser:
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.baidu.com"));
                    //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    break;
                case R.id.call:
                    intent.setAction(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:15363390250"));
                    startActivity(intent);
                    break;
                case R.id.map:
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("geo:38.899533,-77.036476"));
                    startActivity(intent);
                    break;

            }

        }
    };
}
