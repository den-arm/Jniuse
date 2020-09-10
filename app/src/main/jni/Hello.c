//
// Created by den on 2020/09/04.
//
#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

/*
*  jstring:  返回值
*  Java_全类名_方法名
*  JNIEnv: 里面有很多方法
* jobject: 谁调用了这个方法就是谁的事例com.example.jniuse.Jni.sayHello
*/
jstring Java_com_example_jniuse_Jni_sayHello(JNIEnv *env, jobject jobj) {
    char *text = "I am from c";
    return (*env)->NewStringUTF(env, text);
}

