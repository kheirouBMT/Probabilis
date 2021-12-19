package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class type extends AppCompatActivity {
    TextView show;
    int i=0;
    Dialog popUP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        popUP = new Dialog(this);
        show = findViewById(R.id.selector);

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

            }
        });
        without.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUP.dismiss();
                withoutT(null);

            }
        });
        popUP.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popUP.show();
    }
}