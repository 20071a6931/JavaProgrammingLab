package com.company;
import java.util.*;
import java.lang.Math;
public class Adam {
    public static int reverse(int u){
        int s=0;
        while (u>0)
        {
            s=s*10+u%10;
            u=u/10;
        }
        return s;
    }
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter a  number:");
        int n= read.nextInt();
        int u=n;
        int m=n*n;
        int v=reverse(m);
        int sqrt=(int)Math.sqrt(v);
        int a=reverse(sqrt);
        if(a==u)
        {
            System.out.println("It is Adam number");
        }
        else
        {
            System.out.println("It is not Adam number");
        }


    }
}
