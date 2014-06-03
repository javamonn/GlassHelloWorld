package com.example.helloworld;
import com.google.android.glass.app.Card;
import com.google.android.glass.timeline.LiveCard;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;


public class HelloWorldActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Card helloWorld = new Card(this);
		helloWorld.setText("Hello, World!");
		helloWorld.setFootnote("Google Glass Crash Course");
		setContentView(helloWorld.getView());
	}
}
