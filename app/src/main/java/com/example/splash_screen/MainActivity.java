package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 5000;

    //Here all id
    View lineOne,linetwo,lineThree,lineFour,lineFive,lineSix;
    TextView tag,tagLine;

    //For Animations
    Animation topAnimation,bottomAnimation,middleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        //All Id
        lineOne = findViewById(R.id.lineOne);
        linetwo = findViewById(R.id.lineTwo);
        lineThree = findViewById(R.id.lineThree);
        lineFour = findViewById(R.id.lineFour);
        lineFive = findViewById(R.id.lineFive);
        lineSix = findViewById(R.id.lineSix);

        tag = findViewById(R.id.tag);
        tagLine = findViewById(R.id.tagLine);

        //Setting Animation

        lineOne.setAnimation(topAnimation);
        linetwo.setAnimation(topAnimation);
        lineThree.setAnimation(topAnimation);
        lineFour.setAnimation(topAnimation);
        lineFive.setAnimation(topAnimation);
        lineSix.setAnimation(topAnimation);

        tag.setAnimation(middleAnimation);
        tagLine.setAnimation(bottomAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}