package com.jiajia.viewdemo.view;

import android.content.Context;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class CustomProgressBar extends ProgressBar {
    public CustomProgressBar(Context context) {
        super(context);
    }

    public CustomProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected synchronized void onMeasure(int widthMeasureSpec,
                                          int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final int roundCorners = 15;
    //就是改变这个值，就可以改变自定义progressbar左右两端的圆角大小了，使用于自定义图片的情况，
    Shape getDrawableShape() {
        final float[] roundedCorners = new float[] { 0, 0, 0, 0, 0, 0, 0, 0 };
        for(int i=0;i<roundedCorners.length;i++){
            roundedCorners[i] = dp2px(getContext(), roundCorners);
        }
        return new RoundRectShape(roundedCorners, null, null);
    }

    private float dp2px(Context context, int roundCorners) {
//        return getResources().getD;

        return roundCorners * 3;
    }


}
