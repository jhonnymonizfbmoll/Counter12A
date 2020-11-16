package com.jhonnymoniz.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int nCount = 0; // When we  start, the value is 0
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void countUp(View view){ // when we click the button, we call this fun
        nCount++;
        TextView nCounter = (TextView) findViewById(R.id.nCounter);
        if (nCounter != null){
            nCounter.setText(Integer.toString(nCount)); // replace the previous value
        }
    }

}