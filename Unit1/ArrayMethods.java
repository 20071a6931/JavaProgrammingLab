package com.company;
import java.util.*;
public class ArrayMethods {
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);

        int arr[]=new int[50];
        System.out.println("Enter no. of elements");
        int n=read.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]= read.nextInt();
        }
        int sum=0;
        int min=arr[0];
        int max=arr[0];
        for (int i=0;i<n;i++)
        {
            sum+=arr[i];
            if (arr[i]<min)
            {
                min=arr[i];
            }
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Sum is:"+sum);
        System.out.println("Max is:"+max);
        System.out.println("Min is:"+min);
    }
}
