package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private int no1Val;
    private int no2Val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        no1Val = extras.getInt("no1");
        no2Val = extras.getInt("no2");

        TextView textView1 = findViewById(R.id.editText);
        textView1.setText(Integer.toString(no1Val));

        TextView textView2 = findViewById(R.id.editText2);
        textView2.setText(Integer.toString(no2Val));
    }

    public void addition(View v) {
        int ans = no1Val +  no2Val;

        TextView answertxt = findViewById(R.id.answer);
        answertxt.setText(Integer.toString(no1Val) + " + " + Integer.toString(no2Val) + " = " + Integer.toString(ans));
    }

    public void subtractions(View view) {
        int ans = no1Val -  no2Val;

        TextView answertxt = findViewById(R.id.answer);
        answertxt.setText(Integer.toString(no1Val) + " - " + Integer.toString(no2Val) + " = " + Integer.toString(ans));
    }

    public void multiplication(View view) {
        int ans = no1Val *  no2Val;

        TextView answertxt = findViewById(R.id.answer);
        answertxt.setText(Integer.toString(no2Val) + " * " + Integer.toString(no2Val) + " = " + Integer.toString(ans));
    }

    public void division(View view) {
        int ans = no2Val /  no2Val;

        TextView answertxt = findViewById(R.id.answer);
        answertxt.setText(Integer.toString(no1Val) + " / " + Integer.toString(no2Val) + " = " + Integer.toString(ans));
    }
}
