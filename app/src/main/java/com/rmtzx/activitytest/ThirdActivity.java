package com.rmtzx.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import javax.security.auth.login.LoginException;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
//        final Intent intent = getIntent();
//        int id = intent.getIntExtra("id", -1);
//        String time = intent.getStringExtra("time");
        Log.d("AAA", "ThirdActivity");
//        Log.e("time", time);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(ThirdActivity.this, FirstActivity.class);
//                startActivity(intent);

                //销毁所有活动
                ActivityCollector.finishAll();

                //推出进程
                android.os.Process.killProcess(android.os.Process.myPid());

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