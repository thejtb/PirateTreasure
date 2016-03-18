package com.example.codecaboose.piratetreasurehunt;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class PlayActivity extends AppCompatActivity {

    static int counter = 0;
    private Button submit_btn;
    private TextView sList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);
        sList = (TextView)findViewById(R.id.scrollList);
        /*TextView textList = (TextView) findViewById(R.id.scrollList);
        textList.setMovementMethod(new ScrollingMovementMethod());*/
        sList.setText("");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        File filePath = getFileStreamPath("org.png");
        imageView.setImageDrawable(Drawable.createFromPath(filePath.toString()));


        final EditText edit_txt = (EditText) findViewById(R.id.textView);
        edit_txt.setText("");

        edit_txt.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    //submit_btn.performClick();

                    String  str1 = edit_txt.getText().toString().replaceAll("\\s+","");
                    String str2 = CreateActivity.addArray.get(counter).replaceAll("\\s+","");
                            Log.d("tag2222", str1);
                    Log.d("tag22223", str2);



                    if(str1.equals(str2)) {
                                   Log.d("equals", CreateActivity.addArray.get(counter));
                        sList.setText(sList.getText() + "\n" + CreateActivity.addArray.get(counter));

                        File filePath = getFileStreamPath("test" + counter +".png");
                        ImageView imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setImageDrawable(Drawable.createFromPath(filePath.toString()));




                        counter++;
                        return true;


                    }


                }
                return false;
            }
        });






    }






}
