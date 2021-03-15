package com.example.homemonitoringsystemusingraspberrypi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Camera2 extends AppCompatActivity {
    private Button cam2Btn;
    private Button cam2stngsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera2);
        setTitle("Camera 2 Options");

        cam2Btn = (Button) findViewById(R.id.viewCam2Btn);
        cam2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLiveCam2();
            }
        });

        cam2stngsBtn = (Button) findViewById(R.id.cam2stngsBtn);
        cam2stngsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCam2Stngs();
            }
        });
    }



    public void openLiveCam2() {
        Intent intent = new Intent(this, Camera2Live.class);
        startActivity(intent);
    }

    public void openCam2Stngs() {
        Intent intent = new Intent(this, Camera2Settings.class);
        startActivity(intent);
    }

    }