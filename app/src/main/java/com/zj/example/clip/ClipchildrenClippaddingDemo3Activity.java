package com.zj.example.clip;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;

/**
 * clipToPadding属性定义了是否允许ViewGroup在padding中绘制,该值默认为true,即不允许.
 * create by zhengjiong
 * Date: 2015-04-02
 * Time: 21:50
 */
public class ClipchildrenClippaddingDemo3Activity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clipchildren_clippadding_demo3_layout);


    }

    public void onClick(View view) {
        ScaleAnimation anim = (ScaleAnimation) AnimationUtils.loadAnimation(this, R.anim.scale_anim);

        view.startAnimation(anim);
    }
}
