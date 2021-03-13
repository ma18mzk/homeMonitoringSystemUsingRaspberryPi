package com.example.homemonitoringsystemusingraspberrypi;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Camera1Live extends AppCompatActivity {
    private WebView camera1webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera1_live);
        setTitle("Camera 1 Live Video Feed");

        camera1webView = (WebView) findViewById(R.id.camera1WebView);
        camera1webView.setWebViewClient(new WebViewClient());
        camera1webView.loadUrl("http://192.168.1.14/picture/1/frame/");

        WebSettings webSettings = camera1webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setAllowFileAccess(true);

    }



    @Override
    public void onBackPressed() {
        if (camera1webView.canGoBack()) {
            camera1webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

}