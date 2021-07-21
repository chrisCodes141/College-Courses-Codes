package com.example.class1.a2bjava;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

        wsu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Wichita, KS. Tuition is 23000 annually");
                chrisText.setBackgroundColor(Color.YELLOW);
                wsu.setBackgroundColor(Color.YELLOW);
                chrisText.setTextColor(Color.BLACK);
                wsu.setTextColor(Color.BLACK);
            }
        });

        wsu.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Wichita, KS. Tuition is 23000 annually");
                chrisText.setBackgroundColor(Color.BLACK);
                wsu.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.YELLOW);
                wsu.setTextColor(Color.YELLOW);
                return true;
            }
        });
        ou.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Norman, OK. Tuition is 29000 annually");
                chrisText.setBackgroundColor(Color.BLACK);
                ou.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.WHITE);
                ou.setTextColor(Color.WHITE);
            }
        });

        ou.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Norman, OK. Tuition is 29000 annually");
                chrisText.setBackgroundColor(Color.WHITE);
                ou.setBackgroundColor(Color.WHITE);
                chrisText.setTextColor(Color.BLACK);
                ou.setTextColor(Color.BLACK);
                return true;
            }
        });
        osu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In StillWater, OK. Tuition is 34000 annually");
                chrisText.setBackgroundColor(Color.BLACK);
                osu.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.WHITE);
                osu.setTextColor(Color.WHITE);
            }
        });

        osu.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In StillWater, OK. Tuition is 34000 annually");
                chrisText.setBackgroundColor(Color.WHITE);
                osu.setBackgroundColor(Color.WHITE);
                chrisText.setTextColor(Color.BLACK);
                osu.setTextColor(Color.BLACK);
                return true;
            }
        });
        ku.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Lawrence, KS. Tuition is 35000 annually");
                chrisText.setBackgroundColor(Color.parseColor("#800080"));
                ku.setBackgroundColor(Color.parseColor("#800080"));
                chrisText.setTextColor(Color.BLACK);
                ku.setTextColor(Color.BLACK);
            }
        });

        ku.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Lawrence, KS. Tuition is 35000 annually");
                chrisText.setBackgroundColor(Color.BLACK);
                ku.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.parseColor("#800080"));
                ku.setTextColor(Color.parseColor("#800080"));
                return true;
            }
        });
        mit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Boston, MA. Tuition is 65000 annually");
                chrisText.setBackgroundColor(Color.YELLOW);
                mit.setBackgroundColor(Color.YELLOW);
                chrisText.setTextColor(Color.BLACK);
                mit.setTextColor(Color.BLACK);
            }
        });

        mit.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Boston, MA. Tuition is 65000 annually");
                chrisText.setBackgroundColor(Color.BLACK);
                mit.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.YELLOW);
                mit.setTextColor(Color.YELLOW);
                return true;
            }
        });
        cuny.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Brooklyn, NY. Tuition is 33000 yearly");
                chrisText.setBackgroundColor(Color.BLUE);
                cuny.setBackgroundColor(Color.BLUE);
                chrisText.setTextColor(Color.WHITE);
                cuny.setTextColor(Color.WHITE);
            }
        });

        cuny.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Brooklyn, NY. Tuition is 33000 yearly");
                chrisText.setBackgroundColor(Color.WHITE);
                cuny.setBackgroundColor(Color.WHITE);
                chrisText.setTextColor(Color.BLUE);
                cuny.setTextColor(Color.BLUE);
                return true;
            }
        });
        nyu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Brooklyn, NY. It costs 43452 a year approximately");
                chrisText.setBackgroundColor(Color.YELLOW);
                nyu.setBackgroundColor(Color.YELLOW);
                chrisText.setTextColor(Color.BLACK);
                nyu.setTextColor(Color.BLACK);
            }
        });

        nyu.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Brooklyn, NY. It costs 43452 a year approximately");
                chrisText.setBackgroundColor(Color.BLACK);
                nyu.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.YELLOW);
                nyu.setTextColor(Color.YELLOW);
                return true;
            }
        });
        opsu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Oklahoma, OK. Tuition costs around 34000  annually");
                chrisText.setBackgroundColor(Color.YELLOW);
                opsu.setBackgroundColor(Color.YELLOW);
                chrisText.setTextColor(Color.BLACK);
                opsu.setTextColor(Color.BLACK);
            }
        });

        opsu.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Oklahoma, OK. Tuition costs around 34000  annually");
                chrisText.setBackgroundColor(Color.BLACK);
                opsu.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.YELLOW);
                opsu.setTextColor(Color.YELLOW);
                return true;
            }
        });
        rice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Texas, TX. Tuition costs 42253 annually");
                chrisText.setBackgroundColor(Color.BLUE);
                rice.setBackgroundColor(Color.BLUE);
                chrisText.setTextColor(Color.RED);
                rice.setTextColor(Color.RED);
            }
        });

        rice.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Texas, TX. Tuition costs 42253 annually");
                chrisText.setBackgroundColor(Color.RED);
                rice.setBackgroundColor(Color.RED);
                chrisText.setTextColor(Color.BLUE);
                rice.setTextColor(Color.BLUE);
                return true;
            }
        });
        brown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Rhode Island, RI. Tuition costs roughly 50000 annually");
                chrisText.setBackgroundColor(Color.parseColor("#D2691E"));
                brown.setBackgroundColor(Color.parseColor("#D2691E"));
                chrisText.setTextColor(Color.BLACK);
                brown.setTextColor(Color.BLACK);
            }
        });

        brown.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Rhode Island, RI. Tuition costs roughly 50000 annually");
                chrisText.setBackgroundColor(Color.BLACK);
                brown.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.parseColor("#D2691E"));
                brown.setTextColor(Color.parseColor("#D2691E"));
                return true;
            }
        });
        isu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Ames, lowa. Tuition costs 20856 annually");
                chrisText.setBackgroundColor(Color.YELLOW);
                isu.setBackgroundColor(Color.YELLOW);
                chrisText.setTextColor(Color.BLACK);
                isu.setTextColor(Color.BLACK);
            }
        });

        isu.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Ames, lowa. Tuition costs 20856 annually");
                chrisText.setBackgroundColor(Color.BLACK);
                isu.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.parseColor("#FFA500"));
                isu.setTextColor(Color.parseColor("#FFA500"));
                return true;
            }
        });
        duke.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Durham, NC. Tuition costs 49241 annually");
                chrisText.setBackgroundColor(Color.parseColor("#FFA500"));
                duke.setBackgroundColor(Color.parseColor("#FFA500"));
                chrisText.setTextColor(Color.BLACK);
                duke.setTextColor(Color.BLACK);
            }
        });

        duke.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Durham, NC. Tuition costs 49241 annually");
                chrisText.setBackgroundColor(Color.BLACK);
                duke.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.YELLOW);
                duke.setTextColor(Color.YELLOW);
                return true;
            }
        });
        utulsa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Tulsa, OK. tuition costs 39521 annually");
                chrisText.setBackgroundColor(Color.WHITE);
                utulsa.setBackgroundColor(Color.WHITE);
                chrisText.setTextColor(Color.parseColor("#336699"));
                utulsa.setTextColor(Color.parseColor("#336699"));
            }
        });

        utulsa.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Tulsa, OK. tuition costs 39521 annually");
                chrisText.setBackgroundColor(Color.parseColor("#336699"));
                utulsa.setBackgroundColor(Color.parseColor("#336699"));
                chrisText.setTextColor(Color.WHITE);
                utulsa.setTextColor(Color.WHITE);
                return true;
            }
        });
        bc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Newton, Massachuesetts. Tuition costs 49324 annually");
                chrisText.setBackgroundColor(Color.WHITE);
                bc.setBackgroundColor(Color.WHITE);
                chrisText.setTextColor(Color.BLACK);
                bc.setTextColor(Color.BLACK);
            }
        });
//Christopher Guzowski
        bc.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Newton, Massachuesetts. Tuition costs 49324 annually");
                chrisText.setBackgroundColor(Color.BLACK);
                bc.setBackgroundColor(Color.BLACK);
                chrisText.setTextColor(Color.WHITE);
                bc.setTextColor(Color.YELLOW);
                return true;
            }
        });
        suny.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In New York, NY. Tuition costs 31570 annually");
                chrisText.setBackgroundColor(Color.parseColor("#74dbbf"));
                suny.setBackgroundColor(Color.parseColor("#74dbbf"));
                chrisText.setTextColor(Color.WHITE);
                suny.setTextColor(Color.WHITE);
            }
        });
        //Christopher Guzowski

        suny.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In New York, NY. Tuition costs 31570 annually");
                chrisText.setBackgroundColor(Color.WHITE);
                suny.setBackgroundColor(Color.WHITE);
                chrisText.setTextColor(Color.parseColor("#74dbbf"));
                suny.setTextColor(Color.parseColor("#74dbbf"));
                return true;
            }
        });

        setContentView(myLayout);
    }
}
