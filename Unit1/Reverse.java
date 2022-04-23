package com.company;
import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=read.nextInt();
        int arr[]=new int[100];
        System.out.println("enter array elements");
        for (int i=0;i<n;i++)
        {
            arr[i]=read.nextInt();
        }
        System.out.println("Array in reverse order:");
        for (int i=n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

    }
}
