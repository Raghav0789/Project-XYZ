package com.raghav.xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG="com.raghav.xyz.MSD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void submit(View view ){
        //we will handle the click on submit button
        //Build an Intent to open other activity
        Intent intent = new Intent(this,submitActivity.class);
        EditText editText1 = findViewById(R.id.editTextTextPersonName);
        EditText editText2 = findViewById(R.id.editTextTextPersonName2);
        EditText editText3 = findViewById(R.id.editTextTextPersonName3);
        EditText editText4 = findViewById(R.id.editTextTextPersonName4);
        EditText editText5 = findViewById(R.id.editTextTextPersonName5);
        EditText editText6 = findViewById(R.id.editTextTextEmailAddress);
        String massage = editText1.getText().toString()+"\n"
                +editText2.getText().toString()+"\n"
                +editText3.getText().toString()+"\n"
                +editText4.getText().toString()+"\n"
                +editText5.getText().toString()+"\n"
                +editText6.getText().toString();
        intent.putExtra(MSG,massage);
        startActivity(intent);
    }
}