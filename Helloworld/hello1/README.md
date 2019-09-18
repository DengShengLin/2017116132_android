

### 熟悉安卓的生命周期

 - 熟悉各个方法的使用

- 作业：两个按钮实现活动之间的跳转

- 如何使用debug模式，通过使用快捷键F7 F8 F9 ，

- 正则表达式的使用，主要是搜索文件







> 按钮跳转思路是：
>
> 1. hello1类实现onclickListener这个监听器
> 2. 重写onclick()方法，判断是点击了哪个View，添加intent意图，然后启动活动。
> 3. 装配响应事件：创建按钮对象,该对象先后指向两个按钮，然后创建事件



预览图：

![20190918093335](../../img/20190918093335.png)



![20190918093358](../../img/20190918093358.png)

```java
package cn.edu.hstc.cs.shad.hello1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hello1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello1);
        Button button = findViewById(R.id.btn1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn1){
            Intent intent=new Intent(Hello1.this,Hello2.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.btn2){
            Toast.makeText(Hello1.this,"没什么用的~点旁边的按钮吧",Toast.LENGTH_SHORT).show();
        }
    }
}

```





```java
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

```







