package com.abhyasika.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by Ramesh Patwardhan on 04 April 2015 at 2:43 PM.
 */
public class SplashActivity extends Activity {
    MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ourSong = MediaPlayer.create(SplashActivity.this, R.raw.splashsound);
        ourSong.start();
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent openMainActivity= new Intent("com.abhyasika.myapplication.MENUACTIVITY");
                    startActivity(openMainActivity);
                }
            }
        };
            timer.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        ourSong.release();
        finish();
    }
}