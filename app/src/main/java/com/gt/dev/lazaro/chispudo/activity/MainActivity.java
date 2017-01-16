package com.gt.dev.lazaro.chispudo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.gt.dev.lazaro.chispudo.R;

/**
 * 26/12/2016 Guatemala city
 * Todos los derechos reservados Fernando Lazaro
 */


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnPlay, btnText, btnGlosario, btnQuizDaily, btnAbout, btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startVars();
    }

    private void startVars() {
        btnPlay = (ImageButton) findViewById(R.id.btn_play);
        btnText = (ImageButton) findViewById(R.id.btn_text);
        btnGlosario = (ImageButton) findViewById(R.id.btn_glosario);
        btnQuizDaily = (ImageButton) findViewById(R.id.btn_quiz_daily);
        btnAbout = (ImageButton) findViewById(R.id.btn_about);
        btnSetting = (ImageButton) findViewById(R.id.btn_settings);

        btnPlay.setOnClickListener(this);
        btnText.setOnClickListener(this);
        btnGlosario.setOnClickListener(this);
        btnQuizDaily.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnSetting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_play:
                startActivity(new Intent(MainActivity.this, QuizMainActivity.class));
                break;
            case R.id.btn_text:
                startActivity(new Intent(MainActivity.this, TextoActivity.class));
                break;
            case R.id.btn_glosario:
                startActivity(new Intent(MainActivity.this, GlosarioActivty.class));
                break;
            case R.id.btn_quiz_daily:
                //startActivity(new Intent(MainActivity.this, ));
                break;
            case R.id.btn_about:
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                break;
            case R.id.btn_settings:
                //startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                break;
        }
    }
}
