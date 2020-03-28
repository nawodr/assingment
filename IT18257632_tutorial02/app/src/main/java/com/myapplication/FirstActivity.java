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

                EditText no1Value = (EditText) findViewById(R.id.no1Value);
                String no1 = no1Value.getText().toString();

                EditText no2Value = (EditText) findViewById(R.id.no2Value);
                String no2 = no2Value.getText().toString();

                extras.putInt("no1", Integer.parseInt(no1));
                extras.putInt("no1", Integer.parseInt(no2));

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
