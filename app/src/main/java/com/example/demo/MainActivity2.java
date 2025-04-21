package com.example.demo;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity2 14 ", "打印数据 onCreate");
        setContentView(R.layout.activity_main2);
        Log.d("MainActivity2", "打印数据 onCreate");

    }
}
