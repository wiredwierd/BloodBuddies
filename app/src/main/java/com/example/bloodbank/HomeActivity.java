package com.example.bloodbank;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.google.android.gms.maps.model.MarkerOptions;

public class HomeActivity extends AppCompatActivity {
        ProgressBar progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        progress=findViewById(R.id.login_progress);
        ProgressBarAnimation anim = new ProgressBarAnimation(progress, 0, 100);
        anim.setDuration(1000);
        progress.startAnimation(anim);
        progress.setVisibility(View.VISIBLE);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(HomeActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();


            }
        }, 4000);

    }
}
