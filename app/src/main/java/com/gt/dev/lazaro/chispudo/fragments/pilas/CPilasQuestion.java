package com.gt.dev.lazaro.chispudo.fragments.pilas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.gt.dev.lazaro.chispudo.R;

/**
 * Created by Lazarus on 31/12/2016.
 */

public class CPilasQuestion extends AbstractStep implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4;
    public int cPilas;
    int click;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.c_pilas_question, container, false);

        btn1 = (Button) v.findViewById(R.id.btn_c_one_pilas);
        btn2 = (Button) v.findViewById(R.id.btn_c_two_pilas);
        btn3 = (Button) v.findViewById(R.id.btn_c_three_pilas);
        btn4 = (Button) v.findViewById(R.id.btn_c_four_pilas);

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
            case R.id.btn_c_one_pilas:
                cPilas = 1;
                click++;
                break;
            case R.id.btn_c_two_pilas:
                cPilas = 0;
                click++;
                break;
            case R.id.btn_c_three_pilas:
                cPilas = 0;
                click++;
                break;
            case R.id.btn_c_four_pilas:
                cPilas = 0;
                click++;
                break;
        }
    }
}
