package com.example.codecaboose.piratetreasurehunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_screen);

    }

    public void addClue(View view) {
        Intent intent = new Intent(this, PlayActivity.class);
        EditText clueAddition = (EditText) findViewById(R.id.editText);
        

    }
}