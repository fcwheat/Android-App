package com.example.lantern;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HelpActivity extends Activity{
	
	TextView objective;
	TextView objective_text;
	Button go_back;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_layout);
        
        Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/JotiOne_Regular.ttf");
        
        objective = (TextView) findViewById(R.id.objective);
        objective.setTypeface(typeFace);
        objective_text = (TextView) findViewById(R.id.objective_text);
        objective_text.setTypeface(typeFace);
        go_back = (Button) findViewById(R.id.go_back);
               
        go_back.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View arg0) {
        		Intent goBackMainPage = new Intent(arg0.getContext(),MainActivity.class);
        		startActivity(goBackMainPage);
        	}
        	});

    
    }
}


