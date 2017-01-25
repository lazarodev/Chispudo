package com.gt.dev.lazaro.chispudo.activity.play;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.github.fcannizzaro.materialstepper.style.TabStepper;
import com.gt.dev.lazaro.chispudo.R;
import com.gt.dev.lazaro.chispudo.fragments.chilero.AChileroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chilero.BChileroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chilero.CChileroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chilero.DChileroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chilero.EChileroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chilero.FChileroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chilero.GChileroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chilero.IChileroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chilero.JChileroQuestion;

public class ChileroQuizActivity extends TabStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        boolean linear = getIntent().getBooleanExtra("linear", false);

        setErrorTimeout(1500);
        setLinear(linear);
        setTitle("Tab Stepper <small>(" + (linear ? "" : "Non ") + "Linear)</small>");
        setAlternativeTab(true);

        addStep(createFragment(new AChileroQuestion()));
        addStep(createFragment(new BChileroQuestion()));
        addStep(createFragment(new CChileroQuestion()));
        addStep(createFragment(new DChileroQuestion()));
        addStep(createFragment(new EChileroQuestion()));
        addStep(createFragment(new FChileroQuestion()));
        addStep(createFragment(new GChileroQuestion()));
        addStep(createFragment(new IChileroQuestion()));
        addStep(createFragment(new JChileroQuestion()));
        super.onCreate(savedInstanceState);

    }

    private AbstractStep createFragment(AbstractStep fragment) {
        Bundle b = new Bundle();
        b.putInt("position", i++);
        fragment.setArguments(b);
        return fragment;
    }
}
