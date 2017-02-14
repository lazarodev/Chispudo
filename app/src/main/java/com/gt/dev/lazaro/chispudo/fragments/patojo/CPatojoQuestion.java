package com.gt.dev.lazaro.chispudo.fragments.patojo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.gt.dev.lazaro.chispudo.R;

/**
 * Created by Lazarus on 29/12/2016.
 */

public class CPatojoQuestion extends AbstractStep implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4;
    public int cPatojo;
    int click;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.c_patojo_question, container, false);

        btn1 = (Button) v.findViewById(R.id.btn_c_one_patojo);
        btn2 = (Button) v.findViewById(R.id.btn_c_two_patojo);
        btn3 = (Button) v.findViewById(R.id.btn_c_three_patojo);
        btn4 = (Button) v.findViewById(R.id.btn_c_four_patojo);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        return v;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_b_one_patojo:
                cPatojo = 0;
                click++;
                break;
            case R.id.btn_b_two_patojo:
                cPatojo = 1;
                click++;
                break;
            case R.id.btn_b_three_patojo:
                cPatojo = 0;
                click++;
                break;
            case R.id.btn_b_four_patojo:
                cPatojo = 0;
                click++;
                break;
        }
    }
}
