package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        image = findViewById(R.id.img1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://cdorgapi.b-cdn.net/img/players/1fca0272-a33e-4ee8-ac06-bc2b61e24e84.jpg";
//        Glide.with(this).load(url).into(img1);

        Glide.with(this).load(url).into(image);
    }
}