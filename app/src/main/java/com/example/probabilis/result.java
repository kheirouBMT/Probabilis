package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class result extends AppCompatActivity {
    androidx.constraintlayout.widget.ConstraintLayout mainRe,mainRe2,mainRe_sec,mainRe2_sec,mainRe_trd,mainRe2_trd;
    ImageView line,line2,line_sec,line2_sec,line_trd,line2_trd;
    TextView allProbT,inputsA,inputsB,inputsC;
    TextView UP1,UP2,DOWN2,DOWN1,UP1_sec,UP2_sec,DOWN2_sec,DOWN1_sec,UP1_trd,UP2_trd,DOWN2_trd,DOWN1_trd;
    TextView C1_trd,C2_trd,C21_trd,C22_trd,C3_trd,C31_trd,C32_trd,C11_trd,C12_trd,C4_trd,C41_trd,C42_trd;
    TextView C1,C01,C01_sec,C02_sec,C01_trd,C02_trd,C02,C11,C12,C2,C21,C22,C3,C31,C32,C4,C41,C42,C1_sec,C11_sec,C12_sec,C2_sec,C21_sec,C22_sec,C3_sec,C31_sec,C32_sec,C4_sec,C41_sec,C42_sec;
    int numberOfLines1,numberOfLines2,numberOfLines3;
    long up1,up2,down1,down2,up1_sec,up2_sec,down1_sec,down2_sec,up1_trd,up2_trd,down1_trd,down2_trd;
    androidx.constraintlayout.widget.ConstraintLayout actionOne,actionTwo,actionThree,B,C;
    ArrayList<String> Colors = new ArrayList<>();
    ArrayList<String> numbers = new ArrayList<>();
    private int[] C_id = {
            R.id.C1,R.id.C11,R.id.C12,R.id.C1b,R.id.C11b,R.id.C12b,R.id.C2b,R.id.C21b,R.id.C22b,R.id.C2,R.id.C21,R.id.C22,R.id.C3b,R.id.C31b,R.id.C32b,R.id.C3,R.id.C31,R.id.C32,R.id.C4b,R.id.C41b,R.id.C42b,R.id.C4,R.id.C41,R.id.C42,R.id.C5b,R.id.C51b,R.id.C52b,R.id.C5,R.id.C51,R.id.C52,R.id.C6b,R.id.C61b,R.id.C62b,R.id.C6,R.id.C61,R.id.C62};
    private int[] C_sec_id = {
            R.id.C1_sec ,R.id.C11_sec ,R.id.C12_sec ,R.id.C1b_sec ,R.id.C11b_sec ,R.id.C12b_sec ,R.id.C2b_sec ,R.id.C21b_sec ,R.id.C22b_sec ,R.id.C2_sec ,R.id.C21_sec ,R.id.C22_sec ,R.id.C3b_sec ,R.id.C31b_sec ,R.id.C32b_sec ,R.id.C3_sec ,R.id.C31_sec ,R.id.C32_sec ,R.id.C4b_sec ,R.id.C41b_sec ,R.id.C42b_sec ,R.id.C4_sec ,R.id.C41_sec ,R.id.C42_sec ,R.id.C5b_sec ,R.id.C51b_sec ,R.id.C52b_sec ,R.id.C5_sec ,R.id.C51_sec ,R.id.C52_sec ,R.id.C6b_sec ,R.id.C61b_sec ,R.id.C62b_sec ,R.id.C6_sec ,R.id.C61_sec ,R.id.C62_sec };
    private int[] C_trd_id = {
            R.id.C1_trd ,R.id.C11_trd ,R.id.C12_trd ,R.id.C1b_trd ,R.id.C11b_trd ,R.id.C12b_trd ,R.id.C2b_trd ,R.id.C21b_trd ,R.id.C22b_trd ,R.id.C2_trd ,R.id.C21_trd ,R.id.C22_trd ,R.id.C3b_trd ,R.id.C31b_trd ,R.id.C32b_trd ,R.id.C3_trd ,R.id.C31_trd ,R.id.C32_trd ,R.id.C4b_trd ,R.id.C41b_trd ,R.id.C42b_trd ,R.id.C4_trd ,R.id.C41_trd ,R.id.C42_trd ,R.id.C5b_trd ,R.id.C51b_trd ,R.id.C52b_trd ,R.id.C5_trd ,R.id.C51_trd ,R.id.C52_trd ,R.id.C6b_trd ,R.id.C61b_trd ,R.id.C62b_trd ,R.id.C6_trd ,R.id.C61_trd ,R.id.C62_trd };
    ImageView div2,div3;
    androidx.constraintlayout.widget.ConstraintLayout Re3,Re3_sec, Re3_trd;
    TextView equal,equal_sec,equal_trd;
    TextView threePoints, threePoints_sec, threePoints_trd;
    TextView C1b,C11b,C12b,C2b,C21b,C22b,C3b,C31b,C32b,C4b,C41b,C42b,C5,C51,C52,C5b,C51b,C52b,C6,C61,C62,C6b,C61b,C62b,C7,C71,C72;
    TextView C1b_sec ,C11b_sec ,C12b_sec ,C2b_sec ,C21b_sec ,C22b_sec ,C3b_sec ,C31b_sec ,C32b_sec ,C4b_sec ,C41b_sec ,C42b_sec ,C5_sec ,C51_sec ,C52_sec ,C5b_sec ,C51b_sec ,C52b_sec ,C6_sec ,C61_sec ,C62_sec ,C6b_sec ,C61b_sec ,C62b_sec ,C7_sec ,C71_sec ,C72_sec ;
    TextView C1b_trd ,C11b_trd ,C12b_trd ,C2b_trd ,C21b_trd ,C22b_trd ,C3b_trd ,C31b_trd ,C32b_trd ,C4b_trd ,C41b_trd ,C42b_trd ,C5_trd ,C51_trd ,C52_trd ,C5b_trd ,C51b_trd ,C52b_trd ,C6_trd ,C61_trd ,C62_trd ,C6b_trd ,C61b_trd ,C62b_trd ,C7_trd ,C71_trd ,C72_trd;
    @SuppressLint({"CutPasteId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        // reduction
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
        // special case
        if(togetherF.typeOfDraw1==1){
            if(numberOfLines1==1){
                C2.setVisibility(View.GONE);
                C21.setVisibility(View.GONE);
                C22.setVisibility(View.GONE);
                C3.setVisibility(View.GONE);
                C31.setVisibility(View.GONE);
                C32.setVisibility(View.GONE);
                action1line1(null);
                if((togetherF.draw)-(togetherF.varOne)!=0){
                    C4.setVisibility(View.VISIBLE);
                    C41.setVisibility(View.VISIBLE);
                    C42.setVisibility(View.VISIBLE);
                    C42.setText(String.valueOf((inputs.Result)-(togetherF.varOne)));
                    C41.setText(String.valueOf((togetherF.draw)-(togetherF.varOne)));
                    up1 = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                            *functions.cardinal(Long.valueOf((inputs.Result)-(togetherF.varOne)), Long.valueOf((togetherF.draw)-(togetherF.varOne)));
                    UP1.setText(String.valueOf(up1));
                    DOWN1.setText(String.valueOf(down1));
                    if(functions.reduction(up1, down1)==1){
                        Re3.setVisibility(View.GONE);
                        equal.setVisibility(View.GONE);
                    }
                    else {UP2.setText(String.valueOf(up1 / (functions.reduction(up1, down1))));
                        DOWN2.setText(String.valueOf(down1 / (functions.reduction(up1, down1))));}
                }
                else{
                    C4.setVisibility(View.GONE);
                    C41.setVisibility(View.GONE);
                    C42.setVisibility(View.GONE);
                    up1 = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne));
                    UP1.setText(String.valueOf(up1));
                    DOWN1.setText(String.valueOf(down1));
                    if(functions.reduction(up1, down1)==1){
                        Re3.setVisibility(View.GONE);
                        equal.setVisibility(View.GONE);
                    }
                    else {UP2.setText(String.valueOf(up1 / (functions.reduction(up1, down1))));
                        DOWN2.setText(String.valueOf(down1 / (functions.reduction(up1, down1))));}
                }
                if(togetherF.varOne==2){inputsA.setText("\""+numbers.get((togetherF.varOne)-1) + " تحملان " + Colors.get((togetherF.index11)-1)+"\"");}
                else{inputsA.setText("\""+numbers.get((togetherF.varOne)-1) + " تحمل " + Colors.get((togetherF.index11)-1)+"\"");
                }
            }
            if(numberOfLines1==2){
                C3.setVisibility(View.GONE);
                C31.setVisibility(View.GONE);
                C32.setVisibility(View.GONE);
                action1line2(null);
                if((togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo)!=0){
                    C4.setVisibility(View.VISIBLE);
                    C41.setVisibility(View.VISIBLE);
                    C42.setVisibility(View.VISIBLE);
                    C42.setText(String.valueOf((inputs.Result)-(togetherF.varOne)-(togetherF.varTwo)));
                    C41.setText(String.valueOf((togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo)));
                    up1 = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index12)-1)),(togetherF.varTwo))
                            *functions.cardinal((inputs.Result)-(togetherF.varOne)-(togetherF.varTwo), (togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo));
                    UP1.setText(String.valueOf(up1));
                    DOWN1.setText(String.valueOf(down1));
                    if(functions.reduction(up1, down1)==1){
                        Re3.setVisibility(View.GONE);
                        equal.setVisibility(View.GONE);
                    }
                    else {UP2.setText(String.valueOf(up1 / (functions.reduction(up1, down1))));
                        DOWN2.setText(String.valueOf(down1 / (functions.reduction(up1, down1))));}
                }
                else{
                    C4.setVisibility(View.GONE);
                    C41.setVisibility(View.GONE);
                    C42.setVisibility(View.GONE);
                    up1 = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index12)-1)),(togetherF.varTwo));
                    UP1.setText(String.valueOf(up1));
                    DOWN1.setText(String.valueOf(down1));
                    if(functions.reduction(up1, down1)==1){
                        Re3.setVisibility(View.GONE);
                        equal.setVisibility(View.GONE);
                    }
                    else {UP2.setText(String.valueOf(up1 / (functions.reduction(up1, down1))));
                        DOWN2.setText(String.valueOf(down1 / (functions.reduction(up1, down1))));}
                }
                inputsA.setText("\""+numbers.get((togetherF.varOne)-1) + " تحمل " + Colors.get((togetherF.index11)-1)
                        + " و " + numbers.get((togetherF.varTwo)-1) + " تحمل " + Colors.get((togetherF.index12)-1)+"\"");
            }
            if(numberOfLines1==3){
                action1line3(null);
                if((togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo)-(togetherF.varThree)!=0){
                    C4.setVisibility(View.VISIBLE);
                    C41.setVisibility(View.VISIBLE);
                    C42.setVisibility(View.VISIBLE);
                    C42.setText(String.valueOf((inputs.Result)-(togetherF.varOne)-(togetherF.varTwo)-(togetherF.varThree)));
                    C41.setText(String.valueOf((togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo)-(togetherF.varThree)));
                    up1 = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index12)-1)),(togetherF.varTwo))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index13)-1)),(togetherF.varThree))
                            *functions.cardinal((inputs.Result)-(togetherF.varOne)-(togetherF.varTwo)-(togetherF.varThree), (togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo)-(togetherF.varThree));
                    UP1.setText(String.valueOf(up1));
                    DOWN1.setText(String.valueOf(down1));
                    if(functions.reduction(up1, down1)==1){
                        Re3.setVisibility(View.GONE);
                        equal.setVisibility(View.GONE);
                    }
                    else {UP2.setText(String.valueOf(up1 / (functions.reduction(up1, down1))));
                        DOWN2.setText(String.valueOf(down1 / (functions.reduction(up1, down1))));}
                }
                else{
                    C4.setVisibility(View.GONE);
                    C41.setVisibility(View.GONE);
                    C42.setVisibility(View.GONE);
                    up1 = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index12)-1)),(togetherF.varTwo))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index13)-1)),(togetherF.varThree));
                    UP1.setText(String.valueOf(up1));
                    DOWN1.setText(String.valueOf(down1));
                    if(functions.reduction(up1, down1)==1){
                        Re3.setVisibility(View.GONE);
                        equal.setVisibility(View.GONE);
                    }
                    else {
                        UP2.setText(String.valueOf(up1 / (functions.reduction(up1, down1))));
                        DOWN2.setText(String.valueOf(down1 / (functions.reduction(up1, down1))));}
                }
                inputsA.setText("\""+numbers.get((togetherF.varOne)-1) + " تحمل " + Colors.get((togetherF.index11)-1)
                        + " و " + numbers.get((togetherF.varTwo)-1) + " تحمل " + Colors.get((togetherF.index12)-1)
                        + " و " + numbers.get((togetherF.varThree)-1) + " تحمل " + Colors.get((togetherF.index13)-1)+"\"");
            }
        }

        if(togetherF.numberOfPart>=2 & togetherF.typeOfDraw2==1){
            actionTwo.setVisibility(View.VISIBLE);
            B.setVisibility(View.VISIBLE);
            div2.setVisibility(View.VISIBLE);
            if(numberOfLines2==1){
                C2_sec.setVisibility(View.GONE);
                C21_sec.setVisibility(View.GONE);
                C22_sec.setVisibility(View.GONE);
                C3_sec.setVisibility(View.GONE);
                C31_sec.setVisibility(View.GONE);
                C32_sec.setVisibility(View.GONE);
                action2line1(null);
                if((togetherF.draw)-(togetherF.var2One)!=0){
                    C4_sec.setVisibility(View.VISIBLE);
                    C41_sec.setVisibility(View.VISIBLE);
                    C42_sec.setVisibility(View.VISIBLE);
                    C42_sec.setText(String.valueOf((inputs.Result)-(togetherF.var2One)));
                    C41_sec.setText(String.valueOf((togetherF.draw)-(togetherF.var2One)));
                    up1_sec = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                            *functions.cardinal((inputs.Result)-(togetherF.var2One), (togetherF.draw)-(togetherF.var2One));
                    UP1_sec.setText(String.valueOf(up1_sec));
                    DOWN1_sec.setText(String.valueOf(down1_sec));
                    if(functions.reduction(up1_sec, down1_sec)==1){
                        Re3_sec.setVisibility(View.GONE);
                        equal_sec.setVisibility(View.GONE);
                    }
                    else {UP2_sec.setText(String.valueOf(up1_sec / (functions.reduction(up1_sec, down1_sec))));
                        DOWN2_sec.setText(String.valueOf(down1_sec / (functions.reduction(up1_sec, down1_sec))));}
                }
                else{
                    C4_sec.setVisibility(View.GONE);
                    C41_sec.setVisibility(View.GONE);
                    C42_sec.setVisibility(View.GONE);
                    up1_sec = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One));
                    UP1_sec.setText(String.valueOf(up1_sec));
                    DOWN1_sec.setText(String.valueOf(down1_sec));
                    if(functions.reduction(up1_sec, down1_sec)==1){
                        Re3_sec.setVisibility(View.GONE);
                        equal_sec.setVisibility(View.GONE);
                    }
                    else {UP2_sec.setText(String.valueOf(up1_sec / (functions.reduction(up1_sec, down1_sec))));
                        DOWN2_sec.setText(String.valueOf(down1_sec / (functions.reduction(up1_sec, down1_sec))));}
                }
                inputsB.setText("\""+numbers.get((togetherF.var2One)-1) + " تحمل " + Colors.get((togetherF.index21)-1)+"\"");

            }
            if(numberOfLines2==2){
                C3_sec.setVisibility(View.GONE);
                C31_sec.setVisibility(View.GONE);
                C32_sec.setVisibility(View.GONE);
                action2line2(null);
                if((togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two)!=0){
                    C4_sec.setVisibility(View.VISIBLE);
                    C41_sec.setVisibility(View.VISIBLE);
                    C42_sec.setVisibility(View.VISIBLE);
                    C42_sec.setText(String.valueOf((inputs.Result)-(togetherF.var2One)-(togetherF.var2Two)));
                    C41_sec.setText(String.valueOf((togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two)));
                    up1_sec = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index22)-1)),(togetherF.var2Two))
                            *functions.cardinal((inputs.Result)-(togetherF.var2One)-(togetherF.var2Two), (togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two));
                    UP1_sec.setText(String.valueOf(up1_sec));
                    DOWN1_sec.setText(String.valueOf(down1_sec));
                    if(functions.reduction(up1_sec, down1_sec)==1){
                        Re3_sec.setVisibility(View.GONE);
                        equal_sec.setVisibility(View.GONE);
                    }
                    else {UP2_sec.setText(String.valueOf(up1_sec / (functions.reduction(up1_sec, down1_sec))));
                        DOWN2_sec.setText(String.valueOf(down1_sec / (functions.reduction(up1_sec, down1_sec))));}
                }
                else{
                    C4_sec.setVisibility(View.GONE);
                    C41_sec.setVisibility(View.GONE);
                    C42_sec.setVisibility(View.GONE);
                    up1_sec = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index22)-1)),(togetherF.var2Two));
                    UP1_sec.setText(String.valueOf(up1_sec));
                    DOWN1_sec.setText(String.valueOf(down1_sec));
                    if(functions.reduction(up1_sec, down1_sec)==1){
                        Re3_sec.setVisibility(View.GONE);
                        equal_sec.setVisibility(View.GONE);
                    }
                    else {UP2_sec.setText(String.valueOf(up1_sec / (functions.reduction(up1_sec, down1_sec))));
                        DOWN2_sec.setText(String.valueOf(down1_sec / (functions.reduction(up1_sec, down1_sec))));}
                }
                inputsB.setText("\""+numbers.get((togetherF.var2One)-1) + " تحمل " + Colors.get((togetherF.index21)-1)
                        + " و " + numbers.get((togetherF.var2Two)-1) + " تحمل " + Colors.get((togetherF.index22)-1)+"\"");
            }
            if(numberOfLines2==3){
                action2line3(null);
                if((togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two)-(togetherF.var2Three)!=0){
                    C4_sec.setVisibility(View.VISIBLE);
                    C41_sec.setVisibility(View.VISIBLE);
                    C42_sec.setVisibility(View.VISIBLE);
                    C42_sec.setText(String.valueOf((inputs.Result)-(togetherF.var2One)-(togetherF.var2Two)-(togetherF.var2Three)));
                    C41_sec.setText(String.valueOf((togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two)-(togetherF.var2Three)));
                    up1_sec = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index22)-1)),(togetherF.var2Two))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index23)-1)),(togetherF.var2Three))
                            *functions.cardinal((inputs.Result)-(togetherF.var2One)-(togetherF.var2Two)-(togetherF.var2Three), (togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two)-(togetherF.var2Three));
                    UP1_sec.setText(String.valueOf(up1_sec));
                    DOWN1_sec.setText(String.valueOf(down1_sec));
                    if(functions.reduction(up1_sec, down1_sec)==1){
                        Re3_sec.setVisibility(View.GONE);
                        equal_sec.setVisibility(View.GONE);
                    }
                    else {UP2_sec.setText(String.valueOf(up1_sec / (functions.reduction(up1_sec, down1_sec))));
                        DOWN2_sec.setText(String.valueOf(down1_sec / (functions.reduction(up1_sec, down1_sec))));}
                }
                else{
                    C4_sec.setVisibility(View.GONE);
                    C41_sec.setVisibility(View.GONE);
                    C42_sec.setVisibility(View.GONE);
                    up1_sec = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index22)-1)),(togetherF.var2Two))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index23)-1)),(togetherF.var2Three));
                    UP1_sec.setText(String.valueOf(up1_sec));
                    DOWN1_sec.setText(String.valueOf(down1_sec));
                    if(functions.reduction(up1_sec, down1_sec)==1){
                        Re3_sec.setVisibility(View.GONE);
                        equal_sec.setVisibility(View.GONE);
                    }
                    else {UP2_sec.setText(String.valueOf(up1_sec / (functions.reduction(up1_sec, down1_sec))));
                        DOWN2_sec.setText(String.valueOf(down1_sec / (functions.reduction(up1_sec, down1_sec))));}

                }
                inputsB.setText("\""+numbers.get((togetherF.var2One)-1) + " تحمل " + Colors.get((togetherF.index21)-1)
                        + " و " + numbers.get((togetherF.var2Two)-1) + " تحمل " + Colors.get((togetherF.index22)-1)
                        + " و " + numbers.get((togetherF.var2Three)-1) + " تحمل " + Colors.get((togetherF.index23)-1)+"\"");
            }
        }
        if(togetherF.numberOfPart==3 & togetherF.typeOfDraw3==1){
            actionTwo.setVisibility(View.VISIBLE);
            actionThree.setVisibility(View.VISIBLE);
            C.setVisibility(View.VISIBLE);
            div3.setVisibility(View.VISIBLE);
            if(numberOfLines3==1){
                C2_trd.setVisibility(View.GONE);
                C21_trd.setVisibility(View.GONE);
                C22_trd.setVisibility(View.GONE);
                C3_trd.setVisibility(View.GONE);
                C31_trd.setVisibility(View.GONE);
                C32_trd.setVisibility(View.GONE);
                action3line1(null);
                if((togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three)!=0){
                    C4_trd.setVisibility(View.VISIBLE);
                    C41_trd.setVisibility(View.VISIBLE);
                    C42_trd.setVisibility(View.VISIBLE);
                    C42_trd.setText(String.valueOf((inputs.Result)-(togetherF.var3One)));
                    C41_trd.setText(String.valueOf((togetherF.draw)-(togetherF.var3One)));
                    up1_trd = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                            *functions.cardinal((inputs.Result)-(togetherF.var3One), (togetherF.draw)-(togetherF.var3One));
                    UP1_trd.setText(String.valueOf(up1_trd));
                    DOWN1_trd.setText(String.valueOf(down1_trd));
                    if(functions.reduction(up1_trd, down1_trd)==1){
                        Re3_trd.setVisibility(View.GONE);
                        equal_trd.setVisibility(View.GONE);
                    }
                    else {UP2_trd.setText(String.valueOf(up1_trd / (functions.reduction(up1_trd, down1_trd))));
                        DOWN2_trd.setText(String.valueOf(down1_trd / (functions.reduction(up1_trd, down1_trd))));}
                }
                else{
                    C4_trd.setVisibility(View.GONE);
                    C41_trd.setVisibility(View.GONE);
                    C42_trd.setVisibility(View.GONE);
                    up1_trd = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One));
                    UP1_trd.setText(String.valueOf(up1_trd));
                    DOWN1_trd.setText(String.valueOf(down1_trd));
                    if(functions.reduction(up1_trd, down1_trd)==1){
                        Re3_trd.setVisibility(View.GONE);
                        equal_trd.setVisibility(View.GONE);
                    }
                    else {UP2_trd.setText(String.valueOf(up1_trd / (functions.reduction(up1_trd, down1_trd))));
                        DOWN2_trd.setText(String.valueOf(down1_trd / (functions.reduction(up1_trd, down1_trd))));}
                }
                inputsC.setText("\""+numbers.get((togetherF.var3One)-1) + " تحمل " + Colors.get((togetherF.index31)-1)+"\"");
            }
            if(numberOfLines3==2){
                C3_trd.setVisibility(View.GONE);
                C31_trd.setVisibility(View.GONE);
                C32_trd.setVisibility(View.GONE);
                action3line2(null);
                if((togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)!=0){
                    C4_trd.setVisibility(View.VISIBLE);
                    C41_trd.setVisibility(View.VISIBLE);
                    C42_trd.setVisibility(View.VISIBLE);
                    C42_trd.setText(String.valueOf((inputs.Result)-(togetherF.var3One)-(togetherF.var3Two)));
                    C41_trd.setText(String.valueOf((togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)));
                    up1_trd = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index32)-1)),(togetherF.var3Two))
                            *functions.cardinal((inputs.Result)-(togetherF.var3One)-(togetherF.var3Two), (togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two));
                    UP1_trd.setText(String.valueOf(up1_trd));
                    DOWN1_trd.setText(String.valueOf(down1_trd));
                    if(functions.reduction(up1_trd, down1_trd)==1){
                        Re3_trd.setVisibility(View.GONE);
                        equal_trd.setVisibility(View.GONE);
                    }
                    else {UP2_trd.setText(String.valueOf(up1_trd / (functions.reduction(up1_trd, down1_trd))));
                        DOWN2_trd.setText(String.valueOf(down1_trd / (functions.reduction(up1_trd, down1_trd))));}
                }
                else{
                    C4_trd.setVisibility(View.GONE);
                    C41_trd.setVisibility(View.GONE);
                    C42_trd.setVisibility(View.GONE);
                    up1_trd = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index32)-1)),(togetherF.var3Two));
                    UP1_trd.setText(String.valueOf(up1_trd));
                    DOWN1_trd.setText(String.valueOf(down1_trd));
                    if(functions.reduction(up1_trd, down1_trd)==1){
                        Re3_trd.setVisibility(View.GONE);
                        equal_trd.setVisibility(View.GONE);
                    }
                    else {UP2_trd.setText(String.valueOf(up1_trd / (functions.reduction(up1_trd, down1_trd))));
                        DOWN2_trd.setText(String.valueOf(down1_trd / (functions.reduction(up1_trd, down1_trd))));}
                }
                inputsC.setText("\""+numbers.get((togetherF.var3One)-1) + " تحمل " + Colors.get((togetherF.index31)-1)
                        + " و " + numbers.get((togetherF.var3Two)-1) + " تحمل " + Colors.get((togetherF.index32)-1)+"\"");
            }
            if(numberOfLines3==3){
                action3line3(null);
                if((togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three)!=0){
                    C4_trd.setVisibility(View.VISIBLE);
                    C41_trd.setVisibility(View.VISIBLE);
                    C42_trd.setVisibility(View.VISIBLE);
                    C42_trd.setText(String.valueOf((inputs.Result)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three)));
                    C41_trd.setText(String.valueOf((togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three)));
                    up1_trd = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index32)-1)),(togetherF.var3Two))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index33)-1)),(togetherF.var3Three))
                            *functions.cardinal((inputs.Result)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three), (togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three));
                    UP1_trd.setText(String.valueOf(up1_trd));
                    DOWN1_trd.setText(String.valueOf(down1_trd));
                    if(functions.reduction(up1_trd, down1_trd)==1){
                        Re3_trd.setVisibility(View.GONE);
                        equal_trd.setVisibility(View.GONE);
                    }
                    else {UP2_trd.setText(String.valueOf(up1_trd / (functions.reduction(up1_trd, down1_trd))));
                        DOWN2_trd.setText(String.valueOf(down1_trd / (functions.reduction(up1_trd, down1_trd))));}
                }
                else{
                    C4_trd.setVisibility(View.GONE);
                    C41_trd.setVisibility(View.GONE);
                    C42_trd.setVisibility(View.GONE);
                    up1_trd = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index32)-1)),(togetherF.var3Two))
                            *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index33)-1)),(togetherF.var3Three));
                    UP1_trd.setText(String.valueOf(up1_trd));
                    DOWN1_trd.setText(String.valueOf(down1_trd));
                    if(functions.reduction(up1_trd, down1_trd)==1){
                        Re3_trd.setVisibility(View.GONE);
                        equal_trd.setVisibility(View.GONE);
                    }
                    else {UP2_trd.setText(String.valueOf(up1_trd / (functions.reduction(up1_trd, down1_trd))));
                        DOWN2_trd.setText(String.valueOf(down1_trd / (functions.reduction(up1_trd, down1_trd))));}
                }

                inputsC.setText("\""+numbers.get((togetherF.var3One)-1) + " تحمل " + Colors.get((togetherF.index31)-1)
                        + " و " + numbers.get((togetherF.var3Two)-1) + " تحمل " + Colors.get((togetherF.index32)-1)
                        + " و " + numbers.get((togetherF.var3Three)-1) + " تحمل " + Colors.get((togetherF.index33)-1)+"\"");
            }
        }
        // for max
        if(togetherF.typeOfDraw1==2){
            C1.setVisibility(View.GONE);
            C11.setVisibility(View.GONE);
            C12.setVisibility(View.GONE);
            C2.setVisibility(View.GONE);
            C21.setVisibility(View.GONE);
            C22.setVisibility(View.GONE);
            C3.setVisibility(View.GONE);
            C31.setVisibility(View.GONE);
            C32.setVisibility(View.GONE);
            C4.setVisibility(View.GONE);
            C41.setVisibility(View.GONE);
            C42.setVisibility(View.GONE);
            threePoints = findViewById(R.id.threePoints);
            C1b = findViewById(R.id.C1b);
            C11b = findViewById(R.id.C11b);
            C12b = findViewById(R.id.C12b);
            C2b = findViewById(R.id.C2b);
            C21b = findViewById(R.id.C21b);
            C22b = findViewById(R.id.C22b);
            C3b = findViewById(R.id.C3b);
            C31b = findViewById(R.id.C31b);
            C32b = findViewById(R.id.C32b);
            C4b = findViewById(R.id.C4b);
            C41b = findViewById(R.id.C41b);
            C42b = findViewById(R.id.C42b);
            C5b = findViewById(R.id.C5b);
            C51b = findViewById(R.id.C51b);
            C52b = findViewById(R.id.C52b);
            C6b = findViewById(R.id.C6b);
            C61b = findViewById(R.id.C61b);
            C62b = findViewById(R.id.C62b);
            C5 = findViewById(R.id.C5);
            C51 = findViewById(R.id.C51);
            C52 = findViewById(R.id.C52);
            C6 = findViewById(R.id.C6);
            C61 = findViewById(R.id.C61);
            C62 = findViewById(R.id.C62);
            C6 = findViewById(R.id.C6);
            C61 = findViewById(R.id.C61);
            C62 = findViewById(R.id.C62);
            long in = togetherF.varOne;
            inputsA.setText("\""+numbers.get((togetherF.varOne)-1) + " تحمل " + Colors.get((togetherF.index11)-1)+ " على الأكثر " +"\"");
            if(numberOfLines1==1 & functions.index_max(togetherF.varOne, inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)), togetherF.draw)<=6){
                long x;
                x = functions.for_max_plus6(togetherF.varOne, togetherF.allballsB.get((togetherF.index11)-1), togetherF.draw-togetherF.varOne, inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)));
                for(int i=0; i<functions.index_max(togetherF.varOne, inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)), togetherF.draw)*6; i=i+6){
                    ((TextView) findViewById(C_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(C_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index11)-1))));
                    ((TextView) findViewById(C_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(C_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1))));
                    if(in==0){
                        ((TextView) findViewById(C_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                    in--;
                }
                if(in==0){
                    C7 = findViewById(R.id.C7);
                    C7.setVisibility(View.VISIBLE);
                    C71 = findViewById(R.id.C71);
                    C71.setVisibility(View.VISIBLE);
                    C71.setText(String.valueOf(togetherF.draw));
                    C72 = findViewById(R.id.C72);
                    C72.setVisibility(View.VISIBLE);
                    C72.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1))));
                }
                UP1.setText(String.valueOf(x));
                DOWN1.setText(String.valueOf(down1));
                if(functions.reduction(x, down1)==1){
                    Re3.setVisibility(View.GONE);
                    equal.setVisibility(View.GONE);
                }
                else {UP2.setText(String.valueOf(+x / (functions.reduction(+x, down1))));
                    DOWN2.setText(String.valueOf(down1 / (functions.reduction(+x, down1))));}
            }
            if(numberOfLines1==1 & functions.index_max(togetherF.varOne, inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)), togetherF.draw)>6){
                threePoints.setVisibility(View.VISIBLE);
                long x;
                x = functions.for_max_plus6(togetherF.varOne, togetherF.allballsB.get((togetherF.index11)-1), togetherF.draw-togetherF.varOne, inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)));
                for(int i=0; i<6*6; i=i+6){
                    if((togetherF.draw-in)>(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)))){
                        break;
                    }
                    ((TextView) findViewById(C_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(C_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index11)-1))));
                    ((TextView) findViewById(C_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(C_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1))));
                    in--;
                    if(in==0){
                        ((TextView) findViewById(C_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                }
                C61.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)))));
                C62.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)))));
                C61b.setText(String.valueOf((togetherF.draw)-(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)))));
                C62b.setText(String.valueOf((togetherF.allballsB.get((togetherF.index11)-1))));
                UP1.setText(String.valueOf(+x));
                DOWN1.setText(String.valueOf(down1));
                if(in==0){
                    C7 = findViewById(R.id.C7);
                    C7.setVisibility(View.VISIBLE);
                    C71 = findViewById(R.id.C71);
                    C71.setVisibility(View.VISIBLE);
                    C71.setText(String.valueOf(togetherF.draw));
                    C72 = findViewById(R.id.C72);
                    C72.setVisibility(View.VISIBLE);
                    C72.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1))));
                }
                if(functions.reduction(+x, down1)==1){
                    Re3.setVisibility(View.GONE);
                    equal.setVisibility(View.GONE);
                }
                else {UP2.setText(String.valueOf(+x / (functions.reduction(+x, down1))));
                    DOWN2.setText(String.valueOf(down1 / (functions.reduction(+x, down1))));}
            }
        }
        if(togetherF.typeOfDraw2==2){
            actionTwo.setVisibility(View.VISIBLE);
            B.setVisibility(View.VISIBLE);
            div2.setVisibility(View.VISIBLE);
            C1_sec.setVisibility(View.GONE);
            C11_sec.setVisibility(View.GONE);
            C12_sec.setVisibility(View.GONE);
            C2_sec.setVisibility(View.GONE);
            C21_sec.setVisibility(View.GONE);
            C22_sec.setVisibility(View.GONE);
            C3_sec.setVisibility(View.GONE);
            C31_sec.setVisibility(View.GONE);
            C32_sec.setVisibility(View.GONE);
            C4_sec.setVisibility(View.GONE);
            C41_sec.setVisibility(View.GONE);
            C42_sec.setVisibility(View.GONE);
            threePoints_sec = findViewById(R.id.threePoints_sec);
            C1b_sec = findViewById(R.id.C1b_sec);
            C11b_sec = findViewById(R.id.C11b_sec);
            C12b_sec = findViewById(R.id.C12b_sec);
            C2b_sec = findViewById(R.id.C2b_sec);
            C21b_sec = findViewById(R.id.C21b_sec);
            C22b_sec = findViewById(R.id.C22b_sec);
            C3b_sec = findViewById(R.id.C3b_sec);
            C31b_sec = findViewById(R.id.C31b_sec);
            C32b_sec = findViewById(R.id.C32b_sec);
            C4b_sec = findViewById(R.id.C4b_sec);
            C41b_sec = findViewById(R.id.C41b_sec);
            C42b_sec = findViewById(R.id.C42b_sec);
            C5b_sec = findViewById(R.id.C5b_sec);
            C51b_sec = findViewById(R.id.C51b_sec);
            C52b_sec = findViewById(R.id.C52b_sec);
            C6b_sec = findViewById(R.id.C6b_sec);
            C61b_sec = findViewById(R.id.C61b_sec);
            C62b_sec = findViewById(R.id.C62b_sec);
            C5_sec = findViewById(R.id.C5_sec);
            C51_sec = findViewById(R.id.C51_sec);
            C52_sec = findViewById(R.id.C52_sec);
            C6_sec = findViewById(R.id.C6_sec);
            C61_sec = findViewById(R.id.C61_sec);
            C62_sec = findViewById(R.id.C62_sec);
            C6_sec = findViewById(R.id.C6_sec);
            C61_sec = findViewById(R.id.C61_sec);
            C62_sec = findViewById(R.id.C62_sec);
            long in = togetherF.var2One;
            inputsB.setText("\""+numbers.get((togetherF.var2One)-1) + " تحمل " + Colors.get((togetherF.index21)-1)+ " على الأكثر " +"\"");
            if(numberOfLines2==1 & functions.index_max(togetherF.var2One, inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)), togetherF.draw)<=6){
                long x;
                x = functions.for_max_plus6(togetherF.var2One, togetherF.allballsB.get((togetherF.index21)-1), togetherF.draw-togetherF.var2One, inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)));
                for(int i=0; i<functions.index_max(togetherF.var2One, inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)), togetherF.draw)*6; i=i+6){
                    ((TextView) findViewById(C_sec_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(C_sec_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index21)-1))));
                    ((TextView) findViewById(C_sec_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(C_sec_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1))));
                    if(in==0){
                        ((TextView) findViewById(C_sec_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_sec_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_sec_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                    in--;
                }
                if(in==0){
                    C7_sec = findViewById(R.id.C7_sec);
                    C7_sec.setVisibility(View.VISIBLE);
                    C71_sec = findViewById(R.id.C71_sec);
                    C71_sec.setVisibility(View.VISIBLE);
                    C71_sec.setText(String.valueOf(togetherF.draw));
                    C72_sec = findViewById(R.id.C72_sec);
                    C72_sec.setVisibility(View.VISIBLE);
                    C72_sec.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1))));
                }
                UP1_sec.setText(String.valueOf(x));
                DOWN1_sec.setText(String.valueOf(down1_sec));
                if(functions.reduction(x, down1_sec)==1){
                    Re3_sec.setVisibility(View.GONE);
                    equal_sec.setVisibility(View.GONE);
                }
                else {UP2_sec.setText(String.valueOf(+x / (functions.reduction(+x, down1_sec))));
                    DOWN2_sec.setText(String.valueOf(down1_sec / (functions.reduction(+x, down1_sec))));}
            }
            if(numberOfLines2==1 & functions.index_max(togetherF.var2One, inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)), togetherF.draw)>6){
                threePoints_sec.setVisibility(View.VISIBLE);
                long x;
                x = functions.for_max_plus6(togetherF.var2One, togetherF.allballsB.get((togetherF.index21)-1), togetherF.draw-togetherF.var2One, inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)));
                for(int i=0; i<6*6; i=i+6){
                    if((togetherF.draw-in)>(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)))){
                        break;
                    }
                    ((TextView) findViewById(C_sec_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(C_sec_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index21)-1))));
                    ((TextView) findViewById(C_sec_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(C_sec_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_sec_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1))));
                    in--;
                    if(in==0){
                        ((TextView) findViewById(C_sec_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_sec_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_sec_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                }
                C61_sec.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)))));
                C62_sec.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)))));
                C61b_sec.setText(String.valueOf((togetherF.draw)-(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)))));
                C62b_sec.setText(String.valueOf((togetherF.allballsB.get((togetherF.index21)-1))));
                UP1_sec.setText(String.valueOf(+x));
                DOWN1_sec.setText(String.valueOf(down1_sec));
                if(in==0){
                    C7_sec = findViewById(R.id.C7_sec);
                    C7_sec.setVisibility(View.VISIBLE);
                    C71_sec = findViewById(R.id.C71_sec);
                    C71_sec.setVisibility(View.VISIBLE);
                    C71_sec.setText(String.valueOf(togetherF.draw));
                    C72_sec = findViewById(R.id.C72_sec);
                    C72_sec.setVisibility(View.VISIBLE);
                    C72_sec.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1))));
                }
                if(functions.reduction(+x, down1_sec)==1){
                    Re3_sec.setVisibility(View.GONE);
                    equal_sec.setVisibility(View.GONE);
                }
                else {UP2_sec.setText(String.valueOf(+x / (functions.reduction(+x, down1_sec))));
                    DOWN2_sec.setText(String.valueOf(down1_sec / (functions.reduction(+x, down1_sec))));}
            }
        }
        if(togetherF.typeOfDraw3==2){
            actionTwo.setVisibility(View.VISIBLE);
            actionThree.setVisibility(View.VISIBLE);
            C.setVisibility(View.VISIBLE);
            div3.setVisibility(View.VISIBLE);
            C1_trd.setVisibility(View.GONE);
            C11_trd.setVisibility(View.GONE);
            C12_trd.setVisibility(View.GONE);
            C2_trd.setVisibility(View.GONE);
            C21_trd.setVisibility(View.GONE);
            C22_trd.setVisibility(View.GONE);
            C3_trd.setVisibility(View.GONE);
            C31_trd.setVisibility(View.GONE);
            C32_trd.setVisibility(View.GONE);
            C4_trd.setVisibility(View.GONE);
            C41_trd.setVisibility(View.GONE);
            C42_trd.setVisibility(View.GONE);
            threePoints_trd = findViewById(R.id.threePoints_trd);
            C1b_trd = findViewById(R.id.C1b_trd);
            C11b_trd = findViewById(R.id.C11b_trd);
            C12b_trd = findViewById(R.id.C12b_trd);
            C2b_trd = findViewById(R.id.C2b_trd);
            C21b_trd = findViewById(R.id.C21b_trd);
            C22b_trd = findViewById(R.id.C22b_trd);
            C3b_trd = findViewById(R.id.C3b_trd);
            C31b_trd = findViewById(R.id.C31b_trd);
            C32b_trd = findViewById(R.id.C32b_trd);
            C4b_trd = findViewById(R.id.C4b_trd);
            C41b_trd = findViewById(R.id.C41b_trd);
            C42b_trd = findViewById(R.id.C42b_trd);
            C5b_trd = findViewById(R.id.C5b_trd);
            C51b_trd = findViewById(R.id.C51b_trd);
            C52b_trd = findViewById(R.id.C52b_trd);
            C6b_trd = findViewById(R.id.C6b_trd);
            C61b_trd = findViewById(R.id.C61b_trd);
            C62b_trd = findViewById(R.id.C62b_trd);
            C5_trd = findViewById(R.id.C5_trd);
            C51_trd = findViewById(R.id.C51_trd);
            C52_trd = findViewById(R.id.C52_trd);
            C6_trd = findViewById(R.id.C6_trd);
            C61_trd = findViewById(R.id.C61_trd);
            C62_trd = findViewById(R.id.C62_trd);
            C6_trd = findViewById(R.id.C6_trd);
            C61_trd = findViewById(R.id.C61_trd);
            C62_trd = findViewById(R.id.C62_trd);
            long in = togetherF.var3One;
            inputsC.setText("\""+numbers.get((togetherF.var3One)-1) + " تحمل " + Colors.get((togetherF.index31)-1)+ " على الأكثر " +"\"");
            if(numberOfLines3==1 & functions.index_max(togetherF.var3One, inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)), togetherF.draw)<=6){
                long x;
                x = functions.for_max_plus6(togetherF.var3One, togetherF.allballsB.get((togetherF.index31)-1), togetherF.draw-togetherF.var3One, inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)));
                for(int i=0; i<functions.index_max(togetherF.var3One, inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)), togetherF.draw)*6; i=i+6){
                    ((TextView) findViewById(C_trd_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(C_trd_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index31)-1))));
                    ((TextView) findViewById(C_trd_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(C_trd_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1))));
                    if(in==0){
                        ((TextView) findViewById(C_trd_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_trd_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_trd_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                    in--;
                }
                if(in==0){
                    C7_trd = findViewById(R.id.C7_trd);
                    C7_trd.setVisibility(View.VISIBLE);
                    C71_trd = findViewById(R.id.C71_trd);
                    C71_trd.setVisibility(View.VISIBLE);
                    C71_trd.setText(String.valueOf(togetherF.draw));
                    C72_trd = findViewById(R.id.C72_trd);
                    C72_trd.setVisibility(View.VISIBLE);
                    C72_trd.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1))));
                }
                UP1_trd.setText(String.valueOf(x));
                DOWN1_trd.setText(String.valueOf(down1_trd));
                if(functions.reduction(x, down1_trd)==1){
                    Re3_trd.setVisibility(View.GONE);
                    equal_trd.setVisibility(View.GONE);
                }
                else {UP2_trd.setText(String.valueOf(+x / (functions.reduction(+x, down1_trd))));
                    DOWN2_trd.setText(String.valueOf(down1_trd / (functions.reduction(+x, down1_trd))));}
            }
            if(numberOfLines3==1 & functions.index_max(togetherF.var3One, inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)), togetherF.draw)>6){
                threePoints_trd.setVisibility(View.VISIBLE);
                long x;
                x = functions.for_max_plus6(togetherF.var3One, togetherF.allballsB.get((togetherF.index31)-1), togetherF.draw-togetherF.var3One, inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)));
                for(int i=0; i<6*6; i=i+6){
                    if((togetherF.draw-in)>(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)))){
                        break;
                    }
                    ((TextView) findViewById(C_trd_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(C_trd_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index31)-1))));
                    ((TextView) findViewById(C_trd_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(C_trd_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(C_trd_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1))));
                    in--;
                    if(in==0){
                        ((TextView) findViewById(C_trd_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_trd_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(C_trd_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                }
                C61_trd.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)))));
                C62_trd.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)))));
                C61b_trd.setText(String.valueOf((togetherF.draw)-(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)))));
                C62b_trd.setText(String.valueOf((togetherF.allballsB.get((togetherF.index31)-1))));
                UP1_trd.setText(String.valueOf(+x));
                DOWN1_trd.setText(String.valueOf(down1_trd));
                if(in==0){
                    C7_trd = findViewById(R.id.C7_trd);
                    C7_trd.setVisibility(View.VISIBLE);
                    C71_trd = findViewById(R.id.C71_trd);
                    C71_trd.setVisibility(View.VISIBLE);
                    C71_trd.setText(String.valueOf(togetherF.draw));
                    C72_trd = findViewById(R.id.C72_trd);
                    C72_trd.setVisibility(View.VISIBLE);
                    C72_trd.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1))));
                }
                if(functions.reduction(+x, down1_trd)==1){
                    Re3_trd.setVisibility(View.GONE);
                    equal_trd.setVisibility(View.GONE);
                }
                else {UP2_trd.setText(String.valueOf(+x / (functions.reduction(+x, down1_trd))));
                    DOWN2_trd.setText(String.valueOf(down1_trd / (functions.reduction(+x, down1_trd))));}
            }
        }
        // for min
        if(togetherF.typeOfDraw1==3) {
            C1.setVisibility(View.GONE);
            C11.setVisibility(View.GONE);
            C12.setVisibility(View.GONE);
            C2.setVisibility(View.GONE);
            C21.setVisibility(View.GONE);
            C22.setVisibility(View.GONE);
            C3.setVisibility(View.GONE);
            C31.setVisibility(View.GONE);
            C32.setVisibility(View.GONE);
            C4.setVisibility(View.GONE);
            C41.setVisibility(View.GONE);
            C42.setVisibility(View.GONE);
            threePoints = findViewById(R.id.threePoints);
            C1b = findViewById(R.id.C1b);
            C11b = findViewById(R.id.C11b);
            C12b = findViewById(R.id.C12b);
            C2b = findViewById(R.id.C2b);
            C21b = findViewById(R.id.C21b);
            C22b = findViewById(R.id.C22b);
            C3b = findViewById(R.id.C3b);
            C31b = findViewById(R.id.C31b);
            C32b = findViewById(R.id.C32b);
            C4b = findViewById(R.id.C4b);
            C41b = findViewById(R.id.C41b);
            C42b = findViewById(R.id.C42b);
            C5b = findViewById(R.id.C5b);
            C51b = findViewById(R.id.C51b);
            C52b = findViewById(R.id.C52b);
            C6b = findViewById(R.id.C6b);
            C61b = findViewById(R.id.C61b);
            C62b = findViewById(R.id.C62b);
            C5 = findViewById(R.id.C5);
            C51 = findViewById(R.id.C51);
            C52 = findViewById(R.id.C52);
            C6 = findViewById(R.id.C6);
            C61 = findViewById(R.id.C61);
            C62 = findViewById(R.id.C62);
            C6 = findViewById(R.id.C6);
            C61 = findViewById(R.id.C61);
            C62 = findViewById(R.id.C62);
            inputsA.setText("\"" + numbers.get((togetherF.varOne) - 1) + " تحمل " + Colors.get((togetherF.index11) - 1) + " على الأقل " + "\"");
            long min_Re;
            min_Re = functions.for_min(togetherF.varOne, (togetherF.allballsB.get((togetherF.index11) - 1)), (togetherF.draw) - (togetherF.varOne), (inputs.Result) - (togetherF.allballsB.get((togetherF.index11) - 1)));
            UP1.setText(String.valueOf(min_Re));
            DOWN1.setText(String.valueOf(down1));
            long min_times = functions.index_min(togetherF.varOne, (togetherF.draw) - (togetherF.varOne), togetherF.draw, (inputs.Result) - (togetherF.allballsB.get((togetherF.index11) - 1)), (togetherF.allballsB.get((togetherF.index11) - 1)));
            long in_a = togetherF.varOne;
            long in_c = (togetherF.draw) - (togetherF.varOne);
            if (((togetherF.draw) - (togetherF.varOne)) > ((inputs.Result) - (togetherF.allballsB.get((togetherF.index11) - 1)))) {
                in_a = in_a + (togetherF.draw) - (togetherF.varOne);
                in_c = (inputs.Result) - (togetherF.allballsB.get((togetherF.index11) - 1));
                in_a = in_a - in_c;
            }
            for (int i = 0; i <= min_times*6 & i<36; i=i+6) {
                ((TextView) findViewById(C_id[i])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_id[i + 1])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_id[i + 1])).setText(String.valueOf(in_a));
                ((TextView) findViewById(C_id[i + 2])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_id[i + 2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index11) - 1))));
                ((TextView) findViewById(C_id[i + 3])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_id[i + 4])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_id[i + 4])).setText(String.valueOf((togetherF.draw) - (in_a)));
                ((TextView) findViewById(C_id[i + 5])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_id[i + 5])).setText(String.valueOf((inputs.Result) - (togetherF.allballsB.get((togetherF.index11) - 1))));
                if (((togetherF.draw) - (in_a)) == 0) {
                    ((TextView) findViewById(C_id[i + 3])).setVisibility(View.GONE);
                    ((TextView) findViewById(C_id[i + 4])).setVisibility(View.GONE);
                    ((TextView) findViewById(C_id[i + 5])).setVisibility(View.GONE);
                    break;
                }
                in_a++;
            }
            if (min_times >= 6 & togetherF.varOne + min_times - 1 == (togetherF.allballsB.get((togetherF.index11) - 1))) {
                threePoints.setVisibility(View.VISIBLE);
                C61.setText(String.valueOf((togetherF.draw) - ((togetherF.allballsB.get((togetherF.index11) - 1)))));
                C62.setText(String.valueOf((inputs.Result - (togetherF.allballsB.get((togetherF.index11) - 1)))));
                C61b.setText(String.valueOf((togetherF.allballsB.get((togetherF.index11) - 1))));
                C62b.setText(String.valueOf((togetherF.allballsB.get((togetherF.index11) - 1))));
            }
            if (min_times >= 6 & ((togetherF.draw) - (in_a))==0){
                threePoints.setVisibility(View.VISIBLE);
                C61b.setText(String.valueOf(togetherF.draw));
                C62b.setText(String.valueOf((togetherF.allballsB.get((togetherF.index11) - 1))));
                C61.setVisibility(View.GONE);
                C62.setVisibility(View.GONE);
                C6.setVisibility(View.GONE);
            }
            if(functions.reduction(min_Re, down1)==1){
                Re3.setVisibility(View.GONE);
                equal.setVisibility(View.GONE);
            }
            else {UP2.setText(String.valueOf(min_Re / (functions.reduction(min_Re, down1))));
                DOWN2.setText(String.valueOf(down1 / (functions.reduction(min_Re, down1))));}
        }
        if(togetherF.typeOfDraw2==3) {
            actionTwo.setVisibility(View.VISIBLE);
            B.setVisibility(View.VISIBLE);
            div2.setVisibility(View.VISIBLE);
            C1_sec.setVisibility(View.GONE);
            C11_sec.setVisibility(View.GONE);
            C12_sec.setVisibility(View.GONE);
            C2_sec.setVisibility(View.GONE);
            C21_sec.setVisibility(View.GONE);
            C22_sec.setVisibility(View.GONE);
            C3_sec.setVisibility(View.GONE);
            C31_sec.setVisibility(View.GONE);
            C32_sec.setVisibility(View.GONE);
            C4_sec.setVisibility(View.GONE);
            C41_sec.setVisibility(View.GONE);
            C42_sec.setVisibility(View.GONE);
            threePoints_sec = findViewById(R.id.threePoints_sec);
            C1b_sec = findViewById(R.id.C1b_sec);
            C11b_sec = findViewById(R.id.C11b_sec);
            C12b_sec = findViewById(R.id.C12b_sec);
            C2b_sec = findViewById(R.id.C2b_sec);
            C21b_sec = findViewById(R.id.C21b_sec);
            C22b_sec = findViewById(R.id.C22b_sec);
            C3b_sec = findViewById(R.id.C3b_sec);
            C31b_sec = findViewById(R.id.C31b_sec);
            C32b_sec = findViewById(R.id.C32b_sec);
            C4b_sec = findViewById(R.id.C4b_sec);
            C41b_sec = findViewById(R.id.C41b_sec);
            C42b_sec = findViewById(R.id.C42b_sec);
            C5b_sec = findViewById(R.id.C5b_sec);
            C51b_sec = findViewById(R.id.C51b_sec);
            C52b_sec = findViewById(R.id.C52b_sec);
            C6b_sec = findViewById(R.id.C6b_sec);
            C61b_sec = findViewById(R.id.C61b_sec);
            C62b_sec = findViewById(R.id.C62b_sec);
            C5_sec = findViewById(R.id.C5_sec);
            C51_sec = findViewById(R.id.C51_sec);
            C52_sec = findViewById(R.id.C52_sec);
            C6_sec = findViewById(R.id.C6_sec);
            C61_sec = findViewById(R.id.C61_sec);
            C62_sec = findViewById(R.id.C62_sec);
            C6_sec = findViewById(R.id.C6_sec);
            C61_sec = findViewById(R.id.C61_sec);
            C62_sec = findViewById(R.id.C62_sec);
            inputsB.setText("\"" + numbers.get((togetherF.var2One) - 1) + " تحمل " + Colors.get((togetherF.index21) - 1) + " على الأقل " + "\"");
            long min_Re_sec;
            min_Re_sec = functions.for_min(togetherF.var2One, (togetherF.allballsB.get((togetherF.index21) - 1)), (togetherF.draw) - (togetherF.var2One), (inputs.Result) - (togetherF.allballsB.get((togetherF.index21) - 1)));
            UP1_sec.setText(String.valueOf(min_Re_sec));
            DOWN1_sec.setText(String.valueOf(down1_sec));
            long min_times = functions.index_min(togetherF.var2One, (togetherF.draw) - (togetherF.var2One), togetherF.draw, (inputs.Result) - (togetherF.allballsB.get((togetherF.index21) - 1)), (togetherF.allballsB.get((togetherF.index21) - 1)));
            long in_a = togetherF.var2One;
            long in_c = (togetherF.draw) - (togetherF.var2One);
            if (((togetherF.draw) - (togetherF.var2One)) > ((inputs.Result) - (togetherF.allballsB.get((togetherF.index21) - 1)))) {
                in_a = in_a + (togetherF.draw) - (togetherF.var2One);
                in_c = (inputs.Result) - (togetherF.allballsB.get((togetherF.index21) - 1));
                in_a = in_a - in_c;
            }
            for (int i = 0; i <= min_times*6 & i<36; i=i+6) {
                ((TextView) findViewById(C_sec_id[i])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_sec_id[i + 1])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_sec_id[i + 1])).setText(String.valueOf(in_a));
                ((TextView) findViewById(C_sec_id[i + 2])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_sec_id[i + 2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index21) - 1))));
                ((TextView) findViewById(C_sec_id[i + 3])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_sec_id[i + 4])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_sec_id[i + 4])).setText(String.valueOf((togetherF.draw) - (in_a)));
                ((TextView) findViewById(C_sec_id[i + 5])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_sec_id[i + 5])).setText(String.valueOf((inputs.Result) - (togetherF.allballsB.get((togetherF.index21) - 1))));
                if (((togetherF.draw) - (in_a)) == 0) {
                    ((TextView) findViewById(C_sec_id[i + 3])).setVisibility(View.GONE);
                    ((TextView) findViewById(C_sec_id[i + 4])).setVisibility(View.GONE);
                    ((TextView) findViewById(C_sec_id[i + 5])).setVisibility(View.GONE);
                    break;
                }
                in_a++;
            }
            if (min_times >= 6 & togetherF.var2One + min_times - 1 == (togetherF.allballsB.get((togetherF.index21) - 1))) {
                threePoints_sec.setVisibility(View.VISIBLE);
                C61_sec.setText(String.valueOf((togetherF.draw) - ((togetherF.allballsB.get((togetherF.index21) - 1)))));
                C62_sec.setText(String.valueOf((inputs.Result - (togetherF.allballsB.get((togetherF.index21) - 1)))));
                C61b_sec.setText(String.valueOf((togetherF.allballsB.get((togetherF.index21) - 1))));
                C62b_sec.setText(String.valueOf((togetherF.allballsB.get((togetherF.index21) - 1))));
            }
            if (min_times >= 6 & ((togetherF.draw) - (in_a))==0){
                threePoints_sec.setVisibility(View.VISIBLE);
                C61b.setText(String.valueOf(togetherF.draw));
                C62b_sec.setText(String.valueOf((togetherF.allballsB.get((togetherF.index21) - 1))));
                C61_sec.setVisibility(View.GONE);
                C62_sec.setVisibility(View.GONE);
                C6_sec.setVisibility(View.GONE);
            }
            if(functions.reduction(min_Re_sec, down1_sec)==1){
                Re3_sec.setVisibility(View.GONE);
                equal_sec.setVisibility(View.GONE);
            }
            else {UP2_sec.setText(String.valueOf(min_Re_sec / (functions.reduction(min_Re_sec, down1_sec))));
                DOWN2_sec.setText(String.valueOf(down1_sec / (functions.reduction(min_Re_sec, down1_sec))));}
        }
        if(togetherF.typeOfDraw2==3) {
            actionTwo.setVisibility(View.VISIBLE);
            B.setVisibility(View.VISIBLE);
            div2.setVisibility(View.VISIBLE);
            C1_trd.setVisibility(View.GONE);
            C11_trd.setVisibility(View.GONE);
            C12_trd.setVisibility(View.GONE);
            C2_trd.setVisibility(View.GONE);
            C21_trd.setVisibility(View.GONE);
            C22_trd.setVisibility(View.GONE);
            C3_trd.setVisibility(View.GONE);
            C31_trd.setVisibility(View.GONE);
            C32_trd.setVisibility(View.GONE);
            C4_trd.setVisibility(View.GONE);
            C41_trd.setVisibility(View.GONE);
            C42_trd.setVisibility(View.GONE);
            threePoints_trd = findViewById(R.id.threePoints_trd);
            C1b_trd = findViewById(R.id.C1b_trd);
            C11b_trd = findViewById(R.id.C11b_trd);
            C12b_trd = findViewById(R.id.C12b_trd);
            C2b_trd = findViewById(R.id.C2b_trd);
            C21b_trd = findViewById(R.id.C21b_trd);
            C22b_trd = findViewById(R.id.C22b_trd);
            C3b_trd = findViewById(R.id.C3b_trd);
            C31b_trd = findViewById(R.id.C31b_trd);
            C32b_trd = findViewById(R.id.C32b_trd);
            C4b_trd = findViewById(R.id.C4b_trd);
            C41b_trd = findViewById(R.id.C41b_trd);
            C42b_trd = findViewById(R.id.C42b_trd);
            C5b_trd = findViewById(R.id.C5b_trd);
            C51b_trd = findViewById(R.id.C51b_trd);
            C52b_trd = findViewById(R.id.C52b_trd);
            C6b_trd = findViewById(R.id.C6b_trd);
            C61b_trd = findViewById(R.id.C61b_trd);
            C62b_trd = findViewById(R.id.C62b_trd);
            C5_trd = findViewById(R.id.C5_trd);
            C51_trd = findViewById(R.id.C51_trd);
            C52_trd = findViewById(R.id.C52_trd);
            C6_trd = findViewById(R.id.C6_trd);
            C61_trd = findViewById(R.id.C61_trd);
            C62_trd = findViewById(R.id.C62_trd);
            C6_trd = findViewById(R.id.C6_trd);
            C61_trd = findViewById(R.id.C61_trd);
            C62_trd = findViewById(R.id.C62_trd);
            inputsC.setText("\"" + numbers.get((togetherF.var3One) - 1) + " تحمل " + Colors.get((togetherF.index31) - 1) + " على الأقل " + "\"");
            long min_Re_trd;
            min_Re_trd = functions.for_min(togetherF.var3One, (togetherF.allballsB.get((togetherF.index31) - 1)), (togetherF.draw) - (togetherF.var3One), (inputs.Result) - (togetherF.allballsB.get((togetherF.index31) - 1)));
            UP1_trd.setText(String.valueOf(min_Re_trd));
            DOWN1_trd.setText(String.valueOf(down1_trd));
            long min_times = functions.index_min(togetherF.var3One, (togetherF.draw) - (togetherF.var3One), togetherF.draw, (inputs.Result) - (togetherF.allballsB.get((togetherF.index31) - 1)), (togetherF.allballsB.get((togetherF.index31) - 1)));
            long in_a = togetherF.var3One;
            long in_c = (togetherF.draw) - (togetherF.var3One);
            if (((togetherF.draw) - (togetherF.var3One)) > ((inputs.Result) - (togetherF.allballsB.get((togetherF.index31) - 1)))) {
                in_a = in_a + (togetherF.draw) - (togetherF.var3One);
                in_c = (inputs.Result) - (togetherF.allballsB.get((togetherF.index31) - 1));
                in_a = in_a - in_c;
            }
            for (int i = 0; i <= min_times*6 & i<36; i=i+6) {
                ((TextView) findViewById(C_trd_id[i])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_trd_id[i + 1])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_trd_id[i + 1])).setText(String.valueOf(in_a));
                ((TextView) findViewById(C_trd_id[i + 2])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_trd_id[i + 2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index31) - 1))));
                ((TextView) findViewById(C_trd_id[i + 3])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_trd_id[i + 4])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_trd_id[i + 4])).setText(String.valueOf((togetherF.draw) - (in_a)));
                ((TextView) findViewById(C_trd_id[i + 5])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(C_trd_id[i + 5])).setText(String.valueOf((inputs.Result) - (togetherF.allballsB.get((togetherF.index31) - 1))));
                if (((togetherF.draw) - (in_a)) == 0) {
                    ((TextView) findViewById(C_trd_id[i + 3])).setVisibility(View.GONE);
                    ((TextView) findViewById(C_trd_id[i + 4])).setVisibility(View.GONE);
                    ((TextView) findViewById(C_trd_id[i + 5])).setVisibility(View.GONE);
                    break;
                }
                in_a++;
            }
            if (min_times >= 6 & togetherF.var3One + min_times - 1 == (togetherF.allballsB.get((togetherF.index31) - 1))) {
                threePoints_trd.setVisibility(View.VISIBLE);
                C61_trd.setText(String.valueOf((togetherF.draw) - ((togetherF.allballsB.get((togetherF.index31) - 1)))));
                C62_trd.setText(String.valueOf((inputs.Result - (togetherF.allballsB.get((togetherF.index31) - 1)))));
                C61b_trd.setText(String.valueOf((togetherF.allballsB.get((togetherF.index31) - 1))));
                C62b_trd.setText(String.valueOf((togetherF.allballsB.get((togetherF.index31) - 1))));
            }
            if (min_times >= 6 & ((togetherF.draw) - (in_a))==0){
                threePoints_trd.setVisibility(View.VISIBLE);
                C61b.setText(String.valueOf(togetherF.draw));
                C62b_trd.setText(String.valueOf((togetherF.allballsB.get((togetherF.index31) - 1))));
                C61_trd.setVisibility(View.GONE);
                C62_trd.setVisibility(View.GONE);
                C6_trd.setVisibility(View.GONE);
            }
            if(functions.reduction(min_Re_trd, down1_trd)==1){
                Re3_trd.setVisibility(View.GONE);
                equal_trd.setVisibility(View.GONE);
            }
            else {UP2_trd.setText(String.valueOf(min_Re_trd / (functions.reduction(min_Re_trd, down1_trd))));
                DOWN2_trd.setText(String.valueOf(down1_trd / (functions.reduction(min_Re_trd, down1_trd))));}
        }
    }
    public void action1line1(View view){
        C11.setText(String.valueOf(togetherF.varOne));
        C12.setText(String.valueOf(togetherF.allballsB.get((togetherF.index11)-1)));
    }
    public void action1line2(View view){
        action1line1(null);
        C21.setText(String.valueOf(togetherF.varTwo));
        C22.setText(String.valueOf(togetherF.allballsB.get((togetherF.index12)-1)));
    }
    public void action1line3(View view){
        action1line2(null);
        C31.setText(String.valueOf(togetherF.varThree));
        C32.setText(String.valueOf(togetherF.allballsB.get((togetherF.index13)-1)));
    }
    public void action2line1(View view){
        C11_sec.setText(String.valueOf(togetherF.var2One));
        C12_sec.setText(String.valueOf(togetherF.allballsB.get((togetherF.index21)-1)));
    }
    public void action2line2(View view){
        action2line1(null);
        C21_sec.setText(String.valueOf(togetherF.var2Two));
        C22_sec.setText(String.valueOf(togetherF.allballsB.get((togetherF.index22)-1)));
    }
    public void action2line3(View view){
        action2line2(null);
        C31_sec.setText(String.valueOf(togetherF.var2Three));
        C32_sec.setText(String.valueOf(togetherF.allballsB.get((togetherF.index23)-1)));
    }

    public void action3line1(View view){
        C11_trd.setText(String.valueOf(togetherF.var3One));
        C12_trd.setText(String.valueOf(togetherF.allballsB.get((togetherF.index31)-1)));
    }
    public void action3line2(View view){
        action3line1(null);
        C21_trd.setText(String.valueOf(togetherF.var3Two));
        C22_trd.setText(String.valueOf(togetherF.allballsB.get((togetherF.index32)-1)));
    }
    public void action3line3(View view){
        action3line2(null);
        C31_trd.setText(String.valueOf(togetherF.var3Three));
        C32_trd.setText(String.valueOf(togetherF.allballsB.get((togetherF.index33)-1)));
    }
}

