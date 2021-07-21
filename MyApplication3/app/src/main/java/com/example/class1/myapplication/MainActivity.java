package com.example.class1.myapplication;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
//Christopher Guzowski
public class MainActivity extends AppCompatActivity {
    //Christopher Guzowski
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ConstraintLayout myLayout = new ConstraintLayout(this);
        myLayout.setBackgroundColor(Color.GRAY);
//Christopher Guzowski
        final TextView chrisText = new TextView(this);
        chrisText.setId(R.id.chrisText);
        chrisText.setText("Tap on buttons to see more info");
        chrisText.setBackgroundColor(Color.LTGRAY);
        myLayout.addView(chrisText);
//Christopher Guzowski
        final Button wsu = new Button(this);
        wsu.setText("WSU");
        wsu.setId(R.id.wsu);
        myLayout.addView(wsu);
//Christopher Guzowski
        final Button ou = new Button(this);
        ou.setText("OU");
        ou.setId(R.id.ou);
        myLayout.addView(ou);
//Christopher Guzowski
        final Button osu = new Button(this);
        osu.setText("OSU");
        osu.setId(R.id.osu);
        myLayout.addView(osu);
//Christopher Guzowski
        final Button ku = new Button(this);
        ku.setText("KU");
        ku.setId(R.id.ku);
        myLayout.addView(ku);
//Christopher Guzowski
        final Button mit = new Button(this);
        mit.setText("MIT");
        mit.setId(R.id.mit);
        myLayout.addView(mit);
//Christopher Guzowski
        final Button cuny = new Button(this);
        cuny.setText("CUNY");
        cuny.setId(R.id.cuny);
        myLayout.addView(cuny);
//Christopher Guzowski
        final Button nyu = new Button(this);
        nyu.setText("NYU");
        nyu.setId(R.id.nyu);
        myLayout.addView(nyu);
//Christopher Guzowski
        final Button opsu = new Button(this);
        opsu.setText("OPSU");
        opsu.setId(R.id.opsu);
        myLayout.addView(opsu);
//Christopher Guzowski
        final Button rice = new Button(this);
        rice.setText("RICE");
        rice.setId(R.id.rice);
        myLayout.addView(rice);
//Christopher Guzowski
        final Button brown = new Button(this);
        brown.setText("BROWN");
        brown.setId(R.id.brown);
        myLayout.addView(brown);
//Christopher Guzowski
        final Button isu = new Button(this);
        isu.setText("ISU");
        isu.setId(R.id.isu);
        myLayout.addView(isu);
//Christopher Guzowski
        final Button duke = new Button(this);
        duke.setText("DUKE");
        duke.setId(R.id.duke);
        myLayout.addView(duke);
//Christopher Guzowski
        final Button utulsa = new Button(this);
        utulsa.setText("UTULSA");
        utulsa.setId(R.id.utulsa);
        myLayout.addView(utulsa);
//Christopher Guzowski
        final Button bc = new Button(this);
        bc.setText("BC");
        bc.setId(R.id.bc);
        myLayout.addView(bc);
//Christopher Guzowski
        final Button suny = new Button(this);
        suny.setText("SUNY");
        suny.setId(R.id.suny);
        myLayout.addView(suny);
//Christopher Guzowski
        ConstraintSet set = new ConstraintSet();

