package com.gt.dev.lazaro.chispudo.fragments.chispudo;

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

public class AChispudoQuestion extends AbstractStep implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4;
    public static int aChispudo;
    int click;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.a_chispudo_question, container, false);

        btn1 = (Button) v.findViewById(R.id.btn_a_one_chispudo);
        btn2 = (Button) v.findViewById(R.id.btn_a_two_chispudo);
        btn3 = (Button) v.findViewById(R.id.btn_a_three_chispudo);
        btn4 = (Button) v.findViewById(R.id.btn_a_four_chispudo);

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
            case R.id.btn_a_one_chispudo:
                aChispudo = 0;
                click++;
                break;
            case R.id.btn_a_two_chispudo:
                aChispudo = 1;
                click++;
                break;
            case R.id.btn_a_three_chispudo:
                aChispudo = 0;
                click++;
                break;
            case R.id.btn_a_four_chispudo:
                aChispudo = 0;
                click++;
                break;
        }
    }
}
