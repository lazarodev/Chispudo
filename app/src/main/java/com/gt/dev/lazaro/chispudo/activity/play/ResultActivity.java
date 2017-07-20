package com.gt.dev.lazaro.chispudo.activity.play;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gt.dev.lazaro.chispudo.R;

public class ResultActivity extends AppCompatActivity {

    private TextView tvResult, tvPositive, tvNegative;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResult = (TextView) findViewById(R.id.tv_result_point);
        tvPositive = (TextView) findViewById(R.id.tv_positive_message);
        tvNegative = (TextView) findViewById(R.id.tv_negative_message);

        btnOk = (Button) findViewById(R.id.btn_ok_result);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
