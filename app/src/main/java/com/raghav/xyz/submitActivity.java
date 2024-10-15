package com.raghav.xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class submitActivity extends AppCompatActivity {

    public static final String MSG="com.raghav.xyz.MSD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        Intent intent = getIntent();
        String massage = intent.getStringExtra(MainActivity.MSG);

        //set text inside text view to massage
        TextView textView = findViewById(R.id.submitText);
        textView.setText(massage);


    }

    public void fs(View View){
        Intent intent = new Intent(this,finalActivity.class);
        String massage = "ThankYou"+"\nYour details are submited";
        intent.putExtra(MSG,massage);
        startActivity(intent);
    }

}