package com.cnepay.mvparmparse;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class FragmentLifecycleCallbacksActivity extends AppCompatActivity {

    public static final String TAG = "FragmentLifecycleCallbacksActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_lifecycle_callbacks);

        Log.e(TAG, "onCreate " );
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() {
            @Override
            public void onFragmentPreAttached(FragmentManager fm, Fragment f, Context context) {
                super.onFragmentPreAttached(fm, f, context);
                Log.e(TAG, "onFragmentPreAttached ");
            }

            @Override
            public void onFragmentAttached(FragmentManager fm, Fragment f, Context context) {
                super.onFragmentAttached(fm, f, context);
                Log.e(TAG, "onFragmentAttached " );
            }

            @Override
            public void onFragmentPreCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
                super.onFragmentPreCreated(fm, f, savedInstanceState);
                Log.e(TAG, "onFragmentPreCreated " );
            }

            @Override
            public void onFragmentCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
                super.onFragmentCreated(fm, f, savedInstanceState);
                Log.e(TAG, "onFragmentCreated " );
            }

            @Override
            public void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
                super.onFragmentActivityCreated(fm, f, savedInstanceState);
                Log.e(TAG, "onFragmentActivityCreated ");
            }

            @Override
            public void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle savedInstanceState) {
                super.onFragmentViewCreated(fm, f, v, savedInstanceState);
                Log.e(TAG, "onFragmentViewCreated " );
            }

            @Override
            public void onFragmentStarted(FragmentManager fm, Fragment f) {
                super.onFragmentStarted(fm, f);
                Log.e(TAG, "onFragmentStarted " );
            }

            @Override
            public void onFragmentResumed(FragmentManager fm, Fragment f) {
                super.onFragmentResumed(fm, f);
                Log.e(TAG, "onFragmentResumed " );
            }

            @Override
            public void onFragmentPaused(FragmentManager fm, Fragment f) {
                super.onFragmentPaused(fm, f);
                Log.e(TAG, "onFragmentPaused " );
            }

            @Override
            public void onFragmentStopped(FragmentManager fm, Fragment f) {
                super.onFragmentStopped(fm, f);
                Log.e(TAG, "onFragmentStopped " );
            }

            @Override
            public void onFragmentSaveInstanceState(FragmentManager fm, Fragment f, Bundle outState) {
                super.onFragmentSaveInstanceState(fm, f, outState);
                Log.e(TAG, "onFragmentSaveInstanceState " );
            }

            @Override
            public void onFragmentViewDestroyed(FragmentManager fm, Fragment f) {
                super.onFragmentViewDestroyed(fm, f);
                Log.e(TAG, "onFragmentViewDestroyed " );
            }

            @Override
            public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
                super.onFragmentDestroyed(fm, f);
                Log.e(TAG, "onFragmentDestroyed " );
            }

            @Override
            public void onFragmentDetached(FragmentManager fm, Fragment f) {
                super.onFragmentDetached(fm, f);
                Log.e(TAG, "onFragmentDetached " );
            }
        }, true);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContain,BlankFragment.newInstance(),BlankFragment.TAG).commit();
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
