package com.jiajia.viewdemo.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jiajia.viewdemo.R;

/**
 * @author yangjiajia
 */
public class ViewGroupActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, ViewGroupActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_group);
    }
}
