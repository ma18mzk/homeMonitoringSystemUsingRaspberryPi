package com.example.homemonitoringsystemusingraspberrypi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Camera2Live extends AppCompatActivity {
    private WebView camera2webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera2_live);
        setTitle("Camera 2 Live Video Feed");

        camera2webView = (WebView) findViewById(R.id.camera2WebView);
        camera2webView.setWebViewClient(new WebViewClient());
        camera2webView.loadUrl("http://www.google.com/");

        WebSettings webSettings = camera2webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setAllowFileAccess(true);

    }

    @Override
    public void onBackPressed() {
        if (camera2webView.canGoBack()) {
            camera2webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

}