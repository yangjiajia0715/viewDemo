package com.jiajia.viewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        try {
            XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser xmlPullParser = xmlPullParserFactory.newPullParser();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

    }

    @OnClick({R.id.btn_view_1, R.id.btn_view_2, R.id.btn_view_3, R.id.btn_view_4,
            R.id.btn_view_5, R.id.btn_view_6, R.id.btn_view_7})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_view_1:
                break;
            case R.id.btn_view_2:
                break;
            case R.id.btn_view_3:
                break;
            case R.id.btn_view_4:
                break;
            case R.id.btn_view_5:
                break;
            case R.id.btn_view_6:
                break;
            case R.id.btn_view_7:
                break;
            default:
                break;
        }
    }
}
