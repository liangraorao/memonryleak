package com.songqin.memorydemo;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by admin on 2017/6/21.
 */

public class shakeAcitvity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shake);

        String s = "";
        for(int i = 0;i < 100000; i++){
            s += "I am songqin";
        }
    }
}
