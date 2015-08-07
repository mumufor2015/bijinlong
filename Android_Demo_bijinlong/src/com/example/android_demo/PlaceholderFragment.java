package com.example.android_demo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;

public class PlaceholderFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		//��ȡ��Fragment�Ĳ����ļ�
		LinearLayout rootView = (LinearLayout) inflater.inflate(
				R.layout.fragment_main, container, false);
		//���ö�������ʽΪ���Ŷ���
		ScaleAnimation sa = new ScaleAnimation(0, 1, 0, 1);
		sa.setDuration(3000);
		//ʹ�ö���������������ÿ����������ʾʱ�䣨0.2f��ʾ��һ����ť����������������20%�󣬵ڶ�����ť��ʼ���֣���
		LayoutAnimationController lac = new LayoutAnimationController(sa, 0.2f);
		rootView.setLayoutAnimation(lac);

		return rootView;
	}

}
