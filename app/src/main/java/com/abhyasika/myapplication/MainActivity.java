package com.abhyasika.myapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    int counter;
    Button add, subtract;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        add = (Button) findViewById(R.id.buttonAddOne);
        subtract = (Button) findViewById(R.id.buttonSubtractOne);
        display = (TextView) findViewById(R.id.textViewDisplay);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            counter +=1; /* Increase counter by 1 */
            display.setText("Your total is " + counter);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            counter -=1; /* Decrease counter by 1 */
            display.setText("Your total is " + counter);
            }
        });
    }
}