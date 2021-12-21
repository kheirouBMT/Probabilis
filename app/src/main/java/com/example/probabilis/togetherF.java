package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class togetherF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_together_f);
        Intent intent = getIntent();
        int Result = inputs.Result;
        int draw = intent.getIntExtra(type.draw, 0);

        TextView all1 = (TextView) findViewById(R.id.all1);
        all1.setText("عدد السحبات الممكنة هو : " +String.valueOf(Result));

    }
    static long factorial(long x){
        long fac=1;
        for (long i=1 ; i<=x ; i++){
            fac=fac*i;
        }
        return fac;}
    static long permutation(long a, long b){
        return (factorial(a) / (factorial(a-b)*factorial(b)));}
}