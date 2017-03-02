package com.example.alice.audiorecorderalice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class Firstattempt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_firstattempt);
    }
    public void startChronometer(View view){
        ((Chronometer)findViewById(R.id.chronometer4)).start();

    }
    public void stopChronometer(View view){
        ((Chronometer)findViewById(R.id.chronometer4)).stop();
    }
}
