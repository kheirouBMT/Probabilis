package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.ArrayList;

public class Result_without extends AppCompatActivity {
    androidx.constraintlayout.widget.ConstraintLayout mainRe,mainRe0, mainRe2,mainRe_sec,mainRe2_sec,mainRe_trd,mainRe2_trd;
    ImageView line0,line,line2,line_sec,line2_sec,line_trd,line2_trd;
    TextView allProbT,inputsA,inputsB,inputsC;
    TextView UP1,UP2,DOWN2,DOWN1,UP1_sec,UP2_sec,DOWN2_sec,DOWN1_sec,UP1_trd,UP2_trd,DOWN2_trd,DOWN1_trd;
    TextView C1_trd,C2_trd,C21_trd,C22_trd,C3_trd,C31_trd,C32_trd,C11_trd,C12_trd,C4_trd,C41_trd,C42_trd;
    TextView C1,C01,C01_sec,C02_sec,C01_trd,C02_trd,C02,C11,C12,C2,C21,C22,C3,C31,C32,C4,C41,C42,C1_sec,C11_sec,C12_sec,C2_sec,C21_sec,C22_sec,C3_sec,C31_sec,C32_sec,C4_sec,C41_sec,C42_sec;
    int numberOfLines1,numberOfLines2,numberOfLines3;
    long up1,up2,down1,down2,up1_sec,up2_sec,down1_sec,down2_sec,up1_trd,up2_trd,down1_trd,down2_trd;
    long denok=1;
    androidx.constraintlayout.widget.ConstraintLayout actionOne,actionTwo,actionThree,B,C;
    ArrayList<String> Colors = new ArrayList<>();
    ArrayList<String> numbers = new ArrayList<>();
    private int[] C_id = {
            R.id.C1,R.id.C11,R.id.C12,R.id.C1b,R.id.C11b,R.id.C12b,R.id.C2b,R.id.C21b,R.id.C22b,R.id.C2,R.id.C21,R.id.C22,R.id.C3b,R.id.C31b,R.id.C32b,R.id.C3,R.id.C31,R.id.C32,R.id.C4b,R.id.C41b,R.id.C42b,R.id.C4,R.id.C41,R.id.C42,R.id.C5b,R.id.C51b,R.id.C52b,R.id.C5,R.id.C51,R.id.C52,R.id.C6b,R.id.C61b,R.id.C62b,R.id.C6,R.id.C61,R.id.C62};
    private int[] C_sec_id = {
            R.id.C1_sec ,R.id.C11_sec ,R.id.C12_sec ,R.id.C1b_sec ,R.id.C11b_sec ,R.id.C12b_sec ,R.id.C2b_sec ,R.id.C21b_sec ,R.id.C22b_sec ,R.id.C2_sec ,R.id.C21_sec ,R.id.C22_sec ,R.id.C3b_sec ,R.id.C31b_sec ,R.id.C32b_sec ,R.id.C3_sec ,R.id.C31_sec ,R.id.C32_sec ,R.id.C4b_sec ,R.id.C41b_sec ,R.id.C42b_sec ,R.id.C4_sec ,R.id.C41_sec ,R.id.C42_sec ,R.id.C5b_sec ,R.id.C51b_sec ,R.id.C52b_sec ,R.id.C5_sec ,R.id.C51_sec ,R.id.C52_sec ,R.id.C6b_sec ,R.id.C61b_sec ,R.id.C62b_sec ,R.id.C6_sec ,R.id.C61_sec ,R.id.C62_sec };
    private int[] C_trd_id = {
            R.id.C1_trd ,R.id.C11_trd ,R.id.C12_trd ,R.id.C1b_trd ,R.id.C11b_trd ,R.id.C12b_trd ,R.id.C2b_trd ,R.id.C21b_trd ,R.id.C22b_trd ,R.id.C2_trd ,R.id.C21_trd ,R.id.C22_trd ,R.id.C3b_trd ,R.id.C31b_trd ,R.id.C32b_trd ,R.id.C3_trd ,R.id.C31_trd ,R.id.C32_trd ,R.id.C4b_trd ,R.id.C41b_trd ,R.id.C42b_trd ,R.id.C4_trd ,R.id.C41_trd ,R.id.C42_trd ,R.id.C5b_trd ,R.id.C51b_trd ,R.id.C52b_trd ,R.id.C5_trd ,R.id.C51_trd ,R.id.C52_trd ,R.id.C6b_trd ,R.id.C61b_trd ,R.id.C62b_trd ,R.id.C6_trd ,R.id.C61_trd ,R.id.C62_trd };
    private int [] vars = {togetherF.varOne, togetherF.varTwo, togetherF.varThree};
    ImageView div2,div3;
    androidx.constraintlayout.widget.ConstraintLayout Re3,Re3_sec, Re3_trd;
    TextView equal,equal_sec,equal_trd;
    TextView threePoints, threePoints_sec, threePoints_trd;
    TextView C1b,C11b,C12b,C2b,C21b,C22b,C3b,C31b,C32b,C4b,C41b,C42b,C5,C51,C52,C5b,C51b,C52b,C6,C61,C62,C6b,C61b,C62b,C7,C71,C72;
    TextView C1b_sec ,C11b_sec ,C12b_sec ,C2b_sec ,C21b_sec ,C22b_sec ,C3b_sec ,C31b_sec ,C32b_sec ,C4b_sec ,C41b_sec ,C42b_sec ,C5_sec ,C51_sec ,C52_sec ,C5b_sec ,C51b_sec ,C52b_sec ,C6_sec ,C61_sec ,C62_sec ,C6b_sec ,C61b_sec ,C62b_sec ,C7_sec ,C71_sec ,C72_sec ;
    TextView C1b_trd ,C11b_trd ,C12b_trd ,C2b_trd ,C21b_trd ,C22b_trd ,C3b_trd ,C31b_trd ,C32b_trd ,C4b_trd ,C41b_trd ,C42b_trd ,C5_trd ,C51_trd ,C52_trd ,C5b_trd ,C51b_trd ,C52b_trd ,C6_trd ,C61_trd ,C62_trd ,C6b_trd ,C61b_trd ,C62b_trd ,C7_trd ,C71_trd ,C72_trd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_without);
        UP2 = findViewById(R.id.up2);
        UP2_sec = findViewById(R.id.up2_sec);
        UP2_trd = findViewById(R.id.up2_trd);
        DOWN2 = findViewById(R.id.down2);
        DOWN2_sec = findViewById(R.id.down2_sec);
        DOWN2_trd = findViewById(R.id.down2_trd);
        Re3 = findViewById(R.id.Re3);
        Re3_sec = findViewById(R.id.Re3_sec);
        Re3_trd = findViewById(R.id.Re3_trd);
        equal= findViewById(R.id.textView9);
        equal_sec= findViewById(R.id.textView9_sec);
        equal_sec= findViewById(R.id.textView9_sec);
        // fixing fraction problem
        mainRe2 = findViewById(R.id.Re);
        mainRe = findViewById(R.id.Re2);
        line = findViewById(R.id.line);
        line2 = findViewById(R.id.line2);
        line.getLayoutParams().width = mainRe.getWidth();
        line2.getLayoutParams().width = mainRe2.getWidth();
        //
        mainRe2_sec = findViewById(R.id.Re_sec);
        mainRe_sec = findViewById(R.id.Re2_sec);
        line_sec = findViewById(R.id.line_sec);
        line2_sec = findViewById(R.id.line2_sec);
        line_sec.getLayoutParams().width = mainRe_sec.getWidth();
        line2_sec.getLayoutParams().width = mainRe2_sec.getWidth();
        //
        mainRe2_trd = findViewById(R.id.Re_trd);
        mainRe_trd = findViewById(R.id.Re2_trd);
        line_trd = findViewById(R.id.line_trd);
        line2_trd = findViewById(R.id.line2_trd);
        line_trd.getLayoutParams().width = mainRe_trd.getWidth();
        line2_trd.getLayoutParams().width = mainRe2_trd.getWidth();
        // A:..... B:...... C:.....
        Colors.add("اللون الأحمر");
        Colors.add("اللون الأزرق");
        Colors.add("اللون الأخضر");
        Colors.add("اللون الأصفر");
        Colors.add("اللون الأبيض");
        Colors.add("اللون الأسود");
        numbers.add("كرية واحدة");
        numbers.add("كريتين");
        numbers.add("3 كريات");
        numbers.add("4 كريات");
        numbers.add("5 كريات");
        numbers.add("6 كريات");
        numbers.add("كريات 7");
        numbers.add("كريات 8");
        numbers.add("9 كريات");
        numbers.add("كريات 10");
        numbers.add("11 كرية");
        numbers.add("12 كرية");
        numbers.add("13 كرية");
        numbers.add("14 كرية");
        numbers.add("15 كرية");
        numbers.add("16 كرية");
        numbers.add("17 كرية");
        numbers.add("18 كرية");
        numbers.add("19 كرية");
        numbers.add("20 كرية");
        numbers.add("21 كرية");
        numbers.add("22 كرية");
        numbers.add("23 كرية");
        numbers.add("24 كرية");
        numbers.add("25 كرية");
        numbers.add("26 كرية");
        numbers.add("27 كرية");
        numbers.add("28 كرية");
        numbers.add("29 كرية");
        numbers.add("30 كرية");
        numbers.add("31 كرية");
        numbers.add("32 كرية");
        numbers.add("33 كرية");
        numbers.add("34 كرية");
        numbers.add("35 كرية");
        numbers.add("36 كرية");
        numbers.add("37 كرية");
        numbers.add("38 كرية");
        numbers.add("39 كرية");
        numbers.add("40 كرية");
        numbers.add("41 كرية");
        numbers.add("42 كرية");
        numbers.add("43 كرية");
        numbers.add("44 كرية");
        numbers.add("45 كرية");
        numbers.add("46 كرية");
        numbers.add("47 كرية");
        numbers.add("48 كرية");
        numbers.add("49 كرية");
        //
        inputsA = findViewById(R.id.inputsA);
        inputsB = findViewById(R.id.inputsB);
        inputsC = findViewById(R.id.inputsC);
        B=findViewById(R.id.B2);
        C=findViewById(R.id.C);
        // dividers
        div2 = findViewById(R.id.div2);
        div3 = findViewById(R.id.div3);
        // start of the code
        C1 = findViewById(R.id.C1);
        C01 = findViewById(R.id.C01);
        C02 = findViewById(R.id.C02);
        C11 = findViewById(R.id.C11);
        C12 = findViewById(R.id.C12);
        C2 = findViewById(R.id.C2);
        C21 = findViewById(R.id.C21);
        C22 = findViewById(R.id.C22);
        C3 = findViewById(R.id.C3);
        C31 = findViewById(R.id.C31);
        C32 = findViewById(R.id.C32);
        C4 = findViewById(R.id.C4);
        C41 = findViewById(R.id.C41);
        C42 = findViewById(R.id.C42);
        C1_sec = findViewById(R.id.C1_sec);
        C01_sec = findViewById(R.id.C01_sec);
        C02_sec = findViewById(R.id.C02_sec);
        C11_sec = findViewById(R.id.C11_sec);
        C12_sec = findViewById(R.id.C12_sec);
        C2_sec = findViewById(R.id.C2_sec);
        C21_sec = findViewById(R.id.C21_sec);
        C22_sec = findViewById(R.id.C22_sec);
        C3_sec = findViewById(R.id.C3_sec);
        C31_sec = findViewById(R.id.C31_sec);
        C32_sec = findViewById(R.id.C32_sec);
        C4_sec = findViewById(R.id.C4_sec);
        C41_sec = findViewById(R.id.C41_sec);
        C42_sec = findViewById(R.id.C42_sec);
        C1_trd = findViewById(R.id.C1_trd);
        C01_trd = findViewById(R.id.C01_trd);
        C02_trd = findViewById(R.id.C02_trd);
        C11_trd = findViewById(R.id.C11_trd);
        C12_trd = findViewById(R.id.C12_trd);
        C2_trd = findViewById(R.id.C2_trd);
        C21_trd = findViewById(R.id.C21_trd);
        C22_trd = findViewById(R.id.C22_trd);
        C3_trd = findViewById(R.id.C3_trd);
        C31_trd = findViewById(R.id.C31_trd);
        C32_trd = findViewById(R.id.C32_trd);
        C4_trd = findViewById(R.id.C4_trd);
        C41_trd = findViewById(R.id.C41_trd);
        C42_trd = findViewById(R.id.C42_trd);
        //
        actionOne = findViewById(R.id.actionOne);
        actionTwo = findViewById(R.id.actionTwo);
        actionThree = findViewById(R.id.actionThree);
        long allProb = functions.cardinal(inputs.Result, togetherF.draw);
        allProbT = findViewById(R.id.all_prob);
        allProbT.setText(String.valueOf(allProb));
        numberOfLines1 = togetherF.numberOfLines;
        numberOfLines2 = togetherF.numberOfLines2;
        numberOfLines3 = togetherF.numberOfLines3;
        C01.setText(String.valueOf(togetherF.draw));
        C02.setText(String.valueOf(inputs.Result));
        C01_sec.setText(String.valueOf(togetherF.draw));
        C02_sec.setText(String.valueOf(inputs.Result));
        C01_trd.setText(String.valueOf(togetherF.draw));
        C02_trd.setText(String.valueOf(inputs.Result));
        //
        DOWN1 = findViewById(R.id.down1);
        down1 = functions.cardinal(inputs.Result, togetherF.draw);
        UP1 = findViewById(R.id.up1);
        DOWN1_sec = findViewById(R.id.down1_sec);
        down1_sec = functions.cardinal(inputs.Result, togetherF.draw);
        UP1_sec = findViewById(R.id.up1_sec);
        DOWN1_trd = findViewById(R.id.down1_trd);
        down1_trd = functions.cardinal(inputs.Result, togetherF.draw);
        UP1_trd = findViewById(R.id.up1_trd);
        // testing
        long nmrk = functions.factorial(type.draw);
        for (int i=0;i<3; i++){
            int restk = type.draw;
            long deno = functions.factorial(vars[i]);
            denok=denok*deno;
            restk=restk-vars[i];
            if(i+1==togetherF.numberOfLines){
                if(restk==0){}
                else{
                    denok=denok*functions.factorial(restk);
                }
                break;
            }
        }
        allProbT.setText(String.valueOf(denok));
    }
}