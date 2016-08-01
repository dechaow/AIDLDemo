// BookManager.aidl
package com.example.wdc.bean;

import com.example.wdc.bean.Book;

interface BookManager {

    //这里写的方法都没有修饰符

    List<Book> getBooks();

    //传参时除了java基本数据类型以及String，CharSequence类型外
    //都要加定向tag  in/inout/out

    void addBook(in Book book);
}