        set.constrainWidth(chrisText.getId(),ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(chrisText.getId(),ConstraintSet.WRAP_CONTENT);
        set.connect(chrisText.getId(),ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,ConstraintSet.LEFT, 0);
        set.connect(chrisText.getId(),ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,ConstraintSet.RIGHT, 0);
        set.connect(chrisText.getId(),ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,ConstraintSet.TOP, 0);
        set.connect(chrisText.getId(),ConstraintSet.BOTTOM,
                cuny.getId(),ConstraintSet.TOP, 0);
//Christopher Guzowski
        set.constrainWidth(wsu.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(wsu.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(wsu.getId(), ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,ConstraintSet.LEFT,0);
        set.connect(wsu.getId(), ConstraintSet.RIGHT,
                cuny.getId(),ConstraintSet.LEFT, 0);
        set.connect(wsu.getId(), ConstraintSet.TOP,
                chrisText.getId(),ConstraintSet.BOTTOM, 0);
        set.connect(wsu.getId(), ConstraintSet.BOTTOM,
                ou.getId(),ConstraintSet.TOP, 0);
//Christopher Guzowski
        set.constrainWidth(ou.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(ou.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(ou.getId(), ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,ConstraintSet.LEFT,0);
        set.connect(ou.getId(), ConstraintSet.RIGHT,
                nyu.getId(),ConstraintSet.LEFT, 0);
        set.connect(ou.getId(), ConstraintSet.TOP,
                wsu.getId(),ConstraintSet.BOTTOM, 0);
        set.connect(ou.getId(), ConstraintSet.BOTTOM,
                osu.getId(),ConstraintSet.TOP, 0);
//Christopher Guzowski
        set.constrainWidth(osu.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(osu.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(osu.getId(), ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,ConstraintSet.LEFT,0);
        set.connect(osu.getId(), ConstraintSet.RIGHT,
                opsu.getId(),ConstraintSet.LEFT, 0);
        set.connect(osu.getId(), ConstraintSet.TOP,
                ou.getId(),ConstraintSet.BOTTOM, 0);
        set.connect(osu.getId(), ConstraintSet.BOTTOM,
                ku.getId(),ConstraintSet.TOP, 0);
//Christopher Guzowski
        set.constrainWidth(ku.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(ku.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(ku.getId(), ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,ConstraintSet.LEFT,0);
        set.connect(ku.getId(), ConstraintSet.RIGHT,
                rice.getId(),ConstraintSet.LEFT, 0);
        set.connect(ku.getId(), ConstraintSet.TOP,
                osu.getId(),ConstraintSet.BOTTOM, 0);
        set.connect(ku.getId(), ConstraintSet.BOTTOM,
                mit.getId(),ConstraintSet.TOP, 0);
//Christopher Guzowski
        set.constrainWidth(mit.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(mit.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(mit.getId(), ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,ConstraintSet.LEFT,0);
        set.connect(mit.getId(), ConstraintSet.RIGHT,
                brown.getId(),ConstraintSet.LEFT, 0);
        set.connect(mit.getId(), ConstraintSet.TOP,
                ku.getId(),ConstraintSet.BOTTOM, 0);
        set.connect(mit.getId(), ConstraintSet.BOTTOM,
               ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 0);
//Christopher Guzowski
        set.constrainWidth(cuny.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(cuny.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(cuny.getId(),ConstraintSet.LEFT,
                wsu.getId(),ConstraintSet.RIGHT,0);
        set.connect(cuny.getId(),ConstraintSet.RIGHT,
                isu.getId(),ConstraintSet.LEFT,0);
        set.connect(cuny.getId(),ConstraintSet.TOP,
                chrisText.getId(),ConstraintSet.BOTTOM,0);
        set.connect(cuny.getId(),ConstraintSet.BOTTOM,
                nyu.getId(),ConstraintSet.TOP,0);
//Christopher Guzowski
        set.constrainWidth(nyu.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(nyu.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(nyu.getId(),ConstraintSet.LEFT,
                ou.getId(),ConstraintSet.RIGHT,0);
        set.connect(nyu.getId(),ConstraintSet.RIGHT,
                duke.getId(),ConstraintSet.LEFT,0);
        set.connect(nyu.getId(),ConstraintSet.TOP,
                cuny.getId(),ConstraintSet.BOTTOM,0);
        set.connect(nyu.getId(),ConstraintSet.BOTTOM,
                opsu.getId(),ConstraintSet.TOP,0);
//Christopher Guzowski
        set.constrainWidth(opsu.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(opsu.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(opsu.getId(),ConstraintSet.LEFT,
                osu.getId(),ConstraintSet.RIGHT,0);
        set.connect(opsu.getId(),ConstraintSet.RIGHT,
                utulsa.getId(),ConstraintSet.LEFT,0);
        set.connect(opsu.getId(),ConstraintSet.TOP,
                nyu.getId(),ConstraintSet.BOTTOM,0);
        set.connect(opsu.getId(),ConstraintSet.BOTTOM,
                rice.getId(),ConstraintSet.TOP,0);
//Christopher Guzowski
        set.constrainWidth(rice.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(rice.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(rice.getId(),ConstraintSet.LEFT,
                ku.getId(),ConstraintSet.RIGHT,0);
        set.connect(rice.getId(),ConstraintSet.RIGHT,
                bc.getId(),ConstraintSet.LEFT,0);
        set.connect(rice.getId(),ConstraintSet.TOP,
                opsu.getId(),ConstraintSet.BOTTOM,0);
        set.connect(rice.getId(),ConstraintSet.BOTTOM,
                brown.getId(),ConstraintSet.TOP,0);
//Christopher Guzowski
        set.constrainWidth(brown.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(brown.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(brown.getId(),ConstraintSet.LEFT,
                mit.getId(),ConstraintSet.RIGHT,0);
        set.connect(brown.getId(),ConstraintSet.RIGHT,
                suny.getId(),ConstraintSet.LEFT,0);
        set.connect(brown.getId(),ConstraintSet.TOP,
                rice.getId(),ConstraintSet.BOTTOM,0);
        set.connect(brown.getId(),ConstraintSet.BOTTOM,
               ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM,0);
//Christopher Guzowski
        set.constrainWidth(isu.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(isu.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(isu.getId(),ConstraintSet.LEFT,
                cuny.getId(),ConstraintSet.RIGHT,0);
        set.connect(isu.getId(),ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,0);
        set.connect(isu.getId(),ConstraintSet.TOP,
                chrisText.getId(),ConstraintSet.BOTTOM,0);
        set.connect(isu.getId(),ConstraintSet.BOTTOM,
                duke.getId(),ConstraintSet.TOP,0);
//Christopher Guzowski
        set.constrainWidth(duke.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(duke.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(duke.getId(),ConstraintSet.LEFT,
                cuny.getId(),ConstraintSet.RIGHT,0); // might be error<<<<<<<<<<<<<<<
        set.connect(duke.getId(),ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,0);
        set.connect(duke.getId(),ConstraintSet.TOP,
                isu.getId(),ConstraintSet.BOTTOM,0);
        set.connect(duke.getId(),ConstraintSet.BOTTOM,
                utulsa.getId(),ConstraintSet.TOP,0);
//Christopher Guzowski
        set.constrainWidth(utulsa.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(utulsa.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(utulsa.getId(),ConstraintSet.LEFT,
                nyu.getId(),ConstraintSet.RIGHT,0);
        set.connect(utulsa.getId(),ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,0);
        set.connect(utulsa.getId(),ConstraintSet.TOP,
                duke.getId(),ConstraintSet.BOTTOM,0);
        set.connect(utulsa.getId(),ConstraintSet.BOTTOM,
                bc.getId(),ConstraintSet.TOP,0);
//Christopher Guzowski
        set.constrainWidth(bc.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(bc.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(bc.getId(),ConstraintSet.LEFT,
                rice.getId(),ConstraintSet.RIGHT,0);
        set.connect(bc.getId(),ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,0);
        set.connect(bc.getId(),ConstraintSet.TOP,
                utulsa.getId(),ConstraintSet.BOTTOM,0);
        set.connect(bc.getId(),ConstraintSet.BOTTOM,
                suny.getId(),ConstraintSet.TOP,0);
//Christopher Guzowski
        set.constrainWidth(suny.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainHeight(suny.getId(), ConstraintSet.WRAP_CONTENT);
        set.connect(suny.getId(),ConstraintSet.LEFT,
                brown.getId(),ConstraintSet.RIGHT,0);
        set.connect(suny.getId(),ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,0);
        set.connect(suny.getId(),ConstraintSet.TOP,
                bc.getId(),ConstraintSet.BOTTOM,0);
        set.connect(suny.getId(),ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM,0);

        set.applyTo(myLayout);
        setContentView(myLayout);
    }
}
