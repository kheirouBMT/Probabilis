package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class inputs extends AppCompatActivity {
    EditText Red, Blue, Green, Yellow, White, Black;
    TextView re;
    ArrayList<Integer> allBalls;
    int Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputs);
        Red = findViewById(R.id.redBalls);
        Red.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                sum(null);
            }
        });
        Blue = findViewById(R.id.blueBalls);
        Blue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                sum(null);
            }
        });
        Green = findViewById(R.id.greenBalls);
        Green.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                sum(null);
            }
        });
        Yellow = findViewById(R.id.yellowBalls);
        Yellow.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                sum(null);
            }
        });
        White = findViewById(R.id.whiteBalls);
        White.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                sum(null);
            }
        });
        Black = findViewById(R.id.blackBalls);
        Black.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                sum(null);
            }
        });

        re = findViewById(R.id.result);
    }
    public void sum(View view) {
        int red,blue,green,yellow,white,black;
        allBalls = new ArrayList<Integer>();
        if ( TextUtils.isEmpty(Red.getText().toString())){
            red = 0;
            allBalls.add(red);}
        else {
            red = Integer.parseInt(Red.getText().toString());
            allBalls.add(red);}
        if ( TextUtils.isEmpty(Blue.getText().toString())){
            blue = 0;
            allBalls.add(blue);}
        else {
            blue = Integer.parseInt(Blue.getText().toString());
            allBalls.add(blue);}
        if ( TextUtils.isEmpty(Green.getText().toString())){
            green = 0;
            allBalls.add(green);}
        else {
            green = Integer.parseInt(Green.getText().toString());
            allBalls.add(green);}
        if ( TextUtils.isEmpty(Yellow.getText().toString())){
            yellow = 0;
            allBalls.add(yellow);}
        else {
            yellow = Integer.parseInt(Yellow.getText().toString());
            allBalls.add(yellow);}
        if ( TextUtils.isEmpty(White.getText().toString())){
            white = 0;
            allBalls.add(white);}
        else {
            white = Integer.parseInt(White.getText().toString());
            allBalls.add(white);}
        if ( TextUtils.isEmpty(Black.getText().toString())){
            black = 0;
            allBalls.add(black);}
        else {
            black = Integer.parseInt(Black.getText().toString());
            allBalls.add(black);}

        Result = red+blue+green+yellow+white+black;
        re.setText(" "+ Result);




    }
    public void  type(View view){
        startActivity(new Intent(this,type.class));
    }
}