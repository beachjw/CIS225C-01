package com.introtoandroid.midtermjamesbeach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView image;
    TextView imageCaption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.mybutton);
        image = (ImageView) findViewById(R.id.mypic);
        imageCaption = (TextView) findViewById(R.id.mycaption);



    }

    public void buttonClicked(View v) {
        if (button.getText() == getResources().getString(R.string.press1)) {
            button.setText(getResources().getString(R.string.press2));
            imageCaption.setText(getResources().getString(R.string.xwing_text));
            image.setImageResource(R.drawable.xwing);
        }
        else {
            button.setText(getResources().getString(R.string.press1));
            imageCaption.setText(getResources().getString(R.string.tiefighter_text));
            image.setImageResource(R.drawable.tiefighter);
        }

    }
}