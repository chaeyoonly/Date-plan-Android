package com.example.dateplan;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;


public class Location extends Activity {
   int i,d=0,num=0;
   double latitude = 37.545888;
   double longitude = 126.971848;
   LatLng LOC = new LatLng(latitude, longitude);
   LatLng L = new LatLng(37.5, 120);
   
   double pp1,pp2;
   LatLng p1=new LatLng(pp1,pp2);
   
   double pp3,pp4;
   LatLng p2=new LatLng(pp3,pp4);
   
   LatLng a1,a2;
   GoogleMap mMap;
   MarkerOptions optFirst;
   
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.location_my);
      
      mMap = ((MapFragment)getFragmentManager()
            .findFragmentById(R.id.map)).getMap();
      
      ImageButton bb=(ImageButton)findViewById(R.id.b1);

      
      
      mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LOC, 16));

      optFirst = new MarkerOptions();
       optFirst.position(new LatLng(37.521280, 127.041268));// 위도 • 경도
       optFirst.title("");// 제목 미리보기
       optFirst.snippet("Snippet");
       optFirst.icon(BitmapDescriptorFactory
               .fromResource(R.drawable.ic_launcher));
       mMap.addMarker(optFirst).showInfoWindow();

       MarkerOptions optSecond = new MarkerOptions();
       optSecond.position(new LatLng(37.521280, 127.041268));// 위도 • 경도
       optSecond.title(""); // 제목 미리보기
       optSecond.snippet("Snippet2");
       mMap.addMarker(optSecond).showInfoWindow();
    
       i=0;
       d=0;

       bb.setOnClickListener(new OnClickListener(){
           

           @Override
           public void onClick(View v) {
              // TODO Auto-generated method stub
              mMap.addPolyline((new PolylineOptions()
                    .add(a1,a2)
                          .width(10).color(Color.rgb(228, 167, 239))
                    .geodesic(true)));
              double r1=(a1.latitude+a2.latitude)/2;
              double r2=(a1.longitude+a2.longitude)/2;
              
              double p1,p2,p3,p4,p5,p6;

              double p1a = Math.abs(r1- 37.543849);
               double p1b = Math.abs(r2 - 126.965098);
               p1 = p1a + p1b;
               
               double p2a = Math.abs(r1 - 37.568087);
               double p2b = Math.abs(r2 - 126.908761);
               p2 = p2a+p2b;

               double p3a = Math.abs(r1 - 37.657176);
                double p3b = Math.abs(r2 - 127.056449);
                p3 = p3a+p3b;

               double p4a = Math.abs(r1 - 37.521570);
               double p4b = Math.abs(r2 - 127.045605);
               p4 = p4a + p4b;

               double p5a = Math.abs(r1 - 37.574385);
                  double p5b = Math.abs(r2 - 127.003469);
                 p5 = p5a+p5b;

               double p6a = Math.abs(r1 - 37.595622);
               double p6b = Math.abs(r2 - 127.018898);
               p6 = p6a+p6b;
               
               double a[] = { p1,p2,p3, p4,p5,p6 };
               Arrays.sort(a);
               
              LatLng a4 = new LatLng(r1,r2);
              mMap.addMarker(new MarkerOptions()
            .position(a4)
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            .title("만남의장소")
            .snippet("우리여기서만나요^0^"));
              if ( a[0]== p1) {
              mMap.setOnMarkerClickListener(new OnMarkerClickListener(){

                  
                  @Override
                  public boolean onMarkerClick(Marker marker) {
                     // TODO Auto-generated method stub
                     
                         Intent intent = new Intent(Location.this, Yongsan.class);
                         startActivity(intent);// TODO Auto-generated method stub
                        return false;
                      }
              });
              }
                      if ( a[0]== p2) {
                        mMap.setOnMarkerClickListener(new OnMarkerClickListener(){

                             
                             @Override
                             public boolean onMarkerClick(Marker marker) {
                             
                          Intent intent = new Intent(Location.this, Mapo.class);
                          startActivity(intent);// TODO Auto-generated method stub
                        return false;
                       }
                        });
                      }
                      if ( a[0]== p3) {
                            mMap.setOnMarkerClickListener(new OnMarkerClickListener(){

                             
                             @Override
                             public boolean onMarkerClick(Marker marker) {
                          
                          Intent intent = new Intent(Location.this, Nowon.class);
                          startActivity(intent);// TODO Auto-generated method stub
                          
                          return false;
                       }});}
                      if ( a[0]== p4) {
                 mMap.setOnMarkerClickListener(new OnMarkerClickListener(){

                             
                             @Override
                             public boolean onMarkerClick(Marker marker) {
                          
                      
                          Intent intent = new Intent(Location.this, Kangnam.class);
                          startActivity(intent);// TODO Auto-generated method stub
                          
                          return false;
                       
                      }});}
                      if ( a[0]== p5) { mMap.setOnMarkerClickListener(new OnMarkerClickListener(){

                          
                          @Override
                          public boolean onMarkerClick(Marker marker) {
                       
                          Intent intent = new Intent(Location.this, Jongro.class);
                          startActivity(intent);// TODO Auto-generated method stub
                          
                          return false;
                       }});}
                      if ( a[0]== p6) { mMap.setOnMarkerClickListener(new OnMarkerClickListener(){

                          
                          @Override
                          public boolean onMarkerClick(Marker marker) {
                       
                          Intent intent = new Intent(Location.this, Sungbook.class);
                          startActivity(intent);// TODO Auto-generated method stub
                          
                          return false;
                       }});}
                 
                      }
       });

       mMap.setOnMapLongClickListener(new OnMapLongClickListener() {
          
              public void onMapLongClick(LatLng point) {
                 
                 while(i<2){
                   
                 if(i==0){
                mMap.addMarker(new MarkerOptions().position(point)
                      .icon(BitmapDescriptorFactory.fromResource(R.drawable.character_new11)));
                a1=point;
                i++;

                num=1;
                 }
                 else if(i==1){
                    
                    mMap.setOnMapLongClickListener(new OnMapLongClickListener() {
                       
                       public void onMapLongClick(LatLng point) {
                          while(d==0){
                          mMap.addMarker(new MarkerOptions().position(point)
                               .icon(BitmapDescriptorFactory.fromResource(R.drawable.character_new11)));
                          a2=point;
                          d++;
                          }
                       }
                       
                    });
                    i++;
                    num=2;
                    
                 }
                 }
              }
   
              
          });
         mMap.setOnMarkerClickListener(new OnMarkerClickListener(){

            

            @Override
            public boolean onMarkerClick(Marker marker) {
               // TODO Auto-generated method stub
               while(i<2){
                  if(num==1){
                     p1=marker.getPosition();
                     String text="1번"+marker.getPosition();
                     Toast.makeText(getApplicationContext(), text, text.length()).show();
                  
                  }
                  else if(num==2){
                     p2 = marker.getPosition();
                     String text="2번"+marker.getPosition();
                     Toast.makeText(getApplicationContext(), text, text.length()).show();
                     
                  }
               
               }
               return false;
            }
            
         } );
         
                
      
      
      /*mMap.addMarker(
            new MarkerOptions()
            .position(LOC)
            .icon(BitmapDescriptorFactory.defaultMarker(
                  BitmapDescriptorFactory.HUE_CYAN))
                  .title("도라에몽")
                  .snippet("귀여우ㅏ"));
                  */
      /*mMap.addMarker(
            new MarkerOptions()
            .position(LOC)
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher)
                  .title("도라에몽")
                  .snippet("귀여우"));
      mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(LOC, 16));
      */
      /*Marker mk = mMap.addMarker(
            new MarkerOptions()
            .position(LOC)
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.aa))
                  .title("도라에몽")
                  .snippet("귀여우"));
      mk.showInfoWindow();   
      mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(LOC, 16));
      */
   
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      // Handle action bar item clicks here. The action bar will
      // automatically handle clicks on the Home/Up button, so long
      // as you specify a parent activity in AndroidManifest.xml.
      int id = item.getItemId();
      if (id == R.id.action_settings) {
         return true;
      }
      return super.onOptionsItemSelected(item);
   }

}