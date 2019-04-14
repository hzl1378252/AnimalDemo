package com.android.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.TranslateAnimation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startAnimal(line)
    }

    fun startAnimal(view: View){
        //位移动画
        val  mAnimation = TranslateAnimation(TranslateAnimation.ABSOLUTE, 0f,TranslateAnimation.ABSOLUTE,0f,TranslateAnimation.RELATIVE_TO_PARENT, 0f,TranslateAnimation.RELATIVE_TO_PARENT, 0.9f);
        mAnimation.setDuration(1500);
        mAnimation.setRepeatCount(-1);
        mAnimation.setRepeatMode(Animation.RESTART);
        mAnimation.setInterpolator( LinearInterpolator());
        view .setAnimation(mAnimation);
    }
}
