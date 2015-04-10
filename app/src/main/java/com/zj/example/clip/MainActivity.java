package com.zj.example.clip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * create by zhengjiong
 * Date: 2015-04-01
 * Time: 08:34
 */
public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(MainActivity.this, ClipToPaddingDemoActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(MainActivity.this, ClipChildrenDemoActivity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(MainActivity.this, ClipChildrenViewPagerDemoActivity.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(MainActivity.this, ClipchildrenClippaddingDemo3Activity.class));
                break;
        }
    }
}
