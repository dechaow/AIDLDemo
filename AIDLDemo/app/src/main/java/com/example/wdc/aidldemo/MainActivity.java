package com.example.wdc.aidldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wdc.bean.BookManager;

public class MainActivity extends AppCompatActivity {

    private BookManager mBookManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
