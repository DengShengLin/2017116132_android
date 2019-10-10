# 广播接收器

> 总的来说，就是接受各种变化并产生一个事件，比如电池电量变化以及网络发生变化。

动态注册的广播接收器一定都要取消注册才行，这里我们是在 onDestroy()
方法中通过调用 unregisterReceiver()方法来实现的。

查询系统的网络状态就是需要声明权限的。打开
AndroidManifest.xml 文件，在里面加入如下权限就可以查询系统网络状态了：

```xml
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
```

动态注册比较灵活，但是必须在程序启动后才能进行广播。那么有没有什么办法可以让程序在未启动的情况下就能接收到广播
呢？这就需要使用静态注册的方式了。

### 接收一条开机广播

功能描述：当收到这条广播时就可以在 onReceive()方法里
执行相应的逻辑，从而实现开机启动的功能。

新建一个 BootCompleteReceiver 继承自BroadcastReceiver。

```java
public class BootCompleteReceiver extends BroadcastReceiver {
@Override
public void onReceive(Context context, Intent intent) {
Toast.makeText(context, "Boot Complete", Toast.LENGTH_LONG).show();
}
}
```

```xml
<uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />

<receiver android:name=".BootCompleteReceiver" >
	<intent-filter>
		<action android:name="android.intent.action.BOOT_COMPLETED" />
	</intent-filter>
</receiver>
```

<u>需要注意的是，不要在 onReceive()方法中添加过多的逻辑或者进行任何的耗时操作，因为在广播接收器中是不允许开启线程的，当 onReceive()方法运行了较长时间而没有结束时，程序就会报错。</u>
<u>因此广播接收器更多的是扮演一种打开程序其他组件的角色，比如创建一条状态栏通知，或者启动一个服务等.</u>

# 发送标准广播

总共三步：

- 定义

- 注册

- 使用

  

# 发送有序广播

**在我们应用程序内发出的广播，其他的应用程序应该也是可以收到的。**

思路：两个项目接受同一条广播，所以当触发一个项目的广播事件的时候会出现两条广播。

#### sendOrderedBroadcast()方法发送有序广播。

> 接收两个参数，第一个参数仍然是Intent，第二个参数是一个与权限相关的字符串，这里传入 null就行了。

####  abortBroadcast()方法，就表示将这条广播截断。



# 使用本地广播

本地广播的用法并不复杂，主要就是使用了一个 LocalBroadcastManager 来对广播进行管理，并提供了发送广播和注册广播接收器的方法。

~~另外还有一点需要说明，本地广播是无法通过静态注册的方式来接收的。其实这也完全可以理解，因为静态注册主要就是为了让程序在未启动的情况下也能收到广播，而发送本地广播时，**我们的程序肯定是已经启动了**，因此也完全不需要使用静态注册的功能。~~

```
最后我们再来盘点一下使用本地广播的几点优势吧。

1. 可以明确地知道正在发送的广播不会离开我们的程序，因此不需要担心机密数据泄
   漏的问题。
2. 其他的程序无法将广播发送到我们程序的内部，因此不需要担心会有安全漏洞的隐
   患。
3. 发送本地广播比起发送系统全局广播将会更加高效。
```



# 广播的最佳实践——实现强制下线功能



点击按钮发送一条广播，下线的逻辑写在广播接收器里面，而不是mainActivity中，这样的话可以在任何界面使用。

同时强制下线弹出只有一个按钮，点击确定按钮事件：触发活动销毁同时返回桌面。





































# 课堂记录

### 如何使用ui?

- 屏幕布局分割好

- 左右距离确定（层级关系）

- 所占比例关系

- 按钮，颜色等需求

  





