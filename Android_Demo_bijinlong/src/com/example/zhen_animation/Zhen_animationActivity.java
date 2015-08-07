package com.example.zhen_animation;


import com.example.android_demo.R;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Zhen_animationActivity extends Activity {

	//֡����
		private ImageView animationIV;  
	    private Button buttonA, buttonB, buttonC;  
	    private AnimationDrawable animationDrawable;  
	    @Override  
	    public void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);  
	        requestWindowFeature(Window.FEATURE_NO_TITLE);  
	        setContentView(R.layout.activity_zhen_animation);  
	         
	          
	        animationIV = (ImageView) findViewById(R.id.animationIV);  
	        buttonA = (Button) findViewById(R.id.buttonA);  
	        buttonB = (Button) findViewById(R.id.buttonB);  
	        buttonC = (Button) findViewById(R.id.buttonC);  
	          
	        buttonA.setOnClickListener(new OnClickListener()  
	        {  
	            @Override  
	            public void onClick(View v) {  
	                // TODO Auto-generated method stub  
	                animationIV.setImageResource(R.drawable.animation1);  
	                animationDrawable = (AnimationDrawable) animationIV.getDrawable();  
	                animationDrawable.start();  
	            }  
	              
	        });   
	          
	        buttonB.setOnClickListener(new OnClickListener()  
	        {  
	            @Override  
	            public void onClick(View v) {  
	                // TODO Auto-generated method stub  
	                animationDrawable = (AnimationDrawable) animationIV.getDrawable();  
	                animationDrawable.stop();  
	            }  
	              
	        });  
	          
	        buttonC.setOnClickListener(new OnClickListener()  
	        {  
	            @Override  
	            public void onClick(View v) {  
	                // TODO Auto-generated method stub  
//	                animationIV.setImageResource(R.drawable.animation2);  
	                animationDrawable = (AnimationDrawable) animationIV.getDrawable();  
	                animationDrawable.start();  
	            }             
	        });          
	    }  

}
