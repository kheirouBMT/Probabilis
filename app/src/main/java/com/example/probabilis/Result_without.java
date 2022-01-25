package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.ArrayList;

public class Result_without extends AppCompatActivity {
    androidx.constraintlayout.widget.ConstraintLayout mainRe,mainRe0, mainRe2,mainRe_sec,mainRe0_sec,mainRe2_sec,mainRe_trd,mainRe0_trd,mainRe2_trd;
    ImageView line0,line,line2,line_sec,line2_sec,line_trd,line2_trd;
    TextView nmrk_show,denok1,denok2,denok3,denok4,nmrk_show_sec,denok1_sec,denok2_sec,denok3_sec,denok4_sec,nmrk_show_trd,denok1_trd,denok2_trd,denok3_trd,denok4_trd, equal0, equal0_sec,equal0_trd;
    TextView allProbT,inputsA,inputsB,inputsC;
    TextView UP1,UP2,DOWN2,DOWN1,UP1_sec,UP2_sec,DOWN2_sec,DOWN1_sec,UP1_trd,UP2_trd,DOWN2_trd,DOWN1_trd;
    TextView A1_trd,A2_trd,A21_trd,A22_trd,A3_trd,A31_trd,A32_trd,A11_trd,A12_trd,A4_trd,A41_trd,A42_trd;
    TextView A1,A01,A01_sec,A02_sec,A01_trd,A02_trd,A02,A11,A12,A2,A21,A22,A3,A31,A32,A4,A41,A42,A1_sec,A11_sec,A12_sec,A2_sec,A21_sec,A22_sec,A3_sec,A31_sec,A32_sec,A4_sec,A41_sec,A42_sec;
    int numberOfLines1,numberOfLines2,numberOfLines3;
    long up1,up2,down1,down2,up1_sec,up2_sec,down1_sec,down2_sec,up1_trd,up2_trd,down1_trd,down2_trd;
    long denok=1,denok_sec=1,denok_trd=1;
    androidx.constraintlayout.widget.ConstraintLayout actionOne,actionTwo,actionThree,B,C;
    ArrayList<String> Colors = new ArrayList<>();
    ArrayList<String> numbers = new ArrayList<>();
    private int[] A_id = {
            R.id.A1,R.id.A11,R.id.A12,R.id.A1b,R.id.A11b,R.id.A12b,R.id.A2b,R.id.A21b,R.id.A22b,R.id.A2,R.id.A21,R.id.A22,R.id.A3b,R.id.A31b,R.id.A32b,R.id.A3,R.id.A31,R.id.A32,R.id.A4b,R.id.A41b,R.id.A42b,R.id.A4,R.id.A41,R.id.A42,R.id.A5b,R.id.A51b,R.id.A52b,R.id.A5,R.id.A51,R.id.A52,R.id.A6b,R.id.A61b,R.id.A62b,R.id.A6,R.id.A61,R.id.A62};
    private int[] A_sec_id = {
            R.id.A1_sec ,R.id.A11_sec ,R.id.A12_sec ,R.id.A1b_sec ,R.id.A11b_sec ,R.id.A12b_sec ,R.id.A2b_sec ,R.id.A21b_sec ,R.id.A22b_sec ,R.id.A2_sec ,R.id.A21_sec ,R.id.A22_sec ,R.id.A3b_sec ,R.id.A31b_sec ,R.id.A32b_sec ,R.id.A3_sec ,R.id.A31_sec ,R.id.A32_sec ,R.id.A4b_sec ,R.id.A41b_sec ,R.id.A42b_sec ,R.id.A4_sec ,R.id.A41_sec ,R.id.A42_sec ,R.id.A5b_sec ,R.id.A51b_sec ,R.id.A52b_sec ,R.id.A5_sec ,R.id.A51_sec ,R.id.A52_sec ,R.id.A6b_sec ,R.id.A61b_sec ,R.id.A62b_sec ,R.id.A6_sec ,R.id.A61_sec ,R.id.A62_sec };
    private int[] A_trd_id = {
            R.id.A1_trd ,R.id.A11_trd ,R.id.A12_trd ,R.id.A1b_trd ,R.id.A11b_trd ,R.id.A12b_trd ,R.id.A2b_trd ,R.id.A21b_trd ,R.id.A22b_trd ,R.id.A2_trd ,R.id.A21_trd ,R.id.A22_trd ,R.id.A3b_trd ,R.id.A31b_trd ,R.id.A32b_trd ,R.id.A3_trd ,R.id.A31_trd ,R.id.A32_trd ,R.id.A4b_trd ,R.id.A41b_trd ,R.id.A42b_trd ,R.id.A4_trd ,R.id.A41_trd ,R.id.A42_trd ,R.id.A5b_trd ,R.id.A51b_trd ,R.id.A52b_trd ,R.id.A5_trd ,R.id.A51_trd ,R.id.A52_trd ,R.id.A6b_trd ,R.id.A61b_trd ,R.id.A62b_trd ,R.id.A6_trd ,R.id.A61_trd ,R.id.A62_trd };
    private int [] vars = {togetherF.varOne, togetherF.varTwo, togetherF.varThree};
    private int [] facts = {R.id.denok1,R.id.denok2,R.id.denok3,R.id.denok4};
    private int [] facts_sec = {R.id.denok1_sec,R.id.denok2_sec,R.id.denok3_sec,R.id.denok4_sec};
    private int [] facts_trd = {R.id.denok1_trd,R.id.denok2_trd,R.id.denok3_trd,R.id.denok4_trd};
    ImageView div2,div3;
    androidx.constraintlayout.widget.ConstraintLayout Re3,Re3_sec, Re3_trd;
    TextView equal,equal_sec,equal_trd;
    TextView threePoints, threePoints_sec, threePoints_trd;
    TextView A1b,A11b,A12b,A2b,A21b,A22b,A3b,A31b,A32b,A4b,A41b,A42b,A5,A51,A52,A5b,A51b,A52b,A6,A61,A62,A6b,A61b,A62b,A7,A71,A72;
    TextView A1b_sec ,A11b_sec ,A12b_sec ,A2b_sec ,A21b_sec ,A22b_sec ,A3b_sec ,A31b_sec ,A32b_sec ,A4b_sec ,A41b_sec ,A42b_sec ,A5_sec ,A51_sec ,A52_sec ,A5b_sec ,A51b_sec ,A52b_sec ,A6_sec ,A61_sec ,A62_sec ,A6b_sec ,A61b_sec ,A62b_sec ,A7_sec ,A71_sec ,A72_sec ;
    TextView A1b_trd ,A11b_trd ,A12b_trd ,A2b_trd ,A21b_trd ,A22b_trd ,A3b_trd ,A31b_trd ,A32b_trd ,A4b_trd ,A41b_trd ,A42b_trd ,A5_trd ,A51_trd ,A52_trd ,A5b_trd ,A51b_trd ,A52b_trd ,A6_trd ,A61_trd ,A62_trd ,A6b_trd ,A61b_trd ,A62b_trd ,A7_trd ,A71_trd ,A72_trd;
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
        mainRe0 = findViewById(R.id.Re0);
        line0 = findViewById(R.id.line0);
        line = findViewById(R.id.line);
        line2 = findViewById(R.id.line2);
        line.getLayoutParams().width = mainRe.getWidth();
        line2.getLayoutParams().width = mainRe2.getWidth();
        line0.getLayoutParams().width = mainRe0.getWidth();
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
        A1 = findViewById(R.id.A1);
        A01 = findViewById(R.id.A01);
        A02 = findViewById(R.id.A02);
        A11 = findViewById(R.id.A11);
        A12 = findViewById(R.id.A12);
        A2 = findViewById(R.id.A2);
        A21 = findViewById(R.id.A21);
        A22 = findViewById(R.id.A22);
        A3 = findViewById(R.id.A3);
        A31 = findViewById(R.id.A31);
        A32 = findViewById(R.id.A32);
        A4 = findViewById(R.id.A4);
        A41 = findViewById(R.id.A41);
        A42 = findViewById(R.id.A42);
        A1_sec = findViewById(R.id.A1_sec);
        A01_sec = findViewById(R.id.A01_sec);
        A02_sec = findViewById(R.id.A02_sec);
        A11_sec = findViewById(R.id.A11_sec);
        A12_sec = findViewById(R.id.A12_sec);
        A2_sec = findViewById(R.id.A2_sec);
        A21_sec = findViewById(R.id.A21_sec);
        A22_sec = findViewById(R.id.A22_sec);
        A3_sec = findViewById(R.id.A3_sec);
        A31_sec = findViewById(R.id.A31_sec);
        A32_sec = findViewById(R.id.A32_sec);
        A4_sec = findViewById(R.id.A4_sec);
        A41_sec = findViewById(R.id.A41_sec);
        A42_sec = findViewById(R.id.A42_sec);
        A1_trd = findViewById(R.id.A1_trd);
        A01_trd = findViewById(R.id.A01_trd);
        A02_trd = findViewById(R.id.A02_trd);
        A11_trd = findViewById(R.id.A11_trd);
        A12_trd = findViewById(R.id.A12_trd);
        A2_trd = findViewById(R.id.A2_trd);
        A21_trd = findViewById(R.id.A21_trd);
        A22_trd = findViewById(R.id.A22_trd);
        A3_trd = findViewById(R.id.A3_trd);
        A31_trd = findViewById(R.id.A31_trd);
        A32_trd = findViewById(R.id.A32_trd);
        A4_trd = findViewById(R.id.A4_trd);
        A41_trd = findViewById(R.id.A41_trd);
        A42_trd = findViewById(R.id.A42_trd);

