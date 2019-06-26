package com.rmtzx.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //加载视图xml文件
        setContentView(R.layout.first_layout);

        //为按钮1增加监听方法，
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this, "baidu", Toast.LENGTH_SHORT).show();

                //系统浏览器打开网站
                Intent intent =  new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);

                //显式启动第二个活动
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(intent);

                //隐式启动第二个活动
//                Intent intent =new Intent("com.rmtzx.activityest.action_START");
//                intent.addCategory("com.rmtzx.activityest.MY_CATEGORY");
//                startActivity(intent);

            }

        });

        //为按钮2增加监听方法
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int id = 10000;
//
//                long l = System.currentTimeMillis();
//                Date date = new Date(l);
//                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                String nyr = dateFormat.format(date);

                Intent intent =new Intent(FirstActivity.this, ThirdActivity.class);
//                intent.putExtra("id",id);
//                intent.putExtra("time",nyr);

                //用bundle传
//                Bundle bundle = new Bundle();
//                bundle.putInt("id",id);
//                intent.putExtras(bundle);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode) {
            case 1:
                if(resultCode == RESULT_OK){
                    String returnedDate = data.getStringExtra("data_return");
                    Log.e("A",returnedDate);
                }

        }
    }
}
