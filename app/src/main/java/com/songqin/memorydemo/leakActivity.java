package com.songqin.memorydemo;


import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;

public class leakActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leak);
        leak();
    }

    private void leak(){
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    SystemClock.sleep(1000);
                }
            }
        }.start();
    }
}