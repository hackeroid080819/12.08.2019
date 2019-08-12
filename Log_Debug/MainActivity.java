package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView helloTV = findViewById(R.id.helloTV);
        helloTV.setText("Today is 12 Aug 2019");

        Toast.makeText(this, "Welcome to my app", Toast.LENGTH_LONG).show();

        final Button myBtn = findViewById(R.id.myBtn);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloTV.setText("Clicked button!!!");
                Log.e("============ ", "User clicked the button!!!");
                int a = 1;
                int b = 0;
                Log.i("============ ", "a = " + a + " b = " + b);
                int c = a / b;
            }
        });
    }
}
