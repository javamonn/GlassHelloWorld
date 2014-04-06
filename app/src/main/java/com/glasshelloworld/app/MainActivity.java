package com.glasshelloworld.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.glass.app.Card;
import com.google.android.glass.timeline.TimelineManager;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TimelineManager timeline = TimelineManager.from(this);
        Card helloWorld = new Card(this);
        helloWorld.setText("Hello World!");
        helloWorld.setFootnote("Google Glass Hello World");
        timeline.insert(helloWorld);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
    }
}
