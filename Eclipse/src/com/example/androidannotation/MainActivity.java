package com.example.androidannotation;

import org.androidannotations.annotations.EActivity;

import android.app.Activity;
import android.os.Bundle;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
    }
}
