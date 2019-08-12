package com.example.intentrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        String name = getIntent().getExtras().getString(MainActivity.MY_NAME_INTENT_KEY);
        
    }
}
