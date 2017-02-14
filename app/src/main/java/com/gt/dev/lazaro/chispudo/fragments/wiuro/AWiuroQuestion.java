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

public class AWiuroQuestion extends AbstractStep implements View.OnClickListener {

    public static int aWiuro;
    private Button btn1, btn2, btn3, btn4;
    int click;

    @Override
    public String name() {
        return null;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.a_wiuro_question, container, false);

        btn1 = (Button) v.findViewById(R.id.btn_a_one_wiuro);
        btn2 = (Button) v.findViewById(R.id.btn_a_two_wiuro);
        btn3 = (Button) v.findViewById(R.id.btn_a_three_wiuro);
        btn4 = (Button) v.findViewById(R.id.btn_a_four_wiuro);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        return v;
    }

    @Override
    public boolean nextIf() {
        return super.nextIf();
    }

    @Override
    public String error() {
        return super.error();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_a_one_wiuro:
                aWiuro = 1;
                click++;
                break;
            case R.id.btn_a_two_wiuro:
                aWiuro = 0;
                click++;
                break;
            case R.id.btn_a_three_wiuro:
                aWiuro = 0;
                click++;
                break;
            case R.id.btn_a_four_wiuro:
                aWiuro = 0;
                click++;
                break;
        }
    }
}
