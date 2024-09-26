package com.example.class1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.lsyout.activity_main);

        final Button btnup = {Button} findViewById(R.id.upbtn);
        final Button btndown = {Button} findViewById(R.id.dpwmbtn);

        btnup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                btnup.setBackgroundColor(Color.BLUE);
                btndown.setBackgroundColor(Color.BLUE);
                btnup.setTextColor(Color.YELLOW);
                btndown.setTextColor(Color.YELLOW);
            }
            btndown.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    btnup.setBackgroundColor(Color.BLACK);
                    btndown.setBackgroundColor(Color.BLACK);
                    btnup.setTextColor(Color.YELLOW);
                    btndown.setTextColor(Color.YELLOW);
                }
        }

    }
}
