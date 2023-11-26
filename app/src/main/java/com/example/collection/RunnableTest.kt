package com.example.collection

import android.util.Log

class RunnableTest : Runnable {
    val TAG = "test"
    override fun run() {
        var i = 0;
        while (i < 10) {
            i += 1;
            Log.d(TAG, "run: i=$i");
        };
    };
}