package com.example.codecaboose.piratetreasurehunt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_screen);}


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                     //5 clues
                     break;
                case R.id.radioButton2:
                    if (checked)
                        //10 clues
                       break;

              case R.id.radioButton3:
                 if (checked)
                     //15 clues
                        break;
         }
        }
    }


