// book.aidl
package com.example.wdc.bean;

// Declare any non-default types here with import statements
//这个文件的作用是引入了一个序列化对象的Book供其他的aidl文件使用
//book.aidl 与 book.java 包名应当是一样的
parcelable Book;

