package com.gt.dev.lazaro.chispudo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created 26/12/2016
 * Todos los derechos reservados Fernando Lazaro
 */

public class SplashActivity extends AppCompatActivity {

    protected final static long TIEMPO = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        theTimer();
    }

    private void theTimer() {
        Thread timer = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(TIEMPO);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //startActivity(new Intent(this, NewActivity.class));
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        finish();
        super.onPause();
    }
}
