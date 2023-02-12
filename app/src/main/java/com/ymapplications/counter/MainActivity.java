package com.ymapplications.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textCount = findViewById(R.id.textCounter);
        Button buttonCount = findViewById(R.id.buttonCounter);
        Button buttonReset = findViewById(R.id.buttonReset);

         counter = 0;
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               counter++;
               textCount.setText(""+counter);
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                textCount.setText(""+counter);

            }
        });
    }
}