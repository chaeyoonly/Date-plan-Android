package com.example.dateplan;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ListView;

public class MenuChoice extends Activity{
	
	
	private ImageButton im,im2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_choice);
		
		im = (ImageButton)findViewById(R.id.location);
		im2 = (ImageButton)findViewById(R.id.guchoice);
		
		im.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MenuChoice.this, Howtouse.class);
				startActivity(intent);
				//startActivity(new Intent(MainActivity.this, MenuList.class));
			}});

		im2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//startActivity(new Intent(MenuList.this, Cafe4.class));
				Intent intent = new Intent(MenuChoice.this, Place.class);
				startActivity(intent);
			}});
	}

}
