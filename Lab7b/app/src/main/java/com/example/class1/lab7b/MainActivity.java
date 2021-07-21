package com.example.class1.lab7b;

import android.support.constraint.solver.widgets.ConstraintTableLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Color;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Christopher Guzowski
        ConstraintLayout myLayout = (ConstraintLayout) findViewById(R.id.myLayout);
        myLayout.setOnTouchListener(
                new ConstraintLayout.OnTouchListener() {
                    public boolean onTouch(View v, MotionEvent m) {
                        handleTouch(m);
                        return true;
                    }
                }
        );
    }
    //Christopher Guzowski
    int horizontal = 0;
    int vertical = 0;
    boolean touchx, touchy;

    void handleTouch(MotionEvent m) {
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        ImageView soccerball = (ImageView) findViewById(R.id.soccerball);
        ImageView soccerball2 = (ImageView) findViewById(R.id.soccerball2);
        ConstraintLayout myLayout = (ConstraintLayout) findViewById(R.id.myLayout);
        int pointerCount = m.getPointerCount();
        //Christopher Guzowski
        for (int i = 0; i < pointerCount; i++){
            int x = (int) m.getX(i);
            int y = (int) m.getY(i);
            int id = m.getPointerId(i);
            int action = m.getActionMasked();
            int actionIndex = m.getActionIndex();
            String actionString;
            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    actionString = "DOWN";
                    if(horizontal>myLayout.getMaxWidth()) horizontal=-soccerball.getWidth();
                    horizontal = horizontal+70;
                    break;
                case MotionEvent.ACTION_UP:
                    actionString = "UP";
                    vertical = vertical-23;
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    actionString = "PNTER DOWN";
                    vertical = vertical+23;
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    actionString = "PNTR UP";
                    vertical = vertical+23;
                    break;
                case MotionEvent.ACTION_MOVE:
                    actionString = "MOVE";
                    if(horizontal>400) horizontal=0;
                    horizontal = horizontal+3;
                    break;
                default:
                    actionString = "";
            }
            String touchStatus = "Action: "+actionString+" Index: "+" ID: "+id+" X: "+x+" Y: "+y;
            if (id == 0) {
                textView1.setText(touchStatus);
            }
            else
                textView2.setText(touchStatus);
            textView2.setX(horizontal);
            soccerball.setX(x-100);
            soccerball.setY(y-100);

            touchx=((Math.abs(soccerball.getX()-soccerball2.getX())<soccerball.getWidth()-10));
            touchy=((Math.abs(soccerball.getY()-soccerball2.getY())<soccerball.getWidth()-10));

            //Christopher Guzowski

            if (touchx & touchy){
                myLayout.setBackgroundColor(Color.GREEN);
                textView2.setText("touching");
            }
            else{
                myLayout.setBackgroundColor(Color.GRAY);
                textView2.setText("not touching");
            }
        }
    }
}
