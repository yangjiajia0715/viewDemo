package com.jiajia.viewdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author yangjiajia
 */
public class ProgressBarActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, ProgressBarActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
//        Drawable.createFromXml(getResources(), )
//        ClipDrawable.createFromPath()
    }
}
