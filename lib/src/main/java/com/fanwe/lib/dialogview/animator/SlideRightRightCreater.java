package com.fanwe.lib.dialogview.animator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import com.fanwe.lib.dialogview.DialogView;

/**
 * 右边滑入右边滑出
 */
public class SlideRightRightCreater implements DialogView.AnimatorCreater
{
    @Override
    public Animator createAnimator(boolean show, View view)
    {
        final ObjectAnimator animator = new ObjectAnimator();
        animator.setPropertyName(View.TRANSLATION_X.getName());
        animator.setFloatValues(show ? new float[]{view.getWidth(), 0} : new float[]{0, view.getWidth()});
        animator.setTarget(view);
        return animator;
    }
}
