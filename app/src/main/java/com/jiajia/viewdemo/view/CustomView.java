package com.jiajia.viewdemo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.jiajia.viewdemo.R;

public class CustomView extends View {
    private static final String TAG = "ConstructorView";

    public CustomView(Context context) {
        this(context, null);
        Log.d(TAG, "ConstructorView: 一个参数" + context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, R.attr.customViewStyle);
        Log.d(TAG, "ConstructorView: 两个参数");
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG, "ConstructorView: 三个参数");
        for (int i = 0; i < attrs.getAttributeCount(); i++) {
        }
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CustomView, defStyleAttr, 0);

        Log.d(TAG, "attr1 => " + array.getString(R.styleable.CustomView_attr1));
        Log.d(TAG, "attr2 => " + array.getString(R.styleable.CustomView_attr2));
        Log.d(TAG, "attr3 => " + array.getString(R.styleable.CustomView_attr3));
        Log.d(TAG, "attr4 => " + array.getString(R.styleable.CustomView_attr4));
        Log.d(TAG, "attr5 => " + array.getString(R.styleable.CustomView_attr5));
        Log.d(TAG, "attr6 => " + array.getString(R.styleable.CustomView_attr6));
        array.recycle();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    //    public ConstructorView(Context context, @androidx.annotation.Nullable @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }
}
