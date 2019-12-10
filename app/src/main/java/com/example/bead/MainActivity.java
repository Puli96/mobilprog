package com.example.bead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable animation;

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = findViewById(R.id.mainImage);
        imageView.setBackgroundResource(R.drawable.animation);
        animation = (AnimationDrawable)imageView.getBackground();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), MasodikActivity.class);
                startActivity(i);
            }
        });



    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

        animation.start();
    }
}
