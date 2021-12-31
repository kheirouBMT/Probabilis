package com.example.probabilis;

public class functions {
    static long factorial(long x){
        long fac=1;
        for (long i=1 ; i<=x ; i++){
            fac=fac*i;
        }
        return fac;}
    static long cardinal(long a, long b){
        return (factorial(a) / (factorial(a-b)*factorial(b)));}
    static long reduction(long a, long b){
        if(b==0) return a;
        return reduction(b, a%b);
    }
}
