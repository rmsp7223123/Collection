package com.example.collection

import android.util.Log

class ThreadTest : Thread() { // Thread를 상속받으면 다른 클래스를 상속 받을 수 없음
    val TAG = "test"

    override fun run() {
        var i = 0;
        while (i < 10) {
            i += 1;
            Log.d(TAG, "run: i = $i");
        };
    };
};