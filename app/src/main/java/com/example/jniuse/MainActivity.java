package com.example.jniuse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String TAG="NDKDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 创建JNI实例，并调用本地声明的方法
        String result = new Jni().sayHello();
        System.out.println(result);
        // 打印JNI本地方法返回的字符串。
        Log.d(TAG, "the string from JNC C '"+ result + "'");

    }
}