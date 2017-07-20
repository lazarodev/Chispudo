package com.gt.dev.lazaro.chispudo.fragments.chilero;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.gt.dev.lazaro.chispudo.R;

/**
 * Created by Lazarus on 30/12/2016.
 */

public class JChileroQuestion extends AbstractStep implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4;
    public static int jChilero;
    int click;
    private int aValue, bValue, cValue, dValue, eValue, fValue, gValue, hValue, iValue, totalCount;
    String getResult;
    String varInfo;

    public String getVarFinal() {
        return varInfo;
    }

    public void setVarFinal(String varStudy) {
        this.varInfo = varStudy;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.j_chilero_question, container, false);

        btn1 = (Button) v.findViewById(R.id.btn_j_one_chilero);
        btn2 = (Button) v.findViewById(R.id.btn_j_two_chilero);
        btn3 = (Button) v.findViewById(R.id.btn_j_three_chilero);
        btn4 = (Button) v.findViewById(R.id.btn_j_four_chilero);

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
    public boolean nextIf() {
        return click > 0;
    }

    @Override
    public String error() {
        return getString(R.string.error_message_push_button);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_j_one_chilero:
                jChilero = 0;
                click++;
                break;
            case R.id.btn_j_two_chilero:
                jChilero = 0;
                click++;
                break;
            case R.id.btn_j_three_chilero:
                jChilero = 0;
                click++;
                break;
            case R.id.btn_j_four_chilero:
                jChilero = 1;
                click++;
                break;
        }
    }

    public void finalValue() {
        aValue = AChileroQuestion.aChilero;
        bValue = BChileroQuestion.bChilero;
        cValue = CChileroQuestion.cChilero;
        dValue = DChileroQuestion.dChilero;
        eValue = EChileroQuestion.eChilero;
        fValue = FChileroQuestion.fChilero;
        gValue = GChileroQuestion.gChilero;
        hValue = HChileroQuestion.hChilero;
        iValue = IChileroQuestion.iChilero;

        totalCount = aValue + bValue + cValue + dValue + eValue + fValue + gValue + hValue + iValue + jChilero;

        String sum = String.valueOf(totalCount);
        Log.d("SUMATORIO_TOTAL", sum);

        if (totalCount <= 32) {

        } else if (totalCount >= 33 && totalCount <= 34) {

        }

        this.varInfo = getResult;
    }

}
