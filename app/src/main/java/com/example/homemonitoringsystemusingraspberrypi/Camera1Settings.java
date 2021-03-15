package com.example.homemonitoringsystemusingraspberrypi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Camera1Settings extends AppCompatActivity {
    private WebView cam1stngsWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera1_settings);
        setTitle("Camera 1 Settings and Media");

        cam1stngsWebView = (WebView) findViewById(R.id.camera1SettingsWebView);
        cam1stngsWebView.setWebViewClient(new WebViewClient());
        cam1stngsWebView.loadUrl("http://192.168.1.14/");

        WebSettings webSettings = cam1stngsWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setAllowFileAccess(true);

    }
}