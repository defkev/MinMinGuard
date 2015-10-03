package tw.fatminmin.xposed.minminguard.ui;

import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

import tw.fatminmin.xposed.minminguard.R;

/**
 * Created by fatminmin on 2015/10/3.
 */
public class MinMinGuardIntro extends AppIntro {
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(AppIntroFragment.newInstance(
                getResources().getString(R.string.intro_auto_title),
                getResources().getString(R.string.intro_auto_content),
                R.drawable.intro1, Color.parseColor("#4CAE50")));
        addSlide(AppIntroFragment.newInstance(
                getResources().getString(R.string.intro_manual_title),
                getResources().getString(R.string.intro_manual_content),
                R.drawable.intro2, Color.parseColor("#4CAE50")));
    }

    @Override
    public void onSkipPressed() {
        finish();
    }

    @Override
    public void onDonePressed() {
        finish();
    }
}
