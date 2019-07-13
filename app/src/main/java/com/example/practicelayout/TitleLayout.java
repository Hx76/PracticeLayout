package com.example.practicelayout;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.jar.Attributes;

public class TitleLayout extends LinearLayout {
   public TitleLayout(Context context, AttributeSet attrs) {
       super(context, attrs);
       LayoutInflater.from(context).inflate(R.layout.title,this);
       Button button1 = findViewById(R.id.button1);
       Button button2 = findViewById(R.id.button2);
       button1.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View view) {
               ((Activity)getContext()).finish();
           }
       });
       button2.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getContext(),"ohohohohoh",Toast.LENGTH_SHORT).show();
           }
       });
   }
}
