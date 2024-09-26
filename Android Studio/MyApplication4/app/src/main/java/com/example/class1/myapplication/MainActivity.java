package com.example.class1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView chrisText = (TextView) findViewById(R.id.chrisText);
        final Button chrisButton = (Button) findViewById(R.id.chrisButton);

        chrisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrisText.setText("Guzowski");
            }
        });

        chrisText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrisText.setText("Christopher");
            }
        });

    }
}
