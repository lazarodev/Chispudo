package com.gt.dev.lazaro.chispudo.activity.play;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.fcannizzaro.materialstepper.AbstractStep;
import com.github.fcannizzaro.materialstepper.style.TabStepper;
import com.gt.dev.lazaro.chispudo.R;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.AChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.BChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.CChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.DChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.EChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.FChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.GChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.HChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.IChispudoQuestion;
import com.gt.dev.lazaro.chispudo.fragments.chispudo.JChispudoQuestion;

public class ChispudoQuizActivity extends TabStepper {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        boolean linear = getIntent().getBooleanExtra("linear", false);

        setErrorTimeout(1500);
        setLinear(linear);
        setTitle("Title");
        setAlternativeTab(true);

        addStep(createFragment(new AChispudoQuestion()));
        addStep(createFragment(new BChispudoQuestion()));
        addStep(createFragment(new CChispudoQuestion()));
        addStep(createFragment(new DChispudoQuestion()));
        addStep(createFragment(new EChispudoQuestion()));
        addStep(createFragment(new FChispudoQuestion()));
        addStep(createFragment(new GChispudoQuestion()));
        addStep(createFragment(new HChispudoQuestion()));
        addStep(createFragment(new IChispudoQuestion()));
        addStep(createFragment(new JChispudoQuestion()));

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
