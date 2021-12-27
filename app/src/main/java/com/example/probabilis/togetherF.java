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
import java.util.Collections;

public class togetherF extends AppCompatActivity {
    String[] choices;
    int numberOfPart=1, varOne, varTwo, var2One, var2Two, var3One, var3Two;
    int index=0, Result, draw, numberOfLines=1;//7adita lewla
    NumberPicker picker1,picker2,picker3;
    int index2=0, numberOfLines2=1; // 7adita tania
    NumberPicker picker21,picker22,picker23;
    int index3=0, numberOfLines3=1; // 7adita talta
    NumberPicker picker31,picker32,picker33;
    ArrayList<Integer> allballs = new ArrayList<>();
    ArrayList<Integer> allballs2;
    ArrayList<Integer> allballs3;
    ArrayList<Integer> allballsB = new ArrayList<>();
    ImageButton plus;
    ImageButton plus2;
    ImageButton plus3;
    TextView other;
    static ImageView colors1, colors2, colors3;
    static ImageView colors21, colors22, colors23;
    static ImageView colors31, colors32, colors33;
    androidx.constraintlayout.widget.ConstraintLayout first_line;
    androidx.constraintlayout.widget.ConstraintLayout second_line;
    androidx.constraintlayout.widget.ConstraintLayout third_line;
    //
    androidx.constraintlayout.widget.ConstraintLayout first_line2;
    androidx.constraintlayout.widget.ConstraintLayout second_line2;
    androidx.constraintlayout.widget.ConstraintLayout third_line2;
    //
    androidx.constraintlayout.widget.ConstraintLayout first_line3;
    androidx.constraintlayout.widget.ConstraintLayout second_line3;
    androidx.constraintlayout.widget.ConstraintLayout third_line3;
    LinearLayout hadita_one;
    LinearLayout hadita_two;
    LinearLayout hadita_three;
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
        allballsB = new ArrayList<>(allballs);
        allballs2 = new ArrayList<>(allballs);
        allballs3 = new ArrayList<>(allballs);
        //    end of getting inputs

        // number of draws
        draw = intent.getIntExtra(type.draw, 0);

