package com.example.homemonitoringsystemusingraspberrypi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Camera1 extends AppCompatActivity {
    private Button cam1Btn;

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

    }

    public void openLiveCam1() {
        Intent intent = new Intent(this, Camera1Live.class);
        startActivity(intent);
    }

}