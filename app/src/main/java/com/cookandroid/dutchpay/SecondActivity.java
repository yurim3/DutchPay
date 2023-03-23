package com.cookandroid.dutchpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String text = intent.getStringExtra("TEXT");      // 입력된 텍스트 불러오기


        WebView nWebView = (WebView) findViewById(R.id.webView);
        nWebView.loadUrl(text);

        finish();
    }
}