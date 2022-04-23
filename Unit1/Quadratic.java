package com.company;
import java.util.*;
import java.lang.Math;
public class Quadratic {
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);
        System.out.println("enter coefficients of Quadratic equation line by line");
        int a= read.nextInt();
        int b= read.nextInt();
        int c= read.nextInt();
        int s=b*b - 4*a*c;
        if (s>=0)
        {
            int u=(-b + (int)Math.sqrt(s))/2*a;
            int v=(-b - (int)Math.sqrt(s))/2*a;
            System.out.println("Roots are:"+u+" "+v);
        }
        else
        {
            System.out.println("No real roots exist");
        }
    }
}
