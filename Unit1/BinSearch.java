package com.company;
import java.util.*;
public class BinSearch {

    public static void main(String[] args) {
	Scanner read=new Scanner(System.in);
    System.out.println("enter a number");
    int n=read.nextInt();
    System.out.println("Enter integers in ascending order");
    int arr[]=new int[50];
    for(int i=0;i<n;i++)
    {
        arr[i]=read.nextInt();
    }
    System.out.println("enter key to be searched");
    int key=read.nextInt();
    int lb=0;
    int ub=n-1;
    int mid = (lb+ub)/2;
    while(arr[mid]!=key && lb<=ub)
    {
        if (arr[mid]<key)
        {
            lb=mid+1;
        }
        else
        {
            ub=mid-1;
        }
        mid=(lb+ub)/2;
    }
    if (arr[mid]==key)
    {
        System.out.println("found");
    }
    else
    {
        System.out.println("not found");
    }
    }
}
