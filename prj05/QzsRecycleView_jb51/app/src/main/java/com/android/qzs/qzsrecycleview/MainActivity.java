package com.android.qzs.qzsrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;//子项
    private ImageView iv_add;//添加按钮
    private RecycleAdapter adapter;//引用适配器
    private List<String> list = new ArrayList<String>();//list集合
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();//初始化布局，找到添加按钮和recycleview
        initRecycle();//调用方法
        iv_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //添加自带默认动画
                    adapter.addData(list.size());
        }
        });
    }
    private void initRecycle() {
        //  纵向滑动
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
//      获取数据，向适配器传数据，绑定适配器
        list = initData();
        adapter = new RecycleAdapter(MainActivity.this, list);
        mRecyclerView.setAdapter(adapter);
//      添加动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }
    private void initView() {
        iv_add = (ImageView) findViewById(R.id.iv_add);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }

    protected ArrayList<String> initData() {
        ArrayList<String> mDatas = new ArrayList<String>();
        for (int i = 0; i < 1; i++) {
            mDatas.add("我是备忘录" + i);
        }
        return mDatas;
    }
}
