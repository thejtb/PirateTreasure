package com.example.codecaboose.piratetreasurehunt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CreateActivity.visitedSettings = true;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_screen);}


    public void onRadioButtonClicked(View view) {
        // Second floor selection
        Switch toggle1 = (Switch) findViewById(R.id.switch1);
        toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    CreateActivity.checkedFloor = true;
                else
                    CreateActivity.checkedFloor = false;
            }
        });
        // Yard inclusion selection
        Switch toggle2 = (Switch) findViewById(R.id.switch2);
        toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    CreateActivity.checkedYard = true;
                else
                    CreateActivity.checkedYard = false;
            }
        });

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    //5 clues
                    CreateActivity.clueNum = 5;
                    break;
            case R.id.radioButton2:
                if (checked)
                    //10 clues
                    CreateActivity.clueNum = 10;
                    break;
            case R.id.radioButton3:
                if (checked)
                    //15 clues
                    CreateActivity.clueNum = 15;
                    break;
         }
        }
    }


