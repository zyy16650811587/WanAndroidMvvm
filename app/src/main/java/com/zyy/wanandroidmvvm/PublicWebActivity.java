package com.zyy.wanandroidmvvm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PublicWebActivity extends AppCompatActivity {


    private ImageView im_web;
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_web);
        initView();
    }

    private void initView() {
        im_web = (ImageView) findViewById(R.id.im_web);

        web = (WebView) findViewById(R.id.web);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
      web.loadUrl(url);
        im_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
