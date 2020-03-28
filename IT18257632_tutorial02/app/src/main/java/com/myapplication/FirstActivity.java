package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button submit = findViewById(R.id.ok_btn);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                Bundle extras = new Bundle();

                EditText num1Value = (EditText) findViewById(R.id.num1_value);
                String num1 = num1Value.getText().toString();
                EditText num2Value = (EditText) findViewById(R.id.num2_value);
                String num2 = num2Value.getText().toString();

                extras.putInt("num1", Integer.parseInt(num1));
                extras.putInt("num2", Integer.parseInt(num2));

                intent.putExtras(extras);

                Context context = getApplicationContext();

                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

                toast.show();

                startActivity(intent);
            }
        });

    }

}
