package com.company;
import java.util.*;
public class Perfect {
    public static void main(String args[]){
       Scanner read=new Scanner(System.in);
       int n= read.nextInt();
       int s=0,m=n;
        for (int i = 1; i < n; i++) {
            if (n%i==0){
                s+=i;
            }
        }
        if (s==m)
        {
            System.out.println("It is Perfect number");
        }
        else
        {
            System.out.println("It is not perfect number");
        }
    }
}
