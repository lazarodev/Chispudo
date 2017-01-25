package com.gt.dev.lazaro.chispudo.activity.play;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.github.fcannizzaro.materialstepper.style.TabStepper;
import com.gt.dev.lazaro.chispudo.R;
import com.gt.dev.lazaro.chispudo.fragments.patojo.APatojoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.patojo.BPatojoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.patojo.CPatojoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.patojo.DPatojoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.patojo.EPatojoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.patojo.FPatojoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.patojo.GPatojoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.patojo.HPatojoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.patojo.IPatojoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.patojo.JPatojoQuestion;

public class PatojoQuizActivity extends TabStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        boolean linear = getIntent().getBooleanExtra("linear", false);

        setErrorTimeout(1500);
        setLinear(linear);
        setTitle("Tab Stepper <small>(" + (linear ? "" : "Non ") + "Linear)</small>");
        setAlternativeTab(true);

        addStep(createFragment(new APatojoQuestion()));
        addStep(createFragment(new BPatojoQuestion()));
        addStep(createFragment(new CPatojoQuestion()));
        addStep(createFragment(new DPatojoQuestion()));
        addStep(createFragment(new EPatojoQuestion()));
        addStep(createFragment(new FPatojoQuestion()));
        addStep(createFragment(new GPatojoQuestion()));
        addStep(createFragment(new HPatojoQuestion()));
        addStep(createFragment(new IPatojoQuestion()));
        addStep(createFragment(new JPatojoQuestion()));

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
