package com.example.user.drawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by User on 4/23/2016.
 */
public class SplashClass extends Activity{
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.splash_screen);

        Thread startTime = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    Intent i = new Intent(SplashClass.this, MainActivity.class);
                    startActivity(i);
                    finish();

                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        };
        startTime.start();
    }
}
