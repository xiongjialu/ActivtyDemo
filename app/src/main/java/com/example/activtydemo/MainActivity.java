package com.example.activtydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TAG="tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"MainActivity -->onCreate(创建)");
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivty.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"MainActivity -->onStart(运行)");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"MainActivity -->onResume(获取焦点)");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"MainActivity -->onPause(失去焦点)");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"MainActivity -->onStop(暂停)");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"MainActivity -->onDestroy(销毁)");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"MainActivity -->onRestart(重新开始)");
    }
}
