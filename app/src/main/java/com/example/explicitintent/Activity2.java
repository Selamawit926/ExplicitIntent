package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView act2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        act2= findViewById(R.id.act2);

        String name= getIntent().getStringExtra("name");

        act2.setText(name + ", welcome to Activity 2!");
    }
}
