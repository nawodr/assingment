package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private int num1Val;
    private int num2Val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        num1Val = extras.getInt("num1");
        num2Val = extras.getInt("num2");

        TextView textView1 = findViewById(R.id.editText);
        textView1.setText(Integer.toString(num1Val));

        TextView textView2 = findViewById(R.id.editText2);
        textView2.setText(Integer.toString(num2Val));
    }

    public void addition(View view) {
        int ans = num1Val +  num2Val;

        TextView answertxt = findViewById(R.id.answer);
        answertxt.setText(Integer.toString(num1Val) + " + " + Integer.toString(num2Val) + " = " + Integer.toString(ans));
    }

    public void subtractions(View view) {
        int ans = num1Val -  num2Val;

        TextView answertxt = findViewById(R.id.answer);
        answertxt.setText(Integer.toString(num1Val) + " - " + Integer.toString(num2Val) + " = " + Integer.toString(ans));
    }

    public void multiplication(View view) {
        int ans = num1Val *  num2Val;

        TextView answertxt = findViewById(R.id.answer);
        answertxt.setText(Integer.toString(num1Val) + " * " + Integer.toString(num2Val) + " = " + Integer.toString(ans));
    }

    public void division(View view) {
        int ans = num1Val /  num2Val;

        TextView answertxt = findViewById(R.id.answer);
        answertxt.setText(Integer.toString(num1Val) + " / " + Integer.toString(num2Val) + " = " + Integer.toString(ans));
    }
}
