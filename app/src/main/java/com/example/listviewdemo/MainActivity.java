package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.os.Bundle;
//import android.widget.Adapter;
//import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] classes = {"Discrete Structures", "Digital Logic & Comp Org", "Database Concepts", "German 201", "Public Speaking"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, classes);

        listView = findViewById(R.id.class_schedule);
        listView.setAdapter(adapter);


    }
}