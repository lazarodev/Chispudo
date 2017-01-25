package com.gt.dev.lazaro.chispudo.activity.play;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.github.fcannizzaro.materialstepper.style.TabStepper;
import com.gt.dev.lazaro.chispudo.fragments.wiuro.AWiuroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.wiuro.BWiuroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.wiuro.CWiuroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.wiuro.DWiuroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.wiuro.EWiuroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.wiuro.FWiuroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.wiuro.GWiuroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.wiuro.HWiuroQuestion;
import com.gt.dev.lazaro.chispudo.fragments.wiuro.IWiuroQuest;
import com.gt.dev.lazaro.chispudo.fragments.wiuro.JWiuroQuestion;

public class WiuroQuizActivity extends TabStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        boolean linear = getIntent().getBooleanExtra("linear", false);

        setErrorTimeout(1500);
        setLinear(linear);
        setTitle("Tab Stepper <small>(" + (linear ? "" : "Non ") + "Linear)</small>");
        setAlternativeTab(true);

        addStep(createFragment(new AWiuroQuestion()));
        addStep(createFragment(new BWiuroQuestion()));
        addStep(createFragment(new CWiuroQuestion()));
        addStep(createFragment(new DWiuroQuestion()));
        addStep(createFragment(new EWiuroQuestion()));
        addStep(createFragment(new FWiuroQuestion()));
        addStep(createFragment(new GWiuroQuestion()));
        addStep(createFragment(new HWiuroQuestion()));
        addStep(createFragment(new IWiuroQuest()));
        addStep(createFragment(new JWiuroQuestion()));

        super.onCreate(savedInstanceState);
    }

    private AbstractStep createFragment(AbstractStep fragment) {
        Bundle b = new Bundle();
        b.putInt("position", i++);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public void onComplete() {
        super.onComplete();
    }
}