        //
        actionOne = findViewById(R.id.actionOne);
        actionTwo = findViewById(R.id.actionTwo);
        actionThree = findViewById(R.id.actionThree);
        long allProb = functions.permutation(inputs.Result, togetherF.draw);
        allProbT = findViewById(R.id.all_prob);
        allProbT.setText(String.valueOf(allProb));
        numberOfLines1 = togetherF.numberOfLines;
        numberOfLines2 = togetherF.numberOfLines2;
        numberOfLines3 = togetherF.numberOfLines3;
        A01.setText(String.valueOf(togetherF.draw));
        A02.setText(String.valueOf(inputs.Result));
        A01_sec.setText(String.valueOf(togetherF.draw));
        A02_sec.setText(String.valueOf(inputs.Result));
        A01_trd.setText(String.valueOf(togetherF.draw));
        A02_trd.setText(String.valueOf(inputs.Result));
        //
        DOWN1 = findViewById(R.id.down1);
        down1 = functions.permutation(inputs.Result, togetherF.draw);
        UP1 = findViewById(R.id.up1);
        DOWN1_sec = findViewById(R.id.down1_sec);
        down1_sec = functions.permutation(inputs.Result, togetherF.draw);
        UP1_sec = findViewById(R.id.up1_sec);
        DOWN1_trd = findViewById(R.id.down1_trd);
        down1_trd = functions.permutation(inputs.Result, togetherF.draw);
        UP1_trd = findViewById(R.id.up1_trd);
        nmrk_show = findViewById(R.id.nmrk);
        denok1 = findViewById(R.id.denok1);
        denok2 = findViewById(R.id.denok2);
        denok3 = findViewById(R.id.denok3);
        denok4 = findViewById(R.id.denok4);
        denok4.setVisibility(View.GONE);
        denok3.setVisibility(View.GONE);
        denok2.setVisibility(View.GONE);
        equal0 = findViewById(R.id.equal0);
        // testing
        long nmrk = functions.factorial(type.draw);
        nmrk_show.setText(String.valueOf(type.draw) +"! ");
        for (int i=0;i<3; i++){
            int restk = type.draw;
            long deno = functions.factorial(vars[i]);
            denok=denok*deno;
            restk=restk-vars[i];
            if(togetherF.varOne+togetherF.varTwo+togetherF.varThree==type.draw || togetherF.varOne+togetherF.varTwo
                    ==type.draw || togetherF.varOne==type.draw ){
                equal0.setVisibility(View.GONE);
                mainRe0.setVisibility(View.GONE);
                break;}
            if(i==0){
                ((TextView) findViewById(facts[i])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(facts[i])).setText(String.valueOf(vars[i]) +"! ");
            }
            else{
                ((TextView) findViewById(facts[i])).setVisibility(View.VISIBLE);
                ((TextView) findViewById(facts[i])).setText(" x " +String.valueOf(vars[i]) +"! ");
            }
            if(i+1==togetherF.numberOfLines){
                if(restk==0){}
                else{
                    denok4.setVisibility(View.VISIBLE);
                    denok4.setText(" x " +String.valueOf(restk) +"!");
                    denok=denok*functions.factorial(restk);
                }
                break;
            }
        }
        inputsA.setText("\""+numbers.get((togetherF.varOne)-1) + " تحمل " + Colors.get((togetherF.index11)-1)+ " على الأكثر " +"\"");
        if(togetherF.typeOfDraw1==1){
            if(numberOfLines1==1){
                A2.setVisibility(View.GONE);
                A21.setVisibility(View.GONE);
                A22.setVisibility(View.GONE);
                A3.setVisibility(View.GONE);
                A31.setVisibility(View.GONE);
                A32.setVisibility(View.GONE);
                action1line1(null);
                if((togetherF.draw)-(togetherF.varOne)!=0){
                    A4.setVisibility(View.VISIBLE);
                    A41.setVisibility(View.VISIBLE);
                    A42.setVisibility(View.VISIBLE);
                    A42.setText(String.valueOf((inputs.Result)-(togetherF.varOne)));
                    A41.setText(String.valueOf((togetherF.draw)-(togetherF.varOne)));
                    up1 = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                            *functions.permutation(Long.valueOf((inputs.Result)-(togetherF.varOne)), Long.valueOf((togetherF.draw)-(togetherF.varOne)));
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
                    A4.setVisibility(View.GONE);
                    A41.setVisibility(View.GONE);
                    A42.setVisibility(View.GONE);
                    up1 = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne));
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
                A3.setVisibility(View.GONE);
                A31.setVisibility(View.GONE);
                A32.setVisibility(View.GONE);
                action1line2(null);
                if((togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo)!=0){
                    A4.setVisibility(View.VISIBLE);
                    A41.setVisibility(View.VISIBLE);
                    A42.setVisibility(View.VISIBLE);
                    A42.setText(String.valueOf((inputs.Result)-(togetherF.varOne)-(togetherF.varTwo)));
                    A41.setText(String.valueOf((togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo)));
                    up1 = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index12)-1)),(togetherF.varTwo))
                            *functions.permutation((inputs.Result)-(togetherF.varOne)-(togetherF.varTwo), (togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo));
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
                    A4.setVisibility(View.GONE);
                    A41.setVisibility(View.GONE);
                    A42.setVisibility(View.GONE);
                    up1 = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index12)-1)),(togetherF.varTwo));
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
                    A4.setVisibility(View.VISIBLE);
                    A41.setVisibility(View.VISIBLE);
                    A42.setVisibility(View.VISIBLE);
                    A42.setText(String.valueOf((inputs.Result)-(togetherF.varOne)-(togetherF.varTwo)-(togetherF.varThree)));
                    A41.setText(String.valueOf((togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo)-(togetherF.varThree)));
                    up1 = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index12)-1)),(togetherF.varTwo))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index13)-1)),(togetherF.varThree))
                            *functions.permutation((inputs.Result)-(togetherF.varOne)-(togetherF.varTwo)-(togetherF.varThree), (togetherF.draw)-(togetherF.varOne)-(togetherF.varTwo)-(togetherF.varThree));
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
                    A4.setVisibility(View.GONE);
                    A41.setVisibility(View.GONE);
                    A42.setVisibility(View.GONE);
                    up1 = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index12)-1)),(togetherF.varTwo))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index13)-1)),(togetherF.varThree));
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
                A2_sec.setVisibility(View.GONE);
                A21_sec.setVisibility(View.GONE);
                A22_sec.setVisibility(View.GONE);
                A3_sec.setVisibility(View.GONE);
                A31_sec.setVisibility(View.GONE);
                A32_sec.setVisibility(View.GONE);
                action2line1(null);
                if((togetherF.draw)-(togetherF.var2One)!=0){
                    A4_sec.setVisibility(View.VISIBLE);
                    A41_sec.setVisibility(View.VISIBLE);
                    A42_sec.setVisibility(View.VISIBLE);
                    A42_sec.setText(String.valueOf((inputs.Result)-(togetherF.var2One)));
                    A41_sec.setText(String.valueOf((togetherF.draw)-(togetherF.var2One)));
                    up1_sec = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                            *functions.permutation((inputs.Result)-(togetherF.var2One), (togetherF.draw)-(togetherF.var2One));
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
                    A4_sec.setVisibility(View.GONE);
                    A41_sec.setVisibility(View.GONE);
                    A42_sec.setVisibility(View.GONE);
                    up1_sec = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One));
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
                A3_sec.setVisibility(View.GONE);
                A31_sec.setVisibility(View.GONE);
                A32_sec.setVisibility(View.GONE);
                action2line2(null);
                if((togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two)!=0){
                    A4_sec.setVisibility(View.VISIBLE);
                    A41_sec.setVisibility(View.VISIBLE);
                    A42_sec.setVisibility(View.VISIBLE);
                    A42_sec.setText(String.valueOf((inputs.Result)-(togetherF.var2One)-(togetherF.var2Two)));
                    A41_sec.setText(String.valueOf((togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two)));
                    up1_sec = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index22)-1)),(togetherF.var2Two))
                            *functions.permutation((inputs.Result)-(togetherF.var2One)-(togetherF.var2Two), (togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two));
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
                    A4_sec.setVisibility(View.GONE);
                    A41_sec.setVisibility(View.GONE);
                    A42_sec.setVisibility(View.GONE);
                    up1_sec = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index22)-1)),(togetherF.var2Two));
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
                    A4_sec.setVisibility(View.VISIBLE);
                    A41_sec.setVisibility(View.VISIBLE);
                    A42_sec.setVisibility(View.VISIBLE);
                    A42_sec.setText(String.valueOf((inputs.Result)-(togetherF.var2One)-(togetherF.var2Two)-(togetherF.var2Three)));
                    A41_sec.setText(String.valueOf((togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two)-(togetherF.var2Three)));
                    up1_sec = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index22)-1)),(togetherF.var2Two))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index23)-1)),(togetherF.var2Three))
                            *functions.permutation((inputs.Result)-(togetherF.var2One)-(togetherF.var2Two)-(togetherF.var2Three), (togetherF.draw)-(togetherF.var2One)-(togetherF.var2Two)-(togetherF.var2Three));
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
                    A4_sec.setVisibility(View.GONE);
                    A41_sec.setVisibility(View.GONE);
                    A42_sec.setVisibility(View.GONE);
                    up1_sec = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index22)-1)),(togetherF.var2Two))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index23)-1)),(togetherF.var2Three));
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
                A2_trd.setVisibility(View.GONE);
                A21_trd.setVisibility(View.GONE);
                A22_trd.setVisibility(View.GONE);
                A3_trd.setVisibility(View.GONE);
                A31_trd.setVisibility(View.GONE);
                A32_trd.setVisibility(View.GONE);
                action3line1(null);
                if((togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three)!=0){
                    A4_trd.setVisibility(View.VISIBLE);
                    A41_trd.setVisibility(View.VISIBLE);
                    A42_trd.setVisibility(View.VISIBLE);
                    A42_trd.setText(String.valueOf((inputs.Result)-(togetherF.var3One)));
                    A41_trd.setText(String.valueOf((togetherF.draw)-(togetherF.var3One)));
                    up1_trd = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                            *functions.permutation((inputs.Result)-(togetherF.var3One), (togetherF.draw)-(togetherF.var3One));
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
                    A4_trd.setVisibility(View.GONE);
                    A41_trd.setVisibility(View.GONE);
                    A42_trd.setVisibility(View.GONE);
                    up1_trd = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One));
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
                A3_trd.setVisibility(View.GONE);
                A31_trd.setVisibility(View.GONE);
                A32_trd.setVisibility(View.GONE);
                action3line2(null);
                if((togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)!=0){
                    A4_trd.setVisibility(View.VISIBLE);
                    A41_trd.setVisibility(View.VISIBLE);
                    A42_trd.setVisibility(View.VISIBLE);
                    A42_trd.setText(String.valueOf((inputs.Result)-(togetherF.var3One)-(togetherF.var3Two)));
                    A41_trd.setText(String.valueOf((togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)));
                    up1_trd = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index32)-1)),(togetherF.var3Two))
                            *functions.permutation((inputs.Result)-(togetherF.var3One)-(togetherF.var3Two), (togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two));
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
                    A4_trd.setVisibility(View.GONE);
                    A41_trd.setVisibility(View.GONE);
                    A42_trd.setVisibility(View.GONE);
                    up1_trd = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index32)-1)),(togetherF.var3Two));
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
                    A4_trd.setVisibility(View.VISIBLE);
                    A41_trd.setVisibility(View.VISIBLE);
                    A42_trd.setVisibility(View.VISIBLE);
                    A42_trd.setText(String.valueOf((inputs.Result)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three)));
                    A41_trd.setText(String.valueOf((togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three)));
                    up1_trd = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index32)-1)),(togetherF.var3Two))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index33)-1)),(togetherF.var3Three))
                            *functions.permutation((inputs.Result)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three), (togetherF.draw)-(togetherF.var3One)-(togetherF.var3Two)-(togetherF.var3Three));
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
                    A4_trd.setVisibility(View.GONE);
                    A41_trd.setVisibility(View.GONE);
                    A42_trd.setVisibility(View.GONE);
                    up1_trd = functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index32)-1)),(togetherF.var3Two))
                            *functions.permutation(Long.valueOf(togetherF.allballsB.get((togetherF.index33)-1)),(togetherF.var3Three));
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
        // max1
        if(togetherF.typeOfDraw1==2){
            A1.setVisibility(View.GONE);
            A11.setVisibility(View.GONE);
            A12.setVisibility(View.GONE);
            A2.setVisibility(View.GONE);
            A21.setVisibility(View.GONE);
            A22.setVisibility(View.GONE);
            A3.setVisibility(View.GONE);
            A31.setVisibility(View.GONE);
            A32.setVisibility(View.GONE);
            A4.setVisibility(View.GONE);
            A41.setVisibility(View.GONE);
            A42.setVisibility(View.GONE);
            threePoints = findViewById(R.id.threePoints);
            A1b = findViewById(R.id.A1b);
            A11b = findViewById(R.id.A11b);
            A12b = findViewById(R.id.A12b);
            A2b = findViewById(R.id.A2b);
            A21b = findViewById(R.id.A21b);
            A22b = findViewById(R.id.A22b);
            A3b = findViewById(R.id.A3b);
            A31b = findViewById(R.id.A31b);
            A32b = findViewById(R.id.A32b);
            A4b = findViewById(R.id.A4b);
            A41b = findViewById(R.id.A41b);
            A42b = findViewById(R.id.A42b);
            A5b = findViewById(R.id.A5b);
            A51b = findViewById(R.id.A51b);
            A52b = findViewById(R.id.A52b);
            A6b = findViewById(R.id.A6b);
            A61b = findViewById(R.id.A61b);
            A62b = findViewById(R.id.A62b);
            A5 = findViewById(R.id.A5);
            A51 = findViewById(R.id.A51);
            A52 = findViewById(R.id.A52);
            A6 = findViewById(R.id.A6);
            A61 = findViewById(R.id.A61);
            A62 = findViewById(R.id.A62);
            A6 = findViewById(R.id.A6);
            A61 = findViewById(R.id.A61);
            A62 = findViewById(R.id.A62);
            long in = togetherF.varOne;
            inputsA.setText("\""+numbers.get((togetherF.varOne)-1) + " تحمل " + Colors.get((togetherF.index11)-1)+ " على الأكثر " +"\"");
            if(numberOfLines1==1 & functions.index_max(togetherF.varOne, inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)), togetherF.draw)<=6){
                long x;
                x = functions.for_max_plus_without(togetherF.varOne, togetherF.allballsB.get((togetherF.index11)-1), togetherF.draw-togetherF.varOne, inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)));
                for(int i=0; i<functions.index_max(togetherF.varOne, inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)), togetherF.draw)*6; i=i+6){
                    ((TextView) findViewById(A_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(A_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index11)-1))));
                    ((TextView) findViewById(A_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(A_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1))));
                    if(in==0){
                        ((TextView) findViewById(A_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                    in--;
                }
                if(in==0){
                    A7 = findViewById(R.id.A7);
                    A7.setVisibility(View.VISIBLE);
                    A71 = findViewById(R.id.A71);
                    A71.setVisibility(View.VISIBLE);
                    A71.setText(String.valueOf(togetherF.draw));
                    A72 = findViewById(R.id.A72);
                    A72.setVisibility(View.VISIBLE);
                    A72.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1))));
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
                x = functions.for_max_plus_without(togetherF.varOne, togetherF.allballsB.get((togetherF.index11)-1), togetherF.draw-togetherF.varOne, inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)));
                for(int i=0; i<6*6; i=i+6){
                    if((togetherF.draw-in)>(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)))){
                        break;
                    }
                    ((TextView) findViewById(A_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(A_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index11)-1))));
                    ((TextView) findViewById(A_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(A_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1))));
                    in--;
                    if(in==0){
                        ((TextView) findViewById(A_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                }
                A61.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)))));
                A62.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)))));
                A61b.setText(String.valueOf((togetherF.draw)-(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1)))));
                A62b.setText(String.valueOf((togetherF.allballsB.get((togetherF.index11)-1))));
                UP1.setText(String.valueOf(+x));
                DOWN1.setText(String.valueOf(down1));
                if(in==0){
                    A7 = findViewById(R.id.A7);
                    A7.setVisibility(View.VISIBLE);
                    A71 = findViewById(R.id.A71);
                    A71.setVisibility(View.VISIBLE);
                    A71.setText(String.valueOf(togetherF.draw));
                    A72 = findViewById(R.id.A72);
                    A72.setVisibility(View.VISIBLE);
                    A72.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index11)-1))));
                }
                if(functions.reduction(+x, down1)==1){
                    Re3.setVisibility(View.GONE);
                    equal.setVisibility(View.GONE);
                }
                else {UP2.setText(String.valueOf(+x / (functions.reduction(+x, down1))));
                    DOWN2.setText(String.valueOf(down1 / (functions.reduction(+x, down1))));}
            }
        }
