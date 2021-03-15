package com.example.homemonitoringsystemusingraspberrypi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Camera2Settings extends AppCompatActivity {
    private WebView cam2stngsWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera2_settings);
        setTitle("Camera 2 Settings and Media");

        cam2stngsWebView = (WebView) findViewById(R.id.camera2SettingsWebView);
        cam2stngsWebView.setWebViewClient(new WebViewClient());
        cam2stngsWebView.loadUrl("http://tfl.gov.uk/");

        WebSettings webSettings = cam2stngsWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setAllowFileAccess(true);

    }
}