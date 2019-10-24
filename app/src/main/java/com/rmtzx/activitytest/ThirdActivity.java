package com.rmtzx.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import javax.security.auth.login.LoginException;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
//        final Intent intent = getIntent();
//        int id = intent.getIntExtra("id", -1);
//        String time = intent.getStringExtra("time");
//        Log.e("ss", Integer.toString(id));
//        Log.e("time", time);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "Hello");
                setResult(1, intent);
                finish();

            }
//
//                //在拨号盘中显示
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                Uri data = Uri.parse("tel:" + "15225568540");
//                intent.setData(data);
//
//                //另一种写法
//                //Intent intent =new Intent(Intent.ACTION_DIAL,Uri.parse("tel:10086"));
//                //startActivity(intent);
//
//            }
//        });

        });
    }

}