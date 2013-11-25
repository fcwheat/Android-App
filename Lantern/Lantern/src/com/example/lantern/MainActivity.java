package com.example.lantern;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView lantern;
	Button startgame;
	TextView message_play;
	Button info;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // set up animation
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        // set up font
        Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/JotiOne_Regular.ttf");
        
        // set up objects (buttons, texts etc)
        lantern = (TextView) findViewById(R.id.lantern);
        lantern.setTypeface(typeFace);
        startgame = (Button) findViewById(R.id.startgame);
        message_play = (TextView) findViewById(R.id.message_play);
        message_play.setTypeface(typeFace);
        info = (Button) findViewById(R.id.info);
        
        // button send to help/ info screen
        info.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View arg0) {
        		arg0.startAnimation(animScale);
        		Intent goHelpPage = new Intent(arg0.getContext(),HelpActivity.class);
        		startActivity(goHelpPage);
        	}
        	});
        
        
        
    }
}
