package com.example.probabilis;

public class functions {
    static double factorial(long x){
        double fac=1;
        for (double i=1 ; i<=x ; i++){
            fac=fac*i;
        }
        return Math.round(fac);}
    static long cardinal(long a, long b){
        return (long)(factorial(a) / (factorial(a-b)*factorial(b)));}
    static long permutation(long a, long b){
        return (long)(cardinal(a, b)*factorial(b));
    }
    static long reduction(long a, long b){
        if(b==0) return a;
        return reduction(b, a%b);
    }
    static double reduction_double(double a, double b){
        if(b==0) return a;
        return Math.round(reduction_double(b, a%b));
    }
    static long index_max(long x, long y, long z){
        long counter=z-x;
        long times=0;
        for(int i=0;counter<=y;i++){
            if(x==0){
                break;}
            counter++;
            x--;
            times++;
        }
        return times;

    }
    static long index_min(long x1, long y1, long z1, long k1, long h1){
        long counter1=z1-x1;
        long times1=0;
        if(y1>k1){
            x1=x1+y1;
            y1=k1;
            x1=x1-y1;
            counter1=y1;
        }
        for(int i=0;counter1<=y1;i++){
            if(counter1==0){
                break;}
            if(x1>h1){
                break;
            }
            counter1--;
            x1++;
            times1++;
        }
        return times1;
    }
    static long for_max_plus6(long a1, long b1,long c1, long d1){
        long y = 0;
        for(int i=0;a1!=-1;i++){
            if(c1>d1){
                break;
            }
            long z= (cardinal(b1,a1))*(cardinal(d1,c1));
            y=y+z;
            a1--;
            c1++;
        }
        return y;
    }
    static long for_max_plus_without(long a1, long b1,long c1, long d1){
        long y = 0;
        for(int i=0;a1!=-1;i++){
            if(c1>d1){
                break;
            }
            long z= (permutation(b1,a1))*(permutation(d1,c1));
            y=y+z;
            a1--;
            c1++;
        }
        return y;
    }
    static long for_min(long a , long b, long c, long d){
        long y = 0;
        if(c>d){
            a=a+c;
            c=d;
            a=a-c;
        }
        for(int i=0;c!=-1;i++){
            if(c<=d){
                if(a>b){
                    break;
                }
                long z= (cardinal(b,a))*(cardinal(d,c));
                y=y+z;
                a++;
                c--;}
        }
        return y;
    }
    static long for_min_without(long a , long b, long c, long d){
        long y = 0;
        if(c>d){
            a=a+c;
            c=d;
            a=a-c;
        }
        for(int i=0;c!=-1;i++){
            if(c<=d){
                if(a>b){
                    break;
                }
                long z= (permutation(b,a))*(permutation(d,c));
                y=y+z;
                a++;
                c--;}
        }
        return y;
    }
}
