package com.example.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // list
        // Array같이 안에 값이 있는 리스트
        // list안에 string이나 Int가 들어갈 수 있고 ListOf를 쓰면 읽기만 가능한 array가 만들어지고
        // arraylistOf로 만들어주면 편집이 가능

        //변경 불가능
        val names = listOf("Sean", "John"); //읽기만 가능

        //변경 가능
        val names2 = arrayListOf("Sean", "John", "James");
        names2.add("Tom"); // 추가


        // Map
        // data structure중의 하나로 key-value 두 개로 구성된 페어로 나타낼 수 있는 collection
        // Key와 value값으로 데이터가 이루어져 있음
        // Key는 중복될 수 없고, value는 중복 가능

        //변경불가능한 map 사용 예제 - 사이즈가 변할수없고 읽기만 가능
        fun main() {
            //map은 "key" to value 형식으로 데이터를 저장
            val ageMapper = mapOf("himanshu" to 26, "john" to 30); //이제부터 변경 불가능
            println(ageMapper["himanshu"]); //ageMapper안에 이름을 써주면 vale값인 26을 리턴합니다.
            println(ageMapper.size); //2를 리턴

            // ageMapper.put //read only기 때문에 map에 추가할수없습니다.

            //변경 가능한 맵의 사용 예제
            val newAgeMapper = mutableMapOf("himanshu" to 26, "john" to 30);
            newAgeMapper.put("Doe", 35); // = newAgeMapper["Doe"] = 35 //이렇게하면 Doe가 추가

            newAgeMapper.clear(); //newAgeMapper안에있는 모든 값을 삭제
            newAgeMapper.remove("himanshu"); // "himanshu"라는 키값을 가진 것을 제거

            //get하고 없으면 default가져오기
            println(
                newAgeMapper.getOrDefault(
                    "Kasdfadf",
                    -1
                )
            ); //Kasdfadf가있는지확인하고 없으면 -1을 default값으로 가져옴

            //read
            //값이있는지 없는지 확인
            println(newAgeMapper.containsKey("himanshu")); //true
            println(newAgeMapper.containsValue(30)); // true

            println(newAgeMapper.filter {
                it.key == "himanshu" || it.value == 30; //  himanshu라는 키를 가지고있거나,
                // value로 30일 가지고있는 아이템을 리턴{himanshu = 26, john = 30}
            });

            println(newAgeMapper.filterKeys {
                it == "himanshu"; //himanshu를 key로 가지고있는값을 찾음
            });

            println(newAgeMapper.filterValues {
                it == 30; //30을 value로 가진 값을 찾음
            });

            //sorting
            newAgeMapper.toSortedMap(); // key값을 순서대로 재배열, 알파벳이나 숫자 차례대로 재배치
        };


        // Set
        // List와 달리 중복을 허용하지 않으며, 순차적이지 않은 집합
        val set1 = setOf(3, 3, 1, 2);
        println(set1); // [3,1,2]


        // 변경 불가능한 데이터
        // Immutable list       	listOf
        // Immutable map	        mapOf
        // Immutable set	        setOf

        // 변경 가능한 데이터
        // Mutable list        	ArrayListOf, ArrayList,  mutableListOf
        // Mutable map         	MutableMapOf, HashMap, HashMapOf
        // Mutable set         	MutuableSetOf, HashSetOf


        // Mutable List
        // ArrayList = ArrayListOf
        // mutableListof = ArrayListOf
        //  세 가지 모두 mutable List를 만들기 위한 방법
        // ArrayList는 MutableList 인터페이스를 상속받은 구현체
        // public inline fun <T> arrayListOf(): ArrayList<T> = ArrayList();

        // Mutable Map
        // MutableMapOf, HashMap, HashMapOf는 모두 같은 기능
        // HashMap은 MutableMap 인터페이스를 상속받은 구현체
        val hashMap:HashMap<Int,String> = HashMap<Int,String>(); //빈 hashMap을 생성
        hashMap.put(1,"Ajay"); //= hashMap[1] = "Ajay" //추가
        hashMap.put(3,"Vijay");
        hashMap.put(4,"Praveen");
        hashMap.put(2,"Ajay");

        // Mutable Set
        // MutableSetOf = HashSetof
        // HashSetOf도 MutableSetOf 인터페이스를 상속받은 구현체


    }
}