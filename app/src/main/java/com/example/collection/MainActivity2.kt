package com.example.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.collection.databinding.ActivityMain2Binding
import kotlin.concurrent.thread

class MainActivity2 : AppCompatActivity() {
    val TAG = "test"
    private lateinit var binding : ActivityMain2Binding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        thread(start = true) { // 메인 스레드와 별개로 작동하는 스레드
            // 메인스레드가 아닌 스레드에서는 UI에 접근 할 수 없음
            var i = 0;
            while (i < 10) {
                i += 1;
                runOnUiThread { // UI에 접근 가능
                    binding.tvTest1.text = "카운트 : $i"
                }
                Log.d(TAG, "onCreate: i = $i");
            };
        };
    };
}