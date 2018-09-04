package com.example.dell.snakes;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    int[] myDices={R.drawable.one,
           R.drawable.two,
           R.drawable.three,
           R.drawable.four,
           R.drawable.five,
           R.drawable.six};


    public void rollTapped(View view)
    {


        Random ran=new Random();
       int randomNumber=ran.nextInt(6);
        ImageView dice=findViewById(R.id.dice);
        dice.setImageResource(myDices[randomNumber]);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
