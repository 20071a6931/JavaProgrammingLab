package com.company;
import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);
        int n= read.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <=n ; i++) {
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