        colors1 = findViewById(R.id.color);
        colors2 = findViewById(R.id.color2);
        colors3 = findViewById(R.id.color3);
        //
        colors21 = findViewById(R.id.color21);
        colors22 = findViewById(R.id.color22);
        colors23 = findViewById(R.id.color23);
        //
        colors31 = findViewById(R.id.color31);
        colors32 = findViewById(R.id.color32);
        colors33 = findViewById(R.id.color33);
        //
        first_line = findViewById(R.id.first_line);
        second_line = findViewById(R.id.second);
        third_line = findViewById(R.id.third);
        //
        first_line2 = findViewById(R.id.first_line2);
        second_line2 = findViewById(R.id.second2);
        third_line2 = findViewById(R.id.third2);
        //
        first_line3 = findViewById(R.id.first_line3);
        second_line3 = findViewById(R.id.second3);
        third_line3 = findViewById(R.id.third3);
        //
        other = findViewById(R.id.others);
        picker1 = findViewById(R.id.picker1);
        picker2 = findViewById(R.id.picker2);
        picker3 = findViewById(R.id.picker3);
        //
        picker21 = findViewById(R.id.picker21);
        picker22 = findViewById(R.id.picker22);
        picker23 = findViewById(R.id.picker23);
        //
        picker31 = findViewById(R.id.picker31);
        picker32 = findViewById(R.id.picker32);
        picker33 = findViewById(R.id.picker33);
        //
        hadita_two = findViewById(R.id.hadita_two);
        hadita_three = findViewById(R.id.hadita_three);
        //
        choices = getResources().getStringArray(R.array.picker);
        //
        picker1.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        picker1.setDisplayedValues(choices);
        picker1.setMinValue(0);
        picker1.setMaxValue(Math.min(Result-1, draw-1));
        picker1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                if(picker1.getValue()==draw-1){
                    plus.setVisibility(View.GONE);
                    other.setVisibility(View.VISIBLE);
                }
                else{
                    plus.setVisibility(View.VISIBLE);
                    other.setVisibility(View.GONE);
                }
                if(Collections.frequency(allballs, 0)==5){
                    plus.setVisibility(View.GONE);
                    other.setVisibility(View.VISIBLE);
                }
            }
        });
        picker2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                if(picker1.getValue()+picker2.getValue()+2==draw){
                    plus.setVisibility(View.GONE);
                    other.setVisibility(View.VISIBLE);
                }
                else{
                    plus.setVisibility(View.VISIBLE);
                    other.setVisibility(View.GONE);
                }
                if(Collections.frequency(allballs, 0)==4){
                    plus.setVisibility(View.GONE);
                    other.setVisibility(View.VISIBLE);}
            }
        });
        picker21.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        picker21.setDisplayedValues(choices);
        picker21.setMinValue(0);
        picker21.setMaxValue(Math.min(Result-1, draw-1));
        picker21.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                if(picker21.getValue()==draw-1){
                    plus2.setVisibility(View.GONE);
                    other.setVisibility(View.VISIBLE);
                }
                else{
                    plus2.setVisibility(View.VISIBLE);
                    other.setVisibility(View.GONE);
                }
                if(Collections.frequency(allballs2, 0)==5){
                    plus2.setVisibility(View.GONE);
                    other.setVisibility(View.VISIBLE);}
            }
        });
        picker22.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                if(picker21.getValue()+picker22.getValue()+2==draw){
                    plus2.setVisibility(View.GONE);
                    other.setVisibility(View.VISIBLE);
                }
                else{
                    plus2.setVisibility(View.VISIBLE);
                    other.setVisibility(View.GONE);
                }
                if(Collections.frequency(allballs2, 0)==4){
                    plus2.setVisibility(View.GONE);
                    other.setVisibility(View.VISIBLE);}
            }
        });
        //
        picker31.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        picker31.setDisplayedValues(choices);
        picker31.setMinValue(0);
        picker31.setMaxValue(Math.min(Result-1, draw-1));
        picker31.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                if(picker31.getValue()==draw-1){
                    plus3.setVisibility(View.GONE);
                }
                else{
                    plus3.setVisibility(View.VISIBLE);
                    other.setVisibility(View.GONE);
                }
                if(Collections.frequency(allballs3, 0)==5){
                    plus3.setVisibility(View.GONE);}
            }
        });
        picker32.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                if(picker31.getValue()+picker32.getValue()+2==draw){
                    plus3.setVisibility(View.GONE);
                }
                else{
                    plus3.setVisibility(View.VISIBLE);
                    other.setVisibility(View.GONE);
                }
                if(Collections.frequency(allballs3, 0)==4){
                    plus3.setVisibility(View.GONE);}
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
                                allballs.set(index - 1, 0);
                                plus.setVisibility(View.GONE);
                                for (int i = 0; i < first_line.getChildCount(); i++) {
                                    View child = first_line.getChildAt(i);
                                    child.setEnabled(false);
                                }
                                varOne = picker1.getValue()+1;
                                second_line = findViewById(R.id.second);
                                second_line.setVisibility(View.VISIBLE);
                                picker2.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
                                picker2.setDisplayedValues(choices);
                                picker2.setMinValue(0);
                                picker2.setMaxValue(draw-varOne-1);
                                numberOfLines++;
                                index = 0;
                                popUP2.dismiss();
                            }
                            else if (numberOfLines == 2) {
                                allballs.set(index - 1, 0);
                                plus.setVisibility(View.GONE);
                                second_line = findViewById(R.id.second);
                                for (int i = 0; i < second_line.getChildCount(); i++) {
                                    View child = second_line.getChildAt(i);
                                    child.setEnabled(false);
                                }
                                varTwo = picker2.getValue()+1;
                                third_line.setVisibility(View.VISIBLE);
                                picker3.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
                                picker3.setDisplayedValues(choices);
                                picker3.setMinValue(0);
                                picker3.setMaxValue(draw-varTwo-varOne-1);
                                numberOfLines++;
                                index = 0;
                                popUP2.dismiss();
                                other.setVisibility(View.VISIBLE);
                                }

                        }
                    });

                }
            }

        });
        // 7adita two
        plus2 = findViewById(R.id.plus2);
        plus2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (index2 != 0) {
                    popUP2.setContentView(R.layout.pop_up2);
                    popUP2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    popUP2.setCanceledOnTouchOutside(false);
                    popUP2.show();
                    ImageButton special = (ImageButton) popUP2.findViewById(R.id.special);
                    special.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (numberOfLines2 == 1) {
                                allballs2.set(index2 - 1, 0);
                                plus2.setVisibility(View.GONE);
                                for (int i = 0; i < first_line2.getChildCount(); i++) {
                                    View child = first_line2.getChildAt(i);
                                    child.setEnabled(false);
                                }
                                var2One = picker21.getValue()+1;
                                second_line2 = findViewById(R.id.second2);
                                second_line2.setVisibility(View.VISIBLE);
                                picker22.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
                                picker22.setDisplayedValues(choices);
                                picker22.setMinValue(0);
                                picker22.setMaxValue(draw-var2One-1);
                                numberOfLines2++;
                                index2 = 0;
                                popUP2.dismiss();
                            }
                            else if (numberOfLines2 == 2) {
                                allballs2.set(index2 - 1, 0);
                                plus2.setVisibility(View.GONE);
                                second_line2 = findViewById(R.id.second2);
                                for (int i = 0; i < second_line2.getChildCount(); i++) {
                                    View child = second_line2.getChildAt(i);
                                    child.setEnabled(false);
                                }
                                var2Two = picker22.getValue()+1;
                                third_line2.setVisibility(View.VISIBLE);
                                picker23.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
                                picker23.setDisplayedValues(choices);
                                picker23.setMinValue(0);
                                picker23.setMaxValue(draw-var2Two-var2One-1);
                                numberOfLines2++;
                                index2 = 0;
                                popUP2.dismiss();
                                plus2.setVisibility(View.GONE);
                                other.setVisibility(View.VISIBLE);
                                }

                        }
                    });

                }
            }

        });
        plus3 = findViewById(R.id.plus3);
        plus3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (index3 != 0) {
                    popUP2.setContentView(R.layout.pop_up2);
                    popUP2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    popUP2.setCanceledOnTouchOutside(false);
                    popUP2.show();
                    ImageButton special = (ImageButton) popUP2.findViewById(R.id.special);
                    special.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (numberOfLines3 == 1) {
                                allballs3.set(index3 - 1, 0);
                                plus3.setVisibility(View.GONE);
                                for (int i = 0; i < first_line3.getChildCount(); i++) {
                                    View child = first_line3.getChildAt(i);
                                    child.setEnabled(false);
                                }
                                var3One = picker31.getValue()+1;
                                second_line3 = findViewById(R.id.second3);
                                second_line3.setVisibility(View.VISIBLE);
                                picker32.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
                                picker32.setDisplayedValues(choices);
                                picker32.setMinValue(0);
                                picker32.setMaxValue(draw-var3One-1);
                                numberOfLines3++;
                                index3 = 0;
                                popUP2.dismiss();
                            }
                            else if (numberOfLines3 == 2) {
                                allballs3.set(index3 - 1, 0);
                                plus3.setVisibility(View.GONE);
                                second_line3 = findViewById(R.id.second3);
                                for (int i = 0; i < second_line3.getChildCount(); i++) {
                                    View child = second_line3.getChildAt(i);
                                    child.setEnabled(false);
                                }
                                var3Two = picker32.getValue()+1;
                                third_line3.setVisibility(View.VISIBLE);
                                picker33.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
                                picker33.setDisplayedValues(choices);
                                picker33.setMinValue(0);
                                picker33.setMaxValue(draw-var3Two-var3One-1);
                                numberOfLines3++;
                                index3 = 0;
                                popUP2.dismiss();
                                plus3.setVisibility(View.GONE);
                                }

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
        if(index==6){index=0;}
        if(allballs.get(index)!=0 & index==0){
            colors1.setImageResource(R.drawable.red1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            if(draw==1){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            else{plus.setVisibility(View.VISIBLE);}
            if(picker1.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            if(Collections.frequency(allballs, 0)==5){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==0){
            if(draw==1){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            else{plus.setVisibility(View.VISIBLE);}
            if(picker1.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            if(Collections.frequency(allballs, 0)==5){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index++;
        }

        if(allballs.get(index)!=0 & index==1){
            colors1.setImageResource(R.drawable.blue1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==1){
            index++;
        }
        if(allballs.get(index)!=0 & index==2){
            colors1.setImageResource(R.drawable.green1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==2){
            index++;
        }
        if(allballs.get(index)!=0 & index==3){
            colors1.setImageResource(R.drawable.yellow1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==3){
            index++;
        }
        if(allballs.get(index)!=0 & index==4){
            colors1.setImageResource(R.drawable.white1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==4){
            index++;
        }
        if(allballs.get(index)!=0 & index==5){
            colors1.setImageResource(R.drawable.black1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==5){
            index++;
            switchColor1 (null);
        }
    }
    public void switchColor2(View view ){
        if(index==6){index=0;}
        if(allballs.get(index)!=0 & index==0){
            colors2.setImageResource(R.drawable.red1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-varOne-1, allballs.get(index)-1));
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            if(Collections.frequency(allballs, 0)==4){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==0){
            plus.setVisibility(View.VISIBLE);
            index++;
        }

        if(allballs.get(index)!=0 & index==1){
            colors2.setImageResource(R.drawable.blue1);
            picker2 = findViewById(R.id.picker2);
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            if(Collections.frequency(allballs, 0)==4){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==1){
            index++;
        }
        if(allballs.get(index)!=0 & index==2){
            colors2.setImageResource(R.drawable.green1);
            picker2 = findViewById(R.id.picker2);
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==2){
            index++;
        }
        if(allballs.get(index)!=0 & index==3){
            colors2.setImageResource(R.drawable.yellow1);
            picker2 = findViewById(R.id.picker2);
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==3){
            index++;
        }
        if(allballs.get(index)!=0 & index==4){
            colors2.setImageResource(R.drawable.white1);
            picker2 = findViewById(R.id.picker2);
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==4){
            index++;
        }
        if(allballs.get(index)!=0 & index==5){
            colors2.setImageResource(R.drawable.black1);
            picker2 = findViewById(R.id.picker2);
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==5){
            index++;
            switchColor2 (null);
        }
    }
    public void switchColor3(View view ){
        if(index==6){index=0;}
        if(allballs.get(index)!=0 & index==0){
            colors3.setImageResource(R.drawable.red1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==0){
            index++;
        }

        if(allballs.get(index)!=0 & index==1){
            colors3.setImageResource(R.drawable.blue1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==1){
            index++;
        }
        if(allballs.get(index)!=0 & index==2){
            colors3.setImageResource(R.drawable.green1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==2){
            index++;
        }
        if(allballs.get(index)!=0 & index==3){
            colors3.setImageResource(R.drawable.yellow1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==3){
            index++;
        }
        if(allballs.get(index)!=0 & index==4){
            colors3.setImageResource(R.drawable.white1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==4){
            index++;
        }
        if(allballs.get(index)!=0 & index==5){
            colors3.setImageResource(R.drawable.black1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index)-1));
            index++;
            return;
        }
        if(allballs.get(index)==0 & index==5){
            index++;
            switchColor3 (null);
        }
    }
    public void switchColor21(View view ){
        if(index2==6){index2=0;}
        if(allballs2.get(index2)!=0 & index2==0){
            colors21.setImageResource(R.drawable.red1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index2)-1));
            if(draw==1){
                plus2.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            else{plus2.setVisibility(View.VISIBLE);}
            if(picker21.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            if(Collections.frequency(allballs2, 0)==5){
                plus2.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==0){
            if(draw==1){
                plus2.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            else{plus2.setVisibility(View.VISIBLE);}
            if(picker21.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            if(Collections.frequency(allballs2, 0)==5){
                plus2.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index2++;
        }

        if(allballs2.get(index2)!=0 & index2==1){
            colors21.setImageResource(R.drawable.blue1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index2)-1));
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==1){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==2){
            colors21.setImageResource(R.drawable.green1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index2)-1));
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==2){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==3){
            colors21.setImageResource(R.drawable.yellow1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index2)-1));
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==3){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==4){
            colors21.setImageResource(R.drawable.white1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index2)-1));
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==4){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==5){
            colors21.setImageResource(R.drawable.black1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index2)-1));
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==5){
            index2++;
            switchColor21 (null);
        }
    }
    public void switchColor22(View view ){
        if(index2==6){index2=0;}
        if(allballs2.get(index2)!=0 & index2==0){
            colors22.setImageResource(R.drawable.red1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index2)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }
            if(Collections.frequency(allballs2, 0)==4){
                plus2.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==0){
            plus2.setVisibility(View.VISIBLE);
            if(Collections.frequency(allballs2, 0)==4){
                plus2.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index2++;
        }

        if(allballs2.get(index2)!=0 & index2==1){
            colors22.setImageResource(R.drawable.blue1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index2)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==1){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==2){
            colors22.setImageResource(R.drawable.green1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index2)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==2){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==3){
            colors22.setImageResource(R.drawable.yellow1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index2)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==3){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==4){
            colors22.setImageResource(R.drawable.white1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index2)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==4){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==5){
            colors22.setImageResource(R.drawable.black1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index2)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==5){
            index2++;
            switchColor22 (null);
        }
    }
    public void switchColor23(View view ){
        if(index2==6){index2=0;}
        if(allballs2.get(index2)!=0 & index2==0){
            colors23.setImageResource(R.drawable.red1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index2)-1));
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==0){
            index2++;
        }

        if(allballs2.get(index2)!=0 & index2==1){
            colors23.setImageResource(R.drawable.blue1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index2)-1));            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==1){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==2){
            colors23.setImageResource(R.drawable.green1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index2)-1));
            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==2){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==3){
            colors23.setImageResource(R.drawable.yellow1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index2)-1));            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==3){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==4){
            colors23.setImageResource(R.drawable.white1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index2)-1));            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==4){
            index2++;
        }
        if(allballs2.get(index2)!=0 & index2==5){
            colors23.setImageResource(R.drawable.black1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index2)-1));            index2++;
            return;
        }
        if(allballs2.get(index2)==0 & index2==5){
            index2++;
            switchColor23 (null);
        }
    }
    public void switchColor31(View view ){
        if(index3==6){index3=0;}
        if(allballs3.get(index3)!=0 & index3==0){
            colors31.setImageResource(R.drawable.red1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index3)-1));
            if(draw==1){
                plus3.setVisibility(View.GONE);
            }
            else{plus3.setVisibility(View.VISIBLE);}
            if(picker31.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==0){
            if(draw==1){
                plus3.setVisibility(View.GONE);
            }
            else{plus3.setVisibility(View.VISIBLE);}
            if(picker31.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index3++;
        }

        if(allballs3.get(index3)!=0 & index3==1){
            colors31.setImageResource(R.drawable.blue1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index3)-1));
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==1){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==2){
            colors31.setImageResource(R.drawable.green1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index3)-1));
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==2){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==3){
            colors31.setImageResource(R.drawable.yellow1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index3)-1));
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==3){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==4){
            colors31.setImageResource(R.drawable.white1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index3)-1));
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==4){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==5){
            colors31.setImageResource(R.drawable.black1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index3)-1));
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==5){
            index3++;
            switchColor31 (null);
        }
    }
    public void switchColor32(View view ){
        if(index3==6){index3=0;}
        if(allballs3.get(index3)!=0 & index3==0){
            colors32.setImageResource(R.drawable.red1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index3)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==0){
            plus3.setVisibility(View.VISIBLE);
            index3++;
        }

        if(allballs3.get(index3)!=0 & index3==1){
            colors32.setImageResource(R.drawable.blue1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index3)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==1){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==2){
            colors32.setImageResource(R.drawable.green1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index3)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==2){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==3){
            colors32.setImageResource(R.drawable.yellow1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index3)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==3){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==4){
            colors32.setImageResource(R.drawable.white1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index3)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==4){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==5){
            colors32.setImageResource(R.drawable.black1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index3)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==5){
            index3++;
            switchColor32 (null);
        }
    }
    public void switchColor33(View view ){
        if(index3==6){index3=0;}
        if(allballs3.get(index3)!=0 & index3==0){
            colors33.setImageResource(R.drawable.red1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index3)-1));
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==0){
            index3++;
        }

        if(allballs3.get(index3)!=0 & index3==1){
            colors33.setImageResource(R.drawable.blue1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index3)-1));            index2++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==1){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==2){
            colors33.setImageResource(R.drawable.green1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index3)-1));
            index3++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==2){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==3){
            colors33.setImageResource(R.drawable.yellow1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index3)-1));            index2++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==3){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==4){
            colors33.setImageResource(R.drawable.white1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index3)-1));            index2++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==4){
            index3++;
        }
        if(allballs3.get(index3)!=0 & index3==5){
            colors33.setImageResource(R.drawable.black1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index3)-1));            index2++;
            return;
        }
        if(allballs3.get(index3)==0 & index3==5){
            index2++;
            switchColor33 (null);
        }
    }
    public void for_max(View view){
        popUP2.dismiss();
        plus.setVisibility(View.GONE);
        other.setVisibility(View.VISIBLE);
        if(numberOfLines==1){
            first_line = findViewById(R.id.first_line);
            for (int i = 0; i < first_line.getChildCount(); i++) {
                View child = first_line.getChildAt(i);
                child.setEnabled(false);
            }
        }
        else if(numberOfLines==2){
            second_line = findViewById(R.id.second);
            for (int i = 0; i < second_line.getChildCount(); i++) {
                View child = second_line.getChildAt(i);
                child.setEnabled(false);
            }
        }
    }
    public void for_min(View view){
        popUP2.dismiss();
        plus.setVisibility(View.GONE);
        other.setVisibility(View.VISIBLE);
        if(numberOfLines==1){
            first_line = findViewById(R.id.first_line);
            for (int i = 0; i < first_line.getChildCount(); i++) {
                View child = first_line.getChildAt(i);
                child.setEnabled(false);
            }
        }
        if(numberOfLines==2){
            second_line = findViewById(R.id.second);
            for (int i = 0; i < second_line.getChildCount(); i++) {
                View child = second_line.getChildAt(i);
                child.setEnabled(false);
            }
        }
    }

    public void reset(View view){
        second_line.setVisibility(View.GONE);
        third_line.setVisibility(View.GONE);
        numberOfLines=1;
        index=0;
        colors1.setImageResource(R.drawable.click);
        colors2.setImageResource(R.drawable.click);
        colors3.setImageResource(R.drawable.click);
        plus.setVisibility(View.GONE);
        other.setVisibility(View.GONE);
        for (int i = 0; i < first_line.getChildCount(); i++) {
            View child = first_line.getChildAt(i);
            child.setEnabled(true);
        }
        picker1.setValue(0);
        for (int i = 0; i < second_line.getChildCount(); i++) {
            View child = second_line.getChildAt(i);
            child.setEnabled(true);
        }
        picker2.setValue(0);
        allballs = new ArrayList<>(allballsB);
    }
    public void reset2(View view){
        second_line2.setVisibility(View.GONE);
        third_line2.setVisibility(View.GONE);
        numberOfLines2=1;
        index=0;
        colors21.setImageResource(R.drawable.click);
        colors22.setImageResource(R.drawable.click);
        colors23.setImageResource(R.drawable.click);
        plus2.setVisibility(View.GONE);
        other.setVisibility(View.GONE);
        for (int i = 0; i < first_line2.getChildCount(); i++) {
            View child = first_line2.getChildAt(i);
            child.setEnabled(true);
        }
        picker21.setValue(0);
        for (int i = 0; i < second_line2.getChildCount(); i++) {
            View child = second_line2.getChildAt(i);
            child.setEnabled(true);
        }
        picker22.setValue(0);
        allballs2 = new ArrayList<>(allballsB);
        hadita_two.setVisibility(View.GONE);
        numberOfPart=1;
    }
    public void reset3(View view){
        second_line3.setVisibility(View.GONE);
        third_line3.setVisibility(View.GONE);
        numberOfLines3=1;
        index=0;
        colors31.setImageResource(R.drawable.click);
        colors32.setImageResource(R.drawable.click);
        colors33.setImageResource(R.drawable.click);
        plus3.setVisibility(View.GONE);
        other.setVisibility(View.GONE);
        for (int i = 0; i < first_line3.getChildCount(); i++) {
            View child = first_line3.getChildAt(i);
            child.setEnabled(true);
        }
        picker31.setValue(0);
        for (int i = 0; i < second_line3.getChildCount(); i++) {
            View child = second_line3.getChildAt(i);
            child.setEnabled(true);
        }
        picker32.setValue(0);
        allballs3 = new ArrayList<>(allballsB);
        hadita_three.setVisibility(View.GONE);
        numberOfPart=2;
    }
    public void showParts(View view){
        if(numberOfPart==1){
            for (int i = 0; i < first_line.getChildCount(); i++) {
                View child = first_line.getChildAt(i);
                child.setEnabled(false);
            }
            for (int i = 0; i < second_line.getChildCount(); i++) {
                View child = second_line.getChildAt(i);
                child.setEnabled(false);
            }
            for (int i = 0; i < third_line.getChildCount(); i++) {
                View child = third_line.getChildAt(i);
                child.setEnabled(false);
            }
            hadita_two.setVisibility(View.VISIBLE);
            other.setVisibility(View.GONE);
            numberOfPart++;
        }
        else if(numberOfPart==2){
            for (int i = 0; i < first_line2.getChildCount(); i++) {
                View child = first_line2.getChildAt(i);
                child.setEnabled(false);
            }
            for (int i = 0; i < second_line2.getChildCount(); i++) {
                View child = second_line2.getChildAt(i);
                child.setEnabled(false);
            }
            for (int i = 0; i < third_line2.getChildCount(); i++) {
                View child = third_line2.getChildAt(i);
                child.setEnabled(false);
            }
            hadita_three.setVisibility(View.VISIBLE);
            other.setVisibility(View.GONE);
            numberOfPart++;
        }
    }
    public void resultGo(View view){
        Intent intent = new Intent(this, result.class);
        startActivity(intent);
    }

}