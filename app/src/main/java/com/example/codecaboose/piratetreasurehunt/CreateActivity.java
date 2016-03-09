package com.example.codecaboose.piratetreasurehunt;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.UUID;

public class CreateActivity extends AppCompatActivity {

    private DrawingView drawView;
    private ImageButton currPaint;
    public ArrayList<String> addArray = new ArrayList<String>();
    EditText clueAddition;
    ListView show;
    Button aBut;

    int clueNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_screen);

        drawView = (DrawingView)findViewById(R.id.drawing);

        clueAddition = (EditText) findViewById(R.id.editText);

        aBut = (Button)findViewById(R.id.addButton);

        aBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getText = clueAddition.getText().toString();

                addArray.add(getText);


                /*
                drawView.setDrawingCacheEnabled(true);
                String imgSaved = MediaStore.Images.Media.insertImage(
                        getContentResolver(), drawView.getDrawingCache(),
                        UUID.randomUUID().toString()+".png", "drawing");


                if(imgSaved!=null){
                    Toast savedToast = Toast.makeText(getApplicationContext(),
                            "Drawing saved to Gallery!", Toast.LENGTH_SHORT);
                    savedToast.show();
                }

                drawView.destroyDrawingCache();
                */

                String test = "test1.png";
                File sd = Environment.getExternalStorageDirectory();
                File dest = new File(sd, test );
                String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
                //File file = new File(extStorageDirectory, "er.PNG");

                FileOutputStream fos;

                try {
                    fos = openFileOutput(test, Context.MODE_PRIVATE);
                    drawView.canvasBitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);


                    fos.flush();
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }





            }
        });




    }

    public void addClue(View view) {
        Intent intent = new Intent(this, PlayActivity.class);
        //white out this input if clueFlag = 0

        EditText clueAddition = (EditText) findViewById(R.id.editText);
        

    }
    public void paintClicked(View view){

        if(view != currPaint) {
            ImageButton imgView = (ImageButton) view;
            String color = view.getTag().toString();


            drawView.setColor(color);
        }

    }




}


