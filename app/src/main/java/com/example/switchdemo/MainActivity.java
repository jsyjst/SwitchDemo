package com.example.switchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private Switch mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSwitch=findViewById(R.id.switch_day);
        mSwitch.setChecked(true);
    }
}
