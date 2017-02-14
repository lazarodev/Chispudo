package com.gt.dev.lazaro.chispudo.fragments.wiuro;

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

public class CWiuroQuestion extends AbstractStep implements View.OnClickListener {

    public static int cWiuro;
    private Button btn1, btn2, btn3, btn4;
    int click;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.c_wiuro_question, container, false);

        btn1 = (Button) v.findViewById(R.id.btn_c_one_wiuro);
        btn2 = (Button) v.findViewById(R.id.btn_c_two_wiuro);
        btn3 = (Button) v.findViewById(R.id.btn_c_three_wiuro);
        btn4 = (Button) v.findViewById(R.id.btn_c_four_wiuro);

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
            case R.id.btn_c_one_wiuro:
                cWiuro = 0;
                click++;
                break;
            case R.id.btn_c_two_wiuro:
                cWiuro = 0;
                click++;
                break;
            case R.id.btn_c_three_wiuro:
                cWiuro = 0;
                click++;
                break;
            case R.id.btn_c_four_wiuro:
                cWiuro = 1;
                click++;
                break;
        }
    }
}
