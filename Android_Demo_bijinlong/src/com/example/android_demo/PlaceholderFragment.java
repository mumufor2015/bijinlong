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
		//获取该Fragment的布局文件
		LinearLayout rootView = (LinearLayout) inflater.inflate(
				R.layout.fragment_main, container, false);
		//设置动画的形式为缩放动画
		ScaleAnimation sa = new ScaleAnimation(0, 1, 0, 1);
		sa.setDuration(3000);
		//使用动画控制器，控制每个动画的显示时间（0.2f表示第一个按钮动画出现其整个的20%后，第二个按钮开始出现）。
		LayoutAnimationController lac = new LayoutAnimationController(sa, 0.2f);
		rootView.setLayoutAnimation(lac);

		return rootView;
	}

}
