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

public class FPatojoQuestion extends AbstractStep implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4;
    public int fPatojo;
    int click;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.f_patojo_question, container, false);

        btn1 = (Button) v.findViewById(R.id.btn_f_one_patojo);
        btn2 = (Button) v.findViewById(R.id.btn_f_two_patojo);
        btn3 = (Button) v.findViewById(R.id.btn_f_three_patojo);
        btn4 = (Button) v.findViewById(R.id.btn_f_four_patojo);

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
            case R.id.btn_f_one_chilero:
                fPatojo = 0;
                click++;
                break;
            case R.id.btn_f_two_chilero:
                fPatojo = 0;
                click++;
                break;
            case R.id.btn_f_three_chilero:
                fPatojo = 0;
                click++;
                break;
            case R.id.btn_f_four_chilero:
                fPatojo = 1;
                click++;
                break;
        }
    }
}
