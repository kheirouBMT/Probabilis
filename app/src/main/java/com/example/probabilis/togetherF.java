package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class togetherF extends AppCompatActivity {
    String[] choices;
    int index=0, Result, draw, numberOfLines=1;
    NumberPicker picker1,picker2,picker3;
    ArrayList<Integer> allballs = new ArrayList<>();
    ImageButton plus;
    static ImageView colors, colors2, colors3;
    androidx.constraintlayout.widget.ConstraintLayout first_line;
    androidx.constraintlayout.widget.ConstraintLayout second_line;
    androidx.constraintlayout.widget.ConstraintLayout third_line;
    LinearLayout hadita_one;
    Dialog popUP2;
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

        // number of draws
        draw = intent.getIntExtra(type.draw, 0);

        colors = findViewById(R.id.color);
        colors2 = findViewById(R.id.color2);
        colors3 = findViewById(R.id.color3);
        TextView all1 = (TextView) findViewById(R.id.all1);
        all1.setText("عدد السحبات الممكنة هو : " + permutation(Result, draw));
        picker1 = findViewById(R.id.picker1);
        picker2 = findViewById(R.id.picker2);
        picker3 = findViewById(R.id.picker3);
        choices = getResources().getStringArray(R.array.picker);
        picker1.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        picker1.setDisplayedValues(choices);
        picker1.setMinValue(0);
        picker1.setMaxValue(Math.min(Result-1, draw-1));
        picker1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                if(picker1.getValue()==draw-1){
                    plus.setVisibility(View.GONE);
                }
                else{
                    plus.setVisibility(View.VISIBLE);
                }
            }
        });

        // showing popUp
        popUP2 = new Dialog(this);
        plus = findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (index != 0) {
                    popUP2.setContentView(R.layout.pop_up2);
                    popUP2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    popUP2.setCanceledOnTouchOutside(false);
                    popUP2.show();
                    ImageButton special = (ImageButton) popUP2.findViewById(R.id.special);
                    special.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (numberOfLines == 1) {
                                int selected1 = allballs.get(index - 1);
                                selected1 = selected1 - picker1.getValue();
                                allballs.set(index - 1, selected1);
                                first_line = findViewById(R.id.first_line);
                                for (int i = 0; i < first_line.getChildCount(); i++) {
                                    View child = first_line.getChildAt(i);
                                    child.setEnabled(false);
                                }
                                second_line = findViewById(R.id.second);
                                second_line.setVisibility(View.VISIBLE);
                                picker2.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
                                picker2.setDisplayedValues(choices);
                                picker2.setMinValue(0);
                                picker2.setMaxValue(Math.min(Result - 2, draw - 1));
                                numberOfLines++;
                                index = 0;
                                change_bg1(null);
                                popUP2.dismiss();
                            }
                            else if (numberOfLines == 2) {
                                int selected2 = allballs.get(index - 1);
                                selected2 = selected2 - picker2.getValue();
                                allballs.set(index - 1, selected2);
                                second_line = findViewById(R.id.second);
                                for (int i = 0; i < second_line.getChildCount(); i++) {
                                    View child = second_line.getChildAt(i);
                                    child.setEnabled(false);
                                }
                                int varTwo = picker2.getValue();
                                third_line = findViewById(R.id.third);
                                third_line.setVisibility(View.VISIBLE);
                                picker3.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
                                picker3.setDisplayedValues(choices);
                                picker3.setMinValue(0);
                                picker3.setMaxValue(Math.min(Result - 3, draw - 1));
                                numberOfLines++;
                                index = 0;
                                popUP2.dismiss();
                                plus.setVisibility(View.GONE);}

                        }
                    });

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
    public void switchColor1(View view ){
        if(allballs.get(index)!=0 & index==0){
            colors.setImageResource(R.drawable.red1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==0){
            index++;
        }

        if(allballs.get(index)!=0 & index==1){
            colors.setImageResource(R.drawable.blue1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==1){
            index++;
        }
        if(allballs.get(index)!=0 & index==2){
            colors.setImageResource(R.drawable.green1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==2){
            index++;
        }
        if(allballs.get(index)!=0 & index==3){
            colors.setImageResource(R.drawable.yellow1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==3){
            index++;
        }
        if(allballs.get(index)!=0 & index==4){
            colors.setImageResource(R.drawable.white1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==4){
            index++;
        }
        if(allballs.get(index)!=0 & index==5){
            colors.setImageResource(R.drawable.black1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index=0;
            return;
        }
        if(allballs.get(index)==0 & index==5){
            index=0;
            switchColor1 (null);
        }
    }
    public void switchColor2(View view ){
        if(allballs.get(index)!=0 & index==0){
            colors2.setImageResource(R.drawable.red1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==0){
            index++;
        }

        if(allballs.get(index)!=0 & index==1){
            colors2.setImageResource(R.drawable.blue1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==1){
            index++;
        }
        if(allballs.get(index)!=0 & index==2){
            colors2.setImageResource(R.drawable.green1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==2){
            index++;
        }
        if(allballs.get(index)!=0 & index==3){
            colors2.setImageResource(R.drawable.yellow1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==3){
            index++;
        }
        if(allballs.get(index)!=0 & index==4){
            colors2.setImageResource(R.drawable.white1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==4){
            index++;
        }
        if(allballs.get(index)!=0 & index==5){
            colors2.setImageResource(R.drawable.black1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index=0;
            return;
        }
        if(allballs.get(index)==0 & index==5){
            index=0;
            switchColor2 (null);
        }
    }
    public void switchColor3(View view ){
        if(allballs.get(index)!=0 & index==0){
            colors3.setImageResource(R.drawable.red1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==0){
            index++;
        }

        if(allballs.get(index)!=0 & index==1){
            colors3.setImageResource(R.drawable.blue1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==1){
            index++;
        }
        if(allballs.get(index)!=0 & index==2){
            colors3.setImageResource(R.drawable.green1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==2){
            index++;
        }
        if(allballs.get(index)!=0 & index==3){
            colors3.setImageResource(R.drawable.yellow1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==3){
            index++;
        }
        if(allballs.get(index)!=0 & index==4){
            colors2.setImageResource(R.drawable.white1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==4){
            index++;
        }
        if(allballs.get(index)!=0 & index==5){
            colors3.setImageResource(R.drawable.black1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index=0;
            return;
        }
        if(allballs.get(index)==0 & index==5){
            index=0;
            switchColor2 (null);
        }
    }
    public void for_max(View view){
        popUP2.dismiss();
        plus.setVisibility(View.GONE);
        if(numberOfLines==1){
            first_line = findViewById(R.id.first_line);
            for (int i = 0; i < first_line.getChildCount(); i++) {
                View child = first_line.getChildAt(i);
                child.setEnabled(false);
            }
        }
        if(numberOfLines==2){
            second_line = findViewById(R.id.first_line);
            for (int i = 0; i < second_line.getChildCount(); i++) {
                View child = second_line.getChildAt(i);
                child.setEnabled(false);
            }
        }
    }
    public void for_min(View view){
        popUP2.dismiss();
        plus.setVisibility(View.GONE);
        if(numberOfLines==1){
            first_line = findViewById(R.id.first_line);
            for (int i = 0; i < first_line.getChildCount(); i++) {
                View child = first_line.getChildAt(i);
                child.setEnabled(false);
            }
        }
        if(numberOfLines==2){
            second_line = findViewById(R.id.first_line);
            for (int i = 0; i < second_line.getChildCount(); i++) {
                View child = second_line.getChildAt(i);
                child.setEnabled(false);
            }
        }
    }
    public void change_bg1(View view) {
        hadita_one = findViewById(R.id.hadita_one);
        hadita_one.setBackgroundResource(R.drawable.pix2);
    }
    @SuppressLint("ResourceAsColor")
    public void change_color2(View view){
        second_line.setBackgroundColor(ContextCompat.getColor(this,
                R.color.dark_grey));
    }
}