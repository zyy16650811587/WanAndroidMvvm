package com.zyy.wanandroidmvvm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class XIangWebActivity extends AppCompatActivity {

    private ImageView im_web;
    private WebView web_xiang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        im_web = (ImageView) findViewById(R.id.im_web);
        web_xiang = (WebView) findViewById(R.id.web_xiang);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        im_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        web_xiang.loadUrl(url);
    }
}
