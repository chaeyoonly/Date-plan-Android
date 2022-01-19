package com.example.dateplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Place extends Activity{
	
	private ImageButton im1,im2,im3,im4,im5,im6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.place);
		
		im1 = (ImageButton)findViewById(R.id.gu01);
		im2 = (ImageButton)findViewById(R.id.gu02);
		im3 = (ImageButton)findViewById(R.id.gu03);
		im4 = (ImageButton)findViewById(R.id.gu04);
		im5 = (ImageButton)findViewById(R.id.gu05);
		im6 = (ImageButton)findViewById(R.id.gu06);
		
		im1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Place.this, Yongsan.class);
				startActivity(intent);
				//startActivity(new Intent(MainActivity.this, MenuList.class));
			}});

		im2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//startActivity(new Intent(MenuList.this, Cafe4.class));
				Intent intent = new Intent(Place.this, Mapo.class);
				startActivity(intent);
			}});
					
		im3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//startActivity(new Intent(MenuList.this, Cafe4.class));
				Intent intent = new Intent(Place.this, Nowon.class);
				startActivity(intent);
			}});
		
		im4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//startActivity(new Intent(MenuList.this, Cafe4.class));
				Intent intent = new Intent(Place.this, Kangnam.class);
				startActivity(intent);
			}});
		
		im5.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//startActivity(new Intent(MenuList.this, Cafe4.class));
				Intent intent = new Intent(Place.this, Jongro.class);
				startActivity(intent);
			}});
		
		im6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//startActivity(new Intent(MenuList.this, Cafe4.class));
				Intent intent = new Intent(Place.this, Sungbook.class);
				startActivity(intent);
			}});

		
	}

}
