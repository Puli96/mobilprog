package com.example.bead;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView)findViewById(R.id.mainImage);
        imageView.setBackgroundResource(R.drawable.animation);
        animation = (AnimationDrawable)imageView.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

        animation.start();
    }
}
