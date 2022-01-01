package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class togetherF extends AppCompatActivity {
    String[] choices;
    static int draw,typeOfDraw1=1,typeOfDraw2=1,typeOfDraw3=1;
    static int numberOfPart=1, varOne, varTwo,varThree, var2One, var2Two,var2Three, var3One, var3Two,var3Three;
    static int index11=0,index12=0,index13=0, Result, numberOfLines=1;//7adita lewla
    NumberPicker picker1,picker2,picker3;
    static int index21=0,index22=0,index23=0, numberOfLines2=1; // 7adita tania
    NumberPicker picker21,picker22,picker23;
    static int index31=0,index32=0,index33=0, numberOfLines3=1; // 7adita talta
    NumberPicker picker31,picker32,picker33;
    ImageButton reset1, reset2, reset3;
    ArrayList<Integer> allballs = new ArrayList<>();
    ArrayList<Integer> allballs2;
    ArrayList<Integer> allballs3;
    static ArrayList<Integer> allballsB = new ArrayList<>();
    ImageButton plus;
    ImageButton plus2;
    ImageButton plus3;
    TextView other;
    static ImageView colors1, colors2, colors3;
    static ImageView colors21, colors22, colors23;
    @SuppressLint("StaticFieldLeak")
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
        index11=0;
        index12=0;
        index13=0;
        index21=0;
        index22=0;
        index23=0;
        index31=0;
        index32=0;
        index33=0;
        numberOfLines=1;
        numberOfLines2=1;
        numberOfLines3=1;
        int Result = inputs.Result;
        // getting inputs
        allballs.clear();
        allballs.add(inputs.red);
        allballs.add(inputs.blue);
        allballs.add(inputs.green);
        allballs.add(inputs.yellow);
        allballs.add(inputs.white);
        allballs.add(inputs.black);
        allballsB = new ArrayList<>(allballs);
        allballs2 = new ArrayList<>(allballsB);
        allballs3 = new ArrayList<>(allballsB);
        //    end of getting inputs
        draw = type.draw;
        // number of draws

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
        picker1.setOnValueChangedListener((picker, oldVal, newVal) -> {
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
            if(index11==0){plus.setVisibility(View.GONE);}
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
                if(Collections.frequency(allballs, 0)==5){
                    plus.setVisibility(View.GONE);
                    other.setVisibility(View.VISIBLE);}
                if(index12==0){plus.setVisibility(View.GONE);}
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
                if(index21==0){plus2.setVisibility(View.GONE);}
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
                if(Collections.frequency(allballs2, 0)==5){
                    plus2.setVisibility(View.GONE);
                    other.setVisibility(View.VISIBLE);}
                if(index22==0){plus2.setVisibility(View.GONE);}
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
                if(index31==0){plus3.setVisibility(View.GONE);}
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
                if(Collections.frequency(allballs3, 0)==5){
                    plus3.setVisibility(View.GONE);}
                if(index32==0){plus3.setVisibility(View.GONE);}
            }
        });

        // showing popUp
        popUP2 = new Dialog(this);
        plus = findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (index11 != 0) {
                    popUP2.setContentView(R.layout.pop_up2);
                    popUP2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    popUP2.setCanceledOnTouchOutside(false);
                    popUP2.show();
                    ImageButton special = (ImageButton) popUP2.findViewById(R.id.special);
                    special.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (numberOfLines == 1) {
                                allballs.set(index11 - 1, 0);
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
                                popUP2.dismiss();
                            }
                            else if (numberOfLines == 2) {
                                allballs.set(index12 - 1, 0);
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
                if (index21 != 0) {
                    popUP2.setContentView(R.layout.pop_up2);
                    popUP2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    popUP2.setCanceledOnTouchOutside(false);
                    popUP2.show();
                    ImageButton special = (ImageButton) popUP2.findViewById(R.id.special);
                    special.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (numberOfLines2 == 1) {
                                allballs2.set(index21 - 1, 0);
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
                                popUP2.dismiss();
                            }
                            else if (numberOfLines2 == 2) {
                                allballs2.set(index22 - 1, 0);
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
                if (index31 != 0) {
                    popUP2.setContentView(R.layout.pop_up2);
                    popUP2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    popUP2.setCanceledOnTouchOutside(false);
                    popUP2.show();
                    ImageButton special = (ImageButton) popUP2.findViewById(R.id.special);
                    special.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (numberOfLines3 == 1) {
                                allballs3.set(index31 - 1, 0);
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
                                popUP2.dismiss();
                            }
                            else if (numberOfLines3 == 2) {
                                allballs3.set(index32 - 1, 0);
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
        if(index11==6){index11=0;}
        if(allballs.get(index11)!=0 & index11==0){
            colors1.setImageResource(R.drawable.red1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index11)-1));
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
            index11++;
            return;
        }
        if(allballs.get(index11)==0 & index11==0){
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
            index11++;
        }

        if(allballs.get(index11)!=0 & index11==1){
            colors1.setImageResource(R.drawable.blue1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index11)-1));
            index11++;
            return;
        }
        if(allballs.get(index11)==0 & index11==1){
            index11++;
        }
        if(allballs.get(index11)!=0 & index11==2){
            colors1.setImageResource(R.drawable.green1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index11)-1));
            index11++;
            return;
        }
        if(allballs.get(index11)==0 & index11==2){
            index11++;
        }
        if(allballs.get(index11)!=0 & index11==3){
            colors1.setImageResource(R.drawable.yellow1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index11)-1));
            index11++;
            return;
        }
        if(allballs.get(index11)==0 & index11==3){
            index11++;
        }
        if(allballs.get(index11)!=0 & index11==4){
            colors1.setImageResource(R.drawable.white1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index11)-1));
            index11++;
            return;
        }
        if(allballs.get(index11)==0 & index11==4){
            index11++;
        }
        if(allballs.get(index11)!=0 & index11==5){
            colors1.setImageResource(R.drawable.black1);
            picker1 = findViewById(R.id.picker1);
            picker1.setMaxValue(Math.min(draw-1, allballs.get(index11)-1));
            index11++;
            return;
        }
        if(allballs.get(index11)==0 & index11==5){
            index11++;
            switchColor1 (null);
        }
    }

    public void switchColor2(View view ){
        if(index12==6){index12=0;}
        if(allballs.get(index12)!=0 & index12==0){
            colors2.setImageResource(R.drawable.red1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-varOne-1, allballs.get(index12)-1));
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            else{plus.setVisibility(View.VISIBLE);}
            if(Collections.frequency(allballs, 0)==5){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index12++;
            return;
        }
        if(allballs.get(index12)==0 & index12==0){
            plus.setVisibility(View.VISIBLE);
            index12++;
        }

        if(allballs.get(index12)!=0 & index12==1){
            colors2.setImageResource(R.drawable.blue1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-varOne-1, allballs.get(index12)-1));
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            if(Collections.frequency(allballs, 0)==5){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index12++;
            return;
        }
        if(allballs.get(index12)==0 & index12==1){
            index12++;
        }
        if(allballs.get(index12)!=0 & index12==2){
            colors2.setImageResource(R.drawable.green1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-varOne-1, allballs.get(index12)-1));
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            index12++;
            return;
        }
        if(allballs.get(index12)==0 & index12==2){
            index12++;
        }
        if(allballs.get(index12)!=0 & index12==3){
            colors2.setImageResource(R.drawable.yellow1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-varOne-1, allballs.get(index12)-1));
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            index12++;
            return;
        }
        if(allballs.get(index12)==0 & index12==3){
            index12++;
        }
        if(allballs.get(index12)!=0 & index12==4){
            colors2.setImageResource(R.drawable.white1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-varOne-1, allballs.get(index12)-1));
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            index12++;
            return;
        }
        if(allballs.get(index12)==0 & index12==4){
            index12++;
        }
        if(allballs.get(index12)!=0 & index12==5){
            colors2.setImageResource(R.drawable.black1);
            picker2 = findViewById(R.id.picker2);
            picker2.setMaxValue(Math.min(draw-varOne-1, allballs.get(index12)-1));
            if(varOne+picker2.getValue()+1==draw){
                plus.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);
            }
            index12++;
            return;
        }
        if(allballs.get(index12)==0 & index12==5){
            index12++;
            switchColor2 (null);
        }
    }

    public void switchColor3(View view ){
        if(index13==6){index13=0;}
        if(allballs.get(index13)!=0 & index13==0){
            colors3.setImageResource(R.drawable.red1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index13)-1));
            index13++;
            return;
        }
        if(allballs.get(index13)==0 & index13==0){
            index13++;
        }

        if(allballs.get(index13)!=0 & index13==1){
            colors3.setImageResource(R.drawable.blue1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index13)-1));
            index13++;
            return;
        }
        if(allballs.get(index13)==0 & index13==1){
            index13++;
        }
        if(allballs.get(index13)!=0 & index13==2){
            colors3.setImageResource(R.drawable.green1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index13)-1));
            index13++;
            return;
        }
        if(allballs.get(index13)==0 & index13==2){
            index13++;
        }
        if(allballs.get(index13)!=0 & index13==3){
            colors3.setImageResource(R.drawable.yellow1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index13)-1));
            index13++;
            return;
        }
        if(allballs.get(index13)==0 & index13==3){
            index13++;
        }
        if(allballs.get(index13)!=0 & index13==4){
            colors3.setImageResource(R.drawable.white1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index13)-1));
            index13++;
            return;
        }
        if(allballs.get(index13)==0 & index13==4){
            index13++;
        }
        if(allballs.get(index13)!=0 & index13==5){
            colors3.setImageResource(R.drawable.black1);
            picker3 = findViewById(R.id.picker3);
            picker3.setMaxValue(Math.min(draw-varTwo-varOne-1, allballs.get(index13)-1));
            index13++;
            return;
        }
        if(allballs.get(index13)==0 & index13==5){
            index13++;
            switchColor3 (null);
        }
    }

    public void switchColor21(View view ){
        if(index21==6){index21=0;}
        if(allballs2.get(index21)!=0 & index21==0){
            colors21.setImageResource(R.drawable.red1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index21)-1));
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
            index21++;
            return;
        }
        if(allballs2.get(index21)==0 & index21==0){
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
            index21++;
        }

        if(allballs2.get(index21)!=0 & index21==1){
            colors21.setImageResource(R.drawable.blue1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index21)-1));
            index21++;
            return;
        }
        if(allballs2.get(index21)==0 & index21==1){
            index21++;
        }
        if(allballs2.get(index21)!=0 & index21==2){
            colors21.setImageResource(R.drawable.green1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index21)-1));
            index21++;
            return;
        }
        if(allballs2.get(index21)==0 & index21==2){
            index21++;
        }
        if(allballs2.get(index21)!=0 & index21==3){
            colors21.setImageResource(R.drawable.yellow1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index21)-1));
            index21++;
            return;
        }
        if(allballs2.get(index21)==0 & index21==3){
            index21++;
        }
        if(allballs2.get(index21)!=0 & index21==4){
            colors21.setImageResource(R.drawable.white1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index21)-1));
            index21++;
            return;
        }
        if(allballs2.get(index21)==0 & index21==4){
            index21++;
        }
        if(allballs2.get(index21)!=0 & index21==5){
            colors21.setImageResource(R.drawable.black1);
            picker21 = findViewById(R.id.picker21);
            picker21.setMaxValue(Math.min(draw-1, allballs2.get(index21)-1));
            index21++;
            return;
        }
        if(allballs2.get(index21)==0 & index21==5){
            index21++;
            switchColor21 (null);
        }
    }

    public void switchColor22(View view ){
        if(index22==6){index22=0;}
        if(allballs2.get(index22)!=0 & index22==0){
            colors22.setImageResource(R.drawable.red1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index22)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }
            else{plus2.setVisibility(View.VISIBLE);}
            if(Collections.frequency(allballs2, 0)==5){
                plus2.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index22++;
            return;
        }
        if(allballs2.get(index22)==0 & index22==0){
            plus2.setVisibility(View.VISIBLE);
            if(Collections.frequency(allballs2, 0)==5){
                plus2.setVisibility(View.GONE);
                other.setVisibility(View.VISIBLE);}
            index22++;
        }

        if(allballs2.get(index22)!=0 & index22==1){
            colors22.setImageResource(R.drawable.blue1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index22)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }
            index22++;
            return;
        }
        if(allballs2.get(index22)==0 & index22==1){
            index22++;
        }
        if(allballs2.get(index22)!=0 & index22==2){
            colors22.setImageResource(R.drawable.green1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index22)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }            index22++;
            return;
        }
        if(allballs2.get(index22)==0 & index22==2){
            index22++;
        }
        if(allballs2.get(index22)!=0 & index22==3){
            colors22.setImageResource(R.drawable.yellow1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index22)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }
            index22++;
            return;
        }
        if(allballs2.get(index22)==0 & index22==3){
            index22++;
        }
        if(allballs2.get(index22)!=0 & index22==4){
            colors22.setImageResource(R.drawable.white1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index22)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }
            index22++;
            return;
        }
        if(allballs2.get(index22)==0 & index22==4){
            index22++;
        }
        if(allballs2.get(index22)!=0 & index22==5){
            colors22.setImageResource(R.drawable.black1);
            picker22 = findViewById(R.id.picker22);
            picker22.setMaxValue(Math.min(draw-var2One-1, allballs2.get(index22)-1));
            if(var2One+picker22.getValue()+1==draw){
                plus2.setVisibility(View.GONE);
            }
            index22++;
            return;
        }
        if(allballs2.get(index22)==0 & index22==5){
            index22++;
            switchColor22 (null);
        }
    }

    public void switchColor23(View view ){
        if(index23==6){index23=0;}
        if(allballs2.get(index23)!=0 & index23==0){
            colors23.setImageResource(R.drawable.red1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index23)-1));
            index23++;
            return;
        }
        if(allballs2.get(index23)==0 & index23==0){
            index23++;
        }

        if(allballs2.get(index23)!=0 & index23==1){
            colors23.setImageResource(R.drawable.blue1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index23)-1));            index23++;
            return;
        }
        if(allballs2.get(index23)==0 & index23==1){
            index23++;
        }
        if(allballs2.get(index23)!=0 & index23==2){
            colors23.setImageResource(R.drawable.green1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index23)-1));
            index23++;
            return;
        }
        if(allballs2.get(index23)==0 & index23==2){
            index23++;
        }
        if(allballs2.get(index23)!=0 & index23==3){
            colors23.setImageResource(R.drawable.yellow1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index23)-1));            index23++;
            return;
        }
        if(allballs2.get(index23)==0 & index23==3){
            index23++;
        }
        if(allballs2.get(index23)!=0 & index23==4){
            colors23.setImageResource(R.drawable.white1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index23)-1));            index23++;
            return;
        }
        if(allballs2.get(index23)==0 & index23==4){
            index23++;
        }
        if(allballs2.get(index23)!=0 & index23==5){
            colors23.setImageResource(R.drawable.black1);
            picker23 = findViewById(R.id.picker23);
            picker23.setMaxValue(Math.min(draw-var2Two-var2One-1, allballs2.get(index23)-1));            index23++;
            return;
        }
        if(allballs2.get(index23)==0 & index23==5){
            index23++;
            switchColor23 (null);
        }
    }
    public void switchColor31(View view ){
        if(index31==6){index31=0;}
        if(allballs3.get(index31)!=0 & index31==0){
            colors31.setImageResource(R.drawable.red1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index31)-1));
            if(draw==1){
                plus3.setVisibility(View.GONE);
            }
            else{plus3.setVisibility(View.VISIBLE);}
            if(picker31.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index31++;
            return;
        }
        if(allballs3.get(index31)==0 & index31==0){
            if(draw==1){
                plus3.setVisibility(View.GONE);
            }
            else{plus3.setVisibility(View.VISIBLE);}
            if(picker31.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index31++;
        }

        if(allballs3.get(index31)!=0 & index31==1){
            colors31.setImageResource(R.drawable.blue1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index31)-1));
            index31++;
            return;
        }
        if(allballs3.get(index31)==0 & index31==1){
            index31++;
        }
        if(allballs3.get(index31)!=0 & index31==2){
            colors31.setImageResource(R.drawable.green1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index31)-1));
            index31++;
            return;
        }
        if(allballs3.get(index31)==0 & index31==2){
            index31++;
        }
        if(allballs3.get(index31)!=0 & index31==3){
            colors31.setImageResource(R.drawable.yellow1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index31)-1));
            index31++;
            return;
        }
        if(allballs3.get(index31)==0 & index31==3){
            index31++;
        }
        if(allballs3.get(index31)!=0 & index31==4){
            colors31.setImageResource(R.drawable.white1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index31)-1));
            index31++;
            return;
        }
        if(allballs3.get(index31)==0 & index31==4){
            index31++;
        }
        if(allballs3.get(index31)!=0 & index31==5){
            colors31.setImageResource(R.drawable.black1);
            picker31 = findViewById(R.id.picker31);
            picker31.setMaxValue(Math.min(draw-1, allballs3.get(index31)-1));
            index31++;
            return;
        }
        if(allballs3.get(index31)==0 & index31==5){
            index31++;
            switchColor31 (null);
        }
    }

    public void switchColor32(View view ){
        if(index32==6){index32=0;}
        if(allballs3.get(index32)!=0 & index32==0){
            colors32.setImageResource(R.drawable.red1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index32)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            if(Collections.frequency(allballs3, 0)==5){
                plus3.setVisibility(View.GONE);}
            index32++;
            return;
        }
        if(allballs3.get(index32)==0 & index32==0){
            if(Collections.frequency(allballs3, 0)==5){
                plus3.setVisibility(View.GONE);}
            index32++;
        }

        if(allballs3.get(index32)!=0 & index32==1){
            colors32.setImageResource(R.drawable.blue1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index32)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index32++;
            return;
        }
        if(allballs3.get(index32)==0 & index32==1){
            index32++;
        }
        if(allballs3.get(index32)!=0 & index32==2){
            colors32.setImageResource(R.drawable.green1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index32)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }            index32++;
            return;
        }
        if(allballs3.get(index32)==0 & index32==2){
            index32++;
        }
        if(allballs3.get(index32)!=0 & index32==3){
            colors32.setImageResource(R.drawable.yellow1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index32)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index32++;
            return;
        }
        if(allballs3.get(index32)==0 & index32==3){
            index32++;
        }
        if(allballs3.get(index32)!=0 & index32==4){
            colors32.setImageResource(R.drawable.white1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index32)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index32++;
            return;
        }
        if(allballs3.get(index32)==0 & index32==4){
            index32++;
        }
        if(allballs3.get(index32)!=0 & index32==5){
            colors32.setImageResource(R.drawable.black1);
            picker32 = findViewById(R.id.picker32);
            picker32.setMaxValue(Math.min(draw-var3One-1, allballs3.get(index32)-1));
            if(var3One+picker32.getValue()+1==draw){
                plus3.setVisibility(View.GONE);
            }
            index32++;
            return;
        }
        if(allballs3.get(index32)==0 & index32==5){
            index32++;
            switchColor32 (null);
        }
    }

    public void switchColor33(View view ){
        if(index33==6){index33=0;}
        if(allballs3.get(index33)!=0 & index33==0){
            colors33.setImageResource(R.drawable.red1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index33)-1));
            index33++;
            return;
        }
        if(allballs3.get(index33)==0 & index33==0){
            index33++;
        }

        if(allballs3.get(index33)!=0 & index33==1){
            colors33.setImageResource(R.drawable.blue1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index33)-1));            index33++;
            return;
        }
        if(allballs3.get(index33)==0 & index33==1){
            index33++;
        }
        if(allballs3.get(index33)!=0 & index33==2){
            colors33.setImageResource(R.drawable.green1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index33)-1));
            index33++;
            return;
        }
        if(allballs3.get(index33)==0 & index33==2){
            index33++;
        }
        if(allballs3.get(index33)!=0 & index33==3){
            colors33.setImageResource(R.drawable.yellow1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index33)-1));            index33++;
            return;
        }
        if(allballs3.get(index33)==0 & index33==3){
            index33++;
        }
        if(allballs3.get(index33)!=0 & index33==4){
            colors33.setImageResource(R.drawable.white1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index33)-1));            index33++;
            return;
        }
        if(allballs3.get(index33)==0 & index33==4){
            index33++;
        }
        if(allballs3.get(index33)!=0 & index33==5){
            colors33.setImageResource(R.drawable.black1);
            picker33 = findViewById(R.id.picker33);
            picker33.setMaxValue(Math.min(draw-var3Two-var3One-1, allballs3.get(index33)-1));            index33++;
            return;
        }
        if(allballs3.get(index33)==0 & index33==5){
            index33++;
            switchColor33 (null);
        }
    }

    public void for_max(View view){
        popUP2.dismiss();
        other.setVisibility(View.VISIBLE);
        if(numberOfPart==1){
            plus.setVisibility(View.GONE);
            typeOfDraw1=2;
            first_line = findViewById(R.id.first_line);
            second_line = findViewById(R.id.second);
            third_line = findViewById(R.id.third);
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
        }
        if(numberOfPart==2){
            plus2.setVisibility(View.GONE);
            typeOfDraw2=2;
            first_line2 = findViewById(R.id.first_line2);
            second_line2 = findViewById(R.id.second2);
            third_line2 = findViewById(R.id.third2);
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
        }
        if(numberOfPart==3){
            plus3.setVisibility(View.GONE);
            typeOfDraw3=2;
            first_line3 = findViewById(R.id.first_line3);
            second_line3 = findViewById(R.id.second3);
            third_line3 = findViewById(R.id.third3);
            for (int i = 0; i < first_line3.getChildCount(); i++) {
                View child = first_line3.getChildAt(i);
                child.setEnabled(false);
            }

            for (int i = 0; i < second_line3.getChildCount(); i++) {
                View child = second_line3.getChildAt(i);
                child.setEnabled(false);
            }
            for (int i = 0; i < third_line3.getChildCount(); i++) {
                View child = third_line3.getChildAt(i);
                child.setEnabled(false);
            }
        }
    }
    public void for_min(View view){
        popUP2.dismiss();
        other.setVisibility(View.VISIBLE);
        if(numberOfPart==1){
            plus.setVisibility(View.GONE);
            typeOfDraw1=3;
            first_line = findViewById(R.id.first_line);
            second_line = findViewById(R.id.second);
            third_line = findViewById(R.id.third);
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
        }
        if(numberOfPart==2){
            plus2.setVisibility(View.GONE);
            typeOfDraw2=3;
            first_line2 = findViewById(R.id.first_line2);
            second_line2 = findViewById(R.id.second2);
            third_line2 = findViewById(R.id.third2);
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
        }
        if(numberOfPart==3){
            plus3.setVisibility(View.GONE);
            typeOfDraw3=3;
            first_line3 = findViewById(R.id.first_line3);
            second_line3 = findViewById(R.id.second3);
            third_line3 = findViewById(R.id.third3);
            for (int i = 0; i < first_line3.getChildCount(); i++) {
                View child = first_line3.getChildAt(i);
                child.setEnabled(false);
            }

            for (int i = 0; i < second_line3.getChildCount(); i++) {
                View child = second_line3.getChildAt(i);
                child.setEnabled(false);
            }
            for (int i = 0; i < third_line3.getChildCount(); i++) {
                View child = third_line3.getChildAt(i);
                child.setEnabled(false);
            }
        }
    }
    public void reset(View view){
        second_line.setVisibility(View.GONE);
        third_line.setVisibility(View.GONE);
        numberOfLines=1;
        index11=0;
        index12=0;
        index13=0;
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
        AlertDialog icon_winR2 = new AlertDialog.Builder(this)
                .setTitle("تأكيد")
                .setMessage("هل تريد حذف هذه الحادثة ؟")
                .setPositiveButton("موافق", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        second_line2.setVisibility(View.GONE);
                        third_line2.setVisibility(View.GONE);
                        numberOfLines2=1;
                        index21=0;
                        index22=0;
                        index23=0;
                        colors21.setImageResource(R.drawable.click);
                        colors22.setImageResource(R.drawable.click);
                        colors23.setImageResource(R.drawable.click);
                        plus2.setVisibility(View.GONE);
                        other.setVisibility(View.VISIBLE);
                        picker21.setValue(0);
                        picker22.setValue(0);
                        allballs2.clear();
                        allballs2 = new ArrayList<>(allballsB);
                        numberOfPart=1;
                        reset1 = findViewById(R.id.reset);
                        reset1.setVisibility(View.VISIBLE);
                        for (int i = 0; i < first_line.getChildCount(); i++) {
                            View child = first_line.getChildAt(i);
                            child.setEnabled(true);
                        }
                        for (int i = 0; i < second_line.getChildCount(); i++) {
                            View child = second_line.getChildAt(i);
                            child.setEnabled(true);
                        }
                        for (int i = 0; i < third_line.getChildCount(); i++) {
                            View child = third_line.getChildAt(i);
                            child.setEnabled(true);}
                        for (int i = 0; i < first_line2.getChildCount(); i++) {
                            View child = first_line2.getChildAt(i);
                            child.setEnabled(true);
                        }
                        for (int i = 0; i < second_line2.getChildCount(); i++) {
                            View child = second_line2.getChildAt(i);
                            child.setEnabled(true);
                        }
                        for (int i = 0; i < third_line2.getChildCount(); i++) {
                            View child = third_line2.getChildAt(i);
                            child.setEnabled(true);}
                        hadita_two.setVisibility(View.GONE);
                    }
                })
                .setNegativeButton("إلغاء", null)
                .show();
    }
    public void reset3(View view){
        AlertDialog icon_winR2 = new AlertDialog.Builder(this)
                .setTitle("تأكيد")
                .setMessage("هل تريد حذف هذه الحادثة ؟")
                .setPositiveButton("موافق", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        second_line3.setVisibility(View.GONE);
                        third_line3.setVisibility(View.GONE);
                        numberOfLines3=1;
                        index31=0;
                        index32=0;
                        index33=0;
                        colors31.setImageResource(R.drawable.click);
                        colors32.setImageResource(R.drawable.click);
                        colors33.setImageResource(R.drawable.click);
                        plus3.setVisibility(View.GONE);
                        other.setVisibility(View.VISIBLE);
                        picker31.setValue(0);
                        picker32.setValue(0);
                        allballs3 = new ArrayList<>(allballsB);
                        hadita_three.setVisibility(View.GONE);
                        numberOfPart=2;
                        reset2 = findViewById(R.id.reset2);
                        reset2.setVisibility(View.VISIBLE);
                        for (int i = 0; i < first_line3.getChildCount(); i++) {
                            View child = first_line3.getChildAt(i);
                            child.setEnabled(true);
                        }
                        for (int i = 0; i < second_line2.getChildCount(); i++) {
                            View child = second_line2.getChildAt(i);
                            child.setEnabled(true);
                        }
                        for (int i = 0; i < third_line2.getChildCount(); i++) {
                            View child = third_line.getChildAt(i);
                            child.setEnabled(true);}
                        for (int i = 0; i < first_line3.getChildCount(); i++) {
                            View child = first_line3.getChildAt(i);
                            child.setEnabled(true);
                        }
                        for (int i = 0; i < second_line3.getChildCount(); i++) {
                            View child = second_line3.getChildAt(i);
                            child.setEnabled(true);
                        }
                        for (int i = 0; i < third_line3.getChildCount(); i++) {
                            View child = third_line3.getChildAt(i);
                            child.setEnabled(true);}
                    }
                })
                .setNegativeButton("إلغاء", null)
                .show();
    }
    public void showParts(View view){
        AlertDialog icon_winC = new AlertDialog.Builder(this)
                .setMessage("هل تريد حفظ الحادثة السابقة ؟")
                .setPositiveButton("موافق", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
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
                            reset1 = findViewById(R.id.reset);
                            reset1.setVisibility(View.GONE);
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
                            reset2 = findViewById(R.id.reset2);
                            reset2.setVisibility(View.GONE);
                        }
                    }
                })
                .setNegativeButton( "إلغاء", null)
                .show();
    }
    public void resultGo(View view){
        if(index11==0){
            Toast.makeText(togetherF.this, "يرجى التأكد من صحة التجربة",Toast.LENGTH_SHORT).show();
        }
        else if(index12==0 & numberOfLines==2){
            Toast.makeText(togetherF.this, "يرجى التأكد من صحة التجربة",Toast.LENGTH_SHORT).show();
        }
        else if(index13==0 & numberOfLines==3){
            Toast.makeText(togetherF.this, "يرجى التأكد من صحة التجربة",Toast.LENGTH_SHORT).show();
        }
        else if(index21==0 & numberOfPart==2){
            Toast.makeText(togetherF.this, "يرجى التأكد من صحة التجربة",Toast.LENGTH_SHORT).show();
        }
        else if(index22==0 & numberOfLines2==2){
            Toast.makeText(togetherF.this, "يرجى التأكد من صحة التجربة",Toast.LENGTH_SHORT).show();
        }
        else if(index23==0 & numberOfLines2==3){
            Toast.makeText(togetherF.this, "يرجى التأكد من صحة التجربة",Toast.LENGTH_SHORT).show();
        }
        else if(index31==0 & numberOfPart==3){
            Toast.makeText(togetherF.this, "يرجى التأكد من صحة التجربة",Toast.LENGTH_SHORT).show();
        }
        else if(index32==0 & numberOfLines3==2){
            Toast.makeText(togetherF.this, "يرجى التأكد من صحة التجربة",Toast.LENGTH_SHORT).show();
        }
        else if(index33==0 & numberOfLines3==3){
            Toast.makeText(togetherF.this, "يرجى التأكد من صحة التجربة",Toast.LENGTH_SHORT).show();
        }
        else{
            varOne = picker1.getValue()+1;
            varTwo = picker2.getValue()+1;
            varThree = picker3.getValue()+1;
            var2One = picker21.getValue()+1;
            var2Two = picker22.getValue()+1;
            var2Three = picker23.getValue()+1;
            var3One = picker31.getValue()+1;
            var3Two = picker32.getValue()+1;
            var3Three = picker33.getValue()+1;
            Intent intent = new Intent(this, result.class);
            startActivity(intent);
        }
    }
    public void previous(View view){
        Intent prev = new Intent(this, type.class);
        startActivity(prev);
    }
    public void onBackPressed() {
        Toast.makeText(togetherF.this, "إذا أردت الرجوع إضغط على  \"السابق\"",Toast.LENGTH_SHORT).show();
    }
}