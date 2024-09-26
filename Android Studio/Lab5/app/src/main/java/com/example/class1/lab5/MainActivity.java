package com.example.class1.lab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewAnimationUtils;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import org.w3c.dom.Text;
import android.graphics.Color;
//Christopher Guzowski Lab 5
public class MainActivity extends AppCompatActivity {
//Christopher Guzowski Lab 5
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView chrisText = (TextView) findViewById(R.id.christext);

        final Button wsu = (Button) findViewById(R.id.WSU);
        final Button ou = (Button) findViewById(R.id.OU);
        final Button osu = (Button) findViewById(R.id.OSU);
        final Button ku = (Button) findViewById(R.id.KU);
        final Button mit = (Button) findViewById(R.id.MIT);
        final Button cuny = (Button) findViewById(R.id.CUNY);
        final Button nyu = (Button) findViewById(R.id.NYU);
        final Button opsu = (Button) findViewById(R.id.OPSU);
        final Button rice = (Button) findViewById(R.id.RICE);
        final Button brown = (Button) findViewById(R.id.BROWN);
        final Button isu = (Button) findViewById(R.id.ISU);
        final Button duke = (Button) findViewById(R.id.DUKE);
        final Button utulsa = (Button) findViewById(R.id.UTULSA);
        final Button bc = (Button) findViewById(R.id.BC);
        final Button suny = (Button) findViewById(R.id.SUNY);

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
                chrisText.setTextColor(Color.WHITE);
                rice.setTextColor(Color.WHITE);
            }
        });

        rice.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                chrisText.setText("In Texas, TX. Tuition costs 42253 annually");
                chrisText.setBackgroundColor(Color.WHITE);
                rice.setBackgroundColor(Color.WHITE);
                chrisText.setTextColor(Color.BLUE);
                rice.setTextColor(Color.BLUE);
                return true;
            }
        });
        brown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Rhode Island, RI. Tuition costs roughly 50000 annually");
                chrisText.setBackgroundColor(Color.YELLOW);
                brown.setBackgroundColor(Color.YELLOW);
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
                chrisText.setTextColor(Color.YELLOW);
                brown.setTextColor(Color.YELLOW);
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
                chrisText.setTextColor(Color.YELLOW);
                isu.setTextColor(Color.YELLOW);
                return true;
            }
        });
        duke.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chrisText.setText("In Durham, NC. Tuition costs 49241 annually");
                chrisText.setBackgroundColor(Color.YELLOW);
                duke.setBackgroundColor(Color.YELLOW);
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
    }


    /*public void wsu(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Wichita, KS. Tuition is 23000 annually");
    }
    public void ou(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Norman, OK. Tuition is 29000 annually");
    }
    public void osu(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In StillWater, OK. Tuition is 34000 annually");
    }
    public void ku(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Lawrence, KS. Tuition is 35000 annually");
    }
    public void mit(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Boston, MA. Tuition is 65000 annually");
    }
    public void cuny(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Brooklyn, NY. Tuition is 33000 yearly");
    }
    public void nyu(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Brooklyn, NY. It costs 43452 a year approximately");
    }
    public void opsu(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Oklahoma, OK. Tuition costs around 34000  annually");
    }
    public void rice(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Texas, TX. Tuition costs 42253 annually");
    }
    public void brown(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Rhode Island, RI. Tuition costs roughly 50000 annually");
    }
    public void isu(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Ames, lowa. Tuition costs 20856 annually");
    }
    public void duke(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Durham, NC. Tuition costs 49241 annually");
    }
    public void utulsa(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Tulsa, OK. tuition costs 39521 annually");
    }
    public void bc(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In Newton, Massachuesetts. Tuition costs 49324 annually");
    }
    public void suny(View v){
        TextView chrisText = (TextView) findViewById(R.id.christophertext);
        chrisText.setText("In New York, NY. Tuition costs 31570 annually");
    }
    //Christopher Guzowski Lab 5*/
}
