package com.example.activtydemo;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by _熊家路 on 2018/4/8.
 */

public class SecondActivty extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
}
