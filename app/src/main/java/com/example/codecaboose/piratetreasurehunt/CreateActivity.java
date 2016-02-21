package com.example.codecaboose.piratetreasurehunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class CreateActivity extends AppCompatActivity {

    private DrawingView drawView;
    private ImageButton currPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_screen);

        drawView = (DrawingView)findViewById(R.id.drawing);
        //LinearLayout paintLayout = (LinearLayout)findViewById(R.id.paint_colors);

    }

    public void addClue(View view) {
        Intent intent = new Intent(this, PlayActivity.class);
        EditText clueAddition = (EditText) findViewById(R.id.editText);
        

    }
    public void paintClicked(View view){

        ImageButton imgView = (ImageButton)view;
        String color = view.getTag().toString();
        drawView.setColor(color);


    }




}


