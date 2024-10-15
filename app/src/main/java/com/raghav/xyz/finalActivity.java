package com.raghav.xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class finalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent intent = getIntent();
        String massage = intent.getStringExtra(MainActivity.MSG);

        //set text inside text view to massage
        TextView textView = findViewById(R.id.textView2);
        textView.setText(massage);

    }
}