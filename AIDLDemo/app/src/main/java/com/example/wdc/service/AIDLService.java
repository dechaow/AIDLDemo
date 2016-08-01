package com.example.wdc.service;

import android.app.Service;
import android.content.Intent;
import android.nfc.Tag;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.wdc.bean.Book;
import com.example.wdc.bean.BookManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wdc on 2016/8/1.
 */
public class AIDLService extends Service {

    public static final String TAG = Service.class.getClass().getSimpleName();

    private List<Book> books = new ArrayList<>();

    private final BookManager.Stub mBookManager = new BookManager.Stub(){
        @Override
        public List<Book> getBooks() throws RemoteException {
            synchronized (this){
                Log.e(TAG,"invoking getBooks() method , now the list is : " + books.toString());
            }
            return new ArrayList<>();
        }

        @Override
        public void addBook(Book book) throws RemoteException {
            synchronized (this){
                if (books == null){
                    books = new ArrayList<>();
                }
                if (book == null){
                    Log.e(TAG,"Book is null In");
                    book = new Book();
                }
                book.setPrice(200);
                if (!books.contains(book)){
                    books.add(book);
                }
                //打印mBooks列表，观察客户端传过来的值
                Log.e(TAG, "invoking addBooks() method , now the list is : " + books.toString());
            }
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e(getClass().getSimpleName(), String.format("on bind,intent = %s", intent.toString()));
        return mBookManager;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Book book = new Book();
        book.setName("Hello AIDL");
        book.setPrice(2000);
        books.add(book);
    }
}
