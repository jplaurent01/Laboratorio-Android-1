package com.example.misonido;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    MediaPlayer sonido1;
    MediaPlayer sonido2;
    MediaPlayer sonido3;
    MediaPlayer sonido4;
    MediaPlayer sonido5;
    MediaPlayer sonido6;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;

    boolean check = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonido1 = MediaPlayer.create(this, R.raw.a);
        sonido2 =MediaPlayer.create(this, R.raw.b);
        sonido3 =MediaPlayer.create(this, R.raw.c);
        sonido4 =MediaPlayer.create(this, R.raw.d);
        sonido5 =MediaPlayer.create(this, R.raw.e);
        sonido6 =MediaPlayer.create(this, R.raw.f);

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                sonido1.start();
                check = true;
                b1.setBackgroundColor(Color.BLUE);
                b1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b1.setBackgroundColor(Color.RED);
                    }
                }, 1000);


            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido2.start();
                check = true;
                b2.setBackgroundColor(Color.BLUE);
                b2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b2.setBackgroundColor(Color.GREEN);
                    }
                }, 1000);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido3.start();
                check = true;
                b3.setBackgroundColor(Color.BLUE);
                b3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b3.setBackgroundColor(Color.YELLOW);
                    }
                }, 1000);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido4.start();
                check = true;
                b4.setBackgroundColor(Color.BLUE);
                b4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b4.setBackgroundColor(Color.GREEN);
                    }
                }, 1000);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido5.start();
                check = true;
                b5.setBackgroundColor(Color.BLUE);
                b5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b5.setBackgroundColor(Color.RED);
                    }
                }, 1000);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido6.start();
                check = true;
                b6.setBackgroundColor(Color.BLUE);
                b6.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b6.setBackgroundColor(Color.YELLOW);
                    }
                }, 1000);
            }
        });
    }
}