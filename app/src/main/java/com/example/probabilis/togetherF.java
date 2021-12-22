package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class togetherF extends AppCompatActivity {
    String[] choices;
    int i=0, Result, draw;
    NumberPicker test;
    ArrayList<Integer> allballs = new ArrayList<>();
    ImageButton plus;
    static ImageView colors;
    androidx.constraintlayout.widget.ConstraintLayout first_line;
    androidx.constraintlayout.widget.ConstraintLayout second_line;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_together_f);
        Intent intent = getIntent();
        int Result = inputs.Result;
        // getting inputs

        allballs.add(inputs.red);
        allballs.add(inputs.blue);
        allballs.add(inputs.green);
        allballs.add(inputs.yellow);
        allballs.add(inputs.white);
        allballs.add(inputs.black);
        //    end of getting inputs


        draw = intent.getIntExtra(type.draw, 0);

        colors = findViewById(R.id.color);
        TextView all1 = (TextView) findViewById(R.id.all1);
        all1.setText("عدد السحبات الممكنة هو : " + permutation(Result, draw));
        NumberPicker test = findViewById(R.id.TEST);
        choices = getResources().getStringArray(R.array.picker);
        test.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        test.setDisplayedValues(choices);
        test.setMinValue(0);
        test.setMaxValue(Math.min(Result-1, draw-1));
        plus = findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                second_line = findViewById(R.id.second);
                second_line.setVisibility(View.VISIBLE);
                first_line = findViewById(R.id.first_line);
                first_line.setBackgroundColor(R.color.dark_grey);
                for (int i=0; i<first_line.getChildCount(); i++){
                    View child = first_line.getChildAt(i);
                    child.setEnabled(false);
                }
            }
        });

    }
    static long factorial(long x){
        long fac=1;
        for (long i=1 ; i<=x ; i++){
            fac=fac*i;
        }
        return fac;}
    static long permutation(long a, long b){
        return (factorial(a) / (factorial(a-b)*factorial(b)));}
    public void switchColor(View view ){
        if(allballs.get(i)!=0 & i==0){
            colors.setImageResource(R.drawable.red1);
            NumberPicker test = findViewById(R.id.TEST);
            test.setMaxValue(Math.min(draw-1, allballs.get(i)-1));
            i++;
            return;
        }
        if(allballs.get(i)==0 & i==0){
            i++;
        }

        if(allballs.get(i)!=0 & i==1){
            colors.setImageResource(R.drawable.blue1);
            NumberPicker test = findViewById(R.id.TEST);
            test.setMaxValue(Math.min(draw-1, allballs.get(i)-1));
            i++;
            return;
        }
        if(allballs.get(i)==0 & i==1){
            i++;
        }
        if(allballs.get(i)!=0 & i==2){
            colors.setImageResource(R.drawable.green1);
            NumberPicker test = findViewById(R.id.TEST);
            test.setMaxValue(Math.min(draw-1, allballs.get(i)-1));
            i++;
            return;
        }
        if(allballs.get(i)==0 & i==2){
            i++;
        }
        if(allballs.get(i)!=0 & i==3){
            colors.setImageResource(R.drawable.yellow1);
            NumberPicker test = findViewById(R.id.TEST);
            test.setMaxValue(Math.min(draw-1, allballs.get(i)-1));
            i++;
            return;
        }
        if(allballs.get(i)==0 & i==3){
            i++;
        }
        if(allballs.get(i)!=0 & i==4){
            colors.setImageResource(R.drawable.white1);
            NumberPicker test = findViewById(R.id.TEST);
            test.setMaxValue(Math.min(draw-1, allballs.get(i)-1));
            i++;
            return;
        }
        if(allballs.get(i)==0 & i==4){
            i++;
        }
        if(allballs.get(i)!=0 & i==5){
            colors.setImageResource(R.drawable.black1);
            NumberPicker test = findViewById(R.id.TEST);
            test.setMaxValue(Math.min(draw-1, allballs.get(i)-1));
            i=0;
            return;
        }
        if(allballs.get(i)==0 & i==5){
            i=0;
            switchColor (null);
        }
    }
    public void second(View view){

    }
    public void disable_first(View view){

    }
}