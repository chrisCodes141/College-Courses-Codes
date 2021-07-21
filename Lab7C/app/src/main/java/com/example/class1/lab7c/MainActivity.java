package com.example.class1.lab7c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //christopher guzowski
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result = (TextView) findViewById(R.id.result);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handle();
            }
        });
    }
    //christopher guzowski
    void handle(){
        TextView result = (TextView) findViewById(R.id.result);
        EditText base= (EditText) findViewById(R.id.base);
        EditText height = (EditText) findViewById(R.id.height);

        Double d1,d2,d3;
        String s1,s2,s3;
        s2 = base.getText().toString();
        s3 = height.getText().toString();

        d2 = Double.valueOf(s2);
        d3 = Double.valueOf(s3);
        d1 = (d2*d3)/2;
        //christopher guzowski
        s1 = String.valueOf(d1);
        result.setText("The Area is:"+s1);
    }
}
