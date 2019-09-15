#### 喜马拉雅登录页

- 知识点：使用表格布局

四行四列，效果如下：



![2019-09-15_16-48-37](../../img/2019-09-15_16-48-37.png)

```xml
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@mipmap/biaoge"
    android:stretchColumns="0,3"
    tools:context=".MainActivity">

    <TableRow android:paddingTop="350dp">
        <TextView />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="账 号："
            android:textSize="18sp"
            android:gravity="center_horizontal"
            />

        <EditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="邮箱或手机号"/>

        <TextView />
    </TableRow>
    <TableRow >
        <TextView />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="密 码："
            android:textSize="18sp"
            android:gravity="center_horizontal"
            />

        <EditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="输入6~12位密码"/>

        <TextView />
    </TableRow>
    <TableRow >
        <TextView />
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="注 册"
            />

        <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="登 录"
            android:background="#FF8247"
            />

        <TextView />
    </TableRow>
    <TableRow android:paddingTop="20dp">
        <TextView />
        <TextView />
        <TextView
            android:text="忘记密码"
            android:layout_height="wrap_content"
            android:layout_width="wrap_content"
            android:textColor="#FF4500"
            android:gravity="right"
            />
        <TextView />
    </TableRow>
</TableLayout>
```

