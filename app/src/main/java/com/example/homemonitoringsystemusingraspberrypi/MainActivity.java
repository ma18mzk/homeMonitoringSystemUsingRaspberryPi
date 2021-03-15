package com.example.homemonitoringsystemusingraspberrypi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button continueBtn;
    private ImageButton helpBtn;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home Monitoring System");

        continueBtn = (Button) findViewById(R.id.continueBtn);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCameras();
            }
        });

        helpBtn = (ImageButton) findViewById(R.id.mainHelpBtn);
        builder = new AlertDialog.Builder(this);
        helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("This is 1706960's FYP which uses the Raspberry Pi and a camera in order to create a surveillance style home monitoring system. To get started, please click on the \"CONTINUE\" button below.")
                        .setCancelable(true);
                AlertDialog alert = builder.create();
                alert.setTitle("Help");
                alert.show();

            }
        });


    }

    public void openCameras() {
        Intent intent = new Intent(this, Cameras.class);
        startActivity(intent);
    }
}