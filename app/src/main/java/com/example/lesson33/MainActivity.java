package com.example.lesson33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Integer> list = new ArrayList<Integer>();
list.add (10002);
list.add(293);
list.add(123);
list.add(4352);
list.add(96354);
list.add(816);
list.add (992);
list.add (984);
list.add (884);
list.add (38);

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0)
                even.add(x);
            else
                odd.add(x);
        }
        System.out.println(even);
        System.out.println(odd);
    }
}