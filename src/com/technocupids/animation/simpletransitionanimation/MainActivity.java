package com.technocupids.animation.simpletransitionanimation;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView lightScreen;
	TransitionDrawable screenDrawable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void switchon(View v) {
		lightScreen = (ImageView) findViewById(R.id.lighton);
		screenDrawable = (TransitionDrawable) lightScreen.getDrawable();
		screenDrawable.startTransition(2000);
	}

}
