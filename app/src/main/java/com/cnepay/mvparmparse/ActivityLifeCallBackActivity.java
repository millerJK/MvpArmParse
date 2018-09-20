package com.cnepay.mvparmparse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * applcation 的回调要快于本身activity的生命周期回调
 */
public class ActivityLifeCallBackActivity extends AppCompatActivity {

    public static final String TAG = "ActivityLifeCallBackActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_call_back);
        Log.e(TAG, "onCreate ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy ");
    }
}
