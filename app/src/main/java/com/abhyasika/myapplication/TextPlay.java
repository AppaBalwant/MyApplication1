package com.abhyasika.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.abhyasika.myapplication.R;

import java.util.Random;

/**
 * Created by 2014 on 05 April 2015 at 12:20 AM.
 */
public class TextPlay extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        Button chkCmd = (Button) findViewById(R.id.buttonResults);
        final ToggleButton passTog = (ToggleButton) findViewById(R.id.toggleButtonPassword);
        final EditText input = (EditText) findViewById(R.id.etCommands);
        final TextView display = (TextView) findViewById(R.id.textViewResults);
        passTog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (passTog.isChecked()){
                    input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }else{
                    input.setInputType(InputType.TYPE_CLASS_TEXT);                }

            }
        });
        chkCmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String check = input.getText().toString();
                display.setText(check);
                if (check.contentEquals("left")) {
                    display.setGravity(Gravity.LEFT);

                } else if (check.contentEquals("center")) {
                    display.setGravity(Gravity.CENTER);

                } else if (check.contentEquals("right")) {
                    display.setGravity(Gravity.RIGHT);

                } else if (check.contentEquals("blue")) {
                    display.setTextColor(Color.BLUE);

                } else {
                    if (check.contains("WTF")) {
                        Random crazy = new Random();
                        display.setText("Where's the Fridge????");
                        display.setTextSize(crazy.nextInt(75));
                        display.setTextColor(Color.rgb(crazy.nextInt(255), crazy.nextInt(255), crazy.nextInt(255)));
                        switch(crazy.nextInt(3)){
                            case 0:
                                display.setGravity(Gravity.LEFT);
                                break;
                            case 1:
                                display.setGravity(Gravity.CENTER);
                                break;
                            case 2:
                                display.setGravity(Gravity.RIGHT);
                                break;
                        }
                    } else {
                        display.setText("INVALID");
                        display.setGravity(Gravity.CENTER);
                        display.setTextColor(Color.RED);
                    }
                }


            }
        });
    }
}