#### 创建桌面台球模块

1. mipmap插入背景图片`a.jpg`
2. res/values/string.xml定义变量
3. activity_main.xml使用framelayout布局并修改调用参数

```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@mipmap/a"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/start"
        android:layout_gravity="center"
        android:textSize="18sp"
        android:textColor="#115572"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</FrameLayout>
```



```xml
<resources>
    <string name="app_name">桌面台球</string>
    <string name="start">开始游戏</string>
</resources>

```

