package com.example.collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashMap;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);


    }
}

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            resultMap.put(name[i], yearning[i]);
        };

        for (int i = 0; i < photo.length; i++) {
            String[] person = photo[i];
            int score = 0;
            for (int j = 0; j < person.length; j++) {
                String personName = person[j];
                if(resultMap.containsKey(personName)) {
                    score += resultMap.get(personName);
                };
            };
            answer[i] = score;
        };

        return answer;
    };
};