package com.rmtzx.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Log.d("AAA", "onCreate");
    }

    protected void onStart() {
        super.onStart();
        Log.d("AAA", "onStart");
    }

    protected void onResume() {
        super.onResume();
        Log.d("AAA", "onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.d("AAA", "onPause");

    }

    protected void onStop() {
        super.onStop();
        Log.d("AAA", "onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA", "onDestroy");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("AAA", "onRestart");
    }
}
