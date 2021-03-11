package com.example.homemonitoringsystemusingraspberrypi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Cameras extends AppCompatActivity {
    private ImageButton camera1imgBtn;
    private Button camera1Btn;
    private ImageButton camera2imgBtn;
    private Button camera2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cameras);
        setTitle("Your Cameras");

        camera1imgBtn = (ImageButton) findViewById(R.id.cameraButton);
        camera1imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera1();
            }
        });

        camera1Btn = (Button) findViewById(R.id.button);
        camera1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera1();
            }
        });

        camera2imgBtn = (ImageButton) findViewById(R.id.cameraButton2);
        camera2imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera2();
            }
        });

        camera2Btn = (Button) findViewById(R.id.button2);
        camera2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera2();
            }
        });

    }

    public void openCamera1() {
        Intent intent = new Intent(this, Camera1.class);
        startActivity(intent);
    }

    public void openCamera2() {
        Intent intent2 = new Intent(this, Camera2.class);
        startActivity(intent2);
    }
}