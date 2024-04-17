package com.utils.androidutil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.utils.utilcodex.subutil.util.PinyinUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PinyinUtils.ccs2Pinyin("测试");
    }
}