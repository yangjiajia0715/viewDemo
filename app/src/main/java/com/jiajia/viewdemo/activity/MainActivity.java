package com.jiajia.viewdemo.activity;

import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.jiajia.viewdemo.R;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author yangjiajia
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private CountDownTimer mCountDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        LayoutInflater.from(this).inflate(R.layout.item_temp, null);
    }

    @OnClick({R.id.btn_view_1, R.id.btn_view_2, R.id.btn_view_3, R.id.btn_view_4,
            R.id.btn_view_5, R.id.btn_view_6, R.id.btn_view_7})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_view_1:
                xmlPullParser();
                break;
            case R.id.btn_view_2:
                EventDispatchActivity.start(this);
//                mCountDownTimer = new CountDownTimer(20000, 5000) {
//
//                    @Override
//                    public void onTick(long millisUntilFinished) {
//                        Log.d(TAG, "onTick: millisUntilFinished=" + millisUntilFinished);
//                    }
//
//                    @Override
//                    public void onFinish() {
//                        Log.d(TAG, "onTick: millisUntilFinished onFinish=" );
//                    }
//                };
//                mCountDownTimer.start();
                break;
            case R.id.btn_view_3:
                ViewGroupActivity.start(this);
                break;
            case R.id.btn_view_4:
                // 123456 36
                long millisUntilFinished = 123456789L;
                long seconds = millisUntilFinished / 1000 % 60;
                Log.d(TAG, "onViewClicked: ///=" + (millisUntilFinished / 1000));
                Log.d(TAG, "onViewClicked: ///=" + Math.round(millisUntilFinished / 1000.0f));
                Log.d(TAG, "onViewClicked: ///=" + (Math.round(millisUntilFinished / 1000.0) % 60));
                Log.d(TAG, "onViewClicked: seconds=" + seconds);
                // 21 00000 00000
                //
                break;
            case R.id.btn_view_5:
                LifeCircleActivity.start(this);
                break;
            case R.id.btn_view_6:
                ProgressBarActivity.start(this);
                break;
            case R.id.btn_view_7:
//                CountDownTimerActivity.start(this);
                CustomViewActivity.start(this);
                break;
            default:
                break;
        }
    }

    private void xmlPullParser() {
        //                try {
//                    XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
//                    XmlPullParser xmlPullParser = xmlPullParserFactory.newPullParser();
//                } catch (XmlPullParserException e) {
//                    e.printStackTrace();
//                }

        XmlResourceParser parser = getResources().getXml(R.xml.file_paths);
        try {
            int eventType;
            while ((eventType = parser.next()) != XmlPullParser.END_DOCUMENT) {
                if (eventType == XmlPullParser.START_DOCUMENT) {
                    Log.d(TAG, "xmlPullParser: Start document");
                } else if (eventType == XmlPullParser.START_TAG) {
                    Log.d(TAG, "xmlPullParser: START_TAG " + parser.getName()
                            + ",getAttributeCount=" + parser.getAttributeCount());
                    if (parser.getName().endsWith("-path")) {
                        Log.w(TAG, "xmlPullParser: START_TAG " + parser.getName()
                                + ",getAttributeCount=" + parser.getAttributeCount()
                                + parser.getAttributeName(0)
                                + ":" + parser.getAttributeValue(0));
                    }
                } else if (eventType == XmlPullParser.END_TAG) {
                    Log.d(TAG, "xmlPullParser: END_TAG " + parser.getName());
                } else if (eventType == XmlPullParser.TEXT) {
                    Log.d(TAG, "xmlPullParser: TEXT" + parser.getText());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
