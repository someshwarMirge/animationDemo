package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.imageView);
        imageView.setX(-2000);
        imageView.animate().translationXBy(2000).rotation(3600).setDuration(2000);

    }

    boolean x=true;
    public void entry(View view){
        ImageView imageView=findViewById(R.id.imageView);
    if(x){
imageView.animate().alpha(0).setDuration(500);
x=false;
    }else{
        imageView.animate().alpha(1).setDuration(500);
        x=true;
    }
    }
}