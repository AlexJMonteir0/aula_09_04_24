package com.example.aula_09_04_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread1 = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(4000);
                    startActivity(new Intent(MainActivity.this,ActivityLogin.class));
                    finish();
                }catch (InterruptedException e){
                    throw new RuntimeException(e);

                }
            }

        };thread1.start();

    }
}