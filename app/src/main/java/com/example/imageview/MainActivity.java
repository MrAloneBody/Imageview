package com.example.imageview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TODO: Why put it here? 😢
        //TODO: No permission added in manifest
//        image = findViewById(R.id.img1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image = findViewById(R.id.img1);

        String url = "https://cdorgapi.b-cdn.net/img/players/1fca0272-a33e-4ee8-ac06-bc2b61e24e84.jpg";

        Glide.with(this).load(url).into(image);

    }
}