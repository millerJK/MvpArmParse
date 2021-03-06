package com.cnepay.mvparmparse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //解析manifest中属性
    public void manifestParser(View view) {
        Intent intent = new Intent(this, ManifestPaeserActivity.class);
        startActivity(intent);
    }

    //application注册activty生命周期先后问题
    public void activityLifeCallBack(View view) {
        Intent intent = new Intent(this, ActivityLifeCallBackActivity.class);
        startActivity(intent);
    }

    //activity中注册fragment的生命周期
    public void fragmentlifeCallBack(View view) {
        Intent intent = new Intent(this, FragmentLifecycleCallbacksActivity.class);
        startActivity(intent);
    }
}
