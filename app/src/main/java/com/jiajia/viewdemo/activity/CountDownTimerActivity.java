package com.jiajia.viewdemo.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jiajia.viewdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author yangjiajia
 */
public class CountDownTimerActivity extends AppCompatActivity {
    private static final String TAG = "CountDownTimerActivity";

    @BindView(R.id.btn_count_down_start)
    Button btnCountDownStart;
    @BindView(R.id.btn_count_down_start_1)
    Button btnCountDownStart1;
    @BindView(R.id.btn_count_down_end)
    Button btnCountDownEnd;
    @BindView(R.id.btn_count_down_time)
    TextView btnCountDownTime;
    CountDownTimer mCountDownTimer;
    StringBuilder mStringBuilder;

    public static void start(Context context) {
        Intent starter = new Intent(context, CountDownTimerActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down_timer);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_count_down_start, R.id.btn_count_down_start_1, R.id.btn_count_down_end})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_count_down_start:
                mCountDownTimer = new CountDownTimer(30000, 1000) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        Log.d(TAG, "onTick: millisUntilFinished=" + millisUntilFinished);
                        String timeStr = getTimeStr(millisUntilFinished);
                        btnCountDownTime.setText(timeStr);
                    }

                    @Override
                    public void onFinish() {
                        Log.d(TAG, "onTick: millisUntilFinished onFinish=" );
                    }
                };
                mCountDownTimer.start();
                break;
            case R.id.btn_count_down_start_1:
                mCountDownTimer.start();
                break;
            case R.id.btn_count_down_end:
                mCountDownTimer.cancel();
                break;
            default:
                break;
        }
    }


    private String getTimeStr(long millisUntilFinished) {
        long hours = millisUntilFinished / 1000 / 3600;
        long minutes = (millisUntilFinished / 1000 % 3600) / 60;
//        long seconds = millisUntilFinished / 1000 % 60;
        long seconds = Math.round(millisUntilFinished / 1000f) % 60;
        if (mStringBuilder == null) {
            mStringBuilder = new StringBuilder();
        }
        mStringBuilder.setLength(0);

        if (hours < 10) {
            mStringBuilder.append(0);
        }
        mStringBuilder.append(hours);
        mStringBuilder.append(":");

        if (minutes < 10) {
            mStringBuilder.append(0);
        }
        mStringBuilder.append(minutes);
        mStringBuilder.append(":");

        if (seconds < 10) {
            mStringBuilder.append(0);
        }
        mStringBuilder.append(seconds);
        return mStringBuilder.toString();
    }

}
