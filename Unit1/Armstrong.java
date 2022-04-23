package com.company;
import java.util.*;
import java.lang.Math;
public class Armstrong {
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);
        System.out.println("enter a number :");
        int n= read.nextInt();
        int m=n,s=0,r,c=0,u=n;
        while(u>0){
            c++;
            u=u/10;
        }
        while (n>0)
        {
            r=n%10;
            s=s+(int)Math.pow(r,c);
            n=n/10;
        }
        if(s==m)
        {
            System.out.println("It is Armstrong");
        }
        else
        {
            System.out.println("It is not Armstrong");
        }
    }
}
