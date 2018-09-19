package com.cnepay.mvparmparse;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 用于解析 AndroidManifest 中的 Meta 属性
 */
public class ManifestPaeserActivity extends AppCompatActivity {

    public static final String TAG = "ManifestPaeserActivity";

    private static final String MODULE_VALUE = "ConfigModule";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifest_paeser);

        try {
            ApplicationInfo appInfo = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            if (appInfo.metaData != null) {
                for (String key : appInfo.metaData.keySet()) {
                    Log.e(TAG, "key： " + key + " value: " + appInfo.metaData.get(key));
                }
            } else {
                System.err.println("null");
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
