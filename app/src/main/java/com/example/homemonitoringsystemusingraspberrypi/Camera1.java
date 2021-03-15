package com.example.homemonitoringsystemusingraspberrypi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import java.net.InetAddress;


public class Camera1 extends AppCompatActivity {
    private Button cam1Btn;
    private Button cam1stngsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera1);
        setTitle("Camera 1 Options");

        cam1Btn = (Button) findViewById(R.id.viewCam1Btn);
        cam1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLiveCam1();
            }
        });

        cam1stngsBtn = (Button) findViewById(R.id.cam1stngsBtn);
        cam1stngsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCam1Stngs();
            }
        });
    }



    public void openLiveCam1() {
        Intent intent = new Intent(this, Camera1Live.class);
        startActivity(intent);
    }

    public void openCam1Stngs() {
        Intent intent = new Intent(this, Camera1Settings.class);
        startActivity(intent);
    }

}