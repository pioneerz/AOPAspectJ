package com.example.administrator.aopaspectj;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.aopaspectj.aspectj.LogOutput;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @LogOutput("摇一摇")
    public void shake(View view) {
        SystemClock.sleep(new Random().nextInt(2000));
    }

    @LogOutput("音频消息")
    public void video(View view) {
        SystemClock.sleep(new Random().nextInt(2000));
    }

    @LogOutput("视频消息")
    public void audio(View view) {
        SystemClock.sleep(new Random().nextInt(2000));
    }

    @LogOutput("小说")
    public void fiction(View view) {
        SystemClock.sleep(new Random().nextInt(2000));
    }

}
