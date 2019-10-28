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
        Log.d("AAA", "onDestroy");
        ActivityCollector.removeActivity(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAA", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAA", "onRestart");
    }
}
