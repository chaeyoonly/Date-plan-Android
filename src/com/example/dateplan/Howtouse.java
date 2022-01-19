package com.example.dateplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Howtouse extends Activity{
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);	
			setContentView(R.layout.howtouse);
			
			ImageButton ib2 = (ImageButton)findViewById(R.id.how);
			
			ib2.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//startActivity(new Intent(MainActivity.this, MenuList.class));
					Intent intent = new Intent(Howtouse.this, Location.class);
					startActivity(intent);
				}});
		}
}
