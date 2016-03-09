package com.example.codecaboose.piratetreasurehunt;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        /*TextView textList = (TextView) findViewById(R.id.scrollList);
        textList.setMovementMethod(new ScrollingMovementMethod());*/


        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        File filePath = getFileStreamPath("test1.png");
        imageView.setImageDrawable(Drawable.createFromPath(filePath.toString()));


    }

}
