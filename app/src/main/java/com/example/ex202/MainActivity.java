package com.example.ex202;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton ib;

    ImageView iv;

    Random rnd = new Random();

    int randomNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib = (ImageButton)findViewById(R.id.ib);
        iv = (ImageView)findViewById(R.id.iv);
    }

    public void change(View view) {

        randomNum = rnd.nextInt(3)+1;

        switch (randomNum)
        {
            case 1:
                ib.setImageResource(R.drawable.one);
                iv.setImageResource(R.drawable.one);
                break;
            case 2:
                ib.setImageResource(R.drawable.two);
                iv.setImageResource(R.drawable.two);
                break;
            case 3:
                ib.setImageResource(R.drawable.three);
                iv.setImageResource(R.drawable.three);
                break;
        }
    }
}
