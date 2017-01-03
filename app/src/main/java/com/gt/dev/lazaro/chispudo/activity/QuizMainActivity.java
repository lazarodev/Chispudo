package com.gt.dev.lazaro.chispudo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.gt.dev.lazaro.chispudo.R;
import com.gt.dev.lazaro.chispudo.activity.play.ChileroQuizActivity;
import com.gt.dev.lazaro.chispudo.activity.play.ChispudoQuizActivity;
import com.gt.dev.lazaro.chispudo.activity.play.PatojoQuizActivity;
import com.gt.dev.lazaro.chispudo.activity.play.PilasQuizActivity;
import com.gt.dev.lazaro.chispudo.activity.play.WiuroQuizActivity;

public class QuizMainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnWiuro, btnPatojo, btnChilero, btnPilas, btnChispudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main);

        // Get the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
                startActivity(new Intent(QuizMainActivity.this, WiuroQuizActivity.class));
                break;
            case R.id.btn_patojo_level:
                startActivity(new Intent(QuizMainActivity.this, PatojoQuizActivity.class));
                break;
            case R.id.btn_chilero_level:
                startActivity(new Intent(QuizMainActivity.this, ChileroQuizActivity.class));
                break;
            case R.id.btn_pilas_level:
                startActivity(new Intent(QuizMainActivity.this, PilasQuizActivity.class));
                break;
            case R.id.btn_chispudo_level:
                startActivity(new Intent(QuizMainActivity.this, ChispudoQuizActivity.class));
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
