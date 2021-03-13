package com.example.homemonitoringsystemusingraspberrypi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import java.net.InetAddress;

import static org.apache.commons.net.ftp.FTP.BINARY_FILE_TYPE;

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
        

        try {

            FTPClient ftpClient = new FTPClient();
            ftpClient.connect(InetAddress.getByName("fttp://192.168.0.45"));
            ftpClient.login("Mohammed Kassar", "Boeing789!");
            System.out.println("status :: " + ftpClient.getStatus());
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();

            try{
                String toppath = new String();
                FTPFile[] ftpDirs = ftpClient.listDirectories();
                for (int i = 0; i < ftpDirs.length; i++) {
                    toppath = ftpDirs[0].getName();
                    System.out.println("Directory->: " + ftpDirs[i].getName());

                }

                FTPFile[] ftpdirs2 = ftpClient.listFiles(toppath);
                for (int i = 0; i < ftpdirs2.length; i++) {
                    System.out.println("Files->: " + ftpdirs2[i].getName());
                }
            }catch (Exception e) {
                e.printStackTrace();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void openLiveCam1() {
        Intent intent = new Intent(this, Camera1Live.class);
        startActivity(intent);
    }

}