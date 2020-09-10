package com.example.jniuse;

/**
 *  Creator: @By Sven 2020-02-26
 *  作用： java调用对应的C代码
 **/
public class Jni {
    {
        // 加载so库， 这个Hello名字就是最终编译产出的so的名字，也可以起其他的名字，但必须要和最终的so库名相同。
        System.loadLibrary("Hello");
    }
    /* *
     *  定义native方法
     *  调用C代码对应的方法
     *  @return
     */
    public native String sayHello();  // 声明了一个sayHello的本地接口。
}
