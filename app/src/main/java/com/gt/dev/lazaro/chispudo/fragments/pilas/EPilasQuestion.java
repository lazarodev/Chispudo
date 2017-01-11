package com.gt.dev.lazaro.chispudo.fragments.pilas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.gt.dev.lazaro.chispudo.R;

/**
 * Created by Lazarus on 31/12/2016.
 */

public class EPilasQuestion extends AbstractStep {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.e_pilas_question, container, false);

        return v;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
