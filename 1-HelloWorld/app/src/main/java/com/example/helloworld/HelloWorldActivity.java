package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

// 安卓书上教程第一章， Helloworld


public class HelloWorldActivity extends AppCompatActivity {
    private static final String TAG = "HelloWorldActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Log.d("HelloWorldActivity","oncaeate execute");
        Log.d(TAG, "onCreate: ");
    }
}