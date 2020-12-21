package com.example.masterd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;
import android.media.MediaPlayer;

public class Splash extends AppCompatActivity {
    MediaPlayer mdAye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mdAye = new MediaPlayer();
        mdAye = MediaPlayer.create(this, R.raw.aye);
        mdAye.start();

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                finish();
                mdAye.pause();
                startActivity(new Intent(Splash.this, RecipeListActivity.class));

            }
        };
        Timer opening= new Timer();
        opening.schedule(task,5000);
    }
}