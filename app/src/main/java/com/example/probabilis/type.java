package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import javax.xml.transform.Result;

public class type extends AppCompatActivity {
    TextView show;
    int i=0, type, test, Result;
    String[] choices;
    Dialog popUP;
    NumberPicker draws;
    public static final String draw = "com.example.inputs.draw";
    public static final String Re = "com.example.inputs.Re";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        Intent intent = getIntent();
        int Result = intent.getIntExtra(inputs.Re, 0);
        popUP = new Dialog(this);
        show = findViewById(R.id.selector);
        draws = findViewById(R.id.draws);// num picker
        choices = getResources().getStringArray(R.array.picker);
        draws.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        draws.setDisplayedValues(choices);
        draws.setMinValue(0);
        draws.setMaxValue(Result-1);

    }
    public void togetherT(View v){
        show.setText("في آن واحد");
    }
    public void irja3T(View v){
        show.setText("بإرجاع");
    }
    public void withoutT(View v){
        show.setText("بدون إرجاع");

    }
    public void next2(View view){
        if(type==1){
            Intent intent = new Intent(this, togetherF.class);
            int drawss = (draws.getValue()+1);

            intent.putExtra(draw, drawss);
            intent.putExtra(Re, Result);
            startActivity(intent);
        }
        else if(type==2){

        }
        else if(type==3){

        }
    }
    public void showPOP(View v) {
        TextView txtclose, show;
        ImageView together, tawali, irja3, without;
        popUP.setContentView(R.layout.pop_up);
        txtclose = (TextView) popUP.findViewById(R.id.txtclose);
        show = (TextView) popUP.findViewById(R.id.selector);
        together = (ImageView) popUP.findViewById(R.id.together);
        tawali = (ImageView) popUP.findViewById(R.id.tawali);
        irja3 = (ImageView) popUP.findViewById(R.id.irja3);
        without = (ImageView) popUP.findViewById(R.id.without);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUP.dismiss();
            }
        });
        together.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUP.dismiss();
                togetherT(null);
                type =1;
            }
        });
        tawali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irja3.setVisibility(View.VISIBLE);
                without.setVisibility(View.VISIBLE);
            }
        });
        irja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUP.dismiss();
                irja3T(null);
                type =2;

            }
        });
        without.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUP.dismiss();
                withoutT(null);
                type =3;

            }
        });
        popUP.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popUP.show();
    }

}