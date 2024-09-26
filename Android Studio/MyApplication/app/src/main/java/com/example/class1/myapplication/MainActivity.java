package com.example.class1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "brooklyn";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, msg:"It is in onCreate now");
    }
    //Christopher Guzowski
    @Override
    proteced void onStart() {
        super.onStart();
        Log.i(TAG,"Hey it is onStart now");
    }
    //Christopher Guzowski
    @Override
    proteced void onResume() {
        super.onResume();
        Log.i(TAG, msg:"Hey it is onResume now");
    }
    //Christopher Guzowski
    @Override
    proteced void onDestroy() {
        super.onDestroy();
        Log.i(TAG, msg:"Hey it is onDestroy now");
    }
}
