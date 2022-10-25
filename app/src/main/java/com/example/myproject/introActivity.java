package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class introActivity extends AppCompatActivity {
    ImageView logo,splashImg,app_name;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        splashImg=findViewById(R.id.splashimg);
        logo=findViewById(R.id.logo);
        app_name=findViewById(R.id.app_name);
        lottieAnimationView=findViewById(R.id.lottie);
        splashImg.animate().translationY(-2000).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1800).setDuration(1000).setStartDelay(4000);
        app_name.animate().translationY(1800).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1800).setDuration(1000).setStartDelay(4000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(introActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }
}