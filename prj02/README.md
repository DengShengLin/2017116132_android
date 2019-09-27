### 安卓的生命周期

Activity生命周期最主要的一些方法，启动后依次执行：

onCreate –> onStart –> onResume –> onPause –> onStop –> onDestroy



![060009291302389](../static/060009291302389.png)


### 按钮跳转

- 作业：两个按钮实现活动之间的跳转

- 如何使用debug模式，通过使用快捷键F7 F8 F9 ，

- 正则表达式的使用，主要是搜索文件

![20190918093335](../static/20190918093335.png)

![20190918093358](../static/20190918093358.png)

> 思路是：
>
> 1. hello1类实现onclickListener这个监听器
> 2. 重写onclick()方法，判断是点击了哪个View，添加intent意图，然后启动活动。
> 3. 装配响应事件settupClick()：创建按钮对象,该对象先后指向两个按钮，然后创建监听事件





```java
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

```



```java
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

```