// max2
        if(togetherF.typeOfDraw2==2){
            actionTwo.setVisibility(View.VISIBLE);
            B.setVisibility(View.VISIBLE);
            div2.setVisibility(View.VISIBLE);
            A1_sec.setVisibility(View.GONE);
            A11_sec.setVisibility(View.GONE);
            A12_sec.setVisibility(View.GONE);
            A2_sec.setVisibility(View.GONE);
            A21_sec.setVisibility(View.GONE);
            A22_sec.setVisibility(View.GONE);
            A3_sec.setVisibility(View.GONE);
            A31_sec.setVisibility(View.GONE);
            A32_sec.setVisibility(View.GONE);
            A4_sec.setVisibility(View.GONE);
            A41_sec.setVisibility(View.GONE);
            A42_sec.setVisibility(View.GONE);
            threePoints_sec = findViewById(R.id.threePoints_sec);
            A1b_sec = findViewById(R.id.A1b_sec);
            A11b_sec = findViewById(R.id.A11b_sec);
            A12b_sec = findViewById(R.id.A12b_sec);
            A2b_sec = findViewById(R.id.A2b_sec);
            A21b_sec = findViewById(R.id.A21b_sec);
            A22b_sec = findViewById(R.id.A22b_sec);
            A3b_sec = findViewById(R.id.A3b_sec);
            A31b_sec = findViewById(R.id.A31b_sec);
            A32b_sec = findViewById(R.id.A32b_sec);
            A4b_sec = findViewById(R.id.A4b_sec);
            A41b_sec = findViewById(R.id.A41b_sec);
            A42b_sec = findViewById(R.id.A42b_sec);
            A5b_sec = findViewById(R.id.A5b_sec);
            A51b_sec = findViewById(R.id.A51b_sec);
            A52b_sec = findViewById(R.id.A52b_sec);
            A6b_sec = findViewById(R.id.A6b_sec);
            A61b_sec = findViewById(R.id.A61b_sec);
            A62b_sec = findViewById(R.id.A62b_sec);
            A5_sec = findViewById(R.id.A5_sec);
            A51_sec = findViewById(R.id.A51_sec);
            A52_sec = findViewById(R.id.A52_sec);
            A6_sec = findViewById(R.id.A6_sec);
            A61_sec = findViewById(R.id.A61_sec);
            A62_sec = findViewById(R.id.A62_sec);
            A6_sec = findViewById(R.id.A6_sec);
            A61_sec = findViewById(R.id.A61_sec);
            A62_sec = findViewById(R.id.A62_sec);
            long in = togetherF.var2One;
            inputsB.setText("\""+numbers.get((togetherF.var2One)-1) + " تحمل " + Colors.get((togetherF.index21)-1)+ " على الأكثر " +"\"");
            if(numberOfLines2==1 & functions.index_max(togetherF.var2One, inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)), togetherF.draw)<=6){
                long x;
                x = functions.for_max_plus_without(togetherF.var2One, togetherF.allballsB.get((togetherF.index21)-1), togetherF.draw-togetherF.var2One, inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)));
                for(int i=0; i<functions.index_max(togetherF.var2One, inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)), togetherF.draw)*6; i=i+6){
                    ((TextView) findViewById(A_sec_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(A_sec_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index21)-1))));
                    ((TextView) findViewById(A_sec_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(A_sec_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1))));
                    if(in==0){
                        ((TextView) findViewById(A_sec_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_sec_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_sec_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                    in--;
                }
                if(in==0){
                    A7_sec = findViewById(R.id.A7_sec);
                    A7_sec.setVisibility(View.VISIBLE);
                    A71_sec = findViewById(R.id.A71_sec);
                    A71_sec.setVisibility(View.VISIBLE);
                    A71_sec.setText(String.valueOf(togetherF.draw));
                    A72_sec = findViewById(R.id.A72_sec);
                    A72_sec.setVisibility(View.VISIBLE);
                    A72_sec.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1))));
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
                x = functions.for_max_plus_without(togetherF.var2One, togetherF.allballsB.get((togetherF.index21)-1), togetherF.draw-togetherF.var2One, inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)));
                for(int i=0; i<6*6; i=i+6){
                    if((togetherF.draw-in)>(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)))){
                        break;
                    }
                    ((TextView) findViewById(A_sec_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(A_sec_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index21)-1))));
                    ((TextView) findViewById(A_sec_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(A_sec_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_sec_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1))));
                    in--;
                    if(in==0){
                        ((TextView) findViewById(A_sec_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_sec_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_sec_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                }
                A61_sec.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)))));
                A62_sec.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)))));
                A61b_sec.setText(String.valueOf((togetherF.draw)-(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1)))));
                A62b_sec.setText(String.valueOf((togetherF.allballsB.get((togetherF.index21)-1))));
                UP1_sec.setText(String.valueOf(+x));
                DOWN1_sec.setText(String.valueOf(down1_sec));
                if(in==0){
                    A7_sec = findViewById(R.id.A7_sec);
                    A7_sec.setVisibility(View.VISIBLE);
                    A71_sec = findViewById(R.id.A71_sec);
                    A71_sec.setVisibility(View.VISIBLE);
                    A71_sec.setText(String.valueOf(togetherF.draw));
                    A72_sec = findViewById(R.id.A72_sec);
                    A72_sec.setVisibility(View.VISIBLE);
                    A72_sec.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index21)-1))));
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
            A1_trd.setVisibility(View.GONE);
            A11_trd.setVisibility(View.GONE);
            A12_trd.setVisibility(View.GONE);
            A2_trd.setVisibility(View.GONE);
            A21_trd.setVisibility(View.GONE);
            A22_trd.setVisibility(View.GONE);
            A3_trd.setVisibility(View.GONE);
            A31_trd.setVisibility(View.GONE);
            A32_trd.setVisibility(View.GONE);
            A4_trd.setVisibility(View.GONE);
            A41_trd.setVisibility(View.GONE);
            A42_trd.setVisibility(View.GONE);
            threePoints_trd = findViewById(R.id.threePoints_trd);
            A1b_trd = findViewById(R.id.A1b_trd);
            A11b_trd = findViewById(R.id.A11b_trd);
            A12b_trd = findViewById(R.id.A12b_trd);
            A2b_trd = findViewById(R.id.A2b_trd);
            A21b_trd = findViewById(R.id.A21b_trd);
            A22b_trd = findViewById(R.id.A22b_trd);
            A3b_trd = findViewById(R.id.A3b_trd);
            A31b_trd = findViewById(R.id.A31b_trd);
            A32b_trd = findViewById(R.id.A32b_trd);
            A4b_trd = findViewById(R.id.A4b_trd);
            A41b_trd = findViewById(R.id.A41b_trd);
            A42b_trd = findViewById(R.id.A42b_trd);
            A5b_trd = findViewById(R.id.A5b_trd);
            A51b_trd = findViewById(R.id.A51b_trd);
            A52b_trd = findViewById(R.id.A52b_trd);
            A6b_trd = findViewById(R.id.A6b_trd);
            A61b_trd = findViewById(R.id.A61b_trd);
            A62b_trd = findViewById(R.id.A62b_trd);
            A5_trd = findViewById(R.id.A5_trd);
            A51_trd = findViewById(R.id.A51_trd);
            A52_trd = findViewById(R.id.A52_trd);
            A6_trd = findViewById(R.id.A6_trd);
            A61_trd = findViewById(R.id.A61_trd);
            A62_trd = findViewById(R.id.A62_trd);
            A6_trd = findViewById(R.id.A6_trd);
            A61_trd = findViewById(R.id.A61_trd);
            A62_trd = findViewById(R.id.A62_trd);
            long in = togetherF.var3One;
            inputsC.setText("\""+numbers.get((togetherF.var3One)-1) + " تحمل " + Colors.get((togetherF.index31)-1)+ " على الأكثر " +"\"");
            if(numberOfLines3==1 & functions.index_max(togetherF.var3One, inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)), togetherF.draw)<=6){
                long x;
                x = functions.for_max_plus_without(togetherF.var3One, togetherF.allballsB.get((togetherF.index31)-1), togetherF.draw-togetherF.var3One, inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)));
                for(int i=0; i<functions.index_max(togetherF.var3One, inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)), togetherF.draw)*6; i=i+6){
                    ((TextView) findViewById(A_trd_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(A_trd_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index31)-1))));
                    ((TextView) findViewById(A_trd_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(A_trd_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1))));
                    if(in==0){
                        ((TextView) findViewById(A_trd_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_trd_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_trd_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                    in--;
                }
                if(in==0){
                    A7_trd = findViewById(R.id.A7_trd);
                    A7_trd.setVisibility(View.VISIBLE);
                    A71_trd = findViewById(R.id.A71_trd);
                    A71_trd.setVisibility(View.VISIBLE);
                    A71_trd.setText(String.valueOf(togetherF.draw));
                    A72_trd = findViewById(R.id.A72_trd);
                    A72_trd.setVisibility(View.VISIBLE);
                    A72_trd.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1))));
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
                x = functions.for_max_plus_without(togetherF.var3One, togetherF.allballsB.get((togetherF.index31)-1), togetherF.draw-togetherF.var3One, inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)));
                for(int i=0; i<6*6; i=i+6){
                    if((togetherF.draw-in)>(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)))){
                        break;
                    }
                    ((TextView) findViewById(A_trd_id[i])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+1])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+1])).setText(String.valueOf(in));
                    ((TextView) findViewById(A_trd_id[i+2])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+2])).setText(String.valueOf((togetherF.allballsB.get((togetherF.index31)-1))));
                    ((TextView) findViewById(A_trd_id[i+3])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+4])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+4])).setText(String.valueOf(togetherF.draw-in));
                    ((TextView) findViewById(A_trd_id[i+5])).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(A_trd_id[i+5])).setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1))));
                    in--;
                    if(in==0){
                        ((TextView) findViewById(A_trd_id[i])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_trd_id[i+1])).setVisibility(View.GONE);
                        ((TextView) findViewById(A_trd_id[i+2])).setVisibility(View.GONE);
                        break;
                    }
                }
                A61_trd.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)))));
                A62_trd.setText(String.valueOf((inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)))));
                A61b_trd.setText(String.valueOf((togetherF.draw)-(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1)))));
                A62b_trd.setText(String.valueOf((togetherF.allballsB.get((togetherF.index31)-1))));
                UP1_trd.setText(String.valueOf(+x));
                DOWN1_trd.setText(String.valueOf(down1_trd));
                if(in==0){
                    A7_trd = findViewById(R.id.A7_trd);
                    A7_trd.setVisibility(View.VISIBLE);
                    A71_trd = findViewById(R.id.A71_trd);
                    A71_trd.setVisibility(View.VISIBLE);
                    A71_trd.setText(String.valueOf(togetherF.draw));
                    A72_trd = findViewById(R.id.A72_trd);
                    A72_trd.setVisibility(View.VISIBLE);
                    A72_trd.setText(String.valueOf(inputs.Result-(togetherF.allballsB.get((togetherF.index31)-1))));
                }
                if(functions.reduction(+x, down1_trd)==1){
                    Re3_trd.setVisibility(View.GONE);
                    equal_trd.setVisibility(View.GONE);
                }
                else {UP2_trd.setText(String.valueOf(+x / (functions.reduction(+x, down1_trd))));
                    DOWN2_trd.setText(String.valueOf(down1_trd / (functions.reduction(+x, down1_trd))));}
            }
        }

    }
    public void action1line1(View view){
        A11.setText(String.valueOf(togetherF.varOne));
        A12.setText(String.valueOf(togetherF.allballsB.get((togetherF.index11)-1)));
    }
    public void action1line2(View view){
        action1line1(null);
        A21.setText(String.valueOf(togetherF.varTwo));
        A22.setText(String.valueOf(togetherF.allballsB.get((togetherF.index12)-1)));
    }
    public void action1line3(View view){
        action1line2(null);
        A31.setText(String.valueOf(togetherF.varThree));
        A32.setText(String.valueOf(togetherF.allballsB.get((togetherF.index13)-1)));
    }
    public void action2line1(View view){
        A11_sec.setText(String.valueOf(togetherF.var2One));
        A12_sec.setText(String.valueOf(togetherF.allballsB.get((togetherF.index21)-1)));
    }
    public void action2line2(View view){
        action2line1(null);
        A21_sec.setText(String.valueOf(togetherF.var2Two));
        A22_sec.setText(String.valueOf(togetherF.allballsB.get((togetherF.index22)-1)));
    }
    public void action2line3(View view){
        action2line2(null);
        A31_sec.setText(String.valueOf(togetherF.var2Three));
        A32_sec.setText(String.valueOf(togetherF.allballsB.get((togetherF.index23)-1)));
    }

    public void action3line1(View view){
        A11_trd.setText(String.valueOf(togetherF.var3One));
        A12_trd.setText(String.valueOf(togetherF.allballsB.get((togetherF.index31)-1)));
    }
    public void action3line2(View view){
        action3line1(null);
        A21_trd.setText(String.valueOf(togetherF.var3Two));
        A22_trd.setText(String.valueOf(togetherF.allballsB.get((togetherF.index32)-1)));
    }
    public void action3line3(View view){
        action3line2(null);
        A31_trd.setText(String.valueOf(togetherF.var3Three));
        A32_trd.setText(String.valueOf(togetherF.allballsB.get((togetherF.index33)-1)));
    }
}