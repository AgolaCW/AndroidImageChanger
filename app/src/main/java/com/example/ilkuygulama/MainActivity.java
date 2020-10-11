package com.example.ilkuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private static ImageView imgviev;
    private static Button buttonsbm;
    private int current_image;
    int[]  images = {R.drawable.resim1, R.drawable.resim2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
            }
    public void buttonClick() {
        imgviev=(ImageView)findViewById(R.id.imageView);
        buttonsbm=(Button)findViewById(R.id.button);
        buttonsbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image++;
                current_image=current_image % images.length;
                imgviev.setImageResource(images[current_image]);
            }
        });


            }
        }









