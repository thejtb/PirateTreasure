package com.example.codecaboose.piratetreasurehunt;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
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
import java.util.logging.Handler;

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
        sList.setMovementMethod(new ScrollingMovementMethod());
        sList.setText("");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        File filePath = getFileStreamPath("org.png");
        imageView.setImageDrawable(Drawable.createFromPath(filePath.toString()));
        sList.setMaxLines(CreateActivity.clueNum + 1);

        final EditText edit_txt = (EditText) findViewById(R.id.textView);
        edit_txt.setText("");


        String temp1 = "" + counter;
        String temp2 = "" + CreateActivity.clueCount;

        Log.d(temp1,"checking counts");
        Log.d(temp2,"^^^^");



        edit_txt.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    //submit_btn.performClick();

                    String  str1 = edit_txt.getText().toString().replaceAll("\\s+","");
                    str1 = str1.replaceAll("%","");
                    String str2 = CreateActivity.addArray.get(counter).replaceAll("\\s+","");
                      // String str2 = CreateActivity.addArray.get(counter);





                    str2 = CreateActivity.cipher(str2);

                              Log.d("tag2222", str1);
                      Log.d("tag22223", str2);


                    if(str1.equals(str2)) {
                                   Log.d("equals", CreateActivity.addArray.get(counter));
                        sList.setText(sList.getText() + "\n" + CreateActivity.addArray.get(counter));

                        File filePath = getFileStreamPath("test" + counter +".png");
                        ImageView imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setImageDrawable(Drawable.createFromPath(filePath.toString()));




                        counter++;

                        String temp9 = "" + CreateActivity.clueCount;
                        String temp10 = "" + counter;

                        Log.d("clueCount ", temp9);
                        Log.d("counter ", temp10);

                        if(counter == CreateActivity.clueCount) {
                            edit_txt.setFocusable(false);
                            showSimplePopUp();

                            //imageView.setImageDrawable(Drawable.createFromPath(filePath.toString()));


                        }




                        return true;


                    }


                }
                return false;
            }
        });






    }

    private void showSimplePopUp() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("YE GOT THE TREASURE!");
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.victorybackground);

        helpBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                        dialog.dismiss();
                    }
                }).setView(image);
        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

    }




}
