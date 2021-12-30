package com.example.probabilis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class result extends AppCompatActivity {
    androidx.constraintlayout.widget.ConstraintLayout mainRe,mainRe2,mainRe_sec,mainRe2_sec,mainRe_trd,mainRe2_trd;
    ImageView line,line2,line_sec,line2_sec,line_trd,line2_trd;
    TextView allProbT,inputsA,inputsB,inputsC;
    TextView UP1,UP2,DOWN2,DOWN1,UP1_sec,UP2_sec,DOWN2_sec,DOWN1_sec,UP1_trd,UP2_trd,DOWN2_trd,DOWN1_trd;
    TextView C2_trd,C21_trd,C22_trd,C3_trd,C31_trd,C32_trd,C11_trd,C12_trd,C4_trd,C41_trd,C42_trd;
    TextView C01,C01_sec,C02_sec,C01_trd,C02_trd,C02,C11,C12,C2,C21,C22,C3,C31,C32,C4,C41,C42,C11_sec,C12_sec,C2_sec,C21_sec,C22_sec,C3_sec,C31_sec,C32_sec,C4_sec,C41_sec,C42_sec;
    int numberOfLines1,numberOfLines2,numberOfLines3;
    long up1,up2,down1,down2,up1_sec,up2_sec,down1_sec,down2_sec,up1_trd,up2_trd,down1_trd,down2_trd;
    androidx.constraintlayout.widget.ConstraintLayout actionOne,actionTwo,actionThree,B,C;
    ArrayList<String> Colors = new ArrayList<>();
    ArrayList<String> numbers = new ArrayList<>();
    ImageView div2,div3;
    @SuppressLint({"CutPasteId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
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
        C41_trd = findViewById(R.id.C1_trd);
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
                *functions.cardinal((inputs.Result)-(togetherF.varOne), (togetherF.draw)-(togetherF.varOne));
                UP1.setText(String.valueOf(up1));
                DOWN1.setText(String.valueOf(down1));

            }
            else{
                C4.setVisibility(View.GONE);
                C41.setVisibility(View.GONE);
                C42.setVisibility(View.GONE);
                up1 = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne));
                UP1.setText(String.valueOf(up1));
                DOWN1.setText(String.valueOf(down1));
            }
            if(togetherF.varOne==2){inputsA.setText(numbers.get((togetherF.varOne)-1) + " تحملان " + Colors.get((togetherF.index11)-1));}
            else{inputsA.setText(numbers.get((togetherF.varOne)-1) + " تحمل " + Colors.get((togetherF.index11)-1));
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
            }
            else{
                C4.setVisibility(View.GONE);
                C41.setVisibility(View.GONE);
                C42.setVisibility(View.GONE);
                up1 = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index11)-1)),(togetherF.varOne))
                *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index12)-1)),(togetherF.varTwo));
                UP1.setText(String.valueOf(up1));
                DOWN1.setText(String.valueOf(down1));
            }
            inputsA.setText(numbers.get((togetherF.varOne)-1) + " تحمل " + Colors.get((togetherF.index11)-1)
            + " و " + numbers.get((togetherF.varTwo)-1) + " تحمل " + Colors.get((togetherF.index12)-1));
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
            }
            inputsA.setText(numbers.get((togetherF.varOne)-1) + " تحمل " + Colors.get((togetherF.index11)-1)
                    + " و " + numbers.get((togetherF.varTwo)-1) + " تحمل " + Colors.get((togetherF.index12)-1)
                    + " و " + numbers.get((togetherF.varThree)-1) + " تحمل " + Colors.get((togetherF.index13)-1));
        }
        if(togetherF.numberOfPart>=2){
            actionTwo.setVisibility(View.VISIBLE);
            B.setVisibility(View.VISIBLE);
            div2.setVisibility(View.VISIBLE);
        }
        if(numberOfLines2==1 & togetherF.numberOfPart==2){
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
            }
            else{
                C4_sec.setVisibility(View.GONE);
                C41_sec.setVisibility(View.GONE);
                C42_sec.setVisibility(View.GONE);
                up1_sec = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One));
                UP1_sec.setText(String.valueOf(up1_sec));
                DOWN1_sec.setText(String.valueOf(down1_sec));
            }
            inputsB.setText(numbers.get((togetherF.var2One)-1) + " تحمل " + Colors.get((togetherF.index21)-1));

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
            }
            else{
                C4_sec.setVisibility(View.GONE);
                C41_sec.setVisibility(View.GONE);
                C42_sec.setVisibility(View.GONE);
                up1_sec = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index21)-1)),(togetherF.var2One))
                        *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index22)-1)),(togetherF.var2Two));
                UP1_sec.setText(String.valueOf(up1_sec));
                DOWN1_sec.setText(String.valueOf(down1_sec));
            }
            inputsB.setText(numbers.get((togetherF.var2One)-1) + " تحمل " + Colors.get((togetherF.index21)-1)
                    + " و " + numbers.get((togetherF.var2Two)-1) + " تحمل " + Colors.get((togetherF.index22)-1));
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

            }
            inputsB.setText(numbers.get((togetherF.var2One)-1) + " تحمل " + Colors.get((togetherF.index21)-1)
                    + " و " + numbers.get((togetherF.var2Two)-1) + " تحمل " + Colors.get((togetherF.index22)-1)
                    + " و " + numbers.get((togetherF.var2Three)-1) + " تحمل " + Colors.get((togetherF.index23)-1));
        }
        if(togetherF.numberOfPart==3){
            actionTwo.setVisibility(View.VISIBLE);
            actionThree.setVisibility(View.VISIBLE);
            C.setVisibility(View.VISIBLE);
            div3.setVisibility(View.VISIBLE);
        }
        if(numberOfLines3==1 & togetherF.numberOfPart==3){
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
            }
            else{
                C4_trd.setVisibility(View.GONE);
                C41_trd.setVisibility(View.GONE);
                C42_trd.setVisibility(View.GONE);
                up1_trd = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One));
                UP1_trd.setText(String.valueOf(up1_trd));
                DOWN1_trd.setText(String.valueOf(down1_trd));
            }
            inputsC.setText(numbers.get((togetherF.var3One)-1) + " تحمل " + Colors.get((togetherF.index31)-1));
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

            }
            else{
                C4_trd.setVisibility(View.GONE);
                C41_trd.setVisibility(View.GONE);
                C42_trd.setVisibility(View.GONE);
                up1_trd = functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index31)-1)),(togetherF.var3One))
                        *functions.cardinal(Long.valueOf(togetherF.allballsB.get((togetherF.index32)-1)),(togetherF.var3Two));
                UP1_trd.setText(String.valueOf(up1_trd));
                DOWN1_trd.setText(String.valueOf(down1_trd));
            }
            inputsC.setText(numbers.get((togetherF.var3One)-1) + " تحمل " + Colors.get((togetherF.index31)-1)
                    + " و " + numbers.get((togetherF.var3Two)-1) + " تحمل " + Colors.get((togetherF.index32)-1));
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
            }

            inputsC.setText(numbers.get((togetherF.var3One)-1) + " تحمل " + Colors.get((togetherF.index31)-1)
                    + " و " + numbers.get((togetherF.var3Two)-1) + " تحمل " + Colors.get((togetherF.index32)-1)
                    + " و " + numbers.get((togetherF.var3Three)-1) + " تحمل " + Colors.get((togetherF.index33)-1));
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
    public void calcUp(View view){

    }
}