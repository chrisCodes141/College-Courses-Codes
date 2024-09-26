package com.example.class1.myapplication;
//Christopher Guzowski
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
//Christopher Guzowski
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button myButton = new Button (this);
        RelativeLayout myLayout = new RelativeLayout(this);
        myButton.setText("Press me");
        myButton.setBackgroundColor(Color.YELLOW);
        myLayout.setBackgroundColor(Color.BLUE);
//Christopher Guzowski
        RelativeLayout.LayoutParams buttonParams =
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonParams.addRule(RelativeLayout.CENTER_VERTICAL);
//Christopher Guzowski
        myLayout.addView(myButton, buttonParams);
        EditText myEditText = new EditText(this);
        myButton.setId(R.id.myButtonId);
        myEditText.setId(R.id.myEditTextId);
        myEditText.setBackgroundColor(Color.LTGRAY);
//Christopher Guzowski
        RelativeLayout.LayoutParams textParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        textParams.addRule(RelativeLayout.ABOVE, myButton.getId());

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,200, r.getDisplayMetrics());
        myEditText.setWidth(px);
        textParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        textParams.setMargins(0, 0, 0,80);
        myLayout.addView(myEditText, textParams);
        setContentView(myLayout);
    }
}
