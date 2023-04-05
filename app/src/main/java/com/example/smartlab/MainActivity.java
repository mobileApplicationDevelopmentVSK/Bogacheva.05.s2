package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.postDelayed(Runnable {
            public void run() {
                Intent i = new Intent(MainActivity.this, SimpleFragmentPagerAdapter.class);
                startActivity(i);
                finish();
            }
        }, 3000)
    }


}