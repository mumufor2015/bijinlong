package com.example.android_demo;

import android.app.Activity;
import android.os.Bundle;

public class Buju_animationActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buju_animation);
		if (savedInstanceState == null) {
			/**
			 * ��Activity�ж�̬�����һ��Fragment
			 */
			getFragmentManager().beginTransaction().add(android.R.id.content, new PlaceholderFragment()).commit();
		}
	}

}
