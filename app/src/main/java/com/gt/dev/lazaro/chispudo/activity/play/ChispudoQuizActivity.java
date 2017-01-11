package com.gt.dev.lazaro.chispudo.activity.play;

import android.os.Bundle;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.github.fcannizzaro.materialstepper.style.TabStepper;
import com.gt.dev.lazaro.chispudo.R;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.AChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.EChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.IChispudoQuestion;

public class ChispudoQuizActivity extends TabStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        boolean linear = getIntent().getBooleanExtra("linear", false);

        setErrorTimeout(1500);
        setLinear(linear);
        setTitle("Title");
        setAlternativeTab(true);

        addStep(createFragment(new AChispudoQuestion()));
        addStep(createFragment(new EChispudoQuestion()));
        addStep(createFragment(new IChispudoQuestion()));

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
