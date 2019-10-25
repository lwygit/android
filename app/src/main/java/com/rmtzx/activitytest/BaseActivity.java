package com.rmtzx.activitytest;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    String TAG = "AAA";

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        Log.d(TAG, "onCreate: ");
        Log.d(TAG, getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
