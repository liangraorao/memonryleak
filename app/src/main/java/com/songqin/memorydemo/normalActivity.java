package com.songqin.memorydemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;

/**
 * Created by admin on 2017/6/22.
 */

public class normalActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_activity);


    }
    private void leaktwo() {
        new MyThread().start();
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            while (true) {
                SystemClock.sleep(1000);
            }
        }
    }
}
