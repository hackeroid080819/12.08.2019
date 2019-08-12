package com.example.intentrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String MY_NAME_INTENT_KEY = "MainActivity.MY_NAME_INTENT_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button helloBtn = findViewById(R.id.helloBtn);
        helloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), HelloActivity.class);
                EditText editText = findViewById(R.id.nameET);
                intent.putExtra(MY_NAME_INTENT_KEY, editText.getText().toString());
            }
        });
    }
}
