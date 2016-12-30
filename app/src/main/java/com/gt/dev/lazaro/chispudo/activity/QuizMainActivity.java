package com.gt.dev.lazaro.chispudo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.gt.dev.lazaro.chispudo.R;

public class QuizMainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnWiuro, btnPatojo, btnChilero, btnPilas, btnChispudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main);

        startVars();
    }

    private void startVars() {
        btnWiuro = (ImageButton) findViewById(R.id.btn_wiuro_level);
        btnPatojo = (ImageButton) findViewById(R.id.btn_patojo_level);
        btnChilero = (ImageButton) findViewById(R.id.btn_chilero_level);
        btnPilas = (ImageButton) findViewById(R.id.btn_pilas_level);
        btnChispudo = (ImageButton) findViewById(R.id.btn_chispudo_level);

        btnWiuro.setOnClickListener(this);
        btnPatojo.setOnClickListener(this);
        btnChilero.setOnClickListener(this);
        btnPilas.setOnClickListener(this);
        btnChispudo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_wiuro_level:
                break;
            case R.id.btn_patojo_level:
                break;
            case R.id.btn_chilero_level:
                break;
            case R.id.btn_pilas_level:
                break;
            case R.id.btn_chispudo_level:
                break;
        }
    }
}
