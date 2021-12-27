package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class result extends AppCompatActivity {
    androidx.constraintlayout.widget.ConstraintLayout mainRe,mainRe2;
    ImageView line,line2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        mainRe2 = findViewById(R.id.Re);
        mainRe = findViewById(R.id.Re2);
        line = findViewById(R.id.line);
        line2 = findViewById(R.id.line2);
        line.getLayoutParams().width = mainRe.getWidth();
        line2.getLayoutParams().width = mainRe2.getWidth();



    }
}