package com.gt.dev.lazaro.chispudo.activity.play;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.github.fcannizzaro.materialstepper.style.TabStepper;
import com.gt.dev.lazaro.chispudo.R;
import com.gt.dev.lazaro.chispudo.fragments.pilas.APilasQuestion;
import com.gt.dev.lazaro.chispudo.fragments.pilas.EPilasQuestion;
import com.gt.dev.lazaro.chispudo.fragments.pilas.IPilasQuestion;

public class PilasQuizActivity extends TabStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        boolean linear = getIntent().getBooleanExtra("linear", false);

        setErrorTimeout(1500);
        setLinear(linear);
        setTitle("Title");
        setAlternativeTab(true);

        addStep(createFragment(new APilasQuestion()));
        addStep(createFragment(new EPilasQuestion()));
        addStep(createFragment(new IPilasQuestion()));

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
